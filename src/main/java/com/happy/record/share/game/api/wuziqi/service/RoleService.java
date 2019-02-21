package com.happy.record.share.game.api.wuziqi.service;


import com.happy.record.share.game.api.wuziqi.dao.user.IRole;
import com.happy.record.share.game.api.wuziqi.model.Role;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service(value="roleService")
public class RoleService {
    @Autowired
    private IRole iRole;

    public List<Role> getAllRole() {
        // TODO 自动生成的方法存根
        return iRole.getAllRole();
    }
}