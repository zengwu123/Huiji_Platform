<%@ page session="false" %>
<%
	String url=request.getContextPath()+"/loginUser.action";
	response.sendRedirect(response.encodeURL(url));
%>
