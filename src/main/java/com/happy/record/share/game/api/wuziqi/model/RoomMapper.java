package com.happy.record.share.game.api.wuziqi.model;

import com.happy.record.share.game.api.wuziqi.WuziqiEndPoint;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.jdbc.core.RowMapper;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Date;

public class RoomMapper implements RowMapper<Room> {
    private  static final Logger logger = LoggerFactory.getLogger(RoleMapper.class);
    @Override
    public Room mapRow(ResultSet resultSet, int i) throws SQLException {
        logger.info("RoleMapper id:"+resultSet.getInt("id"));
        Integer player1 = resultSet.getInt("player1");
        Integer player2 = resultSet.getInt("player2");
        Date createDate = resultSet.getDate("create_date");

        return new Room(new Role(player1,"",""),
                new Role(player2,"",""),
                createDate
                );
    }
}