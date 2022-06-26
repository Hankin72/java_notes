package fcom.ztejava_e_JDK_newDate;

import java.time.Duration;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.Period;

public class DurationPeriod {
    public static void main(String[] args) {
        // period 计算日期差异， 用于lcoalDate之间的比较
        LocalDate today = LocalDate.now();

        System.out.println(today);


        LocalDate bDate = LocalDate.of(1996,8,20);

        System.out.println(bDate);

        Period period = Period.between(bDate, today); //  第二个参数 减去第一个参数

        System.out.println(period);
        System.out.println(period.getYears());
        System.out.println(period.getMonths());
        System.out.println(period.getDays());

        System.out.println("=======================");
        // duration用于计算时间之间的差异， 用于localtime，instant之间的比较

        LocalDateTime t = LocalDateTime.now();
        System.out.println(t);

        LocalDateTime bb = LocalDateTime.of(1998,9,2,10,10,10);
        Duration duration = Duration.between(bb,t);

        System.out.println(duration.toDays());
        System.out.println(duration.toHours());
        System.out.println(duration.toMinutes());
        System.out.println(duration.toMillis());
        System.out.println(duration.toNanos());
    }
}
