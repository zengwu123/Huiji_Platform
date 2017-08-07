package cn.come.demo.service;

import java.util.ArrayList;
import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import cn.come.demo.dto.PumIsSelect;
import cn.come.demo.mapper.PUmAuthorityResourceMapper;
import cn.come.demo.po.PUmAuthorityResource;

@Service
public class PUmAuthorityResourceService {
	@Resource
	private PUmAuthorityResourceMapper pUmAuthorityResourceMapper;

	public List<PumIsSelect> findAllResource(String authorityid) {
		List<PumIsSelect> isSelect=pUmAuthorityResourceMapper.getAllResource(authorityid);
		return isSelect;
	}


	/*
	 * 为权限id的权限添加资源
	 */
	public void addResource(String authorityid, String[] checked) {
		// TODO Auto-generated method stub
		pUmAuthorityResourceMapper.delByAuthorityId(authorityid);
		if(checked!=null){
			List<PUmAuthorityResource> ar=new ArrayList<>();
			for (int i = 0; i < checked.length; i++) {
				PUmAuthorityResource pr=new PUmAuthorityResource();
				pr.setAuthorityid(authorityid);
				pr.setResourceId(checked[i]);
				ar.add(pr);
			}
			pUmAuthorityResourceMapper.addResource(ar);
		}
		
	}
	
	
}
