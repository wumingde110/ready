//package threadstatus;
//
///**
// * 进入死亡状态不能再启动了
// */
//public class ThreadStatusOne implements Runnable {
//    @Override
//    public void run() {
//
//    }
//
//    public static void main(String[] args) {
//        Thread thread = new Thread(() -> {
//            for (int i = 0; i < 5; i++) {
//                try {
//                    Thread.sleep(1000);
//                } catch (InterruptedException e) {
//                    e.printStackTrace();
//                }
//            }
//            System.out.println("///////////////////////////////");
//            System.out.println(Thread.currentThread().getState());
//        });
//        Thread.State state = thread.getState();
//        System.out.println(state);
//
//        thread.start();
//        state=thread.getState();
//        System.out.println(state);
//
//        while(state!=Thread.State.TERMINATED){
//            try {
//                Thread.sleep(100);
//            } catch (InterruptedException e) {
//                e.printStackTrace();
//            }
//            state=thread.getState();
//            System.out.println(state);
//        }
//        thread.start();
//    }
//}
