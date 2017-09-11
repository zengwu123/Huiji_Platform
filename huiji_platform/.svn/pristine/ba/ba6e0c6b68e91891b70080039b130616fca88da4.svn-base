package cn.come.demo.controller;

import javax.annotation.Resource;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;
import cn.come.demo.po.PUmAuthority;
import cn.come.demo.service.PUmAuthorityService;
import cn.come.demo.utils.PageBeanUtil;

@Controller
@RequestMapping("/auth")
public class PUmAuthorityController {
	@Resource
private PUmAuthorityService pUmAuthorityService;
	@RequestMapping("/authority")
	public ModelAndView toAuthorityList(PUmAuthority auth,int page){
		PageBeanUtil pageBean=pUmAuthorityService.getAuthorityList(auth,page);
		ModelAndView mv=new ModelAndView();
		mv.addObject("pageBean", pageBean);
		mv.addObject("auth", auth);
		mv.setViewName("auth.toAuthorityList");
		return mv;
	}
	@RequestMapping("/delAuthority")
	public String delAuthorityById(String authorityid){
		pUmAuthorityService.delAuthorityById(authorityid);
		return "redirect:authority.action?page=1";
	}
	@RequestMapping("/delMore")
	public String delMore(String[] text){
		pUmAuthorityService.delMore(text);
		return "redirect:authority.action?page=1";
		
	}
	@RequestMapping("/toUpdAuthority")
	public ModelAndView toUpdAuthority(String authorityid){
		PUmAuthority pumAuthority=pUmAuthorityService.findAuthoById(authorityid);
		ModelAndView mv=new ModelAndView();
		mv.addObject("pumAuthority",pumAuthority);
		mv.setViewName("auth.toUpdAuthority");
		return mv;
	}
	@RequestMapping("/updateAuthority")
	public String updateAuthority(PUmAuthority pumAuthority,String[] function){
		pUmAuthorityService.updAuthority(pumAuthority,function);
		return "redirect:authority.action?page=1";
	}
	
	@RequestMapping("/toaddAuthority")
	public ModelAndView toaddAuthority(){
		String authorityid=pUmAuthorityService.findMaxAuthorityId();
		ModelAndView mv=new ModelAndView();
		mv.addObject("authorityid", authorityid);
		mv.setViewName("auth.addAuthority");
		return mv;
	}
	
	@RequestMapping("/addAuthority")
	public String addAuthority(PUmAuthority auth,String[] function){
		
		pUmAuthorityService.addAuthority(auth,function);
		return "redirect:authority.action?page=1";
		
	}
}
