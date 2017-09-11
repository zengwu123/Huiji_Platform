package cn.come.demo.mapper;

import java.util.List;
import java.util.Map;
import org.apache.ibatis.annotations.Param;
import cn.come.demo.dto.PaperInfoTem;
import cn.come.demo.po.TPaper;

public interface PaperMapper {

	//查询试卷模板列表
	List<TPaper> getPaperList(TPaper tPaper);

	//生成试卷模板
	void createPaperTem(Map<String, Object> map);

	//生成试题题目，答案表
	void createPaperInfo(@Param("examination_no")String examination_no);

	//得到试卷列表页面
	List<PaperInfoTem> getPaperInfoList(PaperInfoTem paperInfoTem);

	//查找试卷模板的状态
	int checkPaperIsCreated(@Param("examination_no")String examination_no);

}
