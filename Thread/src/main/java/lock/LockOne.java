//package lock;
//
//import java.util.concurrent.locks.ReentrantLock;
//
//public class LockOne {
//    static class one implements Runnable {
//        int tickNumbers = 10;
//        private ReentrantLock lock = new ReentrantLock();
//
//        @Override
//        public void run() {
//            while (true) {
//                try {
//                    lock.lock();
//                    if (tickNumbers > 0) {
//                        try {
//                            Thread.sleep(1000);
//                            System.out.println(Thread.currentThread().getName() + " " + tickNumbers--);
//                        } catch (InterruptedException e) {
//                            e.printStackTrace();
//                        }
//                    } else {
//                        break;
//                    }
//                } catch (Exception e) {
//                    e.printStackTrace();
//                } finally {
//                    lock.unlock();
//                }
//
//
//            }
//        }
//    }
//
//    public static void main(String[] args) {
//        one o = new one();
//        new Thread(o, "one").start();
//        new Thread(o, "two").start();
//        new Thread(o, "three").start();
//    }
//}
