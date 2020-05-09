package com.mmz.service.impl;

import com.mmz.dao.AccountDao;
import com.mmz.pojo.Account;
import com.mmz.service.AccountService;
import lombok.Data;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @Classname AccountServiceImpl
 * @Description TODO
 * @Date 2020/5/9 13:20
 * @Created by mmz
 */
@Data
@Service(value = "accountService")
public class AccountServiceImpl implements AccountService {

    @Autowired
    private AccountDao accountDao;



    public List<Account> findAllAccount() {
        return accountDao.findAllAccount();
    }

    public Account findAccountById(Integer accountid) {
        return accountDao.findAccountById(accountid);
    }

    public void saveAccount(Account account) {
        accountDao.saveAccount(account);
    }

    public void updateAccount(Account account) {
        accountDao.updateAccount(account);
    }

    public void deleteAccount(Integer accountid) {
        accountDao.deleteAccount(accountid);
    }
}
