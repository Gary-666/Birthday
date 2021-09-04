package com.example.birthday.pojo;

import javax.persistence.*;

@Entity
@Table(name="Msg")
public class Msg {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer Id;

    public void setId(Integer id) {
        Id = id;
    }

    public Integer getId() {
        return Id;
    }

    @Column(name="message")
    private String messager;

    public void setMessager(String messager) {
        this.messager = messager;
    }

    public String getMessager() {
        return messager;
    }
}
