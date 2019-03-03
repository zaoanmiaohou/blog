package com.cathy.designpattern.chain;

/**
 * 总监
 * @author cathy
 *
 */
public class Manager extends Leader{

	public Manager(String leaderName) {
		super(leaderName);
	}

	@Override
	public void headerRequest(LeaveRequest leaveRequest) {
		if (leaveRequest.getLeaveDays() < 30) {   // 总监只处理小于30天的请假请求
			System.out.println("总监批");
			System.out.println(leaveRequest.getLeaveName()+",请假"+leaveRequest.getLeaveDays()+"天,原因："+leaveRequest.getReason());
		} else{
			System.out.println("总监未批");
			System.out.println(leaveRequest.getLeaveName()+"难道想辞职？请"+leaveRequest.getLeaveDays()+"多天");
		}
	}
}
