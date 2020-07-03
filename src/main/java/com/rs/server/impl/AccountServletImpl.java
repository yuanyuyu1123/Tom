package com.rs.server.impl;

import com.rs.dao.IAccountDao;
import com.rs.domain.Account;
import com.rs.server.IAccountServlet;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @Description TODO
 * @createTime 2020年06月24日
 */

@Service
public class AccountServletImpl implements IAccountServlet {

    @Autowired
    private IAccountDao accountDao;
    @Override
    public List<Account> findAllAccount() {
        List<Account> allAccount = accountDao.findAllAccount();
        return allAccount;
    }

    @Override
    public Account findOneAccount(Integer id) {
        Account oneAccountById = accountDao.findOneAccountById(id);

        return oneAccountById;
    }

    @Override
    public void insertAccount(Account account) {
        accountDao.insertOneAccount(account);
    }

    @Override
    public void updateAccount(Account account) {
        accountDao.updateOneAccountById(account);
    }

    @Override
    public void deleteAccount(Integer id) {
        accountDao.deleteOneAccountById(id);
    }
}
