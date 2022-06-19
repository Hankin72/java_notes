package dcom.ztejava_Interface;


/**
 * 实现类：implements
 *
 * */
public class PingpongMan implements SportMan, Law{
    private  String name;

    public PingpongMan() {
    }

    public PingpongMan(String name) {
        this.name = name;
    }

    @Override
    public void run() {
        System.out.println(name + "必须跑步训练");

    }

    @Override
    public void competition() {
        System.out.println(name + "参加比赛，为国争光！");
    }

    @Override
    public void rule() {
        System.out.println(name + "必须守法 。。 。 。");
    }
}
