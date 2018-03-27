package com.office.dao;

import com.office.entity.MeetingRoom;
import com.office.entity.MeetingRoomExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface MeetingRoomMapper {
    long countByExample(MeetingRoomExample example);

    int deleteByExample(MeetingRoomExample example);

    int deleteByPrimaryKey(Integer meetingRoomId);

    int insert(MeetingRoom record);

    int insertSelective(MeetingRoom record);

    List<MeetingRoom> selectByExamplePage(MeetingRoomExample example);
    List<MeetingRoom> selectByExample(MeetingRoomExample example);

    MeetingRoom selectByPrimaryKey(Integer meetingRoomId);

    int updateByExampleSelective(@Param("record") MeetingRoom record, @Param("example") MeetingRoomExample example);

    int updateByExample(@Param("record") MeetingRoom record, @Param("example") MeetingRoomExample example);

    int updateByPrimaryKeySelective(MeetingRoom record);

    int updateByPrimaryKey(MeetingRoom record);
}