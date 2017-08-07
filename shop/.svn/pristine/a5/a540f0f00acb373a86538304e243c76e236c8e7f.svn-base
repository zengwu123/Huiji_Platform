package cn.itcast.shop.order.service;

import java.util.List;

import org.springframework.transaction.annotation.Transactional;

import cn.itcast.shop.order.dao.OrderDao;
import cn.itcast.shop.order.vo.Order;
import cn.itcast.shop.utils.PageBean;
@Transactional
public class OrderService {
	private OrderDao orderDao;
	public void setOrderDao(OrderDao orderDao) {
		this.orderDao = orderDao;
	}
	public void save(Order order) {
			orderDao.save(order);
	}
	public PageBean<Order> findPageByUid(Integer uid, Integer page) {
		//设置当前页数
		PageBean<Order> pageBean=new PageBean<Order>();
		pageBean.setPage(page);
		int limit=5;
		pageBean.setLimit(limit);
		Integer totalCount=null;
		totalCount=orderDao.findByCountUid(uid);
		pageBean.setTotalCount(totalCount);
		Integer totalPage=null;
		if(totalCount%limit==0){
			totalPage=totalCount/limit;
		}else{
			totalPage=totalCount/limit+1;
		}
		pageBean.setTotalPage(totalPage);
		List<Order> list=null;
		Integer begin=(page-1)*limit;
		list=orderDao.findByPageUid(uid,begin,limit);
		pageBean.setList(list);
		return pageBean;
	}
	public Order findByOid(Integer oid) {
		
		return orderDao.findByOid(oid);
	}
	public void update(Order currenorder) {
		orderDao.update(currenorder);
	}
}
