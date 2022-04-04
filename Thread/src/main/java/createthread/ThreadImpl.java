package createthread;
/**
 * @author lsl
 */
public class ThreadImpl extends Thread{
    @Override
    public void run() {
        while (true){
            System.out.println(Thread.currentThread().getName()+" ThreadImpl");
            try {
                Thread.sleep(1000L);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
