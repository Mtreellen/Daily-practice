package com.ellen.java.operation;

import com.ellen.java.book.BookList;

/**
 * @author mtreellen
 * @date 2019-11-02-10:44
 */
public class FindOper implements Operation {
    @Override
    public void work(BookList bookList) {
        System.out.print("输入查找的图书：");
        String name = scanner.next();
        int i = 0;
        for (; i < bookList.getUsedSize(); i++) {
            if(bookList.getBooks(i).getName().equals(name)){
                System.out.println(bookList.getBooks(i));
                return;
            }
        }
        if(i >= bookList.getUsedSize()){
            System.out.println("您要查找的书籍不存在");
        }
    }
}
