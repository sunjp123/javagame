package com.happy.record.share.game.api.wuziqi.service;

import com.happy.record.share.game.api.wuziqi.dao.game.IRoom;
import com.happy.record.share.game.api.wuziqi.model.Room;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service(value="roomService")
public class RoomService {
    @Autowired
    private IRoom iRoom;

    public List<Room> getAllUnfinishRoom(){
       return iRoom.getAllUnfinishRoom();
    }
}
