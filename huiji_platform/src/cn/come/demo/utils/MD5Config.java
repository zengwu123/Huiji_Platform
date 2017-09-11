package cn.come.demo.utils;

import java.security.NoSuchAlgorithmException;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.security.authentication.encoding.Md5PasswordEncoder;
import org.springframework.security.authentication.encoding.ShaPasswordEncoder;


/**
* @Title: <p> MD5Config.java <p>
* @Description: <p> ��˵�� <p>
* @author    ���¾�
* @version   1.0 
* @date      2017��4��19�� ����2:18:11
* @Company: <p> �ۼ��Ƽ�  </p> 
*/
public class MD5Config {
	
	private static final Log logger=LogFactory.getLog(MD5Config.class);
	public static String md5(String password) {     
        Md5PasswordEncoder md5 = new Md5PasswordEncoder();     
        // false ��ʾ������32λ��Hex��, ��Ҳ��encodeHashAsBase64��, Acegi Ĭ������; true  ��ʾ������24λ��Base64��     
        md5.setEncodeHashAsBase64(false);     
        String pwd = md5.encodePassword(password, null);     
        logger.debug("MD5: " + pwd + " len=" + pwd.length());  
        return pwd;
    }  
    public static String sha_256(String password) throws NoSuchAlgorithmException {       
        ShaPasswordEncoder sha = new ShaPasswordEncoder(256);     
        sha.setEncodeHashAsBase64(true);     
        String pwd = sha.encodePassword(password, null);     
        logger.debug("��ϣ�㷨 256: " + pwd + " len=" + pwd.length());     
       return pwd;
    }     
         
        
    public static String sha_SHA_256(String password) {     
        ShaPasswordEncoder sha = new ShaPasswordEncoder();     
        sha.setEncodeHashAsBase64(false);     
        String pwd = sha.encodePassword(password, null);      
        logger.debug("��ϣ�㷨 SHA-256: " + pwd + " len=" + pwd.length());     
        return pwd;
    }     
         
        
    public static String md5_SystemWideSaltSource (String password,String username) {     
        Md5PasswordEncoder md5 = new Md5PasswordEncoder();     
        md5.setEncodeHashAsBase64(false);     
             
        // ʹ�ö�̬�����ε�ֻ��Ҫ��ע���û���ʱ�򽫵ڶ������������û�������     
        String pwd = md5.encodePassword(password, username);     
        logger.debug("MD5 SystemWideSaltSource: " + pwd + " len=" + pwd.length());     
       return pwd;
    }     
    public static void main(String[] args) throws NoSuchAlgorithmException {  
        md5("admin"); // ʹ�ü򵥵�MD5���ܷ�ʽ     
          
        sha_256("admin"); // ʹ��256�Ĺ�ϣ�㷨(SHA)����     
             
        sha_SHA_256("admin"); // ʹ��SHA-256�Ĺ�ϣ�㷨(SHA)����     
             
        md5_SystemWideSaltSource("123","teacher"); // ʹ��MD5�ټ�ȫ�ּ����μ��ܵķ�ʽ����      
    }  
    
}
