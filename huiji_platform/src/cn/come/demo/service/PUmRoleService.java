package cn.come.demo.service;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import javax.annotation.Resource;
import org.springframework.stereotype.Service;
import cn.come.demo.mapper.PUmRoleAuthorityMapper;
import cn.come.demo.mapper.PUmRoleMapper;
import cn.come.demo.mapper.PUmUserRoleMapper;
import cn.come.demo.po.PUmRole;
import cn.come.demo.utils.PageBeanUtil;

@Service
public class PUmRoleService {
	@Resource
	private PUmRoleMapper pUmRoleMapper;
	@Resource
	private PUmRoleAuthorityMapper pUmRoleAuthorityMapper;
	@Resource
	private PUmUserRoleMapper pUmUserRoleMapper;
	
	public PageBeanUtil findRoleAll(PUmRole role, int page) {
		int pageSize=3;
		int count=pUmRoleMapper.getCountByRole(role);
		Map<String, Object> map=new HashMap<>();
		map.put("role", role);map.put("page", page);
		map.put("pageSize", pageSize);
		List<PUmRole> list=pUmRoleMapper.selectByRolePage(map);
		PageBeanUtil pageBean=new PageBeanUtil(page, pageSize, count);
		pageBean.setList(list);
		return pageBean;
	}

	public void deleteRole(String id) {
		pUmRoleAuthorityMapper.deleByRoleId(id);
		pUmUserRoleMapper.delUerOfRoleById(id);
		pUmRoleMapper.deleteByPrimaryKey(id);
	}

	public PUmRole forUpd(String roleid) {
		// TODO Auto-generated method stub
		return pUmRoleMapper.selectByPrimaryKey(roleid);
	}

	public void update(PUmRole pumRole) {
		// TODO Auto-generated method stub
		pUmRoleMapper.updateByPrimaryKey(pumRole);
	}

	public void delMoreRole(String[] str) {
		pUmRoleMapper.delMoreRoleAuthority(str);
		pUmUserRoleMapper.delMoreUerOfRoleById(str);
		pUmRoleMapper.delMoreRole(str);
	}

	public List<PUmRole> findAllRole() {
		// TODO Auto-generated method stub
		return pUmRoleMapper.findAllRole();
	}

	public String getMaxId() {
		// TODO Auto-generated method stub
		return pUmRoleMapper.getMaxRoleId();
	}

	public void doAddRole(PUmRole pumRole) {
		pUmRoleMapper.doAddRole(pumRole);
	}
}
