package com.example.birthday;

import com.example.birthday.pojo.User;
import com.example.birthday.service.UserService;
import org.springframework.context.annotation.Conditional;
import org.springframework.context.annotation.Scope;
import org.springframework.scheduling.annotation.Async;
import org.springframework.scheduling.annotation.EnableAsync;
import org.springframework.scheduling.annotation.EnableScheduling;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

import javax.annotation.Resource;
import javax.mail.MessagingException;
import java.time.LocalDateTime;
import java.util.List;

@Component
@EnableScheduling
@EnableAsync
public class Run {
    @Resource
    private UserService userService;

    //每天检查一遍
    @Async
    @Scheduled(cron="0 0 7 * * ?")
    public void SENDBIRMAIL() throws MessagingException {
        List<User> users;
        users=this.userService.findBirToUsers();
        System.out.println(users.size());
        this.userService.sendBirEmail(users);
    }

    //每月凌晨一点发送本周的所有数据
    @Async
    @Scheduled(cron="0 0 7 1 * ?")
    public void SENDBOSMAIL() throws MessagingException {

        String []bos={"396977640@qq.com"};
        List<User> users1;
        users1=this.userService.findBirMoUsers();
        this.userService.sendBosEmail(users1,bos);
    }
}
