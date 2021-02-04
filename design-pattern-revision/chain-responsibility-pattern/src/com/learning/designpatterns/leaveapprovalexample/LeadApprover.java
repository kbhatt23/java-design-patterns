package com.learning.designpatterns.leaveapprovalexample;

import com.learning.designpatterns.leaveapprovalexample.LeaveApplication.LeaveType;

//segregation of concers
//filerting if this guy can process it will be in same class
//also stpe to process will alsobe in same class
//if we can not proces we pass to next untill next is present
public class LeadApprover extends AbstractApprover{

	public LeadApprover(Approver nextApprover) {
		super(nextApprover, "lead");
	}
	@Override
	public boolean process(LeaveApplication leaveApplication) {
		LeaveType leaveType = leaveApplication.getLeaveType();
		int numOfDays = leaveApplication.getNumOfDays();
		if (leaveType == LeaveType.SICK && numOfDays <= 2 && numOfDays > 0) {
			//moved to abstract class common for all subtypes
			//leaveApplication.setApprover("lead");
			return true;
		} 
		return false;
	}

	

}
