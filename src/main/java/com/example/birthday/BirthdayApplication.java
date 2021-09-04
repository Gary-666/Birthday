package com.example.birthday;

import com.example.birthday.pojo.User;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableScheduling;

@SpringBootApplication
@MapperScan("com.example.birthday.mapper")
public class BirthdayApplication {
    public static void main(String[] args) {
        SpringApplication.run(BirthdayApplication.class, args);
    }
}
