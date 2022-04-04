//package TheadPool;
//
//import java.util.concurrent.ExecutionException;
//import java.util.concurrent.ExecutorService;
//import java.util.concurrent.Executors;
//import java.util.concurrent.Future;
//
//public class ThreadPoolOne {
//    static ExecutorService service = Executors.newFixedThreadPool(10);
//
//    public static void main(String[] args) {
////        service.execute(() -> {
////            for (int i = 0; i < 100; i++) {
////                System.out.println(Thread.currentThread().getName() + " " + i);
////            }
////        });
////        service.execute(() -> {
////            for (int i = 0; i < 100; i++) {
////                System.out.println(Thread.currentThread().getName() + " " + i);
////            }
////        });
////        service.execute(() -> {
////            for (int i = 0; i < 100; i++) {
////                System.out.println(Thread.currentThread().getName() + " " + i);
////            }
////        });
//        Future<String> submit = service.submit(() -> {
//            return "xxx";
//        });
//        try {
//            System.out.println(submit.get());
//        } catch (InterruptedException e) {
//            e.printStackTrace();
//        } catch (ExecutionException e) {
//            e.printStackTrace();
//        }
//
//
//    }
//}
