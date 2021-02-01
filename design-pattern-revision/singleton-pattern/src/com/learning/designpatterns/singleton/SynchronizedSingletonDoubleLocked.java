package com.learning.designpatterns.singleton;

public class SynchronizedSingletonDoubleLocked {

	private SynchronizedSingletonDoubleLocked() {

	}

	//4. need to make it volatile for double checked locking case
	//but it again causes performance issue in multicore
	private static volatile SynchronizedSingletonDoubleLocked INSTANCE;

	// 1. making sync method have bad performance impact as even during read it
	// makes thread to come one by one whihc is not needed

//	public static /* 1. synchronized */ SynchronizedSingletonDoubleLocked getInstance() {
//		// 2. synchronization cause slowness
//		// when instnace is already set even the thread needs to come in order one by
//		// one, once instance i s set reading should not be synched
//
//		// 2. synchronized (SynchronizedSingletonDoubleLocked.class) {
//		if (INSTANCE == null) {
//			// should only block when item was supposed to be initlzied first time, then
//			// never blocks
//			synchronized (SynchronizedSingletonDoubleLocked.class) {
//				INSTANCE = new SynchronizedSingletonDoubleLocked();
//			}
//		}
////2.		}
//		return INSTANCE;
//	}
	
	//good double checked locking
	public static /* 1. synchronized */ SynchronizedSingletonDoubleLocked getInstance() {
		
		//first check, no need to synchronize
		//4. however issue is that since it is not synchronized there could be cache issues and hence need to be volatile
		if (INSTANCE == null) {
			// should only block when item was supposed to be initlzied first time, then
			// never blocks
			synchronized (SynchronizedSingletonDoubleLocked.class) {
				if (INSTANCE == null) {
					INSTANCE = new SynchronizedSingletonDoubleLocked();
				}
			}
		}
//2.		}
		return INSTANCE;
	}
}
