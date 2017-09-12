package cn.come.demo.controller;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import com.github.pagehelper.PageInfo;

import cn.come.demo.po.TExaAnswerInfo;
import cn.come.demo.po.TExaQuestionDetailed;
import cn.come.demo.po.TExaQuestions;
import cn.come.demo.service.TExaQuestionsService;

@Controller
@RequestMapping("/que")
public class TExaQuestionsController {
	@Resource
	private TExaQuestionsService tExaQuestionsService;
	
	//题库列表
	@RequestMapping("/QuestionsList")
	public ModelAndView QuestionsList(@RequestParam(value="page",defaultValue="1")Integer page,
			TExaQuestions tExaQuestions){
		PageInfo<TExaQuestions> pageinfo =tExaQuestionsService.getTExaQuestions(page,tExaQuestions);
		ModelAndView mv=new ModelAndView();
		mv.addObject("pageinfo", pageinfo);
		mv.addObject("tExaQuestions", tExaQuestions);
		mv.setViewName("exam.QuestionsList");
		return mv;
	}
	
	//题库列表
		@RequestMapping("/questionsInfoList")
		public ModelAndView questionsInfoList(@RequestParam(value="page",defaultValue="1")Integer page,
				TExaQuestionDetailed tExaQuestionDetailed){
			PageInfo<TExaQuestionDetailed> pageinfo =tExaQuestionsService.getTQuestionsInfoList(page,tExaQuestionDetailed);
			ModelAndView mv=new ModelAndView();
			mv.addObject("pageinfo", pageinfo);
			mv.addObject("tExaQuestionDetailed", tExaQuestionDetailed);
			mv.setViewName("exam.QuestionsInfoList");
			return mv;
		}
		//根据题目编号查看题目答案
		@ResponseBody
		@RequestMapping("/getAnswerByNo")
		public List<TExaAnswerInfo> getAnswersByNo(TExaAnswerInfo tExaAnswerInfo){
		    List<TExaAnswerInfo> tExaAnswerInfoList =tExaQuestionsService.getAnswersByNo(tExaAnswerInfo);
			return tExaAnswerInfoList;
		}	
		
}
