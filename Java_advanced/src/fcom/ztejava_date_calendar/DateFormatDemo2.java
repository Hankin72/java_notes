package fcom.ztejava_date_calendar;


import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class DateFormatDemo2 {
    public static void main(String[] args) throws ParseException {
      // simpledateformat 解析时间字符串
        // 时间2021年08.06 11：11：11 往后 2天14小时49分06秒后的时间

        //  1。  字符串
        String dateStr = "2021年08月06日 11：11：11";
        // 2。
        SimpleDateFormat sdf = new SimpleDateFormat("yy年MM月dd日 HH：mm：ss");
        Date dd = sdf.parse(dateStr);

        System.out.println(dd);
        System.out.println(sdf.format(dd));
        long time = dd.getTime() + (2L *24*60*60+14*60*60+49*60+6)*1000;

        System.out.println(sdf.format(time));
    }
}
