/**
 * @Project ：SpringMVC-SSM-Build
 * @IDE ：IntelliJ IDEA
 * @Author ：Levi_Bee
 * @Date ：2021/12/22 2:43 下午
 */


package com.lv.pojo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Books {
    private int bookID;
    private String bookName;
    private int bookCounts;
    private String detail;

}
