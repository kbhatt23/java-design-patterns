package com.learning.designpatterns.leaveapprovalexample;

//we can move out common thigns here
//we know chaining rule to go for next item in cahin will be commong
//also approverType will also be common for all and hence we can move here
public abstract class AbstractApprover implements Approver{

	private Approver nextApprover;
	
	//appriver could be different based on implem,emntor class
	private String approverType;
	
	public AbstractApprover(Approver nextApprover,String approverType) {
		this.nextApprover = nextApprover;
		this.approverType=approverType;
	}

	@Override
	public void processApplication(LeaveApplication leaveApplication) {
		//we know this functioanlity will always be same for all approver
		//lets make it common
		if(!process(leaveApplication)) {
			// go for next approver in chain
			if (nextApprover == null) {
				System.out.println("leave can not be approved");
			} else {
				nextApprover.processApplication(leaveApplication);
			}
		}else {
			//update the aprover
			leaveApplication.setApprover(approverType);
		}
	}
	//we want to hide this from clinet
	//he should see only the real processapplication method
	public abstract boolean process(LeaveApplication leaveApplication);

}
