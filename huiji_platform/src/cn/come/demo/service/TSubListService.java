package cn.come.demo.service;

import java.io.File;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;

import cn.come.demo.mapper.TSubListMapper;
import cn.come.demo.po.TSubjectInfo;
import cn.come.demo.utils.PoiReadExcleUtil;

@Service
public class TSubListService {
@Resource
private TSubListMapper eSubListMapper;

//获取所有科目列表
public PageInfo<TSubjectInfo> getSubListByRequired(int page,TSubjectInfo tSubjectInfo){
	PageHelper.startPage(page, 5);
	List<TSubjectInfo> subjectList = eSubListMapper.getSubListByRequired(tSubjectInfo);
	PageInfo<TSubjectInfo> page1=new PageInfo<TSubjectInfo>(subjectList,7);
	
	return page1;
}
//根据id获取单个科目信息
public TSubjectInfo getSubById(Long id){
	return eSubListMapper.getSubById(id);
}
//修改科目信息
public void updSubject(TSubjectInfo tSubjectInfo) {
	eSubListMapper.updSubject(tSubjectInfo);
	
}
//删除科目信息
public void delSubById(Long subject_no) {
	eSubListMapper.delSubById(subject_no);
}

//创建题库明细，答案选项明细表
public String creatQueAndAnswer(MultipartFile uploadFile, HttpServletRequest request) throws Exception {
	if(uploadFile.getSize()>0){
		String fileName=uploadFile.getOriginalFilename();
		if(fileName.endsWith(".xls")){
			String queNo = (String) request.getSession().getAttribute("queNo");
			String leftPath=request.getSession().getServletContext().getRealPath("/WEB-INF/Excel");
			String subject_name=request.getParameter("subject_name");
			String questions_name=request.getParameter("questions_name");
			String questions_desc=request.getParameter("questions_desc");
			
			File file=new File(leftPath, fileName);
			if (!file.getParentFile().exists()) { 
				file.getParentFile().mkdirs();
            }
			uploadFile.transferTo(file);
			PoiReadExcleUtil pi=new PoiReadExcleUtil();
			String strPath = pi.getExcelString(leftPath+"\\"+fileName).toString();
			Map<String, Object> map=new HashMap<>();
			map.put("subject_name",subject_name);
			map.put("questions_name",questions_name);
			map.put("questions_desc",questions_desc );
			map.put("strPath",strPath );
			eSubListMapper.creatQueAndAnswer(map);
			return "success";
		}
	}
	return "faile";
}
//得到科目名称
public String getSubject(String subject_no) {
	String tSubList=eSubListMapper.getSubject(subject_no);
	return tSubList;
}


}
