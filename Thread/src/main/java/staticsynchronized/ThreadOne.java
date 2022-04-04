//package staticsynchronized;
//
//public class ThreadOne {
//    public static void main(String[] args) {
//        One o1=new One();
//        One o2=new One();
//        One o3=new One();
//
//        new Thread(o1,"o1").start();
//        new Thread(o2,"o2").start();
//        new Thread(o3,"o3").start();
//
//
//        new Thread(new Two(),"t1").start();
//        new Thread(new Two(),"t2").start();
//        new Thread(new Two(),"t3").start();
//    }
//
//}
//
//class One implements Runnable {
//    @Override
//    public void run() {
//        doIt();
//    }
//
//    private static synchronized void doIt() {
//        for (int i = 0; i < 5; i++) {
//            System.out.println(Thread.currentThread().getName() + " " + i);
//        }
//    }
//}
//
//class Two implements Runnable {
//    @Override
//    public void run() {
//        doIt();
//    }
//
//    private synchronized void doIt() {
//        for (int i = 0; i < 5; i++) {
//            System.out.println(Thread.currentThread().getName() + " " + i);
//        }
//    }
//}
