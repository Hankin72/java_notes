package kcom.ztejava_Lambda;

public class LambdaDemo2 {
    public static void main(String[] args) {
        // Lambda表达式只能简化函数式接口的 匿名内部类的写法形式
        // 首先必须是接口、其次接口中有且仅有一个抽象方法的形式
//        Swimming s1 = new Swimming() {
//            @Override
//            public void swim() {
//                System.out.println("Teaching how to swimming~~~~ ");
//            }
//        };
//
//        go(s1);

        Swimming s2 = () ->{
            System.out.println("check ....");
        };
        go(s2);

        System.out.println("------------------");

        go(new Swimming() {
            @Override
            public void swim() {
                System.out.println("check ");
            }
        });

        System.out.println("------------------");
        go(()-> System.out.println("check lambda "));
    }

    public static void go(Swimming s){
        System.out.println("start .... ");
        s.swim();
        System.out.println("end ... ");
    }

}

// 一旦加上这个注释，必须是函数式接口， 里面指南又一个抽象方法
@FunctionalInterface
interface Swimming{
    void swim();

}



