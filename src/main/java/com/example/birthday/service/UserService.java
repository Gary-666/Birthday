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
}
