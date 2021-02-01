package com.learning.designpatterns.objectpool.self;
//assume this clas represent thread
//it takes time to create instance and takes lot of memory so we will put in pool
public class ThreadReusable implements Reusable{

	//state
	private int id;
	
	public ThreadReusable(int id) {
		this.id = id;
	}

	@Override
	public void runTask() {
		System.out.println("Started task with id "+id);
		//demo slowness
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("Completed task with id "+id);
	}

	public int getId() {
		return id;
	}

	private void setId(int id) {
		this.id = id;
	}
	
	public void updateState(int id) {
		setId(id);
	}
	
	

}
