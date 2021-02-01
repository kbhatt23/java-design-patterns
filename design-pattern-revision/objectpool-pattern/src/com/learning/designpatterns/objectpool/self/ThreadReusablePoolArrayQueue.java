package com.learning.designpatterns.objectpool.self;

import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.BlockingQueue;

//could have used generics
public class ThreadReusablePoolArrayQueue implements ReusablePool{

	
	//could have also used arrayblocking queue as size is fixed and that will save semaphore memoty
	private BlockingQueue<Reusable> pool;
	public static ThreadReusablePoolArrayQueue createPool(int poolSize) {
		return new ThreadReusablePoolArrayQueue(poolSize);
	}
	
	private ThreadReusablePoolArrayQueue(int poolSize) {
		//size is fixed so that need not to grow or reduce
		this.pool= new ArrayBlockingQueue<>(poolSize);
		for(int i = 1 ; i<= poolSize ; i++) {
			//not using blocking as size more than max size wont be reached
			//state can be updated later
			this.pool.offer(new ThreadReusable(i));
		}
	}

	@Override
	public Reusable aquirePoolInstance() {
		//as of now using blocking call, oculd have intredoced timeouts
		//that will save deadlock conditions
		try {
			//blocking call
			Reusable reusable =this.pool.take();
			return reusable;
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		//unable to aquire lock sucessfully
		return null;
		
	}

	@Override
	public void releasePoolInstance(Reusable reusable) {
		//blocking call as we must ensure item is added back
		try {
			this.pool.put(reusable);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
