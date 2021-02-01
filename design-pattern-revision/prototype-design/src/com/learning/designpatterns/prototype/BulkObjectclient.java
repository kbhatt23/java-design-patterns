package com.learning.designpatterns.prototype;

public class BulkObjectclient {
	public static void main(String[] args) throws CloneNotSupportedException {
		long start = System.nanoTime();
		InnerBulkyObject innerBulkyObject = new InnerBulkyObject(11, "ram inner");
		BigBulkyObject bigBulkyObject = new BigBulkyObject(1, "ram", innerBulkyObject);
		
		System.out.println(bigBulkyObject);
		System.out.println("original hashcode "+bigBulkyObject.hashCode());
		long end = System.nanoTime();
		System.out.println("time taken to create main object "+(end-start));
		
		start = System.nanoTime();
		//clone do not call constructor and hence saves time by using o.s native methods
		BigBulkyObject clonedObj = bigBulkyObject.clone();
		
		System.out.println(clonedObj);
		System.out.println("cloned hashcode "+clonedObj.hashCode());
		end = System.nanoTime();
		System.out.println("time taken to create clone object "+(end-start));
		
	}
}
