package com.ztejava_abstract;

public abstract class Student {
    /**
     * 模版方法
     * */
    public final void write(){
        System.out.println("\t\t\t《我的爸爸》");
        System.out.println("你的爸爸是什么样的，来说一说： ");

        // 正文,每个子类都要写的，每个子类写的情况不一样

        System.out.println(wiriteMain());

        // 结尾
        System.out.println("我的爸爸简直太好了～～～");

    }


    public abstract String wiriteMain();
}
