package com.wanghang.fxmall.commons.mybatis;


import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

import java.io.IOException;
import java.io.InputStream;


@Configuration
public class MybatisSessionFactoryUtils {
    private static ThreadLocal<SqlSession> threadLocal = new ThreadLocal<>();

    @Bean
    public SqlSessionFactory proviteSqlSessionFatory() throws IOException {
            InputStream resourceAsStream = Resources.getResourceAsStream("mybatis.cfg.xml");
            SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(resourceAsStream);

        return sqlSessionFactory;
    }
    @Scope("prototype")
    @Bean
    public SqlSession proviteSession(SqlSessionFactory sqlSessionFactory){
        SqlSession session = threadLocal.get();
        if(session == null){
            session = sqlSessionFactory.openSession();
        }
        return session;
    }

}
