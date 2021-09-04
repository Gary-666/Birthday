package com.example.birthday.mapper;

import com.example.birthday.pojo.User;
import javassist.Loader;
import org.apache.ibatis.annotations.Select;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

@Component
public interface UserMapper  extends JpaRepository<User,Integer> {
//    @Query(value="select u from User u where u.username=:username")
//    User selectUserByName(String username);
//
//    @Query(value="select x from User x where x.birthaday=:birthday")
//    User selectUserByBir(Date  birthday);
//      User findUserByUsername(String username);
//      User findUserByBirthaday(Date date);

      List<User> findAll();
      //添加用户,直接所有属性
   //   User findUserById(int id);
   //   List<User> findUsersByBirthaday(Date date);
//    SimpleDateFormat simpleDateFormat=new SimpleDateFormat("MM-dd");
//
//     @Query( value = "select u from User u ")
//      List<User> getBirthday(String currDay);
}

