package com.rs.controller;

import com.rs.domain.Account;
import com.rs.exception.SysException;
import com.rs.server.IAccountServlet;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

/**
 * @Description TODO
 * @createTime 2020年06月24日
 */
@Controller
@RequestMapping("/account")
public class AccountController {

    @Autowired
    private IAccountServlet accountServlet;

    @RequestMapping("/findAll")
    public String findAll(Model model) throws SysException {
        try {
            List<Account> allAccount = accountServlet.findAllAccount();
            model.addAttribute("list",allAccount);
           // int i=1/0;
        } catch (Exception e) {
            e.printStackTrace();
            throw new SysException("查询出错");
        }
        return "list";
    }
}
