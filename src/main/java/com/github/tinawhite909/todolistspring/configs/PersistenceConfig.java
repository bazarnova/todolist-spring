package com.github.tinawhite909.todolistspring.configs;


import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionManager;
import org.mybatis.spring.SqlSessionFactoryBean;
import org.mybatis.spring.annotation.MapperScan;
import org.postgresql.ds.PGSimpleDataSource;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;
import org.springframework.data.jdbc.repository.config.MyBatisJdbcConfiguration;

import javax.sql.DataSource;

@Configuration
@Import(MyBatisJdbcConfiguration.class)
@MapperScan("com.example.demo.mybatis")
public class PersistenceConfig {

    @Bean
    public DataSource dataSource() {
        PGSimpleDataSource ds = new PGSimpleDataSource();
        ds.setURL("jdbc:postgresql://localhost:5432/postgres");
        ds.setUser("postgres");
        ds.setPassword("tina");
        return ds;
    }

    @Bean
    public SqlSessionFactoryBean sqlSessionFactory() {
        SqlSessionFactoryBean factoryBean = new SqlSessionFactoryBean();
        factoryBean.setDataSource(dataSource());
        return factoryBean;
    }

    @Bean
    public SqlSession sqlSession() throws Exception {
        return SqlSessionManager.newInstance(sqlSessionFactory().getObject());
    }
}