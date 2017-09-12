package cn.come.demo.controller;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;
import cn.come.demo.dto.UserInfoExtUser;
import cn.come.demo.po.PUmUser;
import cn.come.demo.service.PUmUserService;
import cn.come.demo.utils.UserInfoSecurity;

@Controller
public class LoginController {
	@Resource
	private PUmUserService pUmUserService;

	@RequestMapping("/loginUser")
	public ModelAndView loginUser(HttpServletRequest request) {
		UserInfoExtUser userinfo=UserInfoSecurity.getSecurityUser();
		ModelAndView mv = new ModelAndView();
		if(null!=userinfo&&userinfo.getUserid()!=null){
			request.getSession().setAttribute("userinfo", userinfo);
			mv.addObject("userinfo", userinfo);
			mv.setViewName("base.definition");
			PUmUser pUmUser=new PUmUser();
			pUmUser.setLoginid(userinfo.getLoginid());
			pUmUserService.updUserInfo(pUmUser);
		}else{
			mv.setViewName("base.logout");
		}
		return mv;
	}
	
	
}
