package cn.come.demo.mapper;

import java.util.List;
import java.util.Map;

import org.apache.ibatis.annotations.Param;

import cn.come.demo.dto.UserInfoExtUser;
import cn.come.demo.po.PUmAuthority;
import cn.come.demo.po.PUmUser;

public interface PUmUserMapper {
	/*
	 * 查询用户是否存在
	 */
	PUmUser selectByUser(PUmUser pUmUser);
	/*
	 * 根据用户查询所有符合条件的个数
	 */
	int selectcountByUser(PUmUser user);
	/*
	 * 根据条件分页查询出符合条件的用户
	 */
	List<PUmUser> selectByUserList(Map<String, Object> map);
	
	/*
	 * 根据用户id删除用户与角色的关联表信息
	 */
	void deleteAllUserRole(String userid);
	
	/*
	 * 根据用户id删除用户
	 */
	int deleteByPrimaryKey(String userid);
	
	/*
	 * 根据用户id查找对应的用户信息
	 */
	 PUmUser selectByPrimaryKey(String userid);
	 /*
	  * 根据用户id修改用户信息
	  */
	 int updateByPrimaryKey(PUmUser pUmUser);
	 
	 /*
	  * 批量删除
	  */
	 void delMoreUser(String[] strs);
	 
	 /*
	  * 找出用户表id最大的值
	  */
	 Long findMaxUserId();
	 
	 /*
	  * 插入用户
	  */
	 int insert(PUmUser pUmUser);
	 
	 /*
	  * 登陆记录登陆时间和登陆次数
	  */
	void updUserInfo(PUmUser pUmUser);
	
	/*
	 * 根据用户id获取权限集合
	 */
	List<PUmAuthority> findAuthorityByUsername(String userid);
	
	/*
	 * 根据登陆id获取用户信息
	 */
	UserInfoExtUser findUserinfoByLoginId(String loginid);
	
	//判读登陆id是否存在
	PUmUser checkLongId(@Param("loginid")String loginid);
}