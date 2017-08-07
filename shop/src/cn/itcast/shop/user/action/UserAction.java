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
	//登陆操作
	public String login(){
		String checkcode1=(String) ServletActionContext.getRequest().getSession().getAttribute("checkcode");
		if(!checkcode.equalsIgnoreCase(checkcode1)){
			this.addActionError("验证码输入错误，请重新输入。。。");
			return "checkfail";
		}
		User exitUser=userService.login(user);
		if(exitUser==null){
			this.addActionError("登陆失败，请重新登陆！");
			return LOGIN;
		}else{
			ServletActionContext.getRequest().getSession()
			.setAttribute("exitUser", exitUser);;
			return "loginSuccess";
		}
		
	}
	/*
	 * 跳转到登陆页面
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
			this.addActionError("验证码输入错误，请重新输入。。。");
			return "checkcodefail";
		}
		userService.save(user);
		this.addActionMessage("注册成功，请去邮箱激活！");
		return "msg";
	}
	//退出，销毁session操作
	public String quit(){
		ServletActionContext.getRequest().getSession().invalidate();
		return "quit";
	}
	/*
	 * 邮箱激活操作
	 */
	public String active(){
		User exitUser=userService.findByCode(user.getCode());
		if(exitUser==null){
			this.addActionError("激活失败，激活码无效！");
		}else{
			exitUser.setState(1);
			exitUser.setCode(null);
			userService.update(exitUser);
			this.addActionMessage("激活成功，请登陆！");
		}
		return "msg";
	}
	public String getUsername() throws IOException{
		User usr=userService.findByUsername(user.getUsername());
		HttpServletResponse response=ServletActionContext.getResponse();
		response.setCharacterEncoding("utf-8");
		response.setContentType("text/html;charset=UTF-8");
		if(usr!=null){
			response.getWriter().println("<font color='red'>用户名已经存在！</font>");;
		}else{
			response.getWriter().println("<font color='green'>用户名可以使用！</font>");;
			
		}
		return NONE;
	}
}
