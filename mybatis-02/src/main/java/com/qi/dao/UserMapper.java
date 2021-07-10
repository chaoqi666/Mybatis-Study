package com.qi.dao;

import com.qi.pojo.Users;

import java.util.List;
import java.util.Map;

public interface UserMapper {
    //查询所有成员
    List<Users> getUserList();
    //根据ID查询
    Users getUserById(int id);
    //插入用户
    int addUser(Users user);
    //修改用户
    int updateUser(Users user);
    //删除用户
    int deleteUser(int id);
    //用万能Map插入用户
    void addUser2(Map<String,Object> map);
}
