package cn.itcast.shop.utils;

import java.util.Properties;
import javax.mail.Message;
import javax.mail.MessagingException;
import javax.mail.Session;
import javax.mail.Transport;
import javax.mail.internet.AddressException;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;
import javax.mail.internet.MimeMessage.RecipientType;

public class MailUtil {
	public static void sendMail(String to,String code) throws Exception{
		 Properties properties = new Properties();

		  properties.put("mail.transport.protocol", "smtp");// 连接协议        

		  properties.put("mail.smtp.host", "smtp.qq.com");// 主机名        

		  properties.put("mail.smtp.port", 465);// 端口号        

		  properties.put("mail.smtp.auth", "true");        

		  properties.put("mail.smtp.ssl.enable", "true");//设置是否使用ssl安全连接  ---一般都使用        

		  properties.put("mail.debug", "true");//设置是否显示debug信息  true 会在控制台显示相关信息        
		//得到回话对象        
		Session session = Session.getInstance(properties);        
		// 获取邮件对象        
		Message message = new MimeMessage(session);        
		//设置发件人邮箱地址       
		 message.setFrom(new InternetAddress("1203287595@qq.com"));       
		 //设置收件人地址        
		 message.setRecipients(RecipientType.TO,new InternetAddress[] { new InternetAddress(to) });       
		 //设置邮件标题        
		message.setSubject("来自购物天堂传智商城官方激活邮件");        
		//设置邮件内容   
		message.setContent("<h1>购物天堂传智商城官方激活邮件!点下面链接完成激活操作!</h1><h3><a href='http://localhost:8080/shop/user_active.action?code="+code+"'>点击激活"+code+"</a></h3>",
				"text/html;charset=UTF-8"); 
		 //得到邮差对象        
		Transport transport = session.getTransport();        
		//连接自己的邮箱账户
		transport.connect("1203287595@qq.com", "xegvbzqtwbkzbagj");//密码为刚才得到的授权码        
		//发送邮件       
		transport.sendMessage(message, message.getAllRecipients());    
		}

}
