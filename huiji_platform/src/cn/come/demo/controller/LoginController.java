package cn.come.demo.controller;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import javax.validation.Valid;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.validation.FieldError;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import cn.come.demo.dto.UserInfoExtUser;
import cn.come.demo.po.PUmRole;
import cn.come.demo.po.PUmUser;
import cn.come.demo.service.PUmRoleService;
import cn.come.demo.service.PUmUserService;
import cn.come.demo.utils.UserInfoSecurity;

@Controller
public class LoginController {
	private Logger logger=LoggerFactory.getLogger(LoginController.class);
	@Resource
	private PUmUserService pUmUserService;
	@Resource
	private PUmRoleService pUmRoleService;


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
	
	//跳转到注册页面
	@RequestMapping("/forRegist")
	public ModelAndView regist() {
		String maxId=pUmUserService.findMaxUerId();
		List<PUmRole> userRole = pUmRoleService.findAllRole();
		PUmUser user=new PUmUser();
		ModelAndView mv=new ModelAndView();
		user.setUserid(maxId);
		mv.addObject("userRole", userRole);
		mv.addObject("user", user);
		mv.setViewName("user.forRegist");
		return mv;
	}
	
	//检查登陆id是否存在
	@ResponseBody
	@RequestMapping("/checkLongId")
	public String checkLongId(String loginid) {
		PUmUser pUmUser=pUmUserService.checkLongId(loginid);
		if(pUmUser!=null){
			return "success";
		}
		return "error";
	}
	
	//进行注册操作
	@ResponseBody
	@RequestMapping(value="/registration",method=RequestMethod.POST)
	public Map<String, String> registration(@Valid PUmUser pumUser,BindingResult result) {
		logger.info(pumUser+"=======pumUser==========");
		Map<String, String> map=new HashMap<>();
		if(result.hasErrors()){
			List<FieldError> list = result.getFieldErrors();
			for (FieldError fieldError : list) {
				map.put(fieldError.getField(), fieldError.getDefaultMessage());
			}
			return map;
		}else{
			pUmUserService.addUser(pumUser);
			return null;
		}
	}
}
