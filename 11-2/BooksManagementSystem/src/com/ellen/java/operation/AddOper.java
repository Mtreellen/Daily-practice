package com.ellen.java.operation;

import com.ellen.java.book.Book;
import com.ellen.java.book.BookList;

import java.util.Scanner;

/**
 * @author mtreellen
 * @date 2019-11-02-10:01
 */
public class AddOper implements Operation {
    @Override
    public void work(BookList bookList) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("输入图书名字：");
        String name = scanner.next();
        System.out.print("输入作者名字：");
        String author = scanner.next();
        System.out.print("输入图书价格：");
        Double price = scanner.nextDouble();
        System.out.print("输入图书类型：");
        String type = scanner.next();

        Book book = new Book(name, author, price, type);
        int size = bookList.getUsedSize();
        bookList.setBooks(size, book);
        bookList.setUsedSize(size + 1);
    }
}
