package cn.come.demo.controller;

import javax.annotation.Resource;
import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.github.pagehelper.PageInfo;

import cn.come.demo.dto.PaperInfoTem;
import cn.come.demo.dto.PaperTem;
import cn.come.demo.dto.UserInfoExtUser;
import cn.come.demo.po.TPaper;
import cn.come.demo.service.PaperService;

@Controller
@RequestMapping("/paper")
public class PaperController {
	@Resource
	private PaperService paperInfoService;
	//试卷模板list页面
	@RequestMapping("/paper")
	public ModelAndView getPaperList(@RequestParam(value="page",defaultValue="1")Integer page,
			TPaper tPaper){
		PageInfo<TPaper> pageinfo=paperInfoService.getPaperList(page,tPaper);
		ModelAndView mv=new ModelAndView();
		mv.addObject("pageinfo", pageinfo);
		mv.addObject("tPaper", tPaper);
		mv.setViewName("paper.paperList");
		return mv;
	}
	//跳转到生成试卷模板页面
	@RequestMapping("/forCreatePaperTem")
	public ModelAndView forCreatePaperTem(String subject_no){
		ModelAndView mv=new ModelAndView();
		mv.addObject("subject_no", subject_no);
		mv.setViewName("paper.forCreatePaperTem");
		return mv;
	}
	//跳转到生成试卷模板页面
	@RequestMapping("/createPaperTem")
	public ModelAndView createPaperTem(PaperTem paperTem,HttpSession session){
		UserInfoExtUser userinfo=(UserInfoExtUser) session.getAttribute("userinfo");
		String userName=userinfo.getUsername();
		paperInfoService.createPaperTem(userName,paperTem);
		ModelAndView mv=new ModelAndView();
		mv.setViewName("redirect:paper.action");
		return mv;
	}
	
	//生成试卷，随机抓取部分试题
		@RequestMapping("/createPaperInfo")
		public ModelAndView createPaperInfo(String examination_no,HttpSession session){
			String msg="";
			ModelAndView mv=new ModelAndView();
			boolean isCreated= paperInfoService.createPaperInfo(examination_no);
			if(isCreated==false){
				mv.setViewName("redirect:paper.action?page=1");
			}else{
				mv.setViewName("redirect:paperInfo.action");
			}
			return mv;
		}
		
		//跳转到试卷列表
		@RequestMapping("/paperInfo")
		public ModelAndView getPaperInfoList(@RequestParam(value="page",defaultValue="1")Integer page,
				PaperInfoTem paperInfoTem){
			PageInfo<PaperInfoTem> pageinfo=paperInfoService.getPaperInfoList(page,paperInfoTem);
			ModelAndView mv=new ModelAndView();
			mv.addObject("pageinfo", pageinfo);
			mv.addObject("paperInfoTem", paperInfoTem);
			mv.setViewName("paper.paperinfoList");
			return mv;
		}
}
