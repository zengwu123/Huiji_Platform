package cn.come.demo.service;

import java.util.List;

import javax.annotation.Resource;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.github.pagehelper.PageInfo;

import cn.come.demo.mapper.PaperMapper;
import cn.come.demo.po.TPaper;
import cn.come.demo.po.TSubjectInfo;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations={"classpath:spring/application-dao.xml","classpath:spring/application-service.xml"})
public class TSubListServiceTest {

	@Resource
	private TSubListService tSubListService;
	
	@Resource
	PaperMapper paperMapper;

	@Test
	public void testGetSubList() {
		TSubjectInfo sub = tSubListService.getSubById(10L);
		
			System.out.println(sub.getSubject_name()+" ====== "+sub.getSubject_no());
	}
	
	@Test
	public void testPaperMapper(){
		TSubjectInfo tSubjectInfo=new TSubjectInfo();/*
		tSubjectInfo.setSubject_no(null);
		tSubjectInfo.setSubject_name("Êý¾Ý¿â");*/
		/*PageInfo<TSubjectInfo> page = tSubListService.getSubList(7,tSubjectInfo);
		System.out.println("========getFirstPage======"+page.getFirstPage());
		System.out.println("========getEndRow======"+page.getEndRow());
		System.out.println("========getLastPage======"+page.getLastPage());
		
			int[] nums = page.getNavigatepageNums();
			for (int i : nums) {
				System.out.print(""+i+",");
			}
		
		
		System.out.println("=======getNextPage======="+page.getNextPage());
		System.out.println("=======getPageNum======="+page.getPageNum());
		System.out.println("=======getPages======="+page.getPages());
		System.out.println("=======getPrePage======="+page.getPrePage());
		System.out.println("======getSize========"+page.getSize());
		System.out.println("======getPageSize========"+page.getPageSize());
		System.out.println("=======getTotal======="+page.getTotal());
		System.out.println("========isHasPreviousPage======"+page.isHasPreviousPage());
		System.out.println("========isIsLastPage======"+page.isIsLastPage());
		System.out.println("========isIsLastPage======"+page.isHasNextPage());*/
	}

}
