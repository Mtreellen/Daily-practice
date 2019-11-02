package com.ellen.java.operation;

import com.ellen.java.book.Book;
import com.ellen.java.book.BookList;

/**
 * @author mtreellen
 * @date 2019-11-02-10:30
 */
public class DelOper implements Operation {
    @Override
    public void work(BookList bookList) {
        System.out.print("请输入要删除的图书：");
        String name = scanner.next();
        int size = bookList.getUsedSize();
        int i = 0;
        for (; i < size; i++) {
            if(bookList.getBooks(i).getName().equals(name)){
                break;
            }
        }
        if(i >= size){
            System.out.println("您要删除的图书不存在");
            return;
        }
        for (int j = i; j < size - 1; j++) {
            Book book = bookList.getBooks(j + 1);
            bookList.setBooks(j, book);
        }
        bookList.setUsedSize(size - 1);
        System.out.println("删除成功！！");
    }
}
