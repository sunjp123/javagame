package com.happy.record.share.game.api.wuziqi.dataSource;

import javax.sql.DataSource;

import org.apache.ibatis.session.SqlSessionFactory;
import org.mybatis.spring.SqlSessionFactoryBean;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.boot.jdbc.DataSourceBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.datasource.DataSourceTransactionManager;

@Configuration
@MapperScan(value = "com.happy.record.share.game.api.wuziqi.dao.user")
public class DataSourceConfig {
//    @Bean(name = "primaryDataSource")
//    @Qualifier("primaryDataSource")
//    @ConfigurationProperties(prefix="spring.datasource")
//    public DataSource primaryDataSource() {
//        return DataSourceBuilder.create().build();
//    }
//
//    @Bean(name = "primaryJdbcTemplate")
//    public JdbcTemplate primaryJdbcTemplate(
//            @Qualifier("primaryDataSource") DataSource dataSource) {
//        return new JdbcTemplate(dataSource);
//    }

    public static final String DATA_SOURCE = "fds";

    public static final String TRANSCATION_MANAGER = "ftm";

    public static final String SQLSESSION_FACTORY = "fsf";

    @Bean(name = DATA_SOURCE)
    @ConfigurationProperties(prefix = "spring.datasource")
    @Primary
    public DataSource dataSource() {
        return DataSourceBuilder.create().build();
    }

    @Bean(name = TRANSCATION_MANAGER)
    @Primary
    public DataSourceTransactionManager dataSourceTransactionManager(@Qualifier(DATA_SOURCE) DataSource ds) {
        return new DataSourceTransactionManager(ds);
    }

    @Bean(name = SQLSESSION_FACTORY)
    @Primary
    public SqlSessionFactory sqlSessionFactory(@Qualifier(DATA_SOURCE) DataSource ds) throws Exception {
        SqlSessionFactoryBean bean = new SqlSessionFactoryBean();
        bean.setDataSource(ds);
        return bean.getObject();
    }
}
