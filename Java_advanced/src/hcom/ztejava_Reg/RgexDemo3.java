package hcom.ztejava_Reg;

import java.util.Scanner;

public class RgexDemo3 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        while (true){
//            System.out.println("输入手机号检察： " );
//            checkPhoneNumber(scanner);
            System.out.println("输入邮箱检查： ");
            checkMail(scanner);

        }


    }
    public static  void checkMail(Scanner scanner){
        String mail = scanner.next();

        if(mail.matches("\\w{1,30}@[a-zA-Z0-9]{2,20}(\\.[a-zA-Z0-9]{2,20}){1,2}")){
            System.out.println("success");
        }else{
            System.out.println("fail format");
        }


    }

    public static  void checkPhoneNumber(Scanner scanner){

        String phone =scanner.next();

        String patterns = "[1][3-9]\\d{9}";

        if(phone.matches(patterns)){
            System.out.println("success");

        }else{
            System.out.println("fail format");
        }
    }

}
