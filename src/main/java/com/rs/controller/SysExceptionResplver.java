package com.rs.controller;

import com.rs.exception.SysException;
import org.springframework.stereotype.Service;
import org.springframework.web.servlet.HandlerExceptionResolver;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * @Description TODO
 * @createTime 2020年06月25日
 */
class SysExceptionResolver implements HandlerExceptionResolver {
    @Override
    public ModelAndView resolveException(HttpServletRequest httpServletRequest, HttpServletResponse httpServletResponse, Object o, Exception e) {
        Exception es=null;
        if(e instanceof SysException){
            es=e;
        }else if(e instanceof IOException){
            es=new SysException("IO异常");
            es.printStackTrace();
        }else {
            es=new SysException("系统正在维护...");
            es.printStackTrace();
        }
        ModelAndView modelAndView = new ModelAndView();
        modelAndView.addObject("errorMsg",es.getMessage());
        modelAndView.setViewName("error");
        return modelAndView;
    }
}
