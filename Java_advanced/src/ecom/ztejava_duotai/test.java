package ecom.ztejava_duotai;

public class test {

    public static void main(String[] args) {
        // 1. 多态的形式
        //
        // 父类类型 对象名称 = new 子类构造器
        //  接口 对象名称 = new 实现类 构造器
        // 小范围类型 赋值 个 大范围的类型是可以的
        Animal a = new Dog();
        a.run();  // 编译看左边，运行看右边
        System.out.println(a.name);
        // 对于变量的调用，编译看左边，运行看右边

        Animal a2 = new Tortise();
        a2.run();
        System.out.println(a.name);


    }


}
