package com.cathy.designpattern.chain;

/**
 * 流程处理类
 * @author cathy
 *
 */
public class Leave {
	
	public static void main(String[] args) {
	
		// 设置一个请假请求
		LeaveRequest employee01 = new LeaveRequest();
		employee01.setLeaveName("员工张三");
		employee01.setLeaveDays(4);   // 应交给  Director主任  处理
		employee01.setReason("事假");		
		
		LeaveRequest employee02 = new LeaveRequest();
		employee02.setLeaveName("员工李四");
		employee02.setLeaveDays(15);   // 应交给  DeputyManager副总监  处理
		employee02.setReason("事假");		
		
		LeaveRequest employee03 = new LeaveRequest();
		employee03.setLeaveName("员工王五");  // 应交给  Manager总监   处理
		employee03.setLeaveDays(25);
		employee03.setReason("事假");		
		
		LeaveRequest employee04 = new LeaveRequest();
		employee04.setLeaveName("员工赵六");
		employee04.setLeaveDays(40);    // 应交给Manager处理
		employee04.setReason("事假");		
		
		// 设置领导
		Leader director = new Director("director");  // 主任
		Leader deputyManager = new DeputyManager("deputyManager");  // 副总监
		Leader manager = new Manager("manager");  // 总监
		
	    // 设置各个领导的上下级关系
		director.setNextLeader(deputyManager);
		deputyManager.setNextLeader(manager);
		
		// 从主任开始处理
		director.headerRequest(employee01);
		director.headerRequest(employee02);
		director.headerRequest(employee03);
		director.headerRequest(employee04);
	}
}
