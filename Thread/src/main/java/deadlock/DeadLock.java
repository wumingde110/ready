//package deadlock;
//
//public class DeadLock {
//    static class one {
//
//    }
//
//    static class two {
//
//    }
//
//    static class number extends Thread {
//        static one o = new one();
//        static two t = new two();
//
//        int choices;
//        String name;
//
//        public number(int choices, String name1) {
//
//            this.choices = choices;
//            this.name = name;
//        }
//
//        @Override
//        public void run() {
//            if (choices == 0) {
//                synchronized (o) {
//                    System.out.println(Thread.currentThread().getName() + " get one lock");
//                    try {
//                        Thread.sleep(1000);
//                    } catch (InterruptedException e) {
//                        e.printStackTrace();
//                    }
//
//                    synchronized (t) {
//                        System.out.println(Thread.currentThread().getName() + " get two lock");
//                    }
//                }
//
//            } else {
//                synchronized (t) {
//                    System.out.println(Thread.currentThread().getName() + " get two lock");
//                    try {
//                        Thread.sleep(5000);
//                    } catch (InterruptedException e) {
//                        e.printStackTrace();
//                    }
//
//                    synchronized (o) {
//                        System.out.println(Thread.currentThread().getName() + " get one lock");
//                    }
//                }
//            }
//        }
//    }
//
//    public static void main(String[] args) {
//        one o = new one();
//        two t = new two();
//        number n = new number(0, "1111");
//        number n1 = new number(1, "2222");
//        new Thread(n, "x1").start();
//        new Thread(n1, "x2").start();
//    }
//
//}
