package com.hym.demo.mybatis.session.defaults;

import com.hym.demo.mybatis.binding.MapperRegistry;
import com.hym.demo.mybatis.session.SqlSession;
import com.hym.demo.mybatis.session.SqlSessionFactory;

/**
 * @author hym
 * @program: demo
 * @description: defaultSqlSessionFactory
 * @date 2022-04-06
 */
public class DefaultSqlSessionFactory implements SqlSessionFactory {

    private final MapperRegistry mapperRegistry;

    public DefaultSqlSessionFactory(MapperRegistry mapperRegistry) {
        this.mapperRegistry = mapperRegistry;
    }


    @Override
    public SqlSession openSession() {
        return new DefaultSqlSession(mapperRegistry);
    }
}
