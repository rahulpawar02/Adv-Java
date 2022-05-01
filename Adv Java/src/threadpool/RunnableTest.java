package threadpool;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class RunnableTest {

	public static void main(String[] args) {
		
		ExecutorService executorService = Executors.newFixedThreadPool(5);
		
		for(int i=1;i<=10;i++) {
			Runnable runnable = new MyRunnable("job:"+i);
			executorService.execute(runnable);
			
		}
		executorService.shutdown();
		while(!executorService.isTerminated()) {
	}
		System.out.println("all request completed successfully");

  }
}
