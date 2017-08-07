package cn.com.demo.mapper;

import java.util.List;
import java.util.Map;

import cn.com.demo.po.PUmRole;

public interface PUmRoleMapper {

	/*
	 * ���ݽ�ɫ������ѯ���������ж�������¼
	 */
	int getCountByRole(PUmRole role);
	
	/*
	 * ����������ҳ��ѯ���н�ɫ��list����
	 */
	List<PUmRole> selectByRolePage(Map<String, Object> map);

	/*
	 * ���ݽ�ɫidɾ����ɫ
	 */
	int deleteByPrimaryKey(String roleid);
	
	/*
	 * ͨ����ɫid�鿴��ɫ��Ϣ
	 */
	PUmRole selectByPrimaryKey(String roleid);
	
	/*
	 * ����roleid�޸Ľ�ɫ��Ϣ
	 */
	int updateByPrimaryKey(PUmRole pUmRole);
	
	/*
	 * ɾ���ý�ɫ�Ķ��Ȩ��
	 */
	void delMoreRoleAuthority(String[] str);
	
	/*
	 * ����ɾ�������ɫ
	 */
	void delMoreRole(String[] str);


}