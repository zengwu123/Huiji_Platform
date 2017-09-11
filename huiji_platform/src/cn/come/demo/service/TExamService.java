package cn.come.demo.service;

import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;

import cn.come.demo.dto.ExtendTPaper;
import cn.come.demo.dto.T_Examinationextend;
import cn.come.demo.mapper.TExamMapper;
import cn.come.demo.po.T_ExaminationInfo;
import cn.come.demo.po.T_ExaminationList;
import cn.come.demo.utils.ExportExcelTwoSheet;

@Service
public class TExamService {
	@Resource
	private TExamMapper tExamMapper;
	
	public ExtendTPaper getPaperInfoList(String examination_no) {
		ExtendTPaper paperInfoList= tExamMapper.getPaperInfoList(examination_no);
		return paperInfoList;
	}

	//计算考试分数，并返回分数和作对题数
	public List<Integer> calScores(String exam_info_no,String dataStr,String examName) {
		Map<String, Object> map=new HashMap<>();
		map.put("dataStr", dataStr);
		map.put("exam_info_no", exam_info_no);
		map.put("scores", 0);
		map.put("rightNum",0);
		map.put("errorNum", 0);
		tExamMapper.calScores(map);
		List<Integer> list=new ArrayList<>();
		list.add((Integer) map.get("scores"));
		list.add((Integer) map.get("rightNum"));
		list.add((Integer) map.get("errorNum"));
		return list;
	}

	//生成考试编号，和答题卡
	public void createExamNo(String examination_no, int num) {
		Map<String, Object> map=new HashMap<>();
		map.put("examination_no",examination_no);
		map.put("num", num);
		tExamMapper.createExamNo(map);
		
	}

	//查找所有没有选择过的考试编号
	public List<T_ExaminationInfo> findExaminfoNo(String data) {
		List<T_ExaminationInfo> list=tExamMapper.findExaminfoNo(data);
		return list;
	}

	//进入到考试页面，前面修改考试信息表
	public int toUdpExamInfo(Date date, String exam_info_no, String studentName) {
		Map<String, Object> map=new HashMap<>();
		map.put("date", date);
		map.put("exam_info_no", exam_info_no);
		map.put("studentName", studentName);
		int num=tExamMapper.udpExamInfo(map);
		return num;
	}

	//查看答案明细列表
	public PageInfo<T_ExaminationList> answerDetialsList(int page, T_ExaminationList t_ExaminationList) {
		PageHelper.startPage(page, 5);
		List<T_ExaminationList> examinfoList=tExamMapper.answerDetialsList(t_ExaminationList);
		PageInfo<T_ExaminationList> pageinfo=new PageInfo<>(examinfoList, 5);
		return pageinfo;
	}

	//导出Excel 答案
	public void expolExcle(String examination_info_no) {
		List<T_Examinationextend> examinfoList=tExamMapper.expolExcle(examination_info_no);
		ExportExcelTwoSheet<T_Examinationextend> ex = new ExportExcelTwoSheet<T_Examinationextend>();
		String[] headers = { "考试编号", "题目类型", "题目编号", "选择答案", "正确答案","创建时间"};
		String fileName="D://答案明细"+examinfoList.get(0).getExamination_info_no()+".xls";
		ex.exportExcel("考试答案明细", headers, examinfoList, fileName, "new");
	}

	//查看试卷分数列表
	public List<T_ExaminationInfo> getPaperInfoScoreList(T_ExaminationInfo t_ExaminationInfo) {
		List<T_ExaminationInfo> scoreList = tExamMapper.getPaperInfoScoreList(t_ExaminationInfo);
		return scoreList;
	}


}
