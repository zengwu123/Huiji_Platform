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

		  properties.put("mail.transport.protocol", "smtp");// ����Э��        

		  properties.put("mail.smtp.host", "smtp.qq.com");// ������        

		  properties.put("mail.smtp.port", 465);// �˿ں�        

		  properties.put("mail.smtp.auth", "true");        

		  properties.put("mail.smtp.ssl.enable", "true");//�����Ƿ�ʹ��ssl��ȫ����  ---һ�㶼ʹ��        

		  properties.put("mail.debug", "true");//�����Ƿ���ʾdebug��Ϣ  true ���ڿ���̨��ʾ�����Ϣ        
		//�õ��ػ�����        
		Session session = Session.getInstance(properties);        
		// ��ȡ�ʼ�����        
		Message message = new MimeMessage(session);        
		//���÷����������ַ       
		 message.setFrom(new InternetAddress("1203287595@qq.com"));       
		 //�����ռ��˵�ַ        
		 message.setRecipients(RecipientType.TO,new InternetAddress[] { new InternetAddress(to) });       
		 //�����ʼ�����        
		message.setSubject("���Թ������ô����̳ǹٷ������ʼ�");        
		//�����ʼ�����   
		message.setContent("<h1>�������ô����̳ǹٷ������ʼ�!������������ɼ������!</h1><h3><a href='http://localhost:8080/shop/user_active.action?code="+code+"'>�������"+code+"</a></h3>",
				"text/html;charset=UTF-8"); 
		 //�õ��ʲ����        
		Transport transport = session.getTransport();        
		//�����Լ��������˻�
		transport.connect("1203287595@qq.com", "xegvbzqtwbkzbagj");//����Ϊ�ղŵõ�����Ȩ��        
		//�����ʼ�       
		transport.sendMessage(message, message.getAllRecipients());    
		}

}
