package fcom.ztejava_e_JDK_newDate;

import java.time.Instant;
import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.util.Date;

public class InstantAPI {
    public static void main(String[] args) {
        Instant instant = Instant.now();

        System.out.println(instant);
        System.out.println(System.currentTimeMillis());

        // 2. 获取系统此刻的时间戳
        Instant instant1 = Instant.now();
        ZonedDateTime instant2 = instant1.atZone(ZoneId.systemDefault());

        System.out.println(instant2);
        System.out.println(instant1.atZone(ZoneId.systemDefault()));

        // 3.   如何返回一个date对象
        Date date = Date.from(instant);
        System.out.println(date);

        Instant i2 = date.toInstant();
        System.out.println(i2);



    }
}
