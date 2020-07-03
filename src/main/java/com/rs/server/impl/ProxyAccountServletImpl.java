package com.rs.server.impl;


import com.rs.utils.Logger;
import org.aopalliance.intercept.MethodInterceptor;
import org.aopalliance.intercept.MethodInvocation;
import org.springframework.beans.BeansException;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;
import org.springframework.stereotype.Service;

/**
 * @Description TODO
 * @createTime 2020年06月24日
 */
@Service
public class ProxyAccountServletImpl implements MethodInterceptor, ApplicationContextAware {

    private ApplicationContext applicationContext;

    @Override
    public Object invoke(MethodInvocation methodInvocation) throws Throwable {
        Logger logger = (Logger)applicationContext.getBean("logger");
        logger.log();
        Object proceed = methodInvocation.proceed();
        return proceed;
    }

    @Override
    public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {
        applicationContext=this.applicationContext;
    }
}
