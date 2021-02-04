package com.learning.designpatterns.leaveapprovalexample;

import com.learning.designpatterns.leaveapprovalexample.LeaveApplication.LeaveType;

public class LeaveApplicationChainClient {

	public static void main(String[] args) {
		LeaveApplication leaveApplication = new LeaveApplication(90, LeaveType.PAY_WITHOUT_LEAVE);
		Approver createChain = createChain();
		processLEaveApplicationChain(leaveApplication, createChain);
		
		System.out.println("final approver status "+leaveApplication);
		
	}
	
	//suppose any framework presare this for you
	public static Approver createChain() {
		DirectorApprover directorApprover = new DirectorApprover(null);
		ManagerApprover managerApprover = new ManagerApprover(directorApprover);
		LeadApprover leadApprover = new LeadApprover(managerApprover);
		return leadApprover;
	}
	
	public static void processLEaveApplicationChain(LeaveApplication leaveApplication, Approver approver){
		approver.processApplication(leaveApplication);
	}
}
