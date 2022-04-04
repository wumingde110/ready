//package producerandcomsumer;
//
///**
// * 标志位
// */
//public class PAndCTwo {
//    public static void main(String[] args) {
//        Ccc c = new Ccc();
//        new Producer(c).start();
//        new Consumer(c).start();
//    }
//
//}
//
//class Producer extends Thread {
//    Ccc ccc;
//
//    public Producer(Ccc ccc) {
//        this.ccc = ccc;
//    }
//
//    @Override
//    public void run() {
//        for (int i = 0; i < 100; i++) {
//            ccc.produce(i + "");
//        }
//    }
//}
//
//class Consumer extends Thread {
//    Ccc ccc;
//
//    public Consumer(Ccc ccc) {
//        this.ccc = ccc;
//    }
//
//    @Override
//    public void run() {
//        for (int i = 0; i < 100; i++) {
//            ccc.consumer();
//        }
//    }
//}
//
//class Ccc {
//    boolean flag = true;
//    String name;
//
//    public synchronized void produce(String name) {
//        if (!flag) {
//            try {
//                this.wait();
//            } catch (InterruptedException e) {
//                e.printStackTrace();
//            }
//        }
//        System.out.println("produce " + name);
//        this.name = name;
//        this.flag = !this.flag;
//        this.notifyAll();
//
//
//    }
//
//    public synchronized void consumer() {
//        if (flag) {
//            try {
//                this.wait();
//            } catch (InterruptedException e) {
//                e.printStackTrace();
//            }
//        }
//        System.out.println("consume " + name);
//        this.flag = !this.flag;
//        this.notifyAll();
//
//
//    }
//}
