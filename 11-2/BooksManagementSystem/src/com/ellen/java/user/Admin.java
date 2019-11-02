package com.ellen.java.user;

import com.ellen.java.operation.*;

/**
 * @author mtreellen
 * @date 2019-11-02-10:56
 */
public class Admin extends User{
    public Admin(String name){
        this.name = name;
        this.operations = new Operation[] {
                new ExitOper(),
                new FindOper(),
                new AddOper(),
                new DelOper(),
                new DisplayOper()
        };
    }
    @Override
    public int menu() {
        System.out.println("===欢迎 " + this.name + " 欢迎进入图书馆===");
        System.out.println("1.查找图书");
        System.out.println("2.新增图书");
        System.out.println("3.删除图书");
        System.out.println("4.显示图书");
        System.out.println("0.退出系统");
        System.out.println("==========================================");
        System.out.print("请输入选择：");
        int input = scanner.nextInt();
        return input;
    }
}
