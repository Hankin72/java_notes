package dcom.ztejava_Interface;


/**
 * 接口：
 * 1。声明了一个接口： 体现一种规范，规范一定是公开的。
 *
 *
 * 接口和接口的关系 ： 多继承，一个接口可以同时继承多个接口
 * */
public interface Interface {
    // JDK 8 之前只能 有抽象方法和1常量

    // 1. 常量
    public  static final  String SCHOOL_NAME ="UNSW";
    int NUMBERS = 0;

    // 2. 抽象方法
    /**
     * 注意： 由于接口体现规范思想，规范默认都是公开的，
     *      所以代码层面，public，abstract, public static final 都可以省略不写
     * */
    public abstract void  run();
    public abstract void  eat();
    void hello();

}
