package com.learning.oopscocepts.basics;

public class OverridingSuperUsage {
public static void main(String[] args) {
	ChildSuperUSage obj = new ChildSuperUSage();
	obj.randomManipulate();
}

}
class FatherSuperUsage{
	
	public void manipulate(String str) {
		System.out.println("Father manipulation called for string "+str);
	}
}

class ChildSuperUSage extends FatherSuperUsage{
	
	public void randomManipulate() {
	//bad place to use it as in future if we override the super method it will get ignored
		//dynamic pol;ymorphism gone
		//super.manipulate("random string");
		manipulate("random string");
	}
	
	//use super method call only in overriden methods to call the uper method we just overrode
	@Override
	public void manipulate(String str) {
		//good place as we are in the same overriden method and hence we can reuse father and add features on child
		super.manipulate(str);
		System.out.println("Child manipulation called for string "+str);
	}
}
