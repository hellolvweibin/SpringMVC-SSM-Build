/**
 * @Project ：SpringMVC-SSM-Build
 * @IDE ：IntelliJ IDEA
 * @Author ：Levi_Bee
 * @Date ：2021/12/22 3:07 下午
 */

package com.lv.service;

import com.lv.pojo.Books;


import java.util.List;

//业务层
public interface BookService {

    //增加一本书

    int addBook(Books books);

    //删除一本书
    int deleteBookById(int id);

    //更新一本书
    int updateBook(Books books);

    //查询一本书
    Books queryBookById(int id);

    //查询全部的书
    List<Books> queryAllBook();

    Books queryBookByName(String bookName);



}
