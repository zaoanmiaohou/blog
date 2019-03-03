package com.cathy.designpattern.chain;

/**
 * 副总监
 * @author cathy
 *
 */
public class DeputyManager extends Leader{

	public DeputyManager(String leaderName) {
		super(leaderName);
	}

	@Override
	public void headerRequest(LeaveRequest leaveRequest) {
		if (leaveRequest.getLeaveDays() < 20) {  // 副总监只处理小于20天的请假请求
			System.out.println("副总监批");
			System.out.println(leaveRequest.getLeaveName()+",请假"+leaveRequest.getLeaveDays()+"天,原因："+leaveRequest.getReason());
		} else if(this.nextLeader != null){   // 大于20天的交给下一个领导处理，首先需要判断下一个领导是否存在
			this.nextLeader.headerRequest(leaveRequest);
		}		
	}
}
