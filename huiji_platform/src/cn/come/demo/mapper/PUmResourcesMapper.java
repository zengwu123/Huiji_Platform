package cn.come.demo.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import cn.come.demo.po.PUmResources;

public interface PUmResourcesMapper {

/*
 * 增加资源
 */
public void addResource(PUmResources pUmResources);
/*
 * 根据资源id删除资源
 */
public void delResource(@Param("resource_id")String resource_id);

/*
 * 根据资源id删除资源和权限关联表数据
 */
public void delAuthorityAndResource(@Param("resource_id")String resource_id);

/*
 * 修改资源
 */
public void updResource(PUmResources pUmResources);
/*
 * 查询资源
 */
public List<PUmResources> selectResource();

/*
 * 根据资源id查找资源
 */
public PUmResources forUpdResource(@Param("resource_id")String resource_id);

/*
 * 获得最大的资源id+1
 */
public String getMaxResourceId();

}