package com.happy.record.share.game.api.wuziqi.dao;

import com.happy.record.share.game.api.wuziqi.model.Role;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;


import java.util.List;

@Mapper
public interface IRole {
    @Select("select * from user")
    public List<Role> getAllRole();
}
