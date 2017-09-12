package cn.come.demo.QuartzJob;

import java.util.List;

import javax.annotation.Resource;

import cn.come.demo.mapper.TExamMapper;
import cn.come.demo.po.T_ExaminationInfo;
import cn.come.demo.utils.ExportExcelTwoSheet;

public class SpringQuartzDemo {
	@Resource
	private TExamMapper tExamMapper;
	
	public int quartzGetScoresExecle(){
		List<T_ExaminationInfo> scoreList = tExamMapper.getPaperInfoScoreList(null);
		if(scoreList.size()>0){
			ExportExcelTwoSheet<T_ExaminationInfo> ex = new ExportExcelTwoSheet<T_ExaminationInfo>();
			String[] headers = { "考试编号", "试卷编号", "考试人员", "正确数量", "错误数量","考试分数","考试时长","开始时间","结束时间"};
			String fileName="D://成绩"+scoreList.get(0).getExamination_info_no()+".xls";
			ex.exportExcel("考试成绩明细", headers, scoreList, fileName, "new");
			return 1;
		}
		return 2;
	}
}
