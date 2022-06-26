package fcom.ztejava_e_JDK_newDate;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

public class DateTimeFormatterDemo {
    public static void main(String[] args) {
        LocalDateTime ldt = LocalDateTime.now();
        System.out.println(ldt);

        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");

        String r = ldt.format(dtf);  // 逆向格式化
        System.out.println(r);

        System.out.println(dtf.format(ldt));  // 正向格式化

        //  解析字符串
        LocalTime ldt1 = LocalTime.parse("2019-11-11 11:11:11", dtf);

        System.out.println(ldt1);

    }
}
