package cn.come.demo.dto;

import java.util.List;

/**
 * 
 * @Title 标题：
 * @date 创建时间：2017年8月30日 下午8:41:59
 * @author 作者：曾午
 * @version   1.0 
 * @Description:方法功能：封装题目和答案list的实体类
 */
public class ExamPaperinfo {
	private String exam_no;         
	private String exam_name;       
	private Long  exam_type;         
	private Long  exam_length;       
	private Long  ps_type;           
	private Long  ps_num;            
	private Long  ps_score;          
	private Long  ps_total_score;
	private Long exam_total_score;
	private String pi_question_name;
	private List<ExamAnswer> examAnswerList;
	
	public String getExam_no() {
		return exam_no;
	}
	public void setExam_no(String exam_no) {
		this.exam_no = exam_no;
	}
	public String getExam_name() {
		return exam_name;
	}
	public void setExam_name(String exam_name) {
		this.exam_name = exam_name;
	}
	public Long getExam_type() {
		return exam_type;
	}
	public void setExam_type(Long exam_type) {
		this.exam_type = exam_type;
	}
	public Long getExam_length() {
		return exam_length;
	}
	public void setExam_length(Long exam_length) {
		this.exam_length = exam_length;
	}
	public Long getPs_type() {
		return ps_type;
	}
	public void setPs_type(Long ps_type) {
		this.ps_type = ps_type;
	}
	public Long getPs_num() {
		return ps_num;
	}
	public void setPs_num(Long ps_num) {
		this.ps_num = ps_num;
	}
	public Long getPs_score() {
		return ps_score;
	}
	public void setPs_score(Long ps_score) {
		this.ps_score = ps_score;
	}
	public Long getPs_total_score() {
		return ps_total_score;
	}
	public void setPs_total_score(Long ps_total_score) {
		this.ps_total_score = ps_total_score;
	}
	public Long getExam_total_score() {
		return exam_total_score;
	}
	public void setExam_total_score(Long exam_total_score) {
		this.exam_total_score = exam_total_score;
	}
	public String getPi_question_name() {
		return pi_question_name;
	}
	public void setPi_question_name(String pi_question_name) {
		this.pi_question_name = pi_question_name;
	}
	
	public List<ExamAnswer> getExamAnswerList() {
		return examAnswerList;
	}
	public void setExamAnswerList(List<ExamAnswer> examAnswerList) {
		this.examAnswerList = examAnswerList;
	}
	@Override
	public String toString() {
		return "ExamPaperinfo [exam_no=" + exam_no + ", exam_name=" + exam_name + ", exam_type=" + exam_type
				+ ", exam_length=" + exam_length + ", ps_type=" + ps_type + ", ps_num=" + ps_num + ", ps_score="
				+ ps_score + ", ps_total_score=" + ps_total_score + ", exam_total_score=" + exam_total_score
				+ ", pi_question_name=" + pi_question_name + ", examAnswerList=" + examAnswerList + "]";
	}

}
