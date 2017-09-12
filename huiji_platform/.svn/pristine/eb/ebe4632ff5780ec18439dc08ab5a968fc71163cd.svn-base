package cn.come.demo.mapper;

import java.util.List;
import java.util.Map;

import org.apache.ibatis.annotations.Param;

import cn.come.demo.dto.ExtendTPaper;
import cn.come.demo.dto.T_Examinationextend;
import cn.come.demo.po.T_ExaminationInfo;
import cn.come.demo.po.T_ExaminationList;

public interface TExamMapper {

	//得到试卷页面所有内容展示出来
	ExtendTPaper getPaperInfoList(@Param("examination_no")String examination_no);

	//计算考试分数，并返回分数和作对题数
	void calScores(Map<String, Object> map);

	//生成考试编号，和答题卡
	void createExamNo(Map<String, Object> map);

	//查找所有没有选择过的考试编号
	List<T_ExaminationInfo> findExaminfoNo(@Param("data")String data);

	//更改考试信息表
	int udpExamInfo(Map<String, Object> map);

	//查看答案明细列表
	List<T_ExaminationList> answerDetialsList(T_ExaminationList t_ExaminationList);

	//导出答案功能
	List<T_Examinationextend> expolExcle(@Param("examination_info_no")String examination_info_no);

	//得到考试分数列表
	List<T_ExaminationInfo> getPaperInfoScoreList(T_ExaminationInfo t_ExaminationInfo);

}
