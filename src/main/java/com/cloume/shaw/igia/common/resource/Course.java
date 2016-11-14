package com.cloume.shaw.igia.common.resource;

import org.springframework.data.annotation.Id;

/**
 * 课程类
 * @author yxiao_000
 *
 */
public class Course {
	
	@Id
	private String id;
	
	/**
	 * 人类友好的唯一编码
	 */
	private String code;
	
	/**
	 * 课程名称
	 */
	private String name;
	
	/**
	 * 课程描述信息
	 */
	private String description;
	
	/**
	 * 课程分类
	 */
	private String classification;
	
	/**
	 * 课程创建时间
	 */
	private long createdTime;
	
	/**
	 * 课程备注信息
	 */
	private String remark;
	
	/**
	 * 课程状态
	 */
	private String state;

	public String getCode() {
		return code;
	}

	public void setCode(String code) {
		this.code = code;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getClassification() {
		return classification;
	}

	public void setClassification(String classification) {
		this.classification = classification;
	}

	public long getCreatedTime() {
		return createdTime;
	}

	public void setCreatedTime(long createdTime) {
		this.createdTime = createdTime;
	}

	public String getRemark() {
		return remark;
	}

	public void setRemark(String remark) {
		this.remark = remark;
	}

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}
}
