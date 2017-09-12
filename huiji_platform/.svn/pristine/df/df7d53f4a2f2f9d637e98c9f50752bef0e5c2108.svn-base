package cn.come.demo.controller;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.servlet.ModelAndView;

import com.github.pagehelper.PageInfo;

import cn.come.demo.po.TSubjectInfo;
import cn.come.demo.service.TSubListService;

@Controller
@RequestMapping("/exam")
public class TSubjectListController {
@Resource
private TSubListService tSubListService;
//exam/creatQue.action
@RequestMapping("/subjectList")
public ModelAndView getSubList(@RequestParam(value="page",defaultValue="1")Integer page,
		TSubjectInfo tSubjectInfo){
	PageInfo<TSubjectInfo> pageinfo = tSubListService.getSubListByRequired(page,tSubjectInfo);
	ModelAndView mv=new ModelAndView();
	mv.addObject("pageinfo", pageinfo);
	mv.addObject("tSubjectInfo", tSubjectInfo);
	mv.setViewName("exam.subjectList");
	return mv;
}
//准备修改查询科目信息
@RequestMapping("/forUdpById")
public ModelAndView findForUdpById(Long subject_no){
	TSubjectInfo subjectInfo = tSubListService.getSubById(subject_no);
	ModelAndView mv=new ModelAndView();
	mv.addObject("subjectInfo", subjectInfo);
	mv.setViewName("exam.forUpdate");
	return mv;
}

//修改科目信息
@RequestMapping("/updateSub")
public String updateSub(TSubjectInfo tSubjectInfo){
	tSubListService.updSubject(tSubjectInfo);
	return "redirect:subjectList.action";
}
//删除科目信息
@RequestMapping("/delSubById")
public String delSubById(Long subject_no){
	tSubListService.delSubById(subject_no);
	return "redirect:subjectList.action";
}

//查找科目信息，跳转到增加题库页面
@RequestMapping("/forCreaQue")
public ModelAndView forCreateQue(String subject_no){
	String SubjectName=tSubListService.getSubject(subject_no);
	ModelAndView mv =new ModelAndView();
	mv.addObject("Subject", SubjectName);
	mv.addObject("subject_no", subject_no);
	mv.setViewName("exam.forCreaQue");
	return mv;
}

//添加题库操作
@RequestMapping("/creatQue")
public ModelAndView creatQue(HttpServletRequest request,MultipartFile uploadFile) throws Exception{
	String re = tSubListService.creatQueAndAnswer(uploadFile,request);
	ModelAndView mv =new ModelAndView();
	mv.setViewName("redirect:../que/QuestionsList.action?page=1");
	return mv;
}

}
