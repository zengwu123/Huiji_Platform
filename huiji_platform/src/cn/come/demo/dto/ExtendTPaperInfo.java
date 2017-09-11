package cn.come.demo.dto;

import java.util.List;

import cn.come.demo.po.TPaperInfo;
import cn.come.demo.po.TPaperList;

public class ExtendTPaperInfo extends TPaperInfo {
	private Long total_score;
	private Long question_num;
    private List<TPaperList> tPaperList;
	public Long getTotal_score() {
		return total_score;
	}
	public void setTotal_score(Long total_score) {
		this.total_score = total_score;
	}
	public Long getQuestion_num() {
		return question_num;
	}
	public void setQuestion_num(Long question_num) {
		this.question_num = question_num;
	}
	public List<TPaperList> gettPaperList() {
		return tPaperList;
	}
	public void settPaperList(List<TPaperList> tPaperList) {
		this.tPaperList = tPaperList;
	}
	@Override
	public String toString() {
		return "ExtendTPaperInfo [total_score=" + total_score + ", question_num=" + question_num + ", tPaperList="
				+ tPaperList + "]";
	}
    
}
