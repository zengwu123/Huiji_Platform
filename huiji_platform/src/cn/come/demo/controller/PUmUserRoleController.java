package cn.come.demo.controller;

import java.util.List;
import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;
import cn.come.demo.dto.UserRole;
import cn.come.demo.service.PUmUserRoleService;
@Controller
@RequestMapping("/association")
public class PUmUserRoleController {
	@Resource
	private PUmUserRoleService pUmUserRoleService;

	@RequestMapping("/associationUser")
	public ModelAndView associationUser(String userid) {
		List<UserRole> userRole = pUmUserRoleService.findUserRole(userid);
		ModelAndView mv = new ModelAndView();
		mv.addObject("userid", userid);
		mv.addObject("userRole", userRole);
		mv.setViewName("ass.associationUser");
		return mv;
	}

	@RequestMapping("doAssUserRole")
	public String doAssUerRole(String userid,HttpServletRequest request) {
		String[] roleid=request.getParameterValues("checked");
			pUmUserRoleService.addAssUserRole(userid,roleid);
		return "redirect:../user/userList.action?page=1";
	}
}
