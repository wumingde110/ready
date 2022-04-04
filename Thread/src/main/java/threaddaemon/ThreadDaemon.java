//package threaddaemon;
//
//public class ThreadDaemon implements Runnable {
//    @Override
//    public void run() {
//        for (int i = 0; i < 30000; i++) {
//            System.out.println("live");
//        }
//        System.out.println("die");
//    }
//
//    static class Daemon implements Runnable {
//        @Override
//        public void run() {
//            while (true) {
//                System.out.println("I am always here");
//            }
//        }
//    }
//
//    public static void main(String[] args) {
//
//
//
//        Daemon daemon = new Daemon();
//        Thread thread1 = new Thread(daemon, "two");
//        thread1.setDaemon(true);
//
//        thread1.start();
//        ThreadDaemon threadDaemon = new ThreadDaemon();
//        Thread thread = new Thread(threadDaemon, "one");
//        thread.start();
//    }
//}
