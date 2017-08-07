package cn.come.demo.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import cn.come.demo.po.PUmResources;

public interface PUmResourcesMapper {

/*
 * ������Դ
 */
public void addResource(PUmResources pUmResources);
/*
 * ������Դidɾ����Դ
 */
public void delResource(@Param("resource_id")String resource_id);

/*
 * ������Դidɾ����Դ��Ȩ�޹���������
 */
public void delAuthorityAndResource(@Param("resource_id")String resource_id);

/*
 * �޸���Դ
 */
public void updResource(PUmResources pUmResources);
/*
 * ��ѯ��Դ
 */
public List<PUmResources> selectResource();

/*
 * ������Դid������Դ
 */
public PUmResources forUpdResource(@Param("resource_id")String resource_id);

/*
 * ���������Դid+1
 */
public String getMaxResourceId();

}