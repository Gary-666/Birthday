package com.example.birthday.service;

import com.example.birthday.pojo.User;
import org.springframework.data.jpa.repository.Query;

import javax.mail.MessagingException;
import java.util.Date;
import java.util.List;

public interface UserService {

    List<User> findBirToUsers(); //返回当天生日的用户
    List<User> findBirMoUsers(); //返回本月生日的用户
    void sendBirEmail(List<User> users) throws MessagingException;
    void sendBosEmail(List<User> users,String []bos) throws MessagingException;
//    //添加用户
//    void addUser(User user);
//
//    //删除用户
//    void deleteUserById(int uid);
//
//    //修改用户
//    void updateUser(User user);
//
//    //查询用户
//    User selectUserById(int uid);
//
//    //查询所有保存用户
//    List<User> selectAllUsers();
//
//    //批量保存用户
//    void addUserList(List<User> userList);
//
//    //获取用户的生日,月、日。
//    String getBirDate(Date date);


}
