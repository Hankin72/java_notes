package com.ztejava_abstract;

public abstract class Animal {
    /**
     * 抽象类不能创建对象，为什么？
     *
     * 反证法：
     *      a.run(); // run 方法体都没有
     *
     *
     * final和abstract是互斥关系：
     *
     *  final修饰类，不能被继承， 修饰的方法不能被重写。
     * abstract 修饰的类必须被继承，修饰的方法必须别重写。
     *
     *
     *
     * */

    private String name;

    public abstract void run();


    // getter + setter

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

}
