package com.hym.demo;

import com.hym.demo.test.dao.ISchoolDao;
import com.hym.demo.test.dao.IUserDao;
import com.hym.demo.mybatis.binding.MapperRegistry;
import com.hym.demo.mybatis.session.SqlSession;
import com.hym.demo.mybatis.session.SqlSessionFactory;
import com.hym.demo.mybatis.session.defaults.DefaultSqlSessionFactory;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.junit.jupiter.api.Test;

class DemoApplicationTests {

    private static Logger logger = LogManager.getLogger(DemoApplicationTests.class);

    @Test
    void contextLoads() {
    }

    @Test
    public void test_MapperProxyFactory() {
        // 1. 注册 Mapper
        MapperRegistry registry = new MapperRegistry();
        registry.addMappers("com.hym.demo.test.dao");

        // 2. 从 SqlSession 工厂获取 Session
        SqlSessionFactory sqlSessionFactory = new DefaultSqlSessionFactory(registry);
        SqlSession sqlSession = sqlSessionFactory.openSession();

        // 3. 获取映射器对象
        ISchoolDao schoolDao = sqlSession.getMapper(ISchoolDao.class);

        // 4. 测试验证
        String res = schoolDao.querySchoolName("10001");
        logger.info("测试结果：{}", res);
    }

}
