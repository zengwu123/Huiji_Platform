package cn.itcast.shop.user.action;

import java.io.IOException;
import javax.servlet.http.HttpServletResponse;
import org.apache.struts2.ServletActionContext;
import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.ModelDriven;

import cn.itcast.shop.user.service.UserService;
import cn.itcast.shop.user.vo.User;

@SuppressWarnings("serial")
public class UserAction extends ActionSupport implements ModelDriven<User> {
	private UserService userService;
	public String checkcode;
	public void setCheckcode(String checkcode) {
		this.checkcode = checkcode;
	}
	public void setUserService(UserService userService) {
		this.userService = userService;
	}
	private User user=new User();
	@Override
	public User getModel() {
		return user;
	}
	//��½����
	public String login(){
		String checkcode1=(String) ServletActionContext.getRequest().getSession().getAttribute("checkcode");
		if(!checkcode.equalsIgnoreCase(checkcode1)){
			this.addActionError("��֤������������������롣����");
			return "checkfail";
		}
		User exitUser=userService.login(user);
		if(exitUser==null){
			this.addActionError("��½ʧ�ܣ������µ�½��");
			return LOGIN;
		}else{
			ServletActionContext.getRequest().getSession()
			.setAttribute("exitUser", exitUser);;
			return "loginSuccess";
		}
		
	}
	/*
	 * ��ת����½ҳ��
	 */
	public String loginPage(){
		return "loginPage";
	}
	public String registPage() {
		return "registPage";
	}
	public String regist(){
		String checkcode1=(String) ServletActionContext.getRequest().getSession().getAttribute("checkcode");
		if(!checkcode.equalsIgnoreCase(checkcode1)){
			this.addActionError("��֤������������������롣����");
			return "checkcodefail";
		}
		userService.save(user);
		this.addActionMessage("ע��ɹ�����ȥ���伤�");
		return "msg";
	}
	//�˳�������session����
	public String quit(){
		ServletActionContext.getRequest().getSession().invalidate();
		return "quit";
	}
	/*
	 * ���伤�����
	 */
	public String active(){
		User exitUser=userService.findByCode(user.getCode());
		if(exitUser==null){
			this.addActionError("����ʧ�ܣ���������Ч��");
		}else{
			exitUser.setState(1);
			exitUser.setCode(null);
			userService.update(exitUser);
			this.addActionMessage("����ɹ������½��");
		}
		return "msg";
	}
	public String getUsername() throws IOException{
		User usr=userService.findByUsername(user.getUsername());
		HttpServletResponse response=ServletActionContext.getResponse();
		response.setCharacterEncoding("utf-8");
		response.setContentType("text/html;charset=UTF-8");
		if(usr!=null){
			response.getWriter().println("<font color='red'>�û����Ѿ����ڣ�</font>");;
		}else{
			response.getWriter().println("<font color='green'>�û�������ʹ�ã�</font>");;
			
		}
		return NONE;
	}
}
