package cn.itcast.shop.order.dao;

import java.util.List;

import org.springframework.orm.hibernate3.HibernateCallback;
import org.springframework.orm.hibernate3.support.HibernateDaoSupport;
import cn.itcast.shop.order.vo.Order;
import cn.itcast.shop.utils.PageHibernateCallback;
public class OrderDao extends HibernateDaoSupport {

	public void save(Order order){
		System.out.println(order.getOrdertime());
		try {
			this.getHibernateTemplate().save(order);
		} catch (Exception e) {
		e.printStackTrace();
		System.out.println("插入数据库有误");
		}
	}
//我的订单个数的统计
	public Integer findByCountUid(Integer uid) {
		String sql="select count(*) from Order o where o.user.uid=?";
		List<Long> list=this.getHibernateTemplate().find(sql, uid);
		if(list != null && list.size()>0){
			return list.get(0).intValue();
		}
		return null;
	}
	public List<Order> findByPageUid(Integer uid, Integer begin, int limit) {
		String hql="from Order o where o.user.uid=? order by ordertime desc";
		List<Order> list=this.getHibernateTemplate().execute(
				new PageHibernateCallback<Order>(hql,new Object[]{uid}, begin, limit));
		return list;
	}
	public Order findByOid(Integer oid) {
		
		return this.getHibernateTemplate().get(Order.class, oid);
	}
	public void update(Order currenorder) {
		this.getHibernateTemplate().update(currenorder);
	}

}
