package com.rs.server;

import com.rs.domain.Account;

import java.util.List;

/**
 * @Description TODO
 * @createTime 2020年06月24日
 */
public interface IAccountServlet {

    List<Account> findAllAccount();

    Account findOneAccount(Integer id);

    void insertAccount(Account account);

    void updateAccount(Account account);

    void  deleteAccount(Integer id);
}
