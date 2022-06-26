package fcom.ztejava_e_JDK_newDate;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;

public class LocalTimeAPI2 {
    public static void main(String[] args) {
        LocalTime nowTime = LocalTime.now();
        System.out.println(nowTime);

        System.out.println(nowTime.getHour());
        System.out.println(nowTime.getMinute());
        System.out.println(nowTime.getSecond());
        System.out.println(LocalTime.of(9,20,30));


        System.out.println(LocalDateTime.now().getDayOfWeek());
        LocalDateTime nowDateTime = LocalDateTime.now();
        LocalDate ld = nowDateTime.toLocalDate();

        System.out.println(ld);

        LocalTime lt = nowDateTime.toLocalTime();
        System.out.println(lt);

    }


}
