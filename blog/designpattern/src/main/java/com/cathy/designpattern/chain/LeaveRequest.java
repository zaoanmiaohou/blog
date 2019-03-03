package com.cathy.designpattern.chain;

/**
 * 一次请假请求类
 * @author cathy
 *
 */
public class LeaveRequest {
	/**
	 * 请假者的姓名
	 */
	private String leaveName;
	/**
	 * 请假的天数
	 */
	private int leaveDays;
	/**
	 * 请假的原因
	 */
	private String reason;
	
	public String getLeaveName() {
		return leaveName;
	}
	public void setLeaveName(String leaveName) {
		this.leaveName = leaveName;
	}
	public int getLeaveDays() {
		return leaveDays;
	}
	public void setLeaveDays(int leaveDays) {
		this.leaveDays = leaveDays;
	}
	public String getReason() {
		return reason;
	}
	public void setReason(String reason) {
		this.reason = reason;
	}
}
