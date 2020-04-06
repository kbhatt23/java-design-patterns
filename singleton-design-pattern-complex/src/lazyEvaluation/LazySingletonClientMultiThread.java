package lazyEvaluation;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

public class LazySingletonClientMultiThread {
public static void main(String[] args) throws InterruptedException {
	ExecutorService service =Executors.newFixedThreadPool(4);
	for(int i =0 ; i< 4 ; i++) {
		service.submit( () -> {
			LazySingleton s = LazySingleton.getInstance();
			
			System.out.println("first time instance "+s.hashCode());
			System.out.println("first time instance data "+s.getData());
		});
	}
	service.awaitTermination(1000, TimeUnit.MILLISECONDS);
	service.shutdown();
	
	
}

}
