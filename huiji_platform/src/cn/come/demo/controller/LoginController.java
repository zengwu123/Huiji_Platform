package cn.come.demo.controller;

import javax.annotation.Resource;
import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import cn.come.demo.po.PUmUser;
import cn.come.demo.service.PUmUserService;

@Controller
public class LoginController {
	@Resource
	private PUmUserService pUmUserService;

	@RequestMapping("/loginCheckUser")
	public @ResponseBody String loginCheckUser(PUmUser pUmUser, HttpSession session) {
		PUmUser pUser = pUmUserService.selectByUser(pUmUser);
		if (pUser != null) {
			session.setAttribute("pUser", pUser);
			pUmUserService.updUserInfo(pUmUser);
			return "success";
		}
		return "false";
	}

	@RequestMapping("/loginUser")
	public ModelAndView loginUser(String username, String password) {
		System.out.println(password);
		ModelAndView mv = new ModelAndView();
		mv.setViewName("base.definition");
		return mv;
	}
}
