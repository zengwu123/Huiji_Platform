package cn.come.demo.po;

import java.util.Date;

public class TExaAnswerInfo {
	
	   private String answer_id;
	   private String question_no;
	   private Long answer_num;
	   private String answer_name;
	   private Long istrue;
	   private Date create_time;
	   private Date uppdate_time;
	public String getAnswer_id() {
		return answer_id;
	}
	public void setAnswer_id(String answer_id) {
		this.answer_id = answer_id;
	}
	public String getQuestion_no() {
		return question_no;
	}
	public void setQuestion_no(String question_no) {
		this.question_no = question_no;
	}
	public Long getAnswer_num() {
		return answer_num;
	}
	public void setAnswer_num(Long answer_num) {
		this.answer_num = answer_num;
	}
	public String getAnswer_name() {
		return answer_name;
	}
	public void setAnswer_name(String answer_name) {
		this.answer_name = answer_name;
	}
	public Long getIstrue() {
		return istrue;
	}
	public void setIstrue(Long istrue) {
		this.istrue = istrue;
	}
	public Date getCreate_time() {
		return create_time;
	}
	public void setCreate_time(Date create_time) {
		this.create_time = create_time;
	}
	public Date getUppdate_time() {
		return uppdate_time;
	}
	public void setUppdate_time(Date uppdate_time) {
		this.uppdate_time = uppdate_time;
	}
	@Override
	public String toString() {
		return "TExaAnswerInfo [answer_id=" + answer_id + ", question_no=" + question_no + ", answer_num=" + answer_num
				+ ", answer_name=" + answer_name + ", istrue=" + istrue + ", create_time=" + create_time
				+ ", uppdate_time=" + uppdate_time + "]";
	}
	   
}
