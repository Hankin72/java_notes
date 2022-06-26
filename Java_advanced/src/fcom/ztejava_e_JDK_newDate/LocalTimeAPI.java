package fcom.ztejava_e_JDK_newDate;

import java.time.LocalDate;

public class LocalTimeAPI {
    public static void main(String[] args) {
        LocalDate nowDate = LocalDate.now();
        System.out.println(nowDate);

        System.out.println(nowDate.getYear());

        System.out.println(nowDate.getDayOfMonth());

        System.out.println(nowDate.getDayOfYear());

        System.out.println(nowDate.getMonthValue());

        System.out.println(nowDate.getDayOfWeek());
        System.out.println(nowDate.getDayOfWeek().getValue());
        System.out.println(nowDate.getMonth());
        LocalDate bt = LocalDate.of(1991,11,11);
        System.out.println(bt);

    }


}
