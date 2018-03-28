package com.office.dao;

import com.office.entity.ApprovalGroup;
import com.office.entity.ApprovalGroupExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface ApprovalGroupMapper {
    long countByExample(ApprovalGroupExample example);

    int deleteByExample(ApprovalGroupExample example);

    int deleteByPrimaryKey(Integer approvalGroupId);

    int insert(ApprovalGroup record);

    int insertSelective(ApprovalGroup record);

    List<ApprovalGroup> selectByExample(ApprovalGroupExample example);

    ApprovalGroup selectByPrimaryKey(Integer approvalGroupId);

    int updateByExampleSelective(@Param("record") ApprovalGroup record, @Param("example") ApprovalGroupExample example);

    int updateByExample(@Param("record") ApprovalGroup record, @Param("example") ApprovalGroupExample example);

    int updateByPrimaryKeySelective(ApprovalGroup record);

    int updateByPrimaryKey(ApprovalGroup record);
}