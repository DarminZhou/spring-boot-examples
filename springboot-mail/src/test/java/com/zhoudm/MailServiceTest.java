package com.zhoudm;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

/**
 * Created by Administrator on 2017/7/19.
 */
@RunWith(SpringRunner.class)
@SpringBootTest
public class MailServiceTest {
    @Autowired
    private MailService MailService;

    @Test
    public void testSimpleMail() throws Exception{
        MailService.sendSimpleMail("damzhou@163.com","test simple mail " , "hello this is simple mail!");
    }
}
