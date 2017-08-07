package cn.com.demo.mapper;


public interface PUmRoleAuthorityMapper {

	/*
	 * 根据角色id删除角色和权限的关联信息
	 */
	void deleByRoleId(String roleid);


}