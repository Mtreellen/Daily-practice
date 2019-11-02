package com.ellen.java.operation;

import com.ellen.java.book.Book;
import com.ellen.java.book.BookList;

/**
 * @author mtreellen
 * @date 2019-11-02-10:18
 */
public class BrrowOper implements Operation {
    @Override
    public void work(BookList bookList) {
        System.out.print("输入借书名字：");
        String name = scanner.next();
        int size = bookList.getUsedSize();
        int i = 0;
        for (; i < size; i++) {
            if(bookList.getBooks(i).getName().equals(name)){
                break;
            }
        }
        if(i >= bookList.getUsedSize()) {
            System.out.println("您要找的书籍不存在");
            return;
        }
        Book book = bookList.getBooks(i);
        if(book.getBorrowed()){
            System.out.println("此书已经借出");
        }else{
            book.setBorrowed(true);
            System.out.println("成功借出！！");
        }
    }
}
