package com.qi.dao;

import com.qi.pojo.Users;
import com.qi.utils.MybatisUtils;
import org.apache.ibatis.session.SqlSession;
import org.junit.Test;

import java.util.HashMap;
import java.util.List;

public class UserDaoTest {

    @Test
    public void test_getUserList() {
        //1.获取SqlSession对象
        SqlSession sqlSession = MybatisUtils.getSqlSession();
        //2.执行SQL
        // 方式一：getMapper
        UserMapper userMapper = sqlSession.getMapper(UserMapper.class);
        List<Users> userList = userMapper.getUserList();
        for (Users user : userList) {
            System.out.println(user);
        }
        //3.关闭sqlSession
        sqlSession.close();
    }

    @Test
    public void test_getUserById() {
        //1.获取SqlSession对象
        SqlSession sqlSession = MybatisUtils.getSqlSession();
        //2.执行SQL
        UserMapper userMapper = sqlSession.getMapper(UserMapper.class);
        Users user = userMapper.getUserById(1);
        System.out.println(user);
        //3.关闭sqlSession
        sqlSession.close();
    }

    @Test
    public void test_addUser() {
        //1.获取SqlSession对象
        SqlSession sqlSession = MybatisUtils.getSqlSession();
        //2.执行SQL
        UserMapper userMapper = sqlSession.getMapper(UserMapper.class);
        int res = userMapper.addUser(new Users(5, "猴子", "555555"));
        if (res > 0) {
            System.out.println("插入成功");
        }
        //3.提交事务
        sqlSession.commit();
        //4.关闭sqlSession
        sqlSession.close();
    }

    @Test
    public void test_updateUser(){
        SqlSession sqlSession = MybatisUtils.getSqlSession();

        UserMapper userMapper = sqlSession.getMapper(UserMapper.class);
        int res = userMapper.updateUser(new Users(4,"hou","123123"));
        if (res > 0) {
            System.out.println("修改成功");
        }
        //提交事务
        sqlSession.commit();
        sqlSession.close();
    }

    @Test
    public void test_deleteUser(){
        SqlSession sqlSession = MybatisUtils.getSqlSession();

        UserMapper userMapper = sqlSession.getMapper(UserMapper.class);
        int res = userMapper.deleteUser(5);
        if (res > 0) {
            System.out.println("删除成功");
        }
        //提交事务
        sqlSession.commit();
        sqlSession.close();
    }

    @Test
    public void test_addUser2(){
        SqlSession sqlSession = MybatisUtils.getSqlSession();
        UserMapper mapper = sqlSession.getMapper(UserMapper.class);
        HashMap<String, Object> map = new HashMap<String, Object>();
        map.put("userid",5);
        map.put("username","大哥");
        map.put("userpassword",6546789);
        mapper.addUser2(map);
        //提交事务
        sqlSession.commit();
        //关闭资源
        sqlSession.close();
    }
}
