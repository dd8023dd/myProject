package com.office.dao;

import com.office.entity.Depts;
import com.office.entity.DeptsExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface DeptsMapper {
    long countByExample(DeptsExample example);

    int deleteByExample(DeptsExample example);

    int deleteByPrimaryKey(Integer deptId);

    int insert(Depts record);

    int insertSelective(Depts record);

    List<Depts> selectByExample(DeptsExample example);
    List<Depts> selectByExamplePage(DeptsExample example);

    Depts selectByPrimaryKey(Integer deptId);

    int updateByExampleSelective(@Param("record") Depts record, @Param("example") DeptsExample example);

    int updateByExample(@Param("record") Depts record, @Param("example") DeptsExample example);

    int updateByPrimaryKeySelective(Depts record);

    int updateByPrimaryKey(Depts record);
}