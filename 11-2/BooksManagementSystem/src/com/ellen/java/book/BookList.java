package com.ellen.java.book;

/**
 * @author mtreellen
 * @date 2019-11-02-9:51
 */
public class BookList {
    private Book[] books = new Book[100];
    private int usedSize = 0;

    public BookList() {
        books[0] = new Book("红楼梦", "曹雪芹", 12.3, "阅读");
        books[1] = new Book("数据结构", "小红", 39.9, "学习");
        books[2] = new Book("数学分析", "陈纪修", 40.0, "学习");
        this.usedSize = 3;
    }

    public Book getBooks(int pos) {
        return this.books[pos];
    }

    public void setBooks(int pos, Book book) {
        this.books[pos] = book;
    }

    public int getUsedSize() {
        return usedSize;
    }

    public void setUsedSize(int usedSize) {
        this.usedSize = usedSize;
    }
}
