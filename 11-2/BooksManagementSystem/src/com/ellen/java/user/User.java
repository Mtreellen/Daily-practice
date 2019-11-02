package com.ellen.java.user;

import com.ellen.java.book.BookList;
import com.ellen.java.operation.Operation;

import java.util.Scanner;

/**
 * @author mtreellen
 * @date 2019-11-02-10:56
 */
public abstract class User {
    public String name;
    protected Operation[] operations;
    Scanner scanner = new Scanner(System.in);
    public abstract int menu();

    public void doOperation(int input, BookList bookList){
        operations[input].work(bookList);
    }
}
