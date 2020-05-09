package com.mmz.dao;

import com.mmz.pojo.Account;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * @Classname AccountDao
 * @Description 账户的持久层接口
 * @Date 2020/5/9 13:21
 * @Created by mmz
 */
@Repository
public interface AccountDao {
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
