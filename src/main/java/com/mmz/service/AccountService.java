package com.mmz.service;

import com.mmz.pojo.Account;

import java.util.List;

/**
 * @Classname AccountService
 * @Description 账户业务层接口
 * @Date 2020/5/9 13:16
 * @Created by mmz
 */
public interface AccountService {
    //查询所有
    List<Account> findAllAccount();

    //查询一个
    Account findAccountById(Integer accountid);

    //保存
    void saveAccount(Account account);

    //更新
    void updateAccount(Account account);

    //删除
    void deleteAccount(Integer accountid);
}
