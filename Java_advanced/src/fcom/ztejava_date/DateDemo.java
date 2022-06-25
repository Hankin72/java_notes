package fcom.ztejava_date;

import java.util.Date;

public class DateDemo {
    public static void main(String[] args) {
        // 1. public Date()
        //
        Date d  = new Date();
        System.out.println(d);
        long d1 = d.getTime();    // 获取时间戳
        System.out.println(d1);  // 获取时间戳
        long d2 = System.currentTimeMillis(); // 做时间的计算和性能的分析
        System.out.println(d2);

        // 2.时间戳转换成日期对象
        // 第一种方式
        d2+=(60*60+121);
        Date dd = new Date(d2);
        System.out.println(dd);
        // 第二种方式
        d.setTime(d2);  //给日期时间赋值
        System.out.println(d);





    }



}
