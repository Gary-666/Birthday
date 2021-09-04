package com.example.birthday.service.Impl;

import java.io.Serializable;



public class ToEmail implements Serializable {
    //多个接收方
    private String[]tos;

    public String[] getTos() {
        return tos;
    }

    public void setTos(String[] tos) {
        this.tos = tos;
    }



    //邮件主题
    private String subject;

    public void setSubject(String subject) {
        this.subject = subject;
    }
    public String getSubject() {
        return subject;
    }

    //接收方的名字
    private String[]name;

    public void setName(String[] name) {
        this.name = name;
    }

    public String[] getName() {
        return name;
    }

//    //单个接收方
//    private String Stos;
//
//    public void setStos(String stos) {
//        Stos = stos;
//    }
//
//    public String getStos() {
//        return Stos;
//    }
}
