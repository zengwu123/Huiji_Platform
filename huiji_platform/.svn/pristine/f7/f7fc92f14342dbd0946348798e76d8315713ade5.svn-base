package cn.come.demo.mapper;

import java.util.List;
import java.util.Map;

import org.apache.ibatis.annotations.Param;

import cn.come.demo.po.TExaQuestions;
import cn.come.demo.po.TSubjectInfo;

public interface TSubListMapper {
	/**
	 * @param tSubjectInfo 
	 * @function 方法名：getSubjectList
	 * @param 参数：@return
	 * @description 描述：查询所有科目信息
	 * @return 返回参数：List<TSubjectInfo>
	 */
	public List<TSubjectInfo> getSubListByRequired(TSubjectInfo tSubjectInfo);
	//根据id查询科目信息
	public TSubjectInfo getSubById(@Param("id")Long id);
	//修改科目信息
	public void updSubject(TSubjectInfo tSubjectInfo);
	//删除科目信息
	public void delSubById(@Param("subject_no")Long subject_no);
	
	//创建题库明细，答案选项明细表
	//public void creatQueAndAnswer(@Param("strPath")String strPath,@Param("queNo") String queNo);
	public void creatQueAndAnswer(Map<String, Object> map);
	
	//得到科目名称
	public String getSubject(@Param("subject_no")String subject_no);
	//得到题库列表
	public List<TExaQuestions> getTExaQuestions(TExaQuestions tExaQuestions);
}
