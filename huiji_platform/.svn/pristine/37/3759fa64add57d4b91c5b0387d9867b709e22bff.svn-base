package cn.come.demo.controller;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import cn.come.demo.dto.PumIsSelect;
import cn.come.demo.service.PUmAuthorityResourceService;

@Controller
@RequestMapping("/resource")
public class PUmAuthorityResourceController {
	@Resource
	private PUmAuthorityResourceService pUmAuthorityResourceService;
	@RequestMapping("/toShowResource")
	public ModelAndView toShowResource(String authorityid){
		List<PumIsSelect> pumIsSelect=pUmAuthorityResourceService.findAllResource(authorityid);
		ModelAndView mv=new ModelAndView();
		mv.addObject("authorityid", authorityid);
		mv.addObject("pumIsSelect", pumIsSelect);
		mv.setViewName("resource.toresource");
		return mv;
	}
	
	@RequestMapping("/relResource")
	public String toRelResource(String authorityid,String[] checked){
		pUmAuthorityResourceService.addResource(authorityid,checked);
		return "redirect:../auth/authority.action?page=1";
	}
	
}
