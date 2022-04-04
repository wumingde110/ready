package createthread;

/**
 * @author lsl
 */
public class ThreadRunnable implements Runnable{
    @Override
    public void run() {
        while (true){
            System.out.println(Thread.currentThread().getName()+" ThreadRunnable");
            try {
                Thread.sleep(1000L);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

}
