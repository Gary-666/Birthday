package com.example.birthday.pojo;


import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.Getter;
import lombok.Setter;
import org.springframework.format.annotation.DateTimeFormat;

import javax.persistence.*;
import java.util.Date;

@Getter
@Setter
@Entity
@Table(name="User")
public class User {


    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer user_id;

    @Column(name="username")
    private String username;

    @Column(name="birthday")
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    private Date birthaday;

    @Column(name="age")
    private int age;

    @Column(name="sex")
    private String sex;

    @Column(name="email")
    private String Email;

    @Column(name="qq")
    private int qq;

    @Column(name="timeset")
    private int timeset;

    @Column(name = "phone")
    private String phone;

}
