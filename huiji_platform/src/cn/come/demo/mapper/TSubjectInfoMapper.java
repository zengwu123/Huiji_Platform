package cn.come.demo.mapper;

import java.util.List;

import cn.come.demo.po.TSubjectInfo;

/**
 * 
 * @Title ���⣺
 * @date ����ʱ�䣺2017��8��24�� ����4:43:51
 * @author ���ߣ�����
 * @version   1.0 
 * @Description:�������ܣ�
 */
public interface TSubjectInfoMapper {

	/**
	 * 
	 * @function ��������saveSubjectByPoi
	 * @param ������@param list
	 * @description ���������ɿ�Ŀ������
	 * @return ���ز�����void
	 */
	public void saveSubjectByPoi(List<TSubjectInfo> list);
}
