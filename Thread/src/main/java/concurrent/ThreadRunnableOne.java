//package concurrent;
//
///**
// * @author lsl
// */
//public class ThreadRunnableOne implements Runnable {
//    private int ticketNums = 10;
//
//
//    @Override
//    public void run() {
//        while (true) {
//            if (ticketNums <= 0) {
//                break;
//            }
//            try {
//                Thread.sleep(200);
//            } catch (InterruptedException e) {
//                e.printStackTrace();
//            }
//            System.out.println(Thread.currentThread().getName() + " " + ticketNums--);
//        }
//    }
//
//    public static void main(String[] args) {
//        ThreadRunnableOne threadRunnableOne = new ThreadRunnableOne();
//        new Thread(threadRunnableOne, "one").start();
//        new Thread(threadRunnableOne, "two").start();
//        new Thread(threadRunnableOne, "three").start();
//        /**
//         * three 9
//         * one 10
//         * two 10
//         * three 7
//         * one 6
//         * two 8
//         * three 5
//         * one 4
//         * two 5
//         * one 3
//         * two 1
//         * three 2
//         *
//         * 多个线程操作出现了票重复的问题
//         */
//
//
//    }
//}
