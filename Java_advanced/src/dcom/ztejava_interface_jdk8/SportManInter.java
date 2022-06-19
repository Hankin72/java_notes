package dcom.ztejava_interface_jdk8;


public interface SportManInter {
   /**
    * 1. JDK 8 开始： 默认方法（实例方法）
    *  必须使用default 修饰， 默认用public修饰
    *
    *  默认方法， 接口不能创建对象，这个方法只能过继给实现类，由实现类的对象享用
    *
    *
    *  2。 静态方法：
    *       - 必须使用static修饰， 默认使用public
    *       -- 接口的静态方法，只能接口名自己调用
    *
    *  3. 私有方法：
    *           jdk1。9 开始
    *           必须在接口内部才能被访问
    * */

   default void run(){

       go(); // 调用私有访问

       System.out.println("run fast/........");

   }

   public static void inAddr(){
       System.out.println("我们都在学习java。。。。。");
   }

   private void go(){
       System.out.println("start go..... ");
   }



}

class PingpongMan implements SportManInter{
}


class Test{
    public static void main(String[] args) {
        PingpongMan p = new PingpongMan();
        p.run();

//        PingpongMan.inAddr();
        SportManInter.inAddr();


    }
}

