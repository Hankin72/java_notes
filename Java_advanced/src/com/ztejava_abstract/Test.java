package com.ztejava_abstract;

public class Test {

    public static void main(String[] args) {
        StudentMiddle s = new StudentMiddle();
        s.write();

        System.out.println("=================");
        StudentChid s2=  new StudentChid();
        s2.write();
    }

}
