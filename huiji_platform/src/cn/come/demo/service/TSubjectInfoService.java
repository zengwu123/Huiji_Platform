package cn.come.demo.service;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import cn.come.demo.mapper.TSubjectInfoMapper;
import cn.come.demo.po.TSubjectInfo;

@Service
public class TSubjectInfoService {
	@Resource
	private TSubjectInfoMapper tSubjectInfoMapper;
	/**
	 * 
	 * @function 方法名：addTSubjectInfo
	 * @param 参数：@param list
	 * @description 描述：将Excel表中的数据插入到科目表中
	 * @return 返回参数：void
	 */
	public void addTSubjectInfo(List<TSubjectInfo> list){
		tSubjectInfoMapper.saveSubjectByPoi(list);
	}
}
