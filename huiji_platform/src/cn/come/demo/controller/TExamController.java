package cn.come.demo.controller;

import java.util.Date;
import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;

import cn.come.demo.QuartzJob.SpringQuartzDemo;
import cn.come.demo.dto.ExtendTPaper;
import cn.come.demo.dto.ExtendTPaperInfo;
import cn.come.demo.po.T_ExaminationInfo;
import cn.come.demo.po.T_ExaminationList;
import cn.come.demo.service.TExamService;

@Controller
@RequestMapping("/exam")
public class TExamController {

	@Resource
	private TExamService tExamService;
	@Resource
	private SpringQuartzDemo springQuartzDemo;
	
	//���ɿ��Ա�ţ��Ծ���⿨
	@ResponseBody
	@RequestMapping("/createExamNo")
	public int createExamNo(String examination_no,int num){
		tExamService.createExamNo(examination_no,num);
		return num;
	}
	
	//���ҿ��Ա�ţ����뿼��
	@ResponseBody
	@RequestMapping("/findExaminfoNo")
	public List<T_ExaminationInfo> findExaminfoNo(String data){
		List<T_ExaminationInfo> exam_info_no=tExamService.findExaminfoNo(data);
		return exam_info_no;
	}
	
	
	//�õ��Ծ�ҳ����������չʾ����
	@ResponseBody
	@RequestMapping("/toUdpExamInfo")
	public int toUdpExamInfo(String exam_info_no,String studentName){
		Date date =new Date();
		int num=tExamService.toUdpExamInfo(date,exam_info_no,studentName);
		if(num>0){
			return 200;//�޸ĳɹ���
		}else{
			return 100;//�޸�ʧ�ܣ���
		}
	}
	
	//�õ��Ծ�ҳ����������չʾ����
	@RequestMapping("/toPaperinfo")
	public ModelAndView forCreatePaper(String exam_info_no,String examination_no){
		ExtendTPaper infoList = tExamService.getPaperInfoList(examination_no);
		int sum=0;
		for (ExtendTPaperInfo ee : infoList.getExtendTPaperInfo()) {
			sum+=ee.getQuestion_nscore();
		}
		ModelAndView mv=new ModelAndView();
		mv.addObject("infoList", infoList);
		mv.addObject("exam_info_no", exam_info_no);
		mv.addObject("sum", sum);
		mv.setViewName("exam.examOpration");
		return mv;
	}
	
	//���㿼�Է����������ط�������������
	@ResponseBody
	@RequestMapping("/examTest")
	public List<Integer> examTest(String single,String mulCho,String judge,String username,
			String exam_info_no){
		String data=single+",==,"+mulCho+"=="+judge+",";
		List<Integer> list = tExamService.calScores(exam_info_no,data,username);
		return list;
	}
	
    //�鿴�Ծ�����б�
	@ResponseBody
	@RequestMapping("/paperInfoScoreList")
	public ModelAndView paperInfoScoreList(@RequestParam(value="page",defaultValue="1")int page,T_ExaminationInfo t_ExaminationInfo){
		PageHelper.startPage(page, 4);
		List<T_ExaminationInfo> scoreList = tExamService.getPaperInfoScoreList(t_ExaminationInfo);
		PageInfo<T_ExaminationInfo> pageinfo=new PageInfo<>(scoreList,3);
		ModelAndView mv=new ModelAndView();
		mv.addObject("pageinfo", pageinfo);
		mv.addObject("t_ExaminationInfo", t_ExaminationInfo);
		mv.setViewName("exam.paperInfoScoreList");
		return mv;
	}
	
	//�鿴����ϸ�б�
	@ResponseBody
	@RequestMapping("/answerDetials")
	public ModelAndView answerDetials(@RequestParam(value="page",defaultValue="1")int page,T_ExaminationList t_ExaminationList){
		PageInfo<T_ExaminationList> pageinfo = tExamService.answerDetialsList(page,t_ExaminationList);
		ModelAndView mv=new ModelAndView();
		mv.addObject("pageinfo", pageinfo);
		mv.addObject("t_ExaminationList", t_ExaminationList);
		mv.setViewName("exam.answerDetials");
		return mv;
	}
	
    //���ش���ϸ�б�
	@ResponseBody
	@RequestMapping("/expolExcle")
	public String expolExcle(String examination_info_no){
		tExamService.expolExcle(examination_info_no);
		return null;
	}
	
	//���سɼ���Excel
		@ResponseBody
		@RequestMapping("/loadScoresToExcle")
		public int loadScoresToExcle(){
			int result = springQuartzDemo.quartzGetScoresExecle();
			return result;
		}
}
