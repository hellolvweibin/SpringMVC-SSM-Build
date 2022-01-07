/**
 * @Project ：SpringMVC-SSM-Build
 * @IDE ：IntelliJ IDEA
 * @Author ：Levi_Bee
 * @Date ：2021/12/22 2:45 下午
 */


package com.lv.dao;

import com.lv.pojo.Books;
import org.apache.ibatis.annotations.Param;

import java.util.List;

//定义接口实现对数据的操作
public interface  BookMapper {

    //增加一本书

    int addBook(Books books);

    //删除一本书
    int deleteBookById(@Param("bookID") int id);

    //更新一本书
    int updateBook(Books books);

    //查询一本书
    Books queryBookById(@Param("bookID") int id);

    //查询全部的书
    List<Books> queryAllBook();

    Books queryBookByName(@Param("bookName") String bookName);

}
