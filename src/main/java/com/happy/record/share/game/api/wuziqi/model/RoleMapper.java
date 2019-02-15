package com.happy.record.share.game.api.wuziqi.model;

import org.springframework.jdbc.core.RowMapper;

import java.sql.ResultSet;
import java.sql.SQLException;

public class RoleMapper implements RowMapper<Role> {
    @Override
    public Role mapRow(ResultSet resultSet, int i) throws SQLException {
        return new Role(resultSet.getInt("id"),resultSet.getString("name")
                ,resultSet.getString("phone"));
    }
}