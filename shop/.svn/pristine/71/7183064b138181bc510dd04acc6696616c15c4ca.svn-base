package cn.itcast.shop.category.service;

import java.util.List;

import org.springframework.transaction.annotation.Transactional;

import cn.itcast.shop.category.dao.CategoryDao;
import cn.itcast.shop.category.vo.Category;

/*
 * 一级业务逻辑对象
 */
@Transactional
public class CategoryService {
private CategoryDao categoryDao;
public void setCategoryDao(CategoryDao categoryDao) {
	this.categoryDao = categoryDao;
}
	public List<Category> findall() {
		return categoryDao.findall();
	}

}
