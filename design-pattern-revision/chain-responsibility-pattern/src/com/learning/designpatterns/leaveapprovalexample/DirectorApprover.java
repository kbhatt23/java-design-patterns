package com.learning.designpatterns.leaveapprovalexample;

import com.learning.designpatterns.leaveapprovalexample.LeaveApplication.LeaveType;

public class DirectorApprover extends AbstractApprover{

	public DirectorApprover(Approver nextApprover) {
		super(nextApprover, "director");
	}

	@Override
	public boolean process(LeaveApplication leaveApplication) {
		LeaveType leaveType = leaveApplication.getLeaveType();
		int numOfDays = leaveApplication.getNumOfDays();
		if((leaveType.equals(LeaveType.PLANNED) && numOfDays > 10  && numOfDays <= 30)
				|| (leaveType.equals(LeaveType.PAY_WITHOUT_LEAVE) && numOfDays > 10  && numOfDays < 60)
				) {
			return true;
		}
		return false;
	}

}
