package com.learning.designpatterns.leaveapprovalexample;

import com.learning.designpatterns.leaveapprovalexample.LeaveApplication.LeaveType;

public class LeaveApplicationBadApproach {

	public static void main(String[] args) {
		//LeaveApplication leaveApplication = new LeaveApplication(0, LeaveType.SICK);
//		LeaveApplication leaveApplication = new LeaveApplication(11, LeaveType.PLANNED);
		LeaveApplication leaveApplication = new LeaveApplication(60, LeaveType.PAY_WITHOUT_LEAVE);
		processLeaveBadApproach(leaveApplication);
		System.out.println("final leave application status "+leaveApplication);
	}
	
	//client must knwo the business logic
	//too much if else case
	//logic whihc approver to call gets tighly coupled with the actual approver
	public static void processLeaveBadApproach(LeaveApplication leaveApplication) {
		
		//handling by Team lead
		//sick leave and 2 or less than 
		//do not support sick leave greater than 2, take planned leave
		LeaveType leaveType = leaveApplication.getLeaveType();
		int numOfDays = leaveApplication.getNumOfDays();
		if(leaveType == LeaveType.SICK && numOfDays <= 2 && numOfDays > 0) {
			leaveApplication.setApprover("lead");
			//manager helps only planned leave upto 10 days
		}else if(leaveType.equals(LeaveType.PLANNED) && numOfDays <= 10 &&  numOfDays > 0) {
			leaveApplication.setApprover("manager");
		}
		//ssupport pllaned leave upto 30 days
		else  if((leaveType.equals(LeaveType.PLANNED) && numOfDays > 10  && numOfDays <= 30)
				|| (leaveType.equals(LeaveType.PAY_WITHOUT_LEAVE) && numOfDays > 10  && numOfDays < 60)
				) {
			leaveApplication.setApprover("director");
		}else {
			System.out.println("leave not supported");
		}
	}
}
