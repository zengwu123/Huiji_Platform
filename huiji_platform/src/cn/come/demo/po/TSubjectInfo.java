package cn.come.demo.po;

import java.util.Date;

/**
 * 
 * @Title 标题：
 * @date 创建时间：2017年8月24日 下午3:51:47
 * @author 作者：曾午
 * @version   1.0 
 * @Description:方法功能：
 */
public class TSubjectInfo {

   private Long subject_no;
   private String subject_code;
   private String subject_name;
   private String class_content;
   private String calss_target;
   private Integer class_hour;
   private Long father_subject;
   private Date create_time;
   private Date update_time;
public Long getSubject_no() {
	return subject_no;
}
public void setSubject_no(Long subject_no) {
	this.subject_no = subject_no;
}
public String getSubject_code() {
	return subject_code;
}
public void setSubject_code(String subject_code) {
	this.subject_code = subject_code;
}
public String getSubject_name() {
	return subject_name;
}
public void setSubject_name(String subject_name) {
	this.subject_name = subject_name;
}
public String getClass_content() {
	return class_content;
}
public void setClass_content(String class_content) {
	this.class_content = class_content;
}
public String getCalss_target() {
	return calss_target;
}
public void setCalss_target(String calss_target) {
	this.calss_target = calss_target;
}
public Integer getClass_hour() {
	return class_hour;
}
public void setClass_hour(Integer class_hour) {
	this.class_hour = class_hour;
}
public Long getFather_subject() {
	return father_subject;
}
public void setFather_subject(Long father_subject) {
	this.father_subject = father_subject;
}
public Date getCreate_time() {
	return create_time;
}
public void setCreate_time(Date create_time) {
	this.create_time = create_time;
}
public Date getUpdate_time() {
	return update_time;
}
public void setUpdate_time(Date update_time) {
	this.update_time = update_time;
}
@Override
public String toString() {
	return "TSubjectInfo [subject_no=" + subject_no + ", subject_code=" + subject_code + ", subject_name="
			+ subject_name + ", class_content=" + class_content + ", calss_target=" + calss_target + ", class_hour="
			+ class_hour + ", father_subject=" + father_subject + ", create_time=" + create_time + ", update_time="
			+ update_time + "]";
}
   
 
}
