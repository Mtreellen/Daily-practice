package com.ellen.java.main;

import com.ellen.java.book.BookList;
import com.ellen.java.user.Admin;
import com.ellen.java.user.Normal;
import com.ellen.java.user.User;

import java.util.Scanner;

/**
 * @author mtreellen
 * @date 2019-11-02-11:09
 */
public class Main {
    public static void main(String[] args) {
        BookList bookList = new BookList();
        User user = login();
        while(true){
            int input = user.menu();
            user.doOperation(input,bookList);
        }
    }
    public static User login(){
        Scanner scanner = new Scanner(System.in);
        System.out.print("请输入你的姓名：");
        String name = scanner.next();
        System.out.print("输入您的身份（1-管理员，0-普通用户): ");
        int input = scanner.nextInt();

        if(input == 1){
            return new Admin(name);
        }else{
            return new Normal(name);
        }
    }
}
