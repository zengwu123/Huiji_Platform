package cn.come.demo.mapper;

import java.util.List;

import cn.come.demo.dto.PumIsSelect;
import cn.come.demo.po.PUmAuthorityResource;

public interface PUmAuthorityResourceMapper {

	//����Ȩ��idɾ������������ص���Դ
	void delByAuthorityId(String authorityid);

	//����Ȩ��id��������������ص���Դ
	List<PumIsSelect> getAllResource(String authorityid);

	//�����Դ��Ϣ
	void addResource(List<PUmAuthorityResource> ar);

}