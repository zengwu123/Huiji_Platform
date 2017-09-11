package cn.come.demo.interceptor;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import org.springframework.web.servlet.HandlerInterceptor;
import org.springframework.web.servlet.ModelAndView;

public class LoginInterceptor implements HandlerInterceptor {

	@Override
	public void afterCompletion(HttpServletRequest arg0, HttpServletResponse arg1, Object arg2, Exception arg3)
			throws Exception {
		// TODO Auto-generated method stub

	}

	@Override
	public void postHandle(HttpServletRequest arg0, HttpServletResponse arg1, Object arg2, ModelAndView arg3)
			throws Exception {
		// TODO Auto-generated method stub

	}

	@Override
	public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object arg2) throws Exception {
		String requestURI = request.getRequestURI();
		Object userInfo = request.getSession().getAttribute("userinfo");
		if(isLogin(requestURI)){
			return true;
		}else{
			if(userInfo==null){
				request.getRequestDispatcher("/jsp/login.jsp").forward(request, response);
				return false;
			}else{
				return true;
			}
		}
	}
	
	public boolean isLogin(String path){
		boolean flag=false;
		String[] strPath={"login.jsp","loginUser.action",".css",".js","registUser"};
		for (int i = 0; i < strPath.length; i++) {
			if(path.contains(strPath[i])){
				flag=true;
				break;
			}
		}
		return flag;
		
	}

}
