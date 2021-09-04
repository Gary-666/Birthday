package com.example.birthday.pojo;


import com.fasterxml.jackson.annotation.JsonFormat;
import org.springframework.format.annotation.DateTimeFormat;

import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name="User")
public class User {


    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer user_id;

//    public Integer getUser_id() {
//        return user_id;
//    } ``````````````````
//
//    public void setUser_id(Integer user_id) {
//        this.user_id = user_id;
//    }



    @Column(name="username")
    private String username;

    public void setUsername(String username) {
        this.username = username;
    }

    public String getUsername() {
        return username;
    }



    @Column(name="birthday")
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    private Date birthaday;
    public Date getBirthaday() {
        return birthaday;
    }

    public void setBirthaday(Date birthaday) {
        this.birthaday = birthaday;
    }


    @Column(name="age")
    private int age;

    public void setAge(int age) {
        this.age = age;
    }

    public int getAge() {
        return age;
    }

    @Column(name="sex")
    private String sex;

    public void setSex(String sex) {
        this.sex = sex;
    }
    public String getSex() {
        return sex;
    }


    @Column(name="email")
    private String Email;

    public void setEmail(String email) {
        Email = email;
    }

    public String getEmail() {
        return Email;
    }

    @Column(name="qq")
    private int qq;

    public void setQq(int qq) {
        this.qq = qq;
    }

    public int getQq() {
        return qq;
    }

    @Column(name="timeset")
    private int timeset;

    public void setTimeset(int timeset) {
        this.timeset = timeset;
    }

    public int getTimeset() {
        return timeset;
    }

    @Column(name = "phone")
    private String phone;

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getPhone() {
        return phone;
    }
}
