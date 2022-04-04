//package threadstop;
//
///**
// * 建议线程正常停止 利用次数，不建议死循环
// * 建议使用标志位 设置一个标志位
// * 不要使用stop或destroy等过时或者jdk不建议的方法
// */
//public class ThreadStopOne implements Runnable {
//    private boolean flag=true;
//    @Override
//    public void run() {
//        int i=0;
//        while (flag){
//            System.out.println("run ....Thread"+i++);
//        }
//    }
//    public void stop(){
//        this.flag=false;
//    }
//
//    //psvm
//    public static void main(String[] args) {
//        ThreadStopOne threadStopOne = new ThreadStopOne();
//        new Thread(threadStopOne).start();
//
//        for (int i = 0; i < 1000; i++) {
//            System.out.println("main "+i);
//            if(i==900){
//                threadStopOne.stop();
//                System.out.println("stop");
//            }
//        }
//    }
//}
