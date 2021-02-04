package com.learning.designpatterns.leaveapprovalexample;

//making it easier for implementaion
//same application can be processed by multiple approvers
public class LeaveApplication {

	//could have taken from and to date, but for simplicity
	private int numOfDays;
	
	//based on type different appovers need to validate
	private LeaveType leaveType;
	
	//could be validate by any specifc approver
	private String approver;
	
	public LeaveApplication(int numOfDays, LeaveType leaveType) {
		this.numOfDays = numOfDays;
		this.leaveType = leaveType;
	}

	public static enum LeaveType{
		//simplicity case
		SICK, PLANNED,PAY_WITHOUT_LEAVE
	}

	public int getNumOfDays() {
		return numOfDays;
	}

	public void setNumOfDays(int numOfDays) {
		this.numOfDays = numOfDays;
	}

	public LeaveType getLeaveType() {
		return leaveType;
	}

	public void setLeaveType(LeaveType leaveType) {
		this.leaveType = leaveType;
	}

	public String getApprover() {
		return approver;
	}

	public void setApprover(String approver) {
		this.approver = approver;
	}

	@Override
	public String toString() {
		return "LeaveApplication [numOfDays=" + numOfDays + ", leaveType=" + leaveType + ", approver=" + approver + "]";
	}
	
	
}
