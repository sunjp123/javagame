package com.happy.record.share.game.api.wuziqi.dataSource;

import org.apache.ibatis.session.SqlSessionFactory;
import org.mybatis.spring.SqlSessionFactoryBean;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.boot.jdbc.DataSourceBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.datasource.DataSourceTransactionManager;

import javax.sql.DataSource;

import static com.happy.record.share.game.api.wuziqi.dataSource.GameDataSourceConfig.SQLSESSION_FACTORY;

@Configuration
@MapperScan(value = "com.happy.record.share.game.api.wuziqi.dao.game",sqlSessionFactoryRef=SQLSESSION_FACTORY)
public class GameDataSourceConfig {

//    @Bean(name = "gameDataSource")
//    @Qualifier("gameDataSource")
//    @ConfigurationProperties(prefix="spring.gamesource")
//    public DataSource gameDataSource() {
//        return DataSourceBuilder.create().build();
//    }
//
//    @Bean(name = "gameJdbcTemplate")
//    public JdbcTemplate gameJdbcTemplate(
//            @Qualifier("gameDataSource") DataSource dataSource) {
//        return new JdbcTemplate(dataSource);
//    }
    public static final String DATA_SOURCE = "sds";

    public static final String TRANSCATION_MANAGER = "stm";

    public static final String SQLSESSION_FACTORY = "ssf";

    @Bean(name = DATA_SOURCE)
    @ConfigurationProperties(prefix = "spring.gamesource")
    public DataSource dataSource() {
        return DataSourceBuilder.create().build();
    }

    @Bean(name = TRANSCATION_MANAGER)
    public DataSourceTransactionManager dataSourceTransactionManager(@Qualifier(DATA_SOURCE) DataSource ds) {
        return new DataSourceTransactionManager(ds);
    }

    @Bean(name = SQLSESSION_FACTORY)
    public SqlSessionFactory sqlSessionFactory(@Qualifier(DATA_SOURCE) DataSource ds) throws Exception {
        SqlSessionFactoryBean bean = new SqlSessionFactoryBean();
        bean.setDataSource(ds);
        return bean.getObject();
    }
}
