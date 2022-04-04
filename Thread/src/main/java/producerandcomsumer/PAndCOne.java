//package producerandcomsumer;
//
///**
// * 利用缓冲区解决：管程法
// */
//public class PAndCOne {
//    public static void main(String[] args) {
//        SynContainer container = new SynContainer();
//         new Producer(container).start();
//         new Consumer(container).start();
//
//    }
//}
//
//class Producer extends Thread {
//
//    SynContainer container;
//
//    public Producer(SynContainer container) {
//        this.container = container;
//    }
//
//    @Override
//    public void run() {
//        for (int i = 0; i < 100; i++) {
//
//            container.setChickens(new Chicken(i));
//            System.out.println(Thread.currentThread().getName() + " 生产 " + i);
//
//        }
//    }
//}
//
//class Consumer extends Thread {
//    SynContainer container;
//
//    public Consumer(SynContainer container) {
//        this.container = container;
//    }
//
//    @Override
//    public void run() {
//        for (int i = 0; i < 100; i++) {
//            Chicken chicken = container.getChicken();
//            System.out.println(Thread.currentThread().getName() + "消费 " + chicken.id);
//        }
//    }
//}
//
//class Chicken {
//    int id;
//
//    public Chicken(int id) {
//        this.id = id;
//    }
//}
//
//class SynContainer {
//    int count = 0;
//    Chicken[] chickens = new Chicken[10];
//
//    public synchronized void setChickens(Chicken chicken) {
//        if (count == chickens.length) {
//            try {
//                this.wait();
//            } catch (InterruptedException e) {
//                e.printStackTrace();
//            }
//        } else {
//            chickens[count++] = chicken;
//            this.notify();
//        }
//    }
//
//    public synchronized Chicken getChicken()  {
//        if (count == 0) {
//            try {
//                this.wait();
//            } catch (InterruptedException e) {
//                e.printStackTrace();
//            }
//        }
//        count--;
//        Chicken ck = chickens[count];
//        this.notifyAll();
//        return ck;
//    }
//
//}