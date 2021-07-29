package com.cx.bank.dao;

import com.cx.bank.model.MoneyBean;

/**
 * @ClassName BankDaoInterface
 * @Description 对操作存储介质方法进行说明
 * @Author Bruce Xu
 * @Date 2021/7/14 17:51
 * @Version 1.4
 */
public interface BankDaoInterface {
    /**
     * 存储方法
     *
     * @param moneyBean 钱包对象
     * @param userName  用户对象
     */
    void saveMoney(MoneyBean moneyBean, String userName);

    /**
     * 添加用户
     *
     * @param userName 用户名
     * @param password 用户密码
     */
    void insertUser(String userName, String password);

    /**
     * 更新金额
     *
     * @param name   转账目标用户名
     * @param amount 转账金额
     * @return 转账目标用户名是否存在
     */
    boolean updateMoney(String name, double amount);

    /**
     * 按用户名查找
     *
     * @param name 用户名
     * @return 是否成功
     */
    boolean findByName(String name);

    /**
     * 按用户名以及密码查找
     *
     * @param name     用户名
     * @param password 密码
     * @return 是否成功
     */
    String findUser(String name, String password);

    /**
     * 获取余额信息
     *
     * @param userName 用户名
     * @return 得到用户余额
     */
    double getMoney(String userName);
}
