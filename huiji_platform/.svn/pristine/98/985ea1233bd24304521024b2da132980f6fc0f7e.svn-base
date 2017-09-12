package cn.come.demo.controller;

import java.util.List;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import cn.come.demo.dto.UserRole;
import cn.come.demo.po.PUmRole;
import cn.come.demo.po.PUmUser;
import cn.come.demo.service.PUmRoleService;
import cn.come.demo.service.PUmUserRoleService;
import cn.come.demo.service.PUmUserService;
import cn.come.demo.utils.PageBeanUtil;

@Controller
@RequestMapping("/user")
public class PUmUserController {
	@Resource
	private PUmUserService pUmUserService;
	@Resource
	private PUmUserRoleService pUmUserRoleService;
	@Resource
	private PUmRoleService pUmRoleService;
	@RequestMapping("/userList")
	public ModelAndView findUserAll(PUmUser user,int page) {
	
		PageBeanUtil pageBean = pUmUserService.findUserAll(user,page);
		ModelAndView mv = new ModelAndView();
		mv.addObject("user", user);
		mv.addObject("pageBean", pageBean);
		mv.setViewName("user.userList");
		return mv;
	}
	@RequestMapping("/delById")
	public ModelAndView delById(String userid){
		pUmUserService.delById(userid);
		ModelAndView mv=new ModelAndView();
		mv.setViewName("redirect:userList.action?page=1");
		return mv;
	}
	/*
	 * 批量删除
	 */
	@RequestMapping("/delMore")
	public ModelAndView  delMoreUser(String text){
		String[] strs = text.split(",");
		pUmUserService.delMoreUser(strs);
		ModelAndView mv=new ModelAndView();
		mv.setViewName("redirect:userList.action?page=1");
		return mv;
	}
	
	@RequestMapping("/forUdpById")
	public ModelAndView forUdpById(String userid){
		PUmUser pumUser=pUmUserService.findUserById(userid);
		List<UserRole> userRole = pUmUserRoleService.findUserRole(userid);
		ModelAndView mv=new ModelAndView();
		mv.addObject("user", pumUser);
		mv.addObject("userRole", userRole);
		mv.setViewName("user.forUdpUser");
		return mv;
	}
	
	//添加用户信息
	@RequestMapping("/forAdd")
	public ModelAndView forAdd(){
		String maxId=pUmUserService.findMaxUerId();
		List<PUmRole> userRole = pUmRoleService.findAllRole();
		PUmUser user=new PUmUser();
		ModelAndView mv=new ModelAndView();
		user.setUserid(maxId);
		mv.addObject("userRole", userRole);
		mv.addObject("user", user);
		mv.setViewName("user.forAddUser");
		return mv;
	}
	@RequestMapping("/addUser")
	public String addUser(PUmUser pumUser,HttpServletRequest requ){
		String[] str = requ.getParameterValues("checked");
		pUmUserService.addUser(pumUser);
		pUmUserRoleService.addAssUserRole(pumUser.getUserid(), str);
		return "redirect:userList.action?page=1";
	}
	@RequestMapping("/updateUser")
	public ModelAndView updateUser(PUmUser pumUser,HttpServletRequest requ){
		String[] str = requ.getParameterValues("checked");
		pUmUserRoleService.addAssUserRole(pumUser.getUserid(), str);
		pUmUserService.updateUser(pumUser);
		ModelAndView mv=new ModelAndView();
		mv.setViewName("redirect:userList.action?page=1");
		return mv;
		
	}


}
