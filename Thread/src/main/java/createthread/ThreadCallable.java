package createthread;

import java.util.concurrent.Callable;

/**
 * @author lsl
 */
public class ThreadCallable implements Callable<String> {

    @Override
    public String call() throws Exception {
      int i=0;
      for(;i<100;i++){
          System.out.println(Thread.currentThread().getName()+" "+i);
      }
      return i+"";
    }
}
