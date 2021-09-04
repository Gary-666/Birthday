package com.example.birthday.service;

import com.example.birthday.service.Impl.ToEmail;

import javax.mail.MessagingException;
import java.io.Serializable;

public interface SendEmails {
    //给生日者的一封邮件
    public void sendBirMail(ToEmail toBirEmail) throws MessagingException;
    //给老板的一封邮件
    public void sendBosMail(ToEmail toBosEmail) throws MessagingException;
}
