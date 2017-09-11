package cn.come.demo.service;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import cn.come.demo.mapper.PUmAuthorityMapper;
import cn.come.demo.mapper.PUmAuthorityResourceMapper;
import cn.come.demo.mapper.PUmRoleAuthorityMapper;
import cn.come.demo.po.PUmAuthority;
import cn.come.demo.utils.PageBeanUtil;

@Service
public class PUmAuthorityService {
	@Resource
	private PUmAuthorityMapper pUmAuthorityMapper;
	@Resource
	private PUmRoleAuthorityMapper pUmRoleAuthorityMapper;
	@Resource
	private PUmAuthorityResourceMapper pUmAuthorityResourceMapper;
	public PageBeanUtil getAuthorityList(PUmAuthority auth, int page) {
		int pageSize=3;
		int totalCount=pUmAuthorityMapper.getAuthorityCount(auth);
		Map<String, Object> map=new HashMap<>();
		map.put("pageSize", pageSize);map.put("page", page);
		map.put("auth", auth);
		List<PUmAuthority> list=pUmAuthorityMapper.selectByAuthority(map);
		PageBeanUtil pageBean =new PageBeanUtil(page, pageSize, totalCount);
		pageBean.setList(list);
		return pageBean;

	}

	public void delAuthorityById(String authorityid) {
		pUmRoleAuthorityMapper.deleByAuthorityId(authorityid);
		pUmAuthorityResourceMapper.delByAuthorityId(authorityid);
		pUmAuthorityMapper.deleteByPrimaryKey(authorityid);
	}

	public PUmAuthority findAuthoById(String authorityid) {
		return pUmAuthorityMapper.selectByPrimaryKey(authorityid);
	}

	public void updAuthority(PUmAuthority pumAuthority, String[] function) {
		String fun="";
		String funname="";
		for (int i = 0; i < function.length; i++) {
			fun+=function[i]+",";
			if ("1".equals(function[i])) {
				funname += "增加,";
			}
			if ("2".equals(function[i])) {
				funname += "修改,";
			}
			if ("3".equals(function[i])) {
				funname += "删除,";
			}
			if ("4".equals(function[i])) {
				funname += "查看,";
			}
			if ("5".equals(function[i])) {
				funname += "授权,";
			}
		}
		pumAuthority.setFunction(fun.substring(0, fun.length()-1));
		pumAuthority.setFunctionname(funname.substring(0, funname.length()-1));
		pUmAuthorityMapper.updateByPrimaryKey(pumAuthority);
	}

	public void delMore(String[] str) {
		
		pUmAuthorityMapper.delRoleAuthorityByROleId(str);
		pUmAuthorityMapper.delAuthorityofResource(str);
		pUmAuthorityMapper.delauthByRoleId(str);
	}

	/*
	 * 查找最大权限id的值
	 */
	public String findMaxAuthorityId() {
		return pUmAuthorityMapper.findMaxAuthorityId();
	}

	/*
	 * 添加权限信息
	 */
	public void addAuthority(PUmAuthority auth, String[] function) {
		String fun="";
		String funname="";
		for (int i = 0; i < function.length; i++) {
			fun+=function[i]+",";
			if ("1".equals(function[i])) {
				funname += "增加,";
			}
			if ("2".equals(function[i])) {
				funname += "修改,";
			}
			if ("3".equals(function[i])) {
				funname += "删除,";
			}
			if ("4".equals(function[i])) {
				funname += "查看,";
			}
			if ("5".equals(function[i])) {
				funname += "授权,";
			}
		}
		auth.setFunction(fun.substring(0, fun.length()-1));
		auth.setFunctionname(funname.substring(0, funname.length()-1));
		pUmAuthorityMapper.addAuthority(auth);
	}
}
