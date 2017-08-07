package cn.come.demo.controller;

import java.util.List;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import cn.come.demo.dto.PUmRoleIsAuthority;
import cn.come.demo.service.PUmRoleAuthorityService;

@Controller
@RequestMapping("/roleAuth")
public class PUmRoleAuthorityController {
	@Resource
private PUmRoleAuthorityService pUmRoleAuthorityService;

	@RequestMapping("/toAuthbyid")
	public ModelAndView toAuthbyid(String roleid){
		List<PUmRoleIsAuthority> authority = pUmRoleAuthorityService.findAllRoleAuthority(roleid);
		ModelAndView mv=new ModelAndView();
		mv.addObject("authority", authority);
		mv.addObject("roleid", roleid);
		mv.setViewName("auth.authRole");
		return mv;
		
	}
	@RequestMapping("/doAssRoleAuth")
	public String doAssRoleAuth(String roleid,HttpServletRequest request){
		pUmRoleAuthorityService.deleByRoleId(roleid);
		String[] cId = request.getParameterValues("checked");
		if(cId!=null){
		pUmRoleAuthorityService.doAssRoleAuth(roleid,cId);
		}
		return "redirect:../role/roleList.action?page=1";
		
	}
}
