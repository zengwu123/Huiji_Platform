package cn.come.demo.service;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import javax.annotation.Resource;
import org.springframework.stereotype.Service;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import cn.come.demo.dto.PaperInfoTem;
import cn.come.demo.dto.PaperTem;
import cn.come.demo.mapper.PaperMapper;
import cn.come.demo.po.TPaper;
@Service
public class PaperService {
	@Resource
	private PaperMapper paperMapper;
	/**
	 * @description 描述：查询所有的试卷模板列表
	 * @return 返回参数：List<TPaper>
	 */
	public PageInfo<TPaper> getPaperList(Integer page,TPaper tPaper) {
		PageHelper.startPage(page, 5);
		List<TPaper> paperList=paperMapper.getPaperList(tPaper);
		PageInfo<TPaper> pageinfo=new PageInfo<>(paperList,7);
		return pageinfo;
	}
	//定制试题模板
	public void createPaperTem(String userName, PaperTem paperTem) {
		Long subject_no = paperTem.getSubject_no();
		Long exam_length = paperTem.getExam_length();
		String examination_name = paperTem.getExamination_name();
		String examination_content = paperTem.getExamination_content();
		StringBuffer str=new StringBuffer();
		str.append("1").append("@|").append(paperTem.getPaperNum1()).append("@|")
		.append(paperTem.getPaperScore1()).append("@|@|").append("2").append("@|")
		.append(paperTem.getPaperNum2()).append("@|").append(paperTem.getPaperScore2())
		.append("@|@|").append("3").append("@|").append(paperTem.getPaperNum3()).append("@|")
		.append(paperTem.getPaperScore3());
		Map<String,Object> map=new HashMap<>();
		map.put("subject_no", subject_no);map.put("exam_length", exam_length);
		map.put("examination_name", examination_name);map.put("examination_content", examination_content);
		map.put("str", str.toString());map.put("userName", userName);
		paperMapper.createPaperTem(map);
	}
	
	//生成试题
	public boolean createPaperInfo(String examination_no) {
		int state =paperMapper.checkPaperIsCreated(examination_no);
		if(state==2){
			return false;
		}else{
			paperMapper.createPaperInfo(examination_no);
			return true;
		}
	}
	//得到试卷列表页面
	public PageInfo<PaperInfoTem> getPaperInfoList(Integer page,PaperInfoTem paperInfoTem) {
		PageHelper.startPage(page, 3);
		List<PaperInfoTem> paperInfoList=paperMapper.getPaperInfoList(paperInfoTem);
		PageInfo<PaperInfoTem> pageinfo=new PageInfo<>(paperInfoList,7);
		return pageinfo;
	}

}
