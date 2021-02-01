package com.learning.designpatterns.objectpool.self;

import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.Semaphore;
import java.util.concurrent.atomic.AtomicInteger;

//could have used generics
public class ThreadReusablePool implements ReusablePool{

	
	//could have also used arrayblocking queue as size is fixed and that will save semaphore memoty
	private Map<Integer, Reusable> pool;
	private Semaphore lock ;
	private AtomicInteger index=new AtomicInteger(1);
	public static ThreadReusablePool createPool(int poolSize) {
		return new ThreadReusablePool(poolSize);
	}
	
	private ThreadReusablePool(int poolSize) {
		//size is fixed so that need not to grow or reduce
		this.pool= new HashMap<>(poolSize);
		for(int i = 1 ; i<= poolSize ; i++) {
			this.pool.put(i, new ThreadReusable(i));
		}
		lock = new Semaphore(poolSize, true);
	}

	@Override
	public Reusable aquirePoolInstance() {
		//as of now using blocking call, oculd have intredoced timeouts
		//that will save deadlock conditions
		try {
			lock.acquire();
			Reusable reusable = this.pool.get(index.getAndIncrement());
			return reusable;
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		//unable to aquire lock sucessfully
		return null;
		
	}

	@Override
	public void releasePoolInstance(Reusable reusable) {
		//release lock
		index.decrementAndGet();
		lock.release();
	}

}
