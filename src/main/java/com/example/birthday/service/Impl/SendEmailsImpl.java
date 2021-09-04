package com.example.birthday.service.Impl;

import com.example.birthday.service.SendEmails;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.io.FileSystemResource;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.mail.javamail.MimeMessageHelper;
import org.springframework.stereotype.Service;
import org.thymeleaf.TemplateEngine;
import org.thymeleaf.context.Context;

import javax.mail.MessagingException;
import javax.mail.internet.MimeMessage;
import java.io.File;
import java.util.Date;

@Service
public class SendEmailsImpl implements SendEmails {

    @Autowired
    JavaMailSender javaMailSender;

    @Autowired
    TemplateEngine templateEngine;

//    @Resource
    public void sendBirMail(ToEmail toBirEmail)throws MessagingException{
         //创建Mime消息
        MimeMessage mimeMessage0=javaMailSender.createMimeMessage();
        MimeMessageHelper helper0=new MimeMessageHelper(mimeMessage0,true);

        //设置谁发，谁接收
        helper0.setFrom("1095012892@qq.com");
        helper0.setSubject(toBirEmail.getSubject());
        helper0.setTo(toBirEmail.getTos());
        helper0.setSentDate(new Date());

        //发送给生日者的demo
        //发送者姓名
        String[] username=toBirEmail.getName();
        //引入template中的context
        Context context=new Context();

        //这里对照着模板,template中对应的内容
        context.setVariable("username",username[0]);

        //下面设置图片之类的
        String process=templateEngine.process("BirDap.html",context);
        helper0.setText(process,true);
        File file=new File("src/main/resources/static/img.png");
        helper0.addInline("p01",new FileSystemResource(file));
        javaMailSender.send(mimeMessage0);
    }

    public void sendBosMail(ToEmail toBosEmail) throws MessagingException{
        MimeMessage mimeMessage1=javaMailSender.createMimeMessage();
        MimeMessageHelper helper1=new MimeMessageHelper(mimeMessage1);

        helper1.setFrom("1095012892@qq.com");
        helper1.setSubject(toBosEmail.getSubject());
        helper1.setTo(toBosEmail.getTos());
        helper1.setSentDate(new Date());

        //将这些连在一起
        String[] username=toBosEmail.getName();
        String all="";
        int Usize=username.length;
        int i=0;
        for(String x:username)
        {

            all+=x;
            i++;
            if(i<Usize)
                all+="、";
            else
                all+=" ";
            System.out.println(all);
        }
        //发送给老板们的demo
        Context context0=new Context();
        context0.setVariable("username",all);
        String process0 =templateEngine.process("AdminGet.html",context0);
        helper1.setText(process0,true);
        javaMailSender.send(mimeMessage1);

    }
}
