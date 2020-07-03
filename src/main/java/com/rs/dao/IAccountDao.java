package com.rs.dao;

import com.rs.domain.Account;

import java.util.List;

/**
 * @Description TODO
 * @createTime 2020年06月24日
 */
public interface IAccountDao {

    /**
     * 查询所有账户
     * */
    List<Account> findAllAccount();

    /**
    *通过id查询单个账户
    */
    Account findOneAccountById(Integer id);

    /**
     * 插入账户
     * */
    void insertOneAccount(Account account);

    /**
    * 通过id更新账户
    * */
    void updateOneAccountById(Account account);

    /**
     * 通过id删除一个账户
    * */
    void deleteOneAccountById(Integer id);
}
