package com.cloume.shaw.igia.common.resource;

import java.util.ArrayList;

import org.springframework.data.annotation.Id;

/**
 * 预约记录，可能包含多条活动预约信息
 * @author yxiao_000
 *
 */
public class Subscribe {
	
	@Id
	private String id;
	
	//预约活动的自定义编号
	private String code;
	
	//预约用户的基本信息
	private SimpleUser user;
	
	//预约创建时间
	private long createTime;
	
	//预约的活动编号（code）列表
	private ArrayList<String> courses = new ArrayList<>();
	
	//预约的活动时间
	private long subscribeTime;
	
	//活动预约的状态：已接受、已拒绝、已完成、正在处理
	private String state;
	
	//预约活动班级
	private String subscribeClass;

	public long getCreateTime() {
		return createTime;
	}

	public void setCreateTime(long createTime) {
		this.createTime = createTime;
	}
	
	public long getSubscribeTime() {
		return subscribeTime;
	}

	public void setSubscribeTime(long subscribeTime) {
		this.subscribeTime = subscribeTime;
	}

	public SimpleUser getUser() {
		return user;
	}

	public void setUser(SimpleUser user) {
		this.user = user;
	}

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}

	public String getCode() {
		return code;
	}

	public void setCode(String code) {
		this.code = code;
	}

	public String getSubscribeClass() {
		return subscribeClass;
	}

	public void setSubscribeClass(String subscribeClass) {
		this.subscribeClass = subscribeClass;
	}

	public ArrayList<String> getCourses() {
		return courses;
	}

	public void setCourses(ArrayList<String> courses) {
		this.courses = courses;
	}

	public class SimpleUser{
		
		public SimpleUser(String openId, String username, String mobile, String address){
			this.openId = openId;
			this.username = username;
			this.mobile = mobile;
			this.address = address;
		}
		
		//预约用户的ID，微信环境下为OpenID
		private String openId;
		
		private String username;
		
		private String mobile;
		
		private String address;

		public String getOpenId() {
			return openId;
		}

		public void setOpenId(String openId) {
			this.openId = openId;
		}

		public String getUsername() {
			return username;
		}

		public void setUsername(String username) {
			this.username = username;
		}

		public String getMobile() {
			return mobile;
		}

		public void setMobile(String mobile) {
			this.mobile = mobile;
		}

		public String getAddress() {
			return address;
		}

		public void setAddress(String address) {
			this.address = address;
		}
		
	}

}
