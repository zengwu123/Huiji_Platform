package cn.com.demo.mapper;

import java.util.List;

public interface PUmUserRoleMapper<UserRole> {
	/*
	 * ͨ��useridɾ�����û����еĽ�ɫ
	 */
	void deleteAllUserRole(String userid);
	
	/*
	 * ɾ������û��µ����н�ɫ
	 */
	void deleteMoreUserRole(String[] strs);
	
	/*
	 * ��ѯ��ɫ���û�֮��Ĺ�����Ϣ
	 */
	<UserRole> List<UserRole> getUserRole(String userid);
	
	/*
	 * ����û���ɫ
	 */
	void addUserRole(List<UserRole> list);
	
	

}