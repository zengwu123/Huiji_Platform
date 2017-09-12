package cn.come.demo.service;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;

import cn.come.demo.mapper.TExaQuestionsMapper;
import cn.come.demo.po.TExaAnswerInfo;
import cn.come.demo.po.TExaQuestionDetailed;
import cn.come.demo.po.TExaQuestions;

@Service
public class TExaQuestionsService {
	@Resource
	private TExaQuestionsMapper tExaQuestionsMapper;

	/**
	 * @description ��������������б���Ŀ��Ϣ����Ŀѡ��
	 * @return ���ز�����void
	 */
	public void addTExaQuestions(String subName, String exmName, String exmDesc, String str) {
		tExaQuestionsMapper.addTExaQuestions(subName, exmName, exmDesc, str);
	}

	public PageInfo<TExaQuestions> getTExaQuestions(Integer page, TExaQuestions tExaQuestions) {
		//�õ����list �б�
		PageHelper.startPage(page, 3);
		List<TExaQuestions> texQuestionsList=tExaQuestionsMapper.getTExaQuestions(tExaQuestions);
		PageInfo<TExaQuestions> pageinfo=new PageInfo<>(texQuestionsList,5);
		return pageinfo;
		
	}

	//�õ������Ŀ�б�
	public PageInfo<TExaQuestionDetailed> getTQuestionsInfoList(Integer page, TExaQuestionDetailed tExaQuestionDetailed) {
		PageHelper.startPage(page, 5);
		List<TExaQuestionDetailed> list=tExaQuestionsMapper.getTQuestionsInfoList(tExaQuestionDetailed);
		PageInfo<TExaQuestionDetailed> pageinfo=new PageInfo<>(list,6);
		return pageinfo;
	}

	//������Ŀ��Ų鿴��Ŀ��
	public List<TExaAnswerInfo> getAnswersByNo(TExaAnswerInfo tExaAnswerInfo) {
		List<TExaAnswerInfo> list= tExaQuestionsMapper.getAnswersByNo(tExaAnswerInfo);
		return list;
	}
}
