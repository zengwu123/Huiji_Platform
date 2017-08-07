package cn.come.demo.service;

import java.util.ArrayList;
import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import cn.come.demo.dto.PUmRoleIsAuthority;
import cn.come.demo.mapper.PUmRoleAuthorityMapper;
import cn.come.demo.po.PUmRoleAuthority;

@Service
public class PUmRoleAuthorityService {
	@Resource
	private PUmRoleAuthorityMapper pUmRoleAuthorityMapper;
	//找到角色和权限的关联信息，没有关联则为1
	public List<PUmRoleIsAuthority> findAllRoleAuthority(String roleid) {
		return pUmRoleAuthorityMapper.findRoleAuthById(roleid);
	}

	public void deleByRoleId(String roleid) {
		// TODO Auto-generated method stub
		pUmRoleAuthorityMapper.deleByRoleId(roleid);
	}

	public void doAssRoleAuth(String roleid, String[] cId) {
		// TODO Auto-generated method stub
		List<PUmRoleAuthority> list = new ArrayList<>();
		for (int i = 0; i < cId.length; i++) {
			PUmRoleAuthority pra = new PUmRoleAuthority();
			pra.setRoleid(roleid);
			pra.setAuthorityid(cId[i]);
			list.add(pra);
		}
		pUmRoleAuthorityMapper.doAssRoleAuth(list);
	}
}
