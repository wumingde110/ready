package threadunsafe;

public class ThreadUnsafeOne {
    static class test implements Runnable {
        private int ticketNumbers = 10;
        private boolean flag = true;

        @Override
        public synchronized void run() {
            while (flag) {
                System.out.println(Thread.currentThread().getName() + " " + ticketNumbers--);
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                if(ticketNumbers<=0){
                    flag=false;
                }
            }
        }
    }

    public static void main(String[] args) {
        test t = new test();
        Thread thread = new Thread(t, "one");
        Thread thread1 = new Thread(t, "two");
        Thread thread2 = new Thread(t, "three");
        thread.start();
        thread1.start();
        thread2.start();

    }
}
