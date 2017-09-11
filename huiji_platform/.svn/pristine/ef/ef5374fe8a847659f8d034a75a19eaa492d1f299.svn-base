package cn.come.demo.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import cn.come.demo.po.TExaQuestions;

public interface TExaQuestionsMapper {

	//调用存储过程，生成题库列表，题库信息，题库明细表
	public void addTExaQuestions(
			@Param("subName")String subName,
			@Param("exmName")String exmName,
			@Param("exmDesc")String exmDesc,
			@Param("str")String str);
	
	//得到题库列表list
	public List<TExaQuestions> getTExaQuestions(TExaQuestions tExaQuestions);
}
