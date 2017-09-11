package cn.come.demo.service;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import javax.annotation.Resource;
import org.springframework.stereotype.Service;
import cn.come.demo.mapper.PUmUserMapper;
import cn.come.demo.mapper.PUmUserRoleMapper;
import cn.come.demo.po.PUmAuthority;
import cn.come.demo.po.PUmUser;
import cn.come.demo.utils.PageBeanUtil;

@Service
public class PUmUserService {
	@Resource
	private PUmUserMapper pUmUserMapper;
	@Resource
	private PUmUserRoleMapper pUmUserRoleMapper;

	public PageBeanUtil findUserAll(PUmUser user, int page) {
		int pageSize = 3;
		int count = pUmUserMapper.selectcountByUser(user);
		Map<String, Object> map = new HashMap<>();
		map.put("user", user);
		map.put("page", page);
		map.put("pageSize", pageSize);
		PageBeanUtil pageBean = new PageBeanUtil(page, pageSize, count);
		List<PUmUser> list = pUmUserMapper.selectByUserList(map);
		pageBean.setList(list);
		return pageBean;
	}

	public void delById(String userid) {
		pUmUserRoleMapper.deleteAllUserRole(userid);
		pUmUserMapper.deleteByPrimaryKey(userid);
	}

	public PUmUser findUserById(String userid) {
		// TODO Auto-generated method stub
		return pUmUserMapper.selectByPrimaryKey(userid);
	}

	public void updateUser(PUmUser pumUser) {
		// TODO Auto-generated method stub
		pUmUserMapper.updateByPrimaryKey(pumUser);
	}

	public PUmUser selectByUser(PUmUser pUmUser) {
		return pUmUserMapper.selectByUser(pUmUser);

	}

	public void delMoreUser(String[] strs) {
		pUmUserRoleMapper.deleteMoreUserRole(strs);
		pUmUserMapper.delMoreUser(strs);
	}

	public String findMaxUerId() {
		String maxId = String.valueOf(pUmUserMapper.findMaxUserId() + 1);
		return maxId;
	}

	public void addUser(PUmUser pumUser) {

		pUmUserMapper.insert(pumUser);

	}

	public void updUserInfo(PUmUser pUmUser) {
		pUmUserMapper.updUserInfo(pUmUser);
	}


}
