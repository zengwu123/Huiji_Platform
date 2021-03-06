package cn.come.demo.service;

import java.util.List;

import javax.annotation.Resource;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import cn.come.demo.po.TSubjectInfo;
import cn.come.demo.utils.PoiReadExcleUtil;
import cn.come.demo.utils.PoiReadExcleUtil2;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations="classpath:spring/application-*.xml")
public class TSubjectInfoServiceTest {

	@Resource
	private TSubjectInfoService tSubjectInfoService;
	
	@Resource
	private TSubListService tSubListService;
	
	@Resource
	private TExaQuestionsService tExaQuestionsService;
	@Test
	public void testAddTSubjectInfo() throws Exception {
		PoiReadExcleUtil2 pi=new PoiReadExcleUtil2();
		List<TSubjectInfo> str = pi.getExcelString();
		for (TSubjectInfo tSubjectInfo : str) {
			
			System.out.println("==============>"+tSubjectInfo.toString());
		}
		//System.out.println("==============================>"+str.size());
		tSubjectInfoService.addTSubjectInfo(str);
	}
	
	@Test
	public void testAddTQuestionInfo() throws Exception {
		PoiReadExcleUtil pi=new PoiReadExcleUtil();
		//String str = pi.getExcelString().toString();
		//str=str.substring(0,str.length()-4);
		//System.out.println(str);
		//tExaQuestionsService.addTExaQuestions("AngularJS", "前端框架", "女生适合看看", str);
	}
	/*@Test
	public void testAstionInfo() throws Exception {
		tSubListService.creatQuesList("Web开源框架", "三大框架", "男生适合看看");
	}*/
}
