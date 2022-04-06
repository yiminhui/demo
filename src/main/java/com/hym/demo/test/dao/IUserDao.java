package com.hym.demo.test.dao;

/**
 * @author hym
 * @program: demo
 * @description: IUserDao
 * @date 2022-04-01
 */
public interface IUserDao {

    String queryUserName(String uId);

    Integer queryUserAge(String uId);

}
