package com.example.birthday.service.Impl;

import com.example.birthday.mapper.UserMapper;
import com.example.birthday.pojo.User;
import com.example.birthday.service.SendEmails;
import com.example.birthday.service.UserService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import javax.mail.MessagingException;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@Service
public class UserServiceImpl implements UserService {
    @Resource
    private UserMapper userMapper;

    @Resource
    private SendEmails sendEmails;
    @Override
    public List<User> findBirToUsers(){
        List<User> uusers,users;
        uusers  =new ArrayList<User>() ;
        users=this.userMapper.findAll();
        for(User s:users){
            String NMonth,NDay,GMonth,GDay; //分别为现在月、日，以及用户的生日
            Date date=new Date();
            SimpleDateFormat simpleDateFormat=new SimpleDateFormat("yyyy-MM-dd");
            String date0;
            date0=simpleDateFormat.format(date);
            NMonth=date0.toString().split("-")[1];
            NDay=date0.toString().split("-")[2];
//            System.out.println(NMonth);
//            System.out.println(NDay);
            String date1=simpleDateFormat.format(s.getBirthaday());
            GMonth=date1.toString().split("-")[1];
            GDay=date1.toString().split("-")[2];
//            System.out.println(GMonth);
//            System.out.println(GDay);
//            System.out.println("----------------------");
            if(NMonth.equals(GMonth)&&NDay.equals(GDay))
                uusers.add(s);
        }
        return uusers;
    }

    @Override
    public void sendBirEmail(List<User> users) throws MessagingException {
        int Usize=users.size(); //用于统计符合要求的人数。
        int i=0;//用于下面计数


        //给生日者发送的
//        String []bir=new String[Usize];
//        String []birName=new String[Usize];


        for(User user:users){
//           bir[i]=user.getEmail();
//           birName[i]=user.getUsername();
           String []bir=new String[]{user.getEmail()};
           String []birName=new String[]{user.getUsername()};
           ToEmail toBirEmail=new ToEmail();
           toBirEmail.setSubject("Exermon发来贺电");
           toBirEmail.setTos(bir);
           toBirEmail.setName(birName);
           this.sendEmails.sendBirMail(toBirEmail);
//           i++;
        }
//        System.out.println(bos);
//
//        //给老板发送的 这里直接写下;
//         ToEmail toBosEmail=new ToEmail();
//         toBosEmail.setSubject("Exermon发来提醒");
//         toBosEmail.setTos(bos);
//         this.sendEmails.sendBosMail(toBosEmail);
    }

    @Override
    public List<User> findBirMoUsers(){
        //并没有在数据库实现查询，而是全部取出来之后再筛选......
        List<User> uusers,users;
        uusers=new ArrayList<>();
        users=this.userMapper.findAll();
        for(User s:users){
            String NMonth,NDay,GMonth,GDay; //分别为现在月、日，以及用户的生日
            Date date=new Date();
            SimpleDateFormat simpleDateFormat=new SimpleDateFormat("yyyy-MM-dd");
            String date0;
            date0=simpleDateFormat.format(date);
            NMonth=date0.toString().split("-")[1];
            String date1=simpleDateFormat.format(s.getBirthaday());
            GMonth=date1.toString().split("-")[1];
            if(NMonth.equals(GMonth))
                uusers.add(s);
        }
        return uusers;
    }
    @Override
    public void sendBosEmail(List<User> users,String []bos) throws MessagingException{
        System.out.println(bos);
        int Usize   = users.size();
        int i=0;
        //给老板发送的，记录当月生日各个人的名字与日期
        String[]birNameWbirDate=new String[Usize];

        //获取日期格式
        SimpleDateFormat simpleDateFormat=new SimpleDateFormat("MM-dd");

        for(User user:users)
        {
            String Date=simpleDateFormat.format(user.getBirthaday());
            String DDate=Date.toString().split("-")[0]+"月"+Date.toString().split("-")[1]+"日";
            birNameWbirDate[i]=user.getUsername()+"("+DDate+")";
        }
        //给老板发送的 这里直接写下;

        ToEmail toBosEmail=new ToEmail();
        toBosEmail.setSubject("Exermon发来提醒");
        toBosEmail.setTos(bos);
        toBosEmail.setName(birNameWbirDate);
        this.sendEmails.sendBosMail(toBosEmail);

    }
//    @Override
//    public void addUser(User user)
//    {
//        userMapper.save(user);
//    }
//
//    @Override
//    public void deleteUserById(int uid){
//        userMapper.deleteById(uid);
//    }
//
//    @Override
//    public void updateUser(User user)
//    {
//        userMapper.save(user);
//    }
//
//    @Override
//    public User selectUserById(int uid) {
//        return userMapper.getById(uid);
//    }
//
//    @Override
//    public List<User> selectAllUsers() {
//        return userMapper.findAll();
//    }
//
//    @Override
//    public void addUserList(List<User> userList) {
//          userMapper.saveAll(userList);
//    }
//
//    @Override
//    public  String getBirDate(Date date){
//        DateFormat df1=DateFormat.getDateInstance();
//        System.out.println(df1.format(date));
//        System.out.println(date.toString().split("-")[0]);
//        return df1.format(date);
//    }
}
