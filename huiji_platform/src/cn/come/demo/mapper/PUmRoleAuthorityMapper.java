package cn.come.demo.mapper;

import java.util.List;

import cn.come.demo.dto.PUmRoleIsAuthority;
import cn.come.demo.po.PUmRoleAuthority;

public interface PUmRoleAuthorityMapper {

	/*
	 * ���ݽ�ɫidɾ����ɫ��Ȩ�޵Ĺ�����Ϣ
	 */
	void deleByRoleId(String roleid);

	/*
	 * ����Ȩ��idɾ����ɫ��Ȩ�޵Ĺ�����Ϣ
	 */
	void deleByAuthorityId(String authorityid);
	/*
	 * ���ݽ�ɫid��ѯ���н�ɫ��Ϣ��û�й�����Ϊ1
	 */
	List<PUmRoleIsAuthority> findRoleAuthById(String roleid);

	/*
	 * ������ɫ��Ȩ�޵���Ϣ
	 */
	void doAssRoleAuth(List<PUmRoleAuthority> list);


}