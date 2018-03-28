package com.office.dao;

import com.office.entity.AskToLeave;
import com.office.entity.AskToLeaveExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface AskToLeaveMapper {
    long countByExample(AskToLeaveExample example);

    int deleteByExample(AskToLeaveExample example);

    int deleteByPrimaryKey(Integer leaveId);

    int insert(AskToLeave record);

    int insertSelective(AskToLeave record);

    List<AskToLeave> selectByExampleS(AskToLeaveExample example);

    AskToLeave selectByPrimaryKeyS(Integer leaveId);
    List<AskToLeave> selectByExample(AskToLeaveExample example);
    
    AskToLeave selectByPrimaryKey(Integer leaveId);

    int updateByExampleSelective(@Param("record") AskToLeave record, @Param("example") AskToLeaveExample example);

    int updateByExample(@Param("record") AskToLeave record, @Param("example") AskToLeaveExample example);

    int updateByPrimaryKeySelective(AskToLeave record);

    int updateByPrimaryKey(AskToLeave record);
}