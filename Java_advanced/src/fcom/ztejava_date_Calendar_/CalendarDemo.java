package fcom.ztejava_date_Calendar_;

import jdk.swing.interop.SwingInterOpUtils;

import java.util.Calendar;
import java.util.Date;

public class CalendarDemo {
    public static void main(String[] args) {
        Calendar cal = Calendar.getInstance();

        System.out.println(cal);
        int year = cal.get(Calendar.YEAR);
        System.out.println(year);

        int month = cal.get(Calendar.MONTH)+1; // 月的数 +1

        System.out.println(month);

        int dayOfYear = cal.get(Calendar.DAY_OF_YEAR);
        System.out.println(dayOfYear);

        int dayOfWeek = cal.get(Calendar.DAY_OF_WEEK);
        System.out.println(dayOfWeek);

        System.out.println(cal.get(Calendar.HOUR));
        // 修改日历中某个字段的信息
        cal.set(Calendar.HOUR, 12);
        System.out.println(cal.get(Calendar.HOUR));


        cal.add(Calendar.DAY_OF_YEAR, 64);
        cal.add(Calendar.MINUTE, 59);

        // public final Date getTime() 拿到此刻日期对象
        Date d = cal.getTime();
        System.out.println(cal.getTime());  // 是上面增加之后的时间

        //
        System.out.println(cal.getTimeInMillis()); //上述时间转换成毫秒值
        System.out.println(cal.getTimeZone());

    }
}
