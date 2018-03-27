package com.office.dao;

import com.office.entity.CheckTimeStatistics;
import com.office.entity.CheckTimeStatisticsExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface CheckTimeStatisticsMapper {
    long countByExample(CheckTimeStatisticsExample example);

    int deleteByExample(CheckTimeStatisticsExample example);

    int deleteByPrimaryKey(Integer checkTimeStatisticsId);

    int insert(CheckTimeStatistics record);

    int insertSelective(CheckTimeStatistics record);

    List<CheckTimeStatistics> selectByExample(CheckTimeStatisticsExample example);
    List<CheckTimeStatistics> selectByExamplePage(CheckTimeStatisticsExample example);

    CheckTimeStatistics selectByPrimaryKey(Integer checkTimeStatisticsId);

    int updateByExampleSelective(@Param("record") CheckTimeStatistics record, @Param("example") CheckTimeStatisticsExample example);

    int updateByExample(@Param("record") CheckTimeStatistics record, @Param("example") CheckTimeStatisticsExample example);

    int updateByPrimaryKeySelective(CheckTimeStatistics record);

    int updateByPrimaryKey(CheckTimeStatistics record);
}