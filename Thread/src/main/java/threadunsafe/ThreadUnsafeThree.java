//package threadunsafe;
//
//import java.util.ArrayList;
//import java.util.List;
//
//public class ThreadUnsafeThree {
//    public static void main(String[] args) {
//        List<String> list = new ArrayList<>();
//        for (int i = 0; i < 10000; i++) {
//
//            new Thread(() -> {
//                synchronized (list) {
//                    list.add(Thread.currentThread().getName());
//                }
//            }).start();
//
//
//        }
//        try {
//            Thread.sleep(1000);
//        } catch (InterruptedException e) {
//            e.printStackTrace();
//        }
//        System.out.println(list.size());
//
//    }
//}
