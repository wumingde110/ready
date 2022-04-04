//package threadstop;
//
///**
// * yield不一定成功
// */
//public class ThreadYieldOne implements Runnable{
//    @Override
//    public void run() {
//        System.out.println(Thread.currentThread().getName()+" begin");
//        Thread.yield();
//        System.out.println(Thread.currentThread().getName()+" end");
//    }
//
//    public static void main(String[] args) {
//        ThreadYieldOne one=new ThreadYieldOne();
////        ThreadYieldOne two=new ThreadYieldOne();
//        new Thread(one,"one").start();
//        new Thread(one,"two").start();
//    }
//}
