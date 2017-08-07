package cn.come.demo.mapper;

import java.util.List;

import cn.come.demo.dto.PumIsSelect;
import cn.come.demo.po.PUmAuthorityResource;

public interface PUmAuthorityResourceMapper {

	//根据权限id删除所有与其相关的资源
	void delByAuthorityId(String authorityid);

	//根据权限id查找所有与其相关的资源
	List<PumIsSelect> getAllResource(String authorityid);

	//添加资源信息
	void addResource(List<PUmAuthorityResource> ar);

}