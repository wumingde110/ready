//package threadstop;
//
//import java.text.SimpleDateFormat;
//import java.util.Date;
//
///**
// * sleep不会释放锁
// */
//public class ThreadSleepOne {
//
//
//    public static void main(String[] args) {
////        tenDown();
//        while (true) {
//            try {
//                Thread.sleep(1000);
//            } catch (InterruptedException e) {
//                e.printStackTrace();
//            }
//            System.out.println(new SimpleDateFormat("HH:mm:ss").format(new Date()));
//        }
//    }
//
//    public static void tenDown() {
//        int num = 10;
//
//        while (true) {
//            try {
//                Thread.sleep(1000);
//                System.out.println(num--);
//                if (num <= 0) {
//                    break;
//                }
//            } catch (InterruptedException e) {
//                e.printStackTrace();
//            }
//        }
//    }
//}
