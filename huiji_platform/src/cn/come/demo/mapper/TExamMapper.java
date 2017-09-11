package cn.come.demo.mapper;

import java.util.List;
import java.util.Map;

import org.apache.ibatis.annotations.Param;

import cn.come.demo.dto.ExtendTPaper;
import cn.come.demo.dto.T_Examinationextend;
import cn.come.demo.po.T_ExaminationInfo;
import cn.come.demo.po.T_ExaminationList;

public interface TExamMapper {

	//�õ��Ծ�ҳ����������չʾ����
	ExtendTPaper getPaperInfoList(@Param("examination_no")String examination_no);

	//���㿼�Է����������ط�������������
	void calScores(Map<String, Object> map);

	//���ɿ��Ա�ţ��ʹ��⿨
	void createExamNo(Map<String, Object> map);

	//��������û��ѡ����Ŀ��Ա��
	List<T_ExaminationInfo> findExaminfoNo(@Param("data")String data);

	//���Ŀ�����Ϣ��
	int udpExamInfo(Map<String, Object> map);

	//�鿴����ϸ�б�
	List<T_ExaminationList> answerDetialsList(T_ExaminationList t_ExaminationList);

	//�����𰸹���
	List<T_Examinationextend> expolExcle(@Param("examination_info_no")String examination_info_no);

	//�õ����Է����б�
	List<T_ExaminationInfo> getPaperInfoScoreList(T_ExaminationInfo t_ExaminationInfo);

}
