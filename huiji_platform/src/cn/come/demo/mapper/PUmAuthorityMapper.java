package cn.come.demo.mapper;

import java.util.List;
import java.util.Map;
import cn.come.demo.po.PUmAuthority;

public interface PUmAuthorityMapper {

	/*
	 * ��ѯ���е�Ȩ��
	 */
	List<PUmAuthority> selectByAuthority(Map<String, Object> map);
	
	/*
	 * ����Ȩ��idɾ��Ȩ��
	 */
	void deleteByPrimaryKey(String authorityid);
	
	/*
	 * ͨ��Ȩ��id����
	 */
	PUmAuthority selectByPrimaryKey(String authorityid);
	
	/*
	 * �޸�Ȩ��
	 */
	void updateByPrimaryKey(PUmAuthority pUmAuthority);
	
	/*
	 * ����Ȩ��idɾ��Ȩ�޺ͽ�ɫ������Ϣ
	 */
	void delRoleAuthorityByROleId(String[] str);

	/*
	 *����Ȩ��idɾ������Ȩ��
	 */
	void delauthByRoleId(String[] str);

	/*
	 * ����Ȩ��idɾ��Ȩ�޺ͽ�ɫ������Ϣ
	 */
	void delAuthorityofResource(String[] str);

	/*
	 * �������Ȩ��id��ֵ+1
	 */
	String findMaxAuthorityId();

	/*
	 * ���Ȩ����Ϣ
	 */
	void addAuthority(PUmAuthority pUmAuthority);

	/*
	 * ����������ѯ��Ȩ�޵�����
	 */
	int getAuthorityCount(PUmAuthority pUmAuthority);
}