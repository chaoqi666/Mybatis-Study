package com.qi.dao;

import com.qi.pojo.Blog;

import java.util.List;
import java.util.Map;

public interface BlogMapper {

    //添加数据
    int addBlog(Blog blog);
    //if查询
    List<Blog> queryBlogIF(Map map);
    //choose查询
    List<Blog> queryBlogChoose(Map map);
    //foreach查询
    List<Blog> queryBlogForeach(Map map);
    //更新博客
    int updateBlog(Map map);
}
