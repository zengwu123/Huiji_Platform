package cn.come.demo.controller;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import cn.come.demo.po.PUmResources;
import cn.come.demo.service.PumResourceService;

@Controller
@RequestMapping("/resource")
public class PumResourceController {
@Resource
private PumResourceService pumResourceService;

/*
 * 查询资源list集合
 */
@RequestMapping("/resourceList")
public ModelAndView findAllResource(){
	List<PUmResources> list = pumResourceService.selectAllResource();
	ModelAndView mv=new ModelAndView();
	mv.addObject("list", list);
	mv.setViewName("resource.resourceList");
	return mv;
}

/*
 * 根据资源id删除资源
 */
@RequestMapping("/delResource")
public String delResourceById(String resource_id){
	pumResourceService.delResource(resource_id);
	return "redirect:resourceList.action";
}

/*
 * 跳转到修改页面
 */
@RequestMapping("/forUpdByResourceid")
public ModelAndView forUpdResource(String resource_id){
	PUmResources pumResource=pumResourceService.selectByResourceId(resource_id);
	ModelAndView mv=new ModelAndView();
	mv.addObject("pumResource", pumResource);
	mv.setViewName("resource.updResource");
	return mv;
}

/*
 * 执行修改操作
 */
@RequestMapping("/updResource")
public String updResource(PUmResources pUmResources){
	pumResourceService.updResource(pUmResources);
	return "redirect:resourceList.action";
}

/*
 * 跳转到添加页面
 */
@RequestMapping("/forAddResource")
public ModelAndView forAddResource(String resource_id){
	String maxId=pumResourceService.getMaxResourceId(resource_id);
	ModelAndView mv=new ModelAndView();
	mv.addObject("maxId", maxId);
	mv.setViewName("resource.forAddResource");
	return mv;
}

/*
 * 添加资源操作
 */
@RequestMapping("/addResource")
public String addResource(PUmResources pUmResources){
	pumResourceService.addResource(pUmResources);
	return "redirect:resourceList.action";
}


}
