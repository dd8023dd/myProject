package com.office.dao;

import com.office.entity.CheckTime;
import com.office.entity.CheckTimeExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface CheckTimeMapper {
    long countByExample(CheckTimeExample example);

    int deleteByExample(CheckTimeExample example);

    int deleteByPrimaryKey(Integer checkTimeId);

    int insert(CheckTime record);

    int insertSelective(CheckTime record);

    List<CheckTime> selectByExample(CheckTimeExample example);
    List<CheckTime> selectByExample1(CheckTimeExample example);

    CheckTime selectByPrimaryKey(Integer checkTimeId);

    int updateByExampleSelective(@Param("record") CheckTime record, @Param("example") CheckTimeExample example);

    int updateByExample(@Param("record") CheckTime record, @Param("example") CheckTimeExample example);

    int updateByPrimaryKeySelective(CheckTime record);

    int updateByPrimaryKey(CheckTime record);
}