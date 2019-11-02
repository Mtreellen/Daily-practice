package com.ellen.java.operation;

import com.ellen.java.book.BookList;

/**
 * @author mtreellen
 * @date 2019-11-02-10:02
 */
public class DisplayOper implements Operation {
    @Override
    public void work(BookList bookList) {
        int size = bookList.getUsedSize();
        for (int i = 0; i < size; i++) {
            System.out.println(bookList.getBooks(i));
        }
    }
}
