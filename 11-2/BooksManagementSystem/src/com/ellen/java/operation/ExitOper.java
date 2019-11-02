package com.ellen.java.operation;

import com.ellen.java.book.BookList;

/**
 * @author mtreellen
 * @date 2019-11-02-10:54
 */
public class ExitOper implements Operation{
    @Override
    public void work(BookList bookList) {
        System.out.println("程序退出");
        System.exit(0);
    }
}
