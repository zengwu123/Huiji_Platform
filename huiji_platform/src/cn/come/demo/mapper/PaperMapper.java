package cn.come.demo.mapper;

import java.util.List;
import java.util.Map;
import org.apache.ibatis.annotations.Param;
import cn.come.demo.dto.PaperInfoTem;
import cn.come.demo.po.TPaper;

public interface PaperMapper {

	//��ѯ�Ծ�ģ���б�
	List<TPaper> getPaperList(TPaper tPaper);

	//�����Ծ�ģ��
	void createPaperTem(Map<String, Object> map);

	//����������Ŀ���𰸱�
	void createPaperInfo(@Param("examination_no")String examination_no);

	//�õ��Ծ��б�ҳ��
	List<PaperInfoTem> getPaperInfoList(PaperInfoTem paperInfoTem);

	//�����Ծ�ģ���״̬
	int checkPaperIsCreated(@Param("examination_no")String examination_no);

}