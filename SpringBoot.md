# SpringBoot

### 关于Date的运用

1. 创建一个指定的date对象,其中表示创建一个2014年6月12号的date对象。

   ```java
   Date d1= new Date(2014-1900,6-1,12);
   ```

2. 获得一个date对象包含的信息，下面再jdk1.6以后，方法已经过时了。

   ```java
   Date d2=new Date(2014-1900,6-1,12);
   //获得年,月，日
   int year=d2.getYear()+1900;
   int month=d2.getMonth()+1;
   int date=d2.getDate();
   int hour=d2.getHours();//不要设置为0
   int minute=d2.getMinutes();
   int second=d2.getSeconds();
   int day=d2.getDay(); //获得星期(注意： 0代表星期日、1代表星期一、2代表星期二。)
   ```

3. 最新的获取date对象中年月日的方法。     

   ```java
   Calendar cld = Calendar.getInstance();
   Date date = new java.sql.Date(1319534374312l);
   cld.setTime(date);
   //方法一
   System.out.println("年份："+cld.get(Calendar.YEAR));
   System.out.println("月份："+(cld.get(Calendar.MONTH)+1));
   System.out.println("日："+cld.get(Calendar.DAY_OF_MONTH));
   
   //方法er
   System.out.println("年份："+date.toString().split("-")[0]);
   System.out.println("月份："+date.toString().split("-")[1]);
   System.out.println("日："+date.toString().split("-")[2]);
   
   ```

4. 将字符串格式化为Date类型。方法如下：

   ```java
   SimpleDateFormat simpleDateFormat=new SimpleDateFormat("yyyy-MM-dd");
   Date date1=simpleDateFormat.parse(str_date1);
   ```

   

   

### Java 字符串的使用

1. Java中字符串的比较方法。如下所示：

- ```java
  //比较字符串大小
  compareTo(string)
  compareToIgnoreCase(String)
  compareTo(object string)
  public static void main(String[] args){
          String str = "String";
          String anotherStr = "string";
          Object objstr = str;
          System.out.println(str.compareTo(anotherStr));
          System.out.println(str.compareToIgnoreCase(anotherStr));
          System.out.println(str.compareTo(objstr.toString()));
      }
   
      
  //比较字符串两者是否相等
   public static void main(String[] args){
          String s1 = "hello";
          String s2 = "hello";
          String s3 = new String("hello");
          String s4 = new String("hello");
          System.out.println("s1:" + s1);
          System.out.println("s2:" + s2);
          System.out.println("s3:" + s3);
          System.out.println("s4:" + s4);
          System.out.println("----------比较内容是否相等---------------");
          System.out.println(s1.equals(s2));
          System.out.println(s2.equals(s3));
          System.out.println(s3.equals(s4));
     
      }
  
  
  //比较字符串的位置是否相等
   public static void main(String[] args){
          String s1 = "hello";
          String s2 = "hello";
          String s3 = new String("hello");
          String s4 = new String("hello");
          System.out.println("s1:" + s1);
          System.out.println("s2:" + s2);
          System.out.println("s3:" + s3);
          System.out.println("s4:" + s4);
          System.out.println("----------比较引用地址是否相等---------------");
          System.out.println(s1 == s2);
          System.out.println(s2 == s3);
          System.out.println(s3 == s4);
      }
  ```

- ```
  //生成的结果
  s1:hello
  s2:hello
  s3:hello
  s4:hello
  ----------比较内容是否相等---------------
  true
  true
  true
  ----------比较引用地址是否相等---------------
  true
  false
  false
  ```

### JPA的使用



