package cn.itcast.shop.user.dao;

import java.util.List;
import org.springframework.orm.hibernate3.support.HibernateDaoSupport;

import cn.itcast.shop.user.vo.User;

public class UserDao extends HibernateDaoSupport {
	public User findByUsername(String username){
		String hql="from User where username=?";
		@SuppressWarnings("unchecked")
		List<User> list=this.getHibernateTemplate().find(hql, username);
		if(list!=null&&list.size()>0){
			return list.get(0);
		}
		return null;
		
	}

	public void save(User user) {
		this.getHibernateTemplate().save(user);
	}

	public User findByCode(String code) {
		String hql="from User where code=?";
		@SuppressWarnings("unchecked")
		List<User> list=this.getHibernateTemplate().find(hql,code);
		if(list!=null&&list.size()>0){
			User usr=list.get(0);
			return usr;
		}
		return null;
	}

	public void update(User exitUser) {
		this.getHibernateTemplate().update(exitUser);
	}

	public User login(User user) {
		String hql="from User where username=? and password=? and state=?";
		@SuppressWarnings("unchecked")
		List<User> list=this.getHibernateTemplate().find(hql, user.getUsername(),user.getPassword(),1);
		if(list!=null&&list.size()>0){
			User exitUser=list.get(0);
			return exitUser;
		}
			return null;
	}

}
