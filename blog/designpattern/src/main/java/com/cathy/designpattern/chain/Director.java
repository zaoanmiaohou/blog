package com.cathy.designpattern.chain;

/**
 * 主任
 * @author cathy
 *
 */
public class Director extends Leader{

	public Director(String leaderName) {
		super(leaderName);
	}

	@Override
	public void headerRequest(LeaveRequest leaveRequest) {
		if (leaveRequest.getLeaveDays() < 10) {  // 主任只处理小于10天的请假请求
			System.out.println("主任批");
			System.out.println(leaveRequest.getLeaveName()+",请假"+leaveRequest.getLeaveDays()+"天,原因："+leaveRequest.getReason());
		} else if(this.nextLeader != null){  // 大于10天的交给下一个领导处理，首先需要判断下一个领导是否存在
			this.nextLeader.headerRequest(leaveRequest);
		}
	}
}
