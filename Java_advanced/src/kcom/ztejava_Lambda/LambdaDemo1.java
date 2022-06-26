package kcom.ztejava_Lambda;

public class LambdaDemo1 {
    public static void main(String[] args) {
        Animal a = new Animal() {
            @Override
            public void run() {
                System.out.println("run fast ... ");
            }
        };

        a.run();

    }
}

abstract class Animal{
    public abstract void run();
}


