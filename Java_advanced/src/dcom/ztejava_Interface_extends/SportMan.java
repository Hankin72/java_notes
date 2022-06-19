package dcom.ztejava_Interface_extends;


/**
 *
 * 接口可以多继承， 一个接口可以同时继承多个接口
 * 目的在于，整合多个接口，便于子类实现。
 * */
public interface SportMan extends  Law, People {
    void run();
    void  competition();

}
