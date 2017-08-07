package cn.com.demo.mapper;

import cn.com.demo.po.PUmAuthorityResource;
import cn.com.demo.po.PUmAuthorityResourceExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface PUmAuthorityResourceMapper {
    int countByExample(PUmAuthorityResourceExample example);

    int deleteByExample(PUmAuthorityResourceExample example);

    int insert(PUmAuthorityResource record);

    int insertSelective(PUmAuthorityResource record);

    List<PUmAuthorityResource> selectByExample(PUmAuthorityResourceExample example);

    int updateByExampleSelective(@Param("record") PUmAuthorityResource record, @Param("example") PUmAuthorityResourceExample example);

    int updateByExample(@Param("record") PUmAuthorityResource record, @Param("example") PUmAuthorityResourceExample example);
}