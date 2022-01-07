/**
 * @Project ：SpringMVC-SSM-Build
 * @IDE ：IntelliJ IDEA
 * @Author ：Levi_Bee
 * @Date ：2021/12/22 3:09 下午
 */


package com.lv.service;

import com.lv.dao.BookMapper;
import com.lv.pojo.Books;

import java.util.List;

public class BookServiceImpl implements BookService {

    //service 调动dao层：组合dao

    private BookMapper bookMapper;

    public void setBookMapper(BookMapper bookMapper) {
        this.bookMapper = bookMapper;
    }

    public int addBook(Books book) {
        return bookMapper.addBook(book);
    }

    public int deleteBookById(int id) {
        return bookMapper.deleteBookById(id);
    }

    public int updateBook(Books books) {
        return bookMapper.updateBook(books);
    }

    public Books queryBookById(int id) {
        return bookMapper.queryBookById(id);
    }

    public List<Books> queryAllBook() {
        return bookMapper.queryAllBook();
    }

    @Override
    public Books queryBookByName(String bookName) {
        return bookMapper.queryBookByName(bookName);
    }
}
