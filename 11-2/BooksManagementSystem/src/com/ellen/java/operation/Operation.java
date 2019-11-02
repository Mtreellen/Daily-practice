package com.ellen.java.operation;

import com.ellen.java.book.BookList;

import java.util.Scanner;

/**
 * @author mtreellen
 * @date 2019-11-02-10:00
 */
public interface Operation {
    Scanner scanner = new Scanner(System.in);
    void work(BookList bookList);
}
