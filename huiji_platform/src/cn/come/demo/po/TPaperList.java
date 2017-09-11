package cn.come.demo.po;

import java.util.Date;

public class TPaperList {

		private String examinati_list_id;  //VARCHAR(36)          not null,
		private String examination_id;     //VARCHAR(36)          not null,
		private Long question_num;       //NUMBER               not null,
		private Long answer_num;         //NUMBER               not null,
		private String answer_content;    // VARCHAR(500)         not null,
		private Long istrue;             //NUMBER               not null,
		private String create_user;        //VARCHAR(36),
		private Date create_time;        //DATE,
		private Date update_time;        //DATE,
		public String getExaminati_list_id() {
			return examinati_list_id;
		}
		public void setExaminati_list_id(String examinati_list_id) {
			this.examinati_list_id = examinati_list_id;
		}
		public String getExamination_id() {
			return examination_id;
		}
		public void setExamination_id(String examination_id) {
			this.examination_id = examination_id;
		}
		public Long getQuestion_num() {
			return question_num;
		}
		public void setQuestion_num(Long question_num) {
			this.question_num = question_num;
		}
		public Long getAnswer_num() {
			return answer_num;
		}
		public void setAnswer_num(Long answer_num) {
			this.answer_num = answer_num;
		}
		public String getAnswer_content() {
			return answer_content;
		}
		public void setAnswer_content(String answer_content) {
			this.answer_content = answer_content;
		}
		public Long getIstrue() {
			return istrue;
		}
		public void setIstrue(Long istrue) {
			this.istrue = istrue;
		}
		public String getCreate_user() {
			return create_user;
		}
		public void setCreate_user(String create_user) {
			this.create_user = create_user;
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
			return "TPaperList [examinati_list_id=" + examinati_list_id + ", examination_id=" + examination_id
					+ ", question_num=" + question_num + ", answer_num=" + answer_num + ", answer_content="
					+ answer_content + ", istrue=" + istrue + ", create_user=" + create_user + ", create_time="
					+ create_time + ", update_time=" + update_time + "]";
		}
		
}
