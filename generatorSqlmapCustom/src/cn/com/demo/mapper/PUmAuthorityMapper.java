package cn.com.demo.mapper;

import java.util.List;

import cn.com.demo.po.PUmAuthority;


public interface PUmAuthorityMapper {

	/*
	 * 查询所有的权限
	 */
	List<PUmAuthority> selectByAuthority();
	
	/*
	 * 根据权限id删除权限
	 */
	int deleteByPrimaryKey(String authorityid);
	
	/*
	 * 通过权限id查找
	 */
	PUmAuthority selectByPrimaryKey(String authorityid);
	
	/*
	 * 修改权限
	 */
	int updateByPrimaryKey(PUmAuthority pUmAuthority);
	
	/*
	 * 根据角色id删除权限和角色关联信息
	 */
	void delRoleAuthorityByROleId(String[] str);

	/*
	 *根据角色id删除所有权限
	 */
	void delauthByRoleId(String[] str);
}