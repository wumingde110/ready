//package createthread;
//
//import java.util.concurrent.ExecutionException;
//import java.util.concurrent.FutureTask;
//
///**
// * @author lsl
// */
//public class Zhu {
//    public static void main(String[] args) {
//        Thread threadRunnable = new Thread(new ThreadRunnable(), "ThreadRunnable1");
////        threadRunnable.setDaemon(true);
//        System.out.println("Starting runnable");
//        threadRunnable.start();
//
//
//        ThreadImpl thread = new ThreadImpl();
//        thread.setName("ThreadImpl1");
////        thread.setDaemon(true);
//        thread.setPriority(Thread.MAX_PRIORITY);
//        System.out.println("Starting impl");
//        thread.start();
//
////        ThreadCallable callable=new ThreadCallable();
////        FutureTask<String> futureTask=new FutureTask<>(callable);
////        for(int i=0;i<100;i++){
////            System.out.println(Thread.currentThread().getName()+" 的循环变量i的值"+i);
////            if(i==20){
////                new Thread(futureTask,"callable").start();
////            }
////        }
////        try {
////            System.out.println(futureTask.get());
////        } catch (InterruptedException e) {
////            e.printStackTrace();
////        } catch (ExecutionException e) {
////            e.printStackTrace();
////        }
//
//
//    }
//}
