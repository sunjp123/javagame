package com.happy.record.share.game.api.wuziqi;

import com.happy.record.share.game.api.wuziqi.model.Role;
import com.happy.record.share.game.api.wuziqi.model.WuziqiInfoDTO;
import com.happy.record.share.game.api.wuziqi.service.RoleService;
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

    @Autowired
    @Qualifier("roleService")  // @Resource(name = "userService")
    private RoleService roleService;

    @RequestMapping(value = "/wuziqi/getList")
    @ResponseBody
    public List<WuziqiInfoDTO> getList(){
        List<WuziqiInfoDTO> wuziqiInfoList = new ArrayList<WuziqiInfoDTO>();
        WuziqiInfoDTO wuziqiInfo = new WuziqiInfoDTO();
        List<Role> roles = roleService.getAllRole();
        System.out.println(roles);
        Role role1 = new Role(1,"sun","12344444444");
        Role role2 = new Role(2,"wang","12344455555");
        wuziqiInfo.setRole1(role1);
        wuziqiInfo.setRole2(role2);
        wuziqiInfo.setStartTime(new Date());
        wuziqiInfoList.add(wuziqiInfo);
        return wuziqiInfoList;
    }
}
