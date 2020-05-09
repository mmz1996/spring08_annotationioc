package com.mmz.pojo;

import lombok.Data;

import java.io.Serializable;

/**
 * @Classname Account
 * @Description TODO
 * @Date 2020/5/9 13:16
 * @Created by mmz
 */
@Data
public class Account implements Serializable {

    private Integer id;
    private String name;
    private float money;

    @Override
    public String toString() {
        return "Account{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", money=" + money +
                '}';
    }
}
