package com.happy.record.share.game.api.wuziqi.dao.game;

import com.happy.record.share.game.api.wuziqi.model.Room;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import java.util.List;

@Mapper
public interface IRoom {
    @Select("select * from room")
    public List<Room> getAllUnfinishRoom();
}
