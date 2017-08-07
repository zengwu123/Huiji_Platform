package cn.come.demo.mapper;

import java.util.List;
import java.util.Map;
import cn.come.demo.po.PUmAuthority;

public interface PUmAuthorityMapper {

	/*
	 * 查询所有的权限
	 */
	List<PUmAuthority> selectByAuthority(Map<String, Object> map);
	
	/*
	 * 根据权限id删除权限
	 */
	void deleteByPrimaryKey(String authorityid);
	
	/*
	 * 通过权限id查找
	 */
	PUmAuthority selectByPrimaryKey(String authorityid);
	
	/*
	 * 修改权限
	 */
	void updateByPrimaryKey(PUmAuthority pUmAuthority);
	
	/*
	 * 根据权限id删除权限和角色关联信息
	 */
	void delRoleAuthorityByROleId(String[] str);

	/*
	 *根据权限id删除所有权限
	 */
	void delauthByRoleId(String[] str);

	/*
	 * 根据权限id删除权限和角色关联信息
	 */
	void delAuthorityofResource(String[] str);

	/*
	 * 查找最大权限id的值+1
	 */
	String findMaxAuthorityId();

	/*
	 * 添加权限信息
	 */
	void addAuthority(PUmAuthority pUmAuthority);

	/*
	 * 根据条件查询出权限的数量
	 */
	int getAuthorityCount(PUmAuthority pUmAuthority);
}