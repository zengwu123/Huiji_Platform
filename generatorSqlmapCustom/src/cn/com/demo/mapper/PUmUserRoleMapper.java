package cn.com.demo.mapper;

import java.util.List;

public interface PUmUserRoleMapper<UserRole> {
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
	<UserRole> List<UserRole> getUserRole(String userid);
	
	/*
	 * 添加用户角色
	 */
	void addUserRole(List<UserRole> list);
	
	

}