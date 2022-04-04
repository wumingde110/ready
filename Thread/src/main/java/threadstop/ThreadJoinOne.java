//package threadstop;
//
//public class ThreadJoinOne implements  Runnable{
//    @Override
//    public void run() {
//        for (int i = 0; i < 1000; i++) {
//            System.out.println("special "+i);
//        }
//    }
//
//    public static void main(String[] args) {
//        ThreadJoinOne one=new ThreadJoinOne();
//        Thread joinone = new Thread(one, "joinone");
//        joinone.start();
//
//        for (int i = 0; i < 500; i++) {
//            if(i==200){
//                try {
//                    joinone.join();
//                } catch (InterruptedException e) {
//                    e.printStackTrace();
//                }
//            }
//            System.out.println("main "+i);
//        }
//    }
//}
