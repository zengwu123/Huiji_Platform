package cn.come.demo.mapper;

import java.util.List;

import cn.come.demo.dto.PUmRoleIsAuthority;
import cn.come.demo.po.PUmRoleAuthority;

public interface PUmRoleAuthorityMapper {

	/*
	 * 根据角色id删除角色和权限的关联信息
	 */
	void deleByRoleId(String roleid);

	/*
	 * 根据权限id删除角色和权限的关联信息
	 */
	void deleByAuthorityId(String authorityid);
	/*
	 * 根据角色id查询所有角色信息，没有关联则为1
	 */
	List<PUmRoleIsAuthority> findRoleAuthById(String roleid);

	/*
	 * 关联角色和权限的信息
	 */
	void doAssRoleAuth(List<PUmRoleAuthority> list);


}