package gcom.ztejava_baozhuangClass;

import java.awt.geom.Arc2D;

public class Test {
    public static void main(String[] args) {
        int a = 10;

        Integer a1 = 100;
        Integer a2 = a;

        System.out.println(a2); //自动装箱
        System.out.println(a1);

        int aa = a1;
        System.out.println(aa); // 自从拆箱

        Double db = 99.2;

        Float x = 12.3F;
        System.out.println(x);
        System.out.println(x.getClass());
        /**
         *
         * */
        System.out.println("=====================");
        System.out.println(Integer.toString(a) instanceof  String);
        int aaa=12;
        Integer a4 = aaa;
        String ss = Integer.toString(aaa);
        System.out.println(ss+"x");
        System.out.println(ss instanceof String);


        // 字符串类型的数值转换成 数据类型 （经常用）
        System.out.println("----------");
        String number = "23";
        int age = Integer.parseInt(number);
        System.out.println(age+1);
        double score = Double.parseDouble(number);
        System.out.println(score + 0.01);

        String number1 = "23.3";
        double age2 = Double.valueOf(number1);
        System.out.println(age2*100);
        System.out.println(Double.toString(age2)+"xxx");


    }


}
