package cn.come.demo.mapper;

import java.util.List;
import java.util.Map;

import org.apache.ibatis.annotations.Param;

import cn.come.demo.po.TExaQuestions;
import cn.come.demo.po.TSubjectInfo;

public interface TSubListMapper {
	/**
	 * @param tSubjectInfo 
	 * @function ��������getSubjectList
	 * @param ������@return
	 * @description ��������ѯ���п�Ŀ��Ϣ
	 * @return ���ز�����List<TSubjectInfo>
	 */
	public List<TSubjectInfo> getSubListByRequired(TSubjectInfo tSubjectInfo);
	//����id��ѯ��Ŀ��Ϣ
	public TSubjectInfo getSubById(@Param("id")Long id);
	//�޸Ŀ�Ŀ��Ϣ
	public void updSubject(TSubjectInfo tSubjectInfo);
	//ɾ����Ŀ��Ϣ
	public void delSubById(@Param("subject_no")Long subject_no);
	
	//���������ϸ����ѡ����ϸ��
	//public void creatQueAndAnswer(@Param("strPath")String strPath,@Param("queNo") String queNo);
	public void creatQueAndAnswer(Map<String, Object> map);
	
	//�õ���Ŀ����
	public String getSubject(@Param("subject_no")String subject_no);
	//�õ�����б�
	public List<TExaQuestions> getTExaQuestions(TExaQuestions tExaQuestions);
}