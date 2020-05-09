package com.mmz.dao.impl;

import com.mmz.dao.AccountDao;
import com.mmz.pojo.Account;
import lombok.Data;
import org.apache.commons.dbutils.QueryRunner;
import org.apache.commons.dbutils.handlers.BeanHandler;
import org.apache.commons.dbutils.handlers.BeanListHandler;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.sql.SQLException;
import java.util.List;

/**
 * @Classname AccountDaoImpl
 * @Description TODO
 * @Date 2020/5/9 13:24
 * @Created by mmz
 */
@Data
@Repository(value = "accountDao")
public class AccountDaoImpl implements AccountDao {

    @Autowired
    private QueryRunner queryRunner;


    public List<Account> findAllAccount(){
        try {
            return queryRunner.query("select * from account",new BeanListHandler<Account>(Account.class));
        }catch (Exception e){
            throw new RuntimeException(e);
        }
    }

    public Account findAccountById(Integer accountid) {
        try {
            return queryRunner.query("select * from account where id = ?",new BeanHandler<Account>(Account.class),accountid);
        }catch (Exception e){
            throw new RuntimeException(e);
        }
    }

    public void saveAccount(Account account) {
        try {
            queryRunner.update("insert into account(name,money) values(?,?)",account.getName(),account.getMoney());
        }catch (Exception e){
            throw new RuntimeException(e);
        }
    }

    public void updateAccount(Account account) {
        try {
            queryRunner.update("update account set name=?,money=? where id=?",account.getName(),account.getMoney(),account.getId());
        }catch (Exception e){
            throw new RuntimeException(e);
        }
    }

    public void deleteAccount(Integer accountid) {
        try {
            queryRunner.update("delete from  account where id = ?",accountid);
        }catch (Exception e){
            throw new RuntimeException(e);
        }
    }
}
