package com.learning.designpatterns.objectpool.self;

//we must enforce any kind of pool to be multi threaded
//we know the class chouls be of reusable interface
public interface ReusablePool {

	public Reusable aquirePoolInstance();

	public void releasePoolInstance(Reusable reusable);
}
