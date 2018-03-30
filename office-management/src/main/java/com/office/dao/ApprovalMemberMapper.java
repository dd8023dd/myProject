package com.office.dao;

import com.office.entity.ApprovalMember;
import com.office.entity.ApprovalMemberExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface ApprovalMemberMapper {
    long countByExample(ApprovalMemberExample example);

    int deleteByExample(ApprovalMemberExample example);

    int deleteByPrimaryKey(Integer approvalMemberId);

    int insert(ApprovalMember record);

    int insertSelective(ApprovalMember record);

    List<ApprovalMember> selectByExample(ApprovalMemberExample example);

    ApprovalMember selectByPrimaryKey(Integer approvalMemberId);

    int updateByExampleSelective(@Param("record") ApprovalMember record, @Param("example") ApprovalMemberExample example);

    int updateByExample(@Param("record") ApprovalMember record, @Param("example") ApprovalMemberExample example);

    int updateByPrimaryKeySelective(ApprovalMember record);

    int updateByPrimaryKey(ApprovalMember record);
}