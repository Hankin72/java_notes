package fcom.ztejava_e_JDK_newDate;

import java.time.LocalDate;
import java.time.LocalTime;
import java.time.Month;
import java.time.MonthDay;

public class LocalTimeAPI3 {
    public static void main(String[] args) {

        LocalTime nowTime = LocalTime.now();

        System.out.println(nowTime);

        System.out.println(nowTime.minusHours(1));
        System.out.println(nowTime.minusMinutes(1));
        System.out.println(nowTime.minusSeconds(100));

        System.out.println("----------------");
        System.out.println(nowTime.plusHours(1));
        System.out.println(nowTime.plusMinutes(1));
        System.out.println(nowTime.plusSeconds(100));
        System.out.println(nowTime);
        System.out.println("--------------");

        LocalDate ld = LocalDate.now();
        MonthDay md = MonthDay.of(ld.getMonthValue(),ld.getDayOfMonth());
        System.out.println(md);
        MonthDay nowMd = MonthDay.from(ld);
        System.out.println(nowMd);

        Month m = Month.of(ld.getMonth().getValue());
        System.out.println(m);


    }


}
