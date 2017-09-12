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
	 * @description 描述：插入题库列表，题目信息，题目选项
	 * @return 返回参数：void
	 */
	public void addTExaQuestions(String subName, String exmName, String exmDesc, String str) {
		tExaQuestionsMapper.addTExaQuestions(subName, exmName, exmDesc, str);
	}

	public PageInfo<TExaQuestions> getTExaQuestions(Integer page, TExaQuestions tExaQuestions) {
		//得到题库list 列表
		PageHelper.startPage(page, 3);
		List<TExaQuestions> texQuestionsList=tExaQuestionsMapper.getTExaQuestions(tExaQuestions);
		PageInfo<TExaQuestions> pageinfo=new PageInfo<>(texQuestionsList,5);
		return pageinfo;
		
	}

	//得到题库题目列表
	public PageInfo<TExaQuestionDetailed> getTQuestionsInfoList(Integer page, TExaQuestionDetailed tExaQuestionDetailed) {
		PageHelper.startPage(page, 5);
		List<TExaQuestionDetailed> list=tExaQuestionsMapper.getTQuestionsInfoList(tExaQuestionDetailed);
		PageInfo<TExaQuestionDetailed> pageinfo=new PageInfo<>(list,6);
		return pageinfo;
	}

	//根据题目编号查看题目答案
	public List<TExaAnswerInfo> getAnswersByNo(TExaAnswerInfo tExaAnswerInfo) {
		List<TExaAnswerInfo> list= tExaQuestionsMapper.getAnswersByNo(tExaAnswerInfo);
		return list;
	}
}
