package com.trkj;

import com.trkj.test.User;
import com.trkj.test.UserDao;
import lombok.extern.slf4j.Slf4j;
import org.apache.logging.log4j.LogManager;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

@SpringBootTest
@Slf4j
class PmsApplicationTests {

    @Test
    void contextLoads() {
        // 使用slf4j输出日志
//        log.error("error");
//        log.warn("warn");
//        log.info("info");
//        log.debug("debug");
//        log.trace("trace");

        // 使用log4j2输出日志， 底层会使用桥接器切换为slf4j门面和logback日志实现

//        log.fatal("log4j2 fatal");
        log.error("log4j2 error");
        log.warn("log4j2 warn");
        log.info("log4j2 info");
        log.debug("log4j2 debug");
        log.trace("log4j2 trace");


    }

    @Autowired
    private UserDao userDao;
    @Test
    public void testUserDao(){
        List<User> users = userDao.selectList(null);
//        int i=1/0;
        System.out.println("用户信息"+users);
    }

}
