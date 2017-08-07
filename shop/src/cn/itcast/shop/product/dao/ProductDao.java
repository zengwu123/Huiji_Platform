package cn.itcast.shop.product.dao;

import java.util.List;
import javax.management.Query;
import org.hibernate.criterion.DetachedCriteria;
import org.hibernate.criterion.Order;
import org.hibernate.criterion.Restrictions;
import org.springframework.orm.hibernate3.support.HibernateDaoSupport;

import cn.itcast.shop.product.vo.Product;
import cn.itcast.shop.utils.PageHibernateCallback;

public class ProductDao extends HibernateDaoSupport{

	public List<Product> findHot() {
		//ʹ�����߲�ѯ
		DetachedCriteria criteria=DetachedCriteria.forClass(Product.class);
		criteria.add(Restrictions.eq("is_hot", 1));
		criteria.addOrder(Order.desc("pdate"));//��������
		@SuppressWarnings("unchecked")
		List<Product> list=this.getHibernateTemplate().findByCriteria(criteria, 0, 10);
		return list;
	}

	public List<Product> findNew() {
		DetachedCriteria creteria=DetachedCriteria.forClass(Product.class);
		creteria.addOrder(Order.desc("pdate"));
		@SuppressWarnings("unchecked")
		List<Product> list=this.getHibernateTemplate().findByCriteria(creteria, 0, 10);
		return list;
	}

	public Product findByPid(Integer pid) {
		return this.getHibernateTemplate().get(Product.class, pid);
	}

	public int findCountCid(Integer cid) {
		String hql="select count(*) from Product p where p.categorySecond.category.cid=?";
		List<Long> list=this.getHibernateTemplate().find(hql, cid);
		if(list!=null&&list.size()>0){
			return list.get(0).intValue();
		}
		return 0;
	}

	public List<Product> findPageCid(Integer cid, int begin, int limit) {
		String hql="select p from Product p join p.categorySecond cs join cs.category c where c.cid=?";
		List<Product> list=this.getHibernateTemplate().execute(new PageHibernateCallback<Product>(hql, new Object[]{cid}, begin, limit));
		if(list!=null&&list.size()>0){
			return list;
		}
		return null;
	}

	public int findCountCsid(Integer csid) {
		String hql="select count(*) from Product p where p.categorySecond.csid=?";
		List<Long> list=this.getHibernateTemplate().find(hql, csid);
		if(list!=null&&list.size()>0){
			return list.get(0).intValue();
		}
		return 0;
	}

	public List<Product> findPageCsid(Integer csid, int begin, int limit) {
		String hql="select p from Product p join p.categorySecond cs where cs.csid=?";
		List<Product> list=this.getHibernateTemplate().execute(new PageHibernateCallback<Product>(hql, new Object[]{csid}, begin, limit));
		if(list!=null&&list.size()>0){
			return list;
		}
		return null;
	}

	
}
