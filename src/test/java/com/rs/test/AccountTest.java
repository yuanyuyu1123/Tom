package com.rs.test;

import com.rs.domain.Account;
import com.rs.server.IAccountServlet;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.List;

/**
 * @Description TODO
 * @createTime 2020年06月24日
 */
public class AccountTest {

    @Test
    public void dindAll(){
        ApplicationContext cp = new ClassPathXmlApplicationContext("applicationContext.xml");
        IAccountServlet accountServletImpl = (IAccountServlet)cp.getBean("accountServletImpl");
        List<Account> allAccount = accountServletImpl.findAllAccount();

    }
}
