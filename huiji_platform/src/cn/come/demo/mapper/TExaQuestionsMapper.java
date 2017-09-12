package cn.come.demo.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import cn.come.demo.po.TExaAnswerInfo;
import cn.come.demo.po.TExaQuestionDetailed;
import cn.come.demo.po.TExaQuestions;

public interface TExaQuestionsMapper {

	//���ô洢���̣���������б������Ϣ�������ϸ��
	public void addTExaQuestions(
			@Param("subName")String subName,
			@Param("exmName")String exmName,
			@Param("exmDesc")String exmDesc,
			@Param("str")String str);
	
	//�õ�����б�list
	public List<TExaQuestions> getTExaQuestions(TExaQuestions tExaQuestions);

	//�õ������Ŀ�б�
	public List<TExaQuestionDetailed> getTQuestionsInfoList(TExaQuestionDetailed tExaQuestionDetailed);

	//������Ŀ��Ų鿴��Ŀ��
	public List<TExaAnswerInfo> getAnswersByNo(TExaAnswerInfo tExaAnswerInfo);
}
