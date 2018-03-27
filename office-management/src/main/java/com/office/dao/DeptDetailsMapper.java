package com.office.dao;

import com.office.entity.DeptDetails;
import com.office.entity.DeptDetailsExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface DeptDetailsMapper {
    long countByExample(DeptDetailsExample example);

    int deleteByExample(DeptDetailsExample example);

    int deleteByPrimaryKey(Integer deptDetailId);

    int insert(DeptDetails record);

    int insertSelective(DeptDetails record);

    List<DeptDetails> selectByExample(DeptDetailsExample example);
    List<DeptDetails> selectByExamplePage(DeptDetailsExample example);

    DeptDetails selectByPrimaryKey(Integer deptDetailId);

    int updateByExampleSelective(@Param("record") DeptDetails record, @Param("example") DeptDetailsExample example);

    int updateByExample(@Param("record") DeptDetails record, @Param("example") DeptDetailsExample example);

    int updateByPrimaryKeySelective(DeptDetails record);

    int updateByPrimaryKey(DeptDetails record);
}