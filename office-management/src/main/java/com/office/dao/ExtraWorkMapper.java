package com.office.dao;

import com.office.entity.ExtraWork;
import com.office.entity.ExtraWorkExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface ExtraWorkMapper {
    long countByExample(ExtraWorkExample example);

    int deleteByExample(ExtraWorkExample example);

    int deleteByPrimaryKey(Integer extraWorkId);

    int insert(ExtraWork record);

    int insertSelective(ExtraWork record);

    List<ExtraWork> selectByExample(ExtraWorkExample example);
    List<ExtraWork> selectByExamplePage(ExtraWorkExample example);

    ExtraWork selectByPrimaryKey(Integer extraWorkId);

    int updateByExampleSelective(@Param("record") ExtraWork record, @Param("example") ExtraWorkExample example);

    int updateByExample(@Param("record") ExtraWork record, @Param("example") ExtraWorkExample example);

    int updateByPrimaryKeySelective(ExtraWork record);

    int updateByPrimaryKey(ExtraWork record);
}