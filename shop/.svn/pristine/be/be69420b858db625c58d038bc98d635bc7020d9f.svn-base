package cn.itcast.shop.user.service;

import org.springframework.transaction.annotation.Transactional;

import cn.itcast.shop.user.dao.UserDao;
import cn.itcast.shop.user.vo.User;
import cn.itcast.shop.utils.MailUtil;
import cn.itcast.shop.utils.UUIDUtils;
@Transactional
public class UserService {
	private UserDao userDao;
	public void setUserDao(UserDao userDao) {
		this.userDao = userDao;
	}
	public User findByUsername(String username){
		return userDao.findByUsername(username);
	}
	public void save(User user) {
		user.setState(0);
		String code=UUIDUtils.getUuid()+UUIDUtils.getUuid();
		try {
			MailUtil.sendMail(user.getEmail(), code);
		} catch (Exception e) {
			e.printStackTrace();
		}
		user.setCode(code);
		userDao.save(user);
	}
	public User findByCode(String code) {
		User usr=userDao.findByCode(code);
		return usr;
	}
	public void update(User exitUser) {
		userDao.update(exitUser);
	}
	public User login(User user) {
		User exuser=userDao.login(user);
		return exuser;
	}
}
