package cn.come.demo.po;

import java.util.Date;

public class T_ExaminationInfo {
	
	private String examination_info_no;
	private String  examination_no;   // VARCHAR(36),
	private String  examination_user;   //VARCHAR(36),
	private Integer  right_num;          //NUMBER,
	private Integer  error_num;         //NUMBER,
	private Integer score;            // NUMBER,
	private Integer examination_length; //NUMBER,
	private Date start_time;         //DATE,
	private Date end_time;          // DATE,
	public String getExamination_info_no() {
		return examination_info_no;
	}
	public void setExamination_info_no(String examination_info_no) {
		this.examination_info_no = examination_info_no;
	}
	public String getExamination_no() {
		return examination_no;
	}
	public void setExamination_no(String examination_no) {
		this.examination_no = examination_no;
	}
	public String getExamination_user() {
		return examination_user;
	}
	public void setExamination_user(String examination_user) {
		this.examination_user = examination_user;
	}
	public Integer getRight_num() {
		return right_num;
	}
	public void setRight_num(Integer right_num) {
		this.right_num = right_num;
	}
	public Integer getError_num() {
		return error_num;
	}
	public void setError_num(Integer error_num) {
		this.error_num = error_num;
	}
	public Integer getScore() {
		return score;
	}
	public void setScore(Integer score) {
		this.score = score;
	}
	public Integer getExamination_length() {
		return examination_length;
	}
	public void setExamination_length(Integer examination_length) {
		this.examination_length = examination_length;
	}
	public Date getStart_time() {
		return start_time;
	}
	public void setStart_time(Date start_time) {
		this.start_time = start_time;
	}
	public Date getEnd_time() {
		return end_time;
	}
	public void setEnd_time(Date end_time) {
		this.end_time = end_time;
	}
	@Override
	public String toString() {
		return "T_ExaminationInfo [examination_info_no=" + examination_info_no + ", examination_no=" + examination_no
				+ ", examination_user=" + examination_user + ", right_num=" + right_num + ", error_num=" + error_num
				+ ", score=" + score + ", examination_length=" + examination_length + ", start_time=" + start_time
				+ ", end_time=" + end_time + "]";
	}
	
}
