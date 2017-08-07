package cn.come.demo.mapper;

import java.util.List;

import cn.come.demo.dto.UserRole;


public interface PUmUserRoleMapper {
	/*
	 * 通过userid删除该用户所有的角色
	 */
	void deleteAllUserRole(String userid);
	
	/*
	 * 删除多个用户下的所有角色
	 */
	void deleteMoreUserRole(String[] strs);
	
	/*
	 * 查询角色和用户之间的关联信息
	 */
	List<UserRole> getUserRole(String userid);
	
	/*
	 * 添加用户角色
	 */
	void addUserRole(List<UserRole> list);
	
	/*
	 * 根据roleid删除角色关联的用户信息
	 */
	void delUerOfRoleById(String roleid);

	/*
	 * 批量删除，根据roleid删除用户和角色关联信息
	 */
	void delMoreUerOfRoleById(String[] str);

}