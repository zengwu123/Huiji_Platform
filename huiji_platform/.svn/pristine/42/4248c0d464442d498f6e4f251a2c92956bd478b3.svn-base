package cn.come.demo.controller;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.github.pagehelper.PageInfo;

import cn.come.demo.po.TExaQuestions;
import cn.come.demo.service.TExaQuestionsService;

@Controller
@RequestMapping("/que")
public class TExaQuestionsController {
	@Resource
	private TExaQuestionsService tExaQuestionsService;
	
	//Ã‚ø‚¡–±Ì
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
}
