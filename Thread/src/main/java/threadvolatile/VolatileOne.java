package threadvolatile;

import lombok.Setter;

public class VolatileOne {
    public static void main(String[] args) {
        One o1 = new One();
        new Thread(o1, "o1").start();
//        new Thread(new One(2), "o2").start();
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        o1.setFlag(false);

    }
}
@Setter
class One implements Runnable {

//    static volatile boolean flag = true;
 volatile boolean flag = true;


    @Override
    public void run() {

        while (flag) {
            System.out.println("true" + System.currentTimeMillis());
        }
        System.out.println("false" + System.currentTimeMillis());


    }
}
