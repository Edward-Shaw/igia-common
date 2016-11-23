package com.cloume.shaw.igia.common.utils;

public class Const {

	public static final String SUBSCRIBE_ACCEPTED = "ACCEPTED"; //已接受
	public static final String SUBSCRIBE_DECLINED = "DECLINED"; //已拒绝
	public static final String SUBSCRIBE_HANDLING = "HANDLING"; //正在处理
	public static final String SUBSCRIBE_CLOSED = "CLOSED"; //已完结
	
	//微信管理后台的用户分组
	public static final long GROUP_TEACHER = 100;
	public static final long GROUP_PARENT = 101;

	public static final String STATE_DELETED = "DELETED"; //已删除
	public static final String STATE_PUBLISHED = "已发布";
	public static final String STATE_UNPUBLISHED = "未发布";
	public static final String STATE_UNKNOWN = "未知状态";
	
	public static final String COURSE_PAINTING = "绘画";  // 0
	public static final String COURSE_DANCE = "舞蹈";  // 1
	public static final String COURSE_TAEKWONDO = "跆拳道";  //2
	public static final String COURSE_YOGA = "瑜伽";  //3
	public static final String COURSE_SCIENCE = "语言与科技";  //4
	public static final String COURSE_CAMP = "寒暑假集训";  //5
	public static final String COURSE_UNKNOWN = "未分类";  //?
}
