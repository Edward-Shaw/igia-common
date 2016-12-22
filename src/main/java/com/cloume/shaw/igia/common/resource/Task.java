package com.cloume.shaw.igia.common.resource;

import org.springframework.data.annotation.Id;

/**
 * 课程作业类
 * @author yxiao_000
 *
 */
public class Task {

	@Id
	private String id;
	
	/**
	 * 人类友好的唯一编码
	 */
	private String code;
	
	/**
	 * 作业内容
	 */
	private String content;
	
	/**
	 * 作业所属课程编码
	 */
	private String courseCode;
	
	/**
	 * 作业所属课程名称
	 */
	private String courseName;
	
	/**
	 * 作业创建时间
	 */
	private long createdTime;
	
	/**
	 * 上一次修改作业内容的时间
	 */
	private long updatedTime;
	
	/**
	 * 作业状态
	 */
	private String state;

	public String getCode() {
		return code;
	}

	public void setCode(String code) {
		this.code = code;
	}

	public String getContent() {
		return content;
	}

	public void setContent(String content) {
		this.content = content;
	}

	public String getCourseCode() {
		return courseCode;
	}

	public void setCourseCode(String courseCode) {
		this.courseCode = courseCode;
	}

	public String getCourseName() {
		return courseName;
	}

	public void setCourseName(String courseName) {
		this.courseName = courseName;
	}

	public long getCreatedTime() {
		return createdTime;
	}

	public void setCreatedTime(long createdTime) {
		this.createdTime = createdTime;
	}

	public long getUpdatedTime() {
		return updatedTime;
	}

	public void setUpdatedTime(long updatedTime) {
		this.updatedTime = updatedTime;
	}

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}
	
}
