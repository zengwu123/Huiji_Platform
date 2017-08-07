package cn.come.demo.service;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import cn.come.demo.mapper.PUmResourcesMapper;
import cn.come.demo.po.PUmResources;

@Service
public class PumResourceService {
@Resource
private PUmResourcesMapper pUmResourcesMapper;

/*
 * ��ȡ��Դlist����
 */
public List<PUmResources> selectAllResource(){
	List<PUmResources> list = pUmResourcesMapper.selectResource();
	return list;
}

/*
 * ɾ����Դ�����Ϣ
 */
public void delResource(String resource_id){
	pUmResourcesMapper.delAuthorityAndResource(resource_id);
	pUmResourcesMapper.delResource(resource_id);
}

/*
 * �޸���Դ
 */
public void updResource(PUmResources pUmResources){
	pUmResourcesMapper.updResource(pUmResources);
}

/*
 * ������Դ
 */
public void addResource(PUmResources pUmResources){
	pUmResourcesMapper.addResource(pUmResources);
}

/*
 * ������Դid������Դ��Ϣ
 */
public PUmResources selectByResourceId(String resource_id) {
	return pUmResourcesMapper.forUpdResource(resource_id);
}

/*
 * ���������Դid+1
 */
public String getMaxResourceId(String resource_id) {
	// TODO Auto-generated method stub
	return pUmResourcesMapper.getMaxResourceId();
}
}
