import java.util.*;
import java.util.concurrent.*;

public class test implements Callable<String> {
    public static void main(String[] args) {
        ExecutorService executor = Executors.newFixedThreadPool(10);
        List<Future<String>> list = new ArrayList<>();
        Callable<String> callable = new test();
        for(int i =0;i<100;i++){
            Future<String> future = executor.submit(callable);
            list.add(future);
        }
        for(Future<String> fut : list){
            try {
                System.out.println(new Date()+ "::"+fut.get());
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
        executor.shutdown();
    }
    public String call() throws Exception{
        Thread.sleep(1000);
        return Thread.currentThread().getName();
    }
}
