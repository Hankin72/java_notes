package fcom.ztejava_date_simpledateformat;

import java.text.SimpleDateFormat;
import java.util.Date;

public class DateFormatDemo {
    public static void main(String[] args) {
        // public SimpleDateFormat(String Pattern)
        Date d = new Date();
        System.out.println(d);

        //
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss EEE a");

        String rs = sdf.format(d);
        System.out.println(rs);
        System.out.println("==============");

        long time1 = System.currentTimeMillis() + 121*1000;
        System.out.println(sdf.format(time1));

        ///    解析 字符串 时间


    }
}
