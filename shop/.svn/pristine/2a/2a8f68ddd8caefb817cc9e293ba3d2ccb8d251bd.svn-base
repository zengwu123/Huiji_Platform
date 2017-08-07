package cn.itcast.shop.product.service;

import java.util.List;

import org.springframework.transaction.annotation.Transactional;

import cn.itcast.shop.product.dao.ProductDao;
import cn.itcast.shop.product.vo.Product;
import cn.itcast.shop.utils.PageBean;

@Transactional
public class ProductService {
	private ProductDao productDao;
	public void setProductDao(ProductDao productDao) {
		this.productDao = productDao;
	}
	public List<Product> findHot() {
		return productDao.findHot();
	}
	public List<Product> findNew() {
		return productDao.findNew();
	}
	public Product findByPid(Integer pid) {
		return productDao.findByPid(pid);
	}
	public PageBean<Product> findByPageCid(Integer cid, Integer page) {
		PageBean<Product> pageBean=new PageBean<Product>();
		pageBean.setPage(page);
		int limit=6;
		pageBean.setLimit(limit);
		int totalCount=0;
		totalCount=productDao.findCountCid(cid);
		pageBean.setTotalCount(totalCount);
		int totalPage=0;
		if(totalCount%limit==0){
			totalPage=totalCount/limit;
		}else{
			totalPage=totalCount/limit+1;
		}
		pageBean.setTotalPage(totalPage);
		int begin=(page-1)*limit;
		List<Product> list=productDao.findPageCid(cid,begin,limit);
		pageBean.setList(list);
		return pageBean;
	}
	public PageBean<Product> findByCsid(Integer csid, Integer page) {
		PageBean<Product> pageBean=new PageBean<Product>();
		pageBean.setPage(page);
		int limit=6;
		pageBean.setLimit(limit);
		int totalCount=0;
		totalCount=productDao.findCountCsid(csid);
		pageBean.setTotalCount(totalCount);
		int totalPage=0;
		if(totalCount%limit==0){
			totalPage=totalCount/limit;
		}else{
			totalPage=totalCount/limit+1;
		}
		pageBean.setTotalPage(totalPage);
		int begin=(page-1)*limit;
		List<Product> list=productDao.findPageCsid(csid,begin,limit);
		pageBean.setList(list);
		return pageBean;
	}
	
}
