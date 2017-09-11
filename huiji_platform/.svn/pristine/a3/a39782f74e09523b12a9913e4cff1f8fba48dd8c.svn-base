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
 * 获取资源list集合
 */
public List<PUmResources> selectAllResource(){
	List<PUmResources> list = pUmResourcesMapper.selectResource();
	return list;
}

/*
 * 删除资源相关信息
 */
public void delResource(String resource_id){
	pUmResourcesMapper.delAuthorityAndResource(resource_id);
	pUmResourcesMapper.delResource(resource_id);
}

/*
 * 修改资源
 */
public void updResource(PUmResources pUmResources){
	pUmResourcesMapper.updResource(pUmResources);
}

/*
 * 增加资源
 */
public void addResource(PUmResources pUmResources){
	pUmResourcesMapper.addResource(pUmResources);
}

/*
 * 根据资源id查找资源信息
 */
public PUmResources selectByResourceId(String resource_id) {
	return pUmResourcesMapper.forUpdResource(resource_id);
}

/*
 * 获得最大的资源id+1
 */
public String getMaxResourceId(String resource_id) {
	// TODO Auto-generated method stub
	return pUmResourcesMapper.getMaxResourceId();
}
}
