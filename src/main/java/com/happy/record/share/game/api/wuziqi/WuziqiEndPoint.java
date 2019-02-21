package com.happy.record.share.game.api.wuziqi;

import com.happy.record.share.game.api.wuziqi.model.Role;
import com.happy.record.share.game.api.wuziqi.model.Room;
import com.happy.record.share.game.api.wuziqi.model.WuziqiInfoDTO;
import com.happy.record.share.game.api.wuziqi.service.RoleService;
import com.happy.record.share.game.api.wuziqi.service.RoomService;
import com.happy.record.share.game.utils.DateUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
@RequestMapping("/api")
@RestController
public class WuziqiEndPoint {
    private  static final Logger logger = LoggerFactory.getLogger(WuziqiEndPoint.class);
    @Autowired
    @Qualifier("roleService")  // @Resource(name = "userService")
    private RoleService roleService;

    @Autowired
    @Qualifier("roomService")
    private RoomService roomService;

    @RequestMapping(value = "/wuziqi/getRooms")
    @ResponseBody
    public List<Room> getRooms(){
        List<Room> rooms = roomService.getAllUnfinishRoom();
        for(Room room:rooms){
            logger.info("createDate="+DateUtils.format(room.getCreateTime()));
        }
        return rooms;
    }

    @RequestMapping(value = "/wuziqi/getList")
    @ResponseBody
    public List<WuziqiInfoDTO> getList(){
        List<WuziqiInfoDTO> wuziqiInfoList = new ArrayList<WuziqiInfoDTO>();
        WuziqiInfoDTO wuziqiInfo = new WuziqiInfoDTO();
        List<Role> roles = roleService.getAllRole();
        for(Role role:roles){
            logger.info(role.getName() + role.getPhone() + role.getId());
        }
        Role role1 = new Role(1,"sun","12344444444");
        Role role2 = new Role(2,"wang","12344455555");
        logger.info(DateUtils.format(DateUtils.addMinute(-30)));

        wuziqiInfo.setRole1(role1);
        wuziqiInfo.setRole2(role2);
        wuziqiInfo.setStartTime(new Date());
        wuziqiInfoList.add(wuziqiInfo);
        return wuziqiInfoList;
    }
}
