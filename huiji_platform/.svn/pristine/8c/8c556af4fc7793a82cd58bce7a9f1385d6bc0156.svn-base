package cn.come.demo.service;

import static org.junit.Assert.*;

import java.util.List;

import org.junit.Before;
import org.junit.Test;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import cn.come.demo.po.PUmUser;

public class PUmUserServiceTest {
	ClassPathXmlApplicationContext factory;
	@Before
	public void setUp() throws Exception {
		factory=new ClassPathXmlApplicationContext("classpath:spring/application-*.xml");
	}

	@Test
	public void testFindUserAll() {
		PUmUserService userservice=factory.getBean(PUmUserService.class);
		PUmUser user=new PUmUser();
		user.setUserid("1005");
		user.setUsername("aa");
		//List<PUmUser> i=userservice.findUserAll(user, 1);
		
		//System.out.println(i.get(0).getUsername()+"=============>");
	}

}
