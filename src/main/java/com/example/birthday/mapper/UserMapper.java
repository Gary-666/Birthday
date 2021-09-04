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
      List<User> findAll();
}

