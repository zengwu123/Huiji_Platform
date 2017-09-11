package cn.come.demo.po;

import java.util.Date;

public class T_ExaminationList {
		private String id;
		private String examination_info_no;   //VARCHAR(36)
		private String examination_id;
		private String question_no;
	    private Integer question_type;       // NUMBER 
	    private Integer question_num;        // NUMBER
	    private String choose_key;          // VARCHAR(10),
	    private String right_key;            //VARCHAR(10),
	    private Date create_time;         // DATE,
		public String getId() {
			return id;
		}
		public void setId(String id) {
			this.id = id;
		}
		public String getExamination_info_no() {
			return examination_info_no;
		}
		public void setExamination_info_no(String examination_info_no) {
			this.examination_info_no = examination_info_no;
		}
		public String getExamination_id() {
			return examination_id;
		}
		public void setExamination_id(String examination_id) {
			this.examination_id = examination_id;
		}
		public String getQuestion_no() {
			return question_no;
		}
		public void setQuestion_no(String question_no) {
			this.question_no = question_no;
		}
		public Integer getQuestion_type() {
			return question_type;
		}
		public void setQuestion_type(Integer question_type) {
			this.question_type = question_type;
		}
		public Integer getQuestion_num() {
			return question_num;
		}
		public void setQuestion_num(Integer question_num) {
			this.question_num = question_num;
		}
		public String getChoose_key() {
			return choose_key;
		}
		public void setChoose_key(String choose_key) {
			this.choose_key = choose_key;
		}
		public String getRight_key() {
			return right_key;
		}
		public void setRight_key(String right_key) {
			this.right_key = right_key;
		}
		public Date getCreate_time() {
			return create_time;
		}
		public void setCreate_time(Date create_time) {
			this.create_time = create_time;
		}
		@Override
		public String toString() {
			return "T_ExaminationList [id=" + id + ", examination_info_no=" + examination_info_no + ", examination_id="
					+ examination_id + ", question_no=" + question_no + ", question_type=" + question_type
					+ ", question_num=" + question_num + ", choose_key=" + choose_key + ", right_key=" + right_key
					+ ", create_time=" + create_time + "]";
		}
	    
	
	    
}
