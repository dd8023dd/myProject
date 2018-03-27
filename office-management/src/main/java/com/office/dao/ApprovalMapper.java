package com.office.dao;

import com.office.entity.Approval;
import com.office.entity.ApprovalExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface ApprovalMapper {
    long countByExample(ApprovalExample example);

    int deleteByExample(ApprovalExample example);

    int deleteByPrimaryKey(Integer approvalId);

    int insert(Approval record);

    int insertSelective(Approval record);

    List<Approval> selectByExample(ApprovalExample example);
    List<Approval> selectByExamplePage(ApprovalExample example);

    Approval selectByPrimaryKey(Integer approvalId);
    
    Approval selectByApprovalNo(String approvalNo);

    int updateByExampleSelective(@Param("record") Approval record, @Param("example") ApprovalExample example);

    int updateByExample(@Param("record") Approval record, @Param("example") ApprovalExample example);

    int updateByPrimaryKeySelective(Approval record);

    int updateByPrimaryKey(Approval record);
}