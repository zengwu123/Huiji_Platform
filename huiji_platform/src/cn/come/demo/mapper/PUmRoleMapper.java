package cn.come.demo.mapper;

import java.util.List;
import java.util.Map;

import cn.come.demo.po.PUmRole;

public interface PUmRoleMapper {

	/*
	 * 根据角色条件查询该条件下有多少条记录
	 */
	int getCountByRole(PUmRole role);
	
	/*
	 * 根据条件分页查询所有角色的list集合
	 */
	List<PUmRole> selectByRolePage(Map<String, Object> map);

	/*
	 * 根据角色id删除角色
	 */
	int deleteByPrimaryKey(String roleid);
	
	/*
	 * 通过角色id查看角色信息
	 */
	PUmRole selectByPrimaryKey(String roleid);
	
	/*
	 * 根据roleid修改角色信息
	 */
	int updateByPrimaryKey(PUmRole pUmRole);
	
	/*
	 * 删除该角色的多个权限
	 */
	void delMoreRoleAuthority(String[] str);
	
	/*
	 * 批量删除多个角色
	 */
	void delMoreRole(String[] str);

	/*
	 * 查找所有角色
	 */
	List<PUmRole> findAllRole();

	/*
	 * 得到最大的roleid+1后的值
	 */
	String getMaxRoleId();

	/*
	 * 添加角色
	 */
	void doAddRole(PUmRole pumRole);


}