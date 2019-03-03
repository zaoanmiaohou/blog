package com.cathy.designpattern.chain;

/**
 * 领导的抽象类
 * @author cathy
 *
 */
public abstract class Leader {
	
	/**
	 * 领导的姓名
	 */
	protected String leaderName; 
	/**
	 *  写一个领导对象
	 */
	protected Leader nextLeader;   
	
	public Leader(String leaderName){
		this.leaderName = leaderName;
	}

	public void setNextLeader(Leader nextLeader) {
		this.nextLeader = nextLeader;
	}
	
	/**
	 * 处理请假请求业务的抽象方法
	 * @param leaveRequest
	 */
	public abstract void headerRequest(LeaveRequest leaveRequest);
}
