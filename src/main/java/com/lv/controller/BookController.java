/**
 * @Project ：SpringMVC-SSM-Build
 * @IDE ：IntelliJ IDEA
 * @Author ：Levi_Bee
 * @Date ：2021/12/22 7:53 下午
 */


package com.lv.controller;

import com.lv.pojo.Books;
import com.lv.service.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.ArrayList;
import java.util.List;

@Controller
@RequestMapping("/book")
public class BookController {

    //controller 调service层
    @Autowired
    @Qualifier("bookServiceImpl")
    private BookService bookService;

    //查询全部的书籍
    @RequestMapping("/allBook")
    public String list(Model model) {
        List<Books> list = bookService.queryAllBook();
        model.addAttribute("list", list);

        return "allBook";
    }

    //跳转到增加书籍页面
    @RequestMapping("/toAddBook")
    public String toAddPaper() {
        return "addBook";

    }

    //添加书籍的请求
    @RequestMapping("/addBook")
    public String addBook(Books books) {
        System.out.println("addBook==" + books);
        bookService.addBook(books);
        return "redirect:/book/allBook"; //重定向到我们的@RequestMapping("/allBook")
    }

    //跳转到修改页面
    @RequestMapping("/toUpdateBook")
    public String toUpdateBook(Model model, int id) {

        Books books = bookService.queryBookById(id);
        model.addAttribute("book", books);
        return "updateBook";
    }

    //修改书籍
    @RequestMapping("/updateBook")
    public String updateBook(Books books) {
        System.out.println("updateBook=>" + books);
        bookService.updateBook(books);
        return "redirect:/book/allBook";
    }

    //删除书籍
    @RequestMapping("/deleteBook/{bookID}")
    public String deleteBook(@PathVariable("bookID") int id) {


        bookService.deleteBookById(id);

        return "redirect:/book/allBook";
    }
    @RequestMapping("/queryBook")
    public String queryBook(String queryBookName,Model model){

        Books books = bookService.queryBookByName(queryBookName);
        List<Books> list =new ArrayList<>();
        list.add(books);
        model.addAttribute("list",list);
        return "allBook";
    }
}
