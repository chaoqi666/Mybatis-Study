package com.qi.pojo;

import lombok.Data;

import java.util.Date;

@Data
public class Blog {
    private String id;
    private String title;
    private String author;
    private Date createTime;// 属性名和字段名不一致,驼峰命名
    private int views;
}
