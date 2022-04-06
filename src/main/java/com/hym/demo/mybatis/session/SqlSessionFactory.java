package com.hym.demo.mybatis.session;

/**
 * @author hym
 * @program: demo
 * @description: SqlSessionFactory
 * @date 2022-04-06
 */
public interface SqlSessionFactory {

    /**
     * @param
     * @return com.hym.demo.mybatis.session.SqlSession
     * @author hym
     * @describe: 打开一个Session
     * @date 2022/4/6 11:21
     */
    SqlSession openSession();

}
