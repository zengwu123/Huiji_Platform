package cn.com.demo.mapper;

import cn.com.demo.po.PUmResources;
import cn.com.demo.po.PUmResourcesExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface PUmResourcesMapper {
    int countByExample(PUmResourcesExample example);

    int deleteByExample(PUmResourcesExample example);

    int deleteByPrimaryKey(String resourceId);

    int insert(PUmResources record);

    int insertSelective(PUmResources record);

    List<PUmResources> selectByExample(PUmResourcesExample example);

    PUmResources selectByPrimaryKey(String resourceId);

    int updateByExampleSelective(@Param("record") PUmResources record, @Param("example") PUmResourcesExample example);

    int updateByExample(@Param("record") PUmResources record, @Param("example") PUmResourcesExample example);

    int updateByPrimaryKeySelective(PUmResources record);

    int updateByPrimaryKey(PUmResources record);
}