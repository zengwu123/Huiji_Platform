package cn.come.demo.mapper;

import java.util.List;

import cn.come.demo.dto.UserRole;


public interface PUmUserRoleMapper {
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
	List<UserRole> getUserRole(String userid);
	
	/*
	 * ����û���ɫ
	 */
	void addUserRole(List<UserRole> list);
	
	/*
	 * ����roleidɾ����ɫ�������û���Ϣ
	 */
	void delUerOfRoleById(String roleid);

	/*
	 * ����ɾ��������roleidɾ���û��ͽ�ɫ������Ϣ
	 */
	void delMoreUerOfRoleById(String[] str);

}