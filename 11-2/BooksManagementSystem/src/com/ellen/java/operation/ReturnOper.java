package com.ellen.java.operation;

import com.ellen.java.book.Book;
import com.ellen.java.book.BookList;

/**
 * @author mtreellen
 * @date 2019-11-02-10:48
 */
public class ReturnOper implements Operation {
    @Override
    public void work(BookList bookList) {
        System.out.print("输入您要归还的书籍：");
        String name = scanner.next();
        Book book = null;
        int i = 0;
        for (; i < bookList.getUsedSize(); i++) {
            if(bookList.getBooks(i).getName().equals(name)){
                book = bookList.getBooks(i);
                break;
            }
        }
        if(i >= bookList.getUsedSize()){
            System.out.println("没有此书籍");
            return;
        }
        if((book != null) && (!book.getBorrowed())){
            System.out.println("此书没有被借阅");
            return;
        }
        if(book != null && book.getBorrowed()){
            book.setBorrowed(false);
            System.out.println("归还成功！1");
        }
    }
}
