package com.learning.designpatterns.leaveapprovalexample;

import com.learning.designpatterns.leaveapprovalexample.LeaveApplication.LeaveType;

public class ManagerApprover extends AbstractApprover{

	public ManagerApprover(Approver nextApprover) {
		super(nextApprover, "manager");
	}

	@Override
	public boolean process(LeaveApplication leaveApplication) {
		LeaveType leaveType = leaveApplication.getLeaveType();
		int numOfDays = leaveApplication.getNumOfDays();
		if(leaveType.equals(LeaveType.PLANNED) && numOfDays <= 10 &&  numOfDays > 0) {
			return true;
		}
		return false;
	}

}
