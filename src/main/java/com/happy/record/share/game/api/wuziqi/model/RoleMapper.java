package com.happy.record.share.game.api.wuziqi.model;

import com.happy.record.share.game.api.wuziqi.WuziqiEndPoint;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.jdbc.core.RowMapper;

import java.sql.ResultSet;
import java.sql.SQLException;

public class RoleMapper implements RowMapper<Role> {
    private  static final Logger logger = LoggerFactory.getLogger(RoleMapper.class);
    @Override
    public Role mapRow(ResultSet resultSet, int i) throws SQLException {
        logger.info("RoleMapper id:"+resultSet.getInt("id"));
        return new Role(resultSet.getInt("id"),resultSet.getString("name")
                ,resultSet.getString("phone"));
    }
}