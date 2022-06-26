package hcom.ztejava_Reg;

import java.util.Scanner;

public class RgexDemo4 {
    public static void main(String[] args) {
        String names ="小路asdas蓉儿asd果儿sad小龙女";
        String[] new_names = names.split("\\w+");
        for (int i = 0; i < new_names.length; i++) {
            System.out.println(new_names[i]);
        }


        String nn = names.replaceAll("\\w+",",");
        System.out.println(nn);



    }

}
