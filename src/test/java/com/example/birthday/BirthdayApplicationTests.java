package com.example.birthday;

import com.example.birthday.mapper.UserMapper;
import com.example.birthday.pojo.User;
import com.example.birthday.service.Impl.ToEmail;
import com.example.birthday.service.SendEmails;
import com.example.birthday.service.UserService;
import org.junit.jupiter.api.DisplayNameGenerator;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.core.io.FileSystemResource;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.mail.javamail.MimeMessageHelper;
import org.thymeleaf.TemplateEngine;
import org.thymeleaf.context.Context;

import javax.annotation.Resource;
import javax.mail.MessagingException;
import javax.mail.internet.MimeMessage;
import java.io.File;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;


@SpringBootTest
class BirthdayApplicationTests {

    @Resource
    private UserMapper userMapper;

    @Resource
    private UserService userService;

    @Resource
    private SendEmails sendEmails;

//    @DateTimeFormat(pattern = "yyyy-MM-dd HH:mm:ss")
//    public Date getBirthday;


    @Test
    public void contextLoads() throws MessagingException, ParseException {

//        this.userMapper.deleteById(5);
//        this.userMapper.deleteById(7);
//        String date0="2001-09-04";
//        SimpleDateFormat simpleDateFormat=new SimpleDateFormat("yyyy-MM-dd");
//        Date Date0=simpleDateFormat.parse(date0);
//        User user=new User();
//        user.setUsername("马嘉锐");
//        user.setAge(20);
//        user.setBirthaday(Date0);
//        user.setEmail("396977640@qq.com");
//        user.setPhone("18138776902");
//        user.setQq(1471835995);
//        user.setTimeset(3);
//        user.setSex("男");
//
//        this.userMapper.save(user);

        //发送给生日者
//        List<User> users;
//        users=this.userService.findBirToUsers();
//        System.out.println(users.size());
//        this.userService.sendBirEmail(users);
//
//        //发送给老板们
//        //老板们的邮箱
//        String []bos={"396977640@qq.com"};
//        List<User> users1;
//        users1=this.userService.findBirMoUsers();
//        this.userService.sendBosEmail(users1,bos);

//        //给生日者的
//        String[] bir={"1471835995@qq.com"};
//        ToEmail toBirEmail=new ToEmail();
//        toBirEmail.setSubject("Exermon发来贺信");
//        toBirEmail.setTos(bir);
//
//        //给老板的
//        String[] bos={"396977640@qq.com"};
//        ToEmail toBosEmail=new ToEmail();
//        toBosEmail.setSubject("Exermon发来提醒");
//        toBirEmail.setTos(bos);

//        users=this.userService.findBirUsers();

   //     this.sendEmails.sendTemplateMail(toBirEmail,toBosEmail);
//         SimpleDateFormat simpleDateFormat=new SimpleDateFormat("MM-dd");
//         Date date1=simpleDateFormat.parse("09-04");
//         System.out.println(date1);


//         String currDay= new SimpleDateFormat("MM-dd").format(new Date());
//         users=this.userMapper.findAll();
//          System.out.println(users.size());
//          for(User s:users)
//          {
//              String NMonth,NDay,GMonth,GDay; //分别为现在月、日，以及用户的生日
//              Date date=new Date();
//              SimpleDateFormat simpleDateFormat=new SimpleDateFormat("yyyy-MM-dd");
//              String date0;
//              date0=simpleDateFormat.format(date);
//              NMonth=date0.toString().split("-")[1];
//              NDay=date0.toString().split("-")[2];
//              System.out.println(NMonth);
//              System.out.println(NDay);
//              String date1=simpleDateFormat.format(s.getBirthaday());
//              GMonth=date1.toString().split("-")[1];
//              GDay=date1.toString().split("-")[2];
//              System.out.println(GMonth);
//              System.out.println(GDay);
//              System.out.println("----------------------");
//
//              if(NMonth.equals(GMonth)&&NDay.equals(GDay))
//                 System.out.println(s.getBirthaday());
//          }

         //        //1.创建EntityManagerFactory
//        EntityManagerFactory factory= Persistence.createEntityManagerFactory("MyJPA");
//        //2.使用工厂对象 创建一个EntityManager对象
//        EntityManager entityManager=factory.createEntityManager();
//        //3.开启事务
//        EntityTransaction transaction= entityManager.getTransaction();
//        //4.EntityManager对象persist方法插入数据库
//        User user=new User();
//        user.setUser_id(0);
//        user.setUsername("马嘉锐");
//        user.setAge(20);
//        user.setSex("男");
//        user.setUserpassword("123456");
//        entityManager.persist(user);
//        //5.事务提交
//        transaction.commit();
//        //6.关闭连接
//        entityManager.close();
//        factory.close();
//        Calendar c1=Calendar.getInstance();
//        c1.set(2001,5-1,12);


//        //这里封装一波，插入数据。
//        Date date0=new Date(2001,10-1,15);
//        User user=new User();
//        user.setUsername("马嘉锐");
//        user.setAge(20);
//        user.setBirthaday(date1);
//        user.setEmail("1095012892@qq.com");
//        user.setPhone("18138776902");
//        user.setQq(1095012892);
//        user.setTimeset(3);
//        user.setSex("男");

//        User user0;
//        //user0 = this.userService.selectUserById(1);
//        user0=this.userMapper.findUserByUsername("马嘉锐");



//        if(user0!=null)
//            System.out.println("666");
//        else
//            System.out.println("111");
//        System.out.println(user0.getBirthaday().toString());
//        System.out.println(this.userService.getBirDate(user0.getBirthaday()));
//        this.userMapper.save(user);
//        this.userMapper.deleteById(3);
//        this.userService.deleteUserById(1);

//        String x=user0.getBirthaday().toString().split("-")[1];
//        if(x.equals("08"))
//            System.out.println("好棒呀");
//        System.out.println(user0.getBirthaday().toString().split("-")[1]);
//        System.out.println(user0.getBirthaday());
    }

//    @Autowired
//    JavaMailSender javaMailSender;
//
//    @Autowired
//    TemplateEngine templateEngine;
//    @Test
//    public void sendImgResMail() throws MessagingException{
//        MimeMessage mimeMessage=javaMailSender.createMimeMessage();
//        MimeMessageHelper helper=new MimeMessageHelper(mimeMessage,true);
//        helper.setSubject("Exermon发来贺电");
//        helper.setFrom("1095012892@qq.com");
//        helper.setTo("1471835995@qq.com");
//
//        helper.setSentDate(new Date());
//
//        //引入template中的context
//        Context context=new Context();
//        context.setVariable("username","马嘉锐");
////        context.setVariable("img","img.png");
//        String process=templateEngine.process("BirDaP.html",context);
//        helper.setText(process,true);
//       // helper.setText("<p>hello 大家好，这是一封测试邮件，这封邮件包含两种图片，分别如下</p><p>第一张图片：</p><img src='cid:p01'/>",true);
//        File file=new File("src/main/resources/static/img.png");
//        helper.addInline("p01",new FileSystemResource(file));
//        javaMailSender.send(mimeMessage);
//    }
}
