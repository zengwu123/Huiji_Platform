<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
    <%@taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta charset="UTF-8" />
<meta name="viewport" content="width=device-width, initial-scale=1.0" />
<link rel="stylesheet" href="../../css/bootstrap.min.css" />
<link rel="stylesheet" href="../../css/bootstrap-responsive.min.css" />
<link rel="stylesheet" href="../../css/colorpicker.css" />
<link rel="stylesheet" href="../../../css/datepicker.css" />
<link rel="stylesheet" href="../../css/uniform.css" />
<link rel="stylesheet" href="../../css/select2.css" />
<link rel="stylesheet" href="../../css/matrix-style.css" />
<link rel="stylesheet" href="../../css/matrix-media.css" />
<link rel="stylesheet" href="../../css/bootstrap-wysihtml5.css" />
<link href="font-awesome/css/font-awesome.css" rel="stylesheet" />
<link href='http://fonts.googleapis.com/css?family=Open+Sans:400,700,800' rel='stylesheet' type='text/css'>
<script type="text/javascript" src="${pageContext.request.contextPath}/js/jquery-1.7.2.js"></script>
<title>修改用户信息</title>
<script type="text/javascript">
$(function(){
	$("input[type='submit']").click(function(){
		var name=$("input[name='loginid']").val();
		var password=$("input[name='password']").val();
		if(name==null|| name==''||password==null||password==''){
			alert("请输入登陆账号和密码");
			return false;
		}
	})
})
</script>
</head>
<body>
<div id="content">
<div id="content-header">
  <div id="breadcrumb"> <a href="#" title="Go to Home" class="tip-bottom"><i class="icon-home"></i> Home</a> <a href="#" class="tip-bottom">Form elements</a> <a href="#" class="current">Common elements</a> </div>
  <h1>用户模块</h1>
</div>
<div class="container-fluid">
  <hr>
  <div class="row-fluid">
    <div class="span6">
<div class="widget-box">
        <div class="widget-title"> <span class="icon"> <i class="icon-align-justify"></i> </span>
           <h5>添加用户信息</h5>
        </div>
        <div class="widget-content nopadding">
          <form action="${pageContext.request.contextPath }/user/addUser.action" method="post" class="form-horizontal">
            <div class="control-group">
              <label class="control-label">用户ID :</label>
              <div class="controls">
                <input type="text" name="userid" value="${user.userid}" readonly="readonly" class="span11" placeholder="用户id" />
              </div>
            </div>
            <div class="control-group">
              <label class="control-label">登陆ID :</label>
              <div class="controls">
                <input type="text" name="loginid" class="span11" placeholder="登陆账号" />
              </div>
            </div>
            <div class="control-group">
              <label class="control-label">用户姓名 :</label>
              <div class="controls">
                <input type="text" name="username" class="span11" placeholder="用户姓名"  />
              </div>
            </div>
            <div class="control-group">
              <label class="control-label">密码 :</label>
              <div class="controls">
                <input type="password" name="password" class="span11" placeholder="密码" />
              </div>
            </div>
            <div class="control-group">
              <label class="control-label">用户类型 :</label>
              <div class="controls">
                <input type="text" name="usertype" class="span11" />
              </div>
            </div>
            <div class="control-group">
              <label class="control-label">用户角色 :</label>
              <div class="controls">
             <c:forEach items="${userRole}" var="list">
						<input type="checkbox" name="checked" value="${list.roleid}"/>&nbsp;&nbsp;&nbsp;
								&nbsp;&nbsp;
								${list.rolename }
								&nbsp;&nbsp;&nbsp;
								&nbsp;&nbsp;
			</c:forEach>  

              </div>
            </div>
             <div class="control-group">
              <label class="control-label">是否有效 :</label>
              <div class="controls">
                <input type="radio" name="userflag"  value="1" checked="checked" class="span11" />有效
                <input type="radio" name="userflag"  value="0" class="span11" />无效
              </div>
            </div>
            <div class="control-group">
              <label class="control-label">是否禁止 :</label>
              <div class="controls">
               <input type="radio" name="enabled" checked="checked" value="1" class="span11"/>正常
			   <input type="radio" name="enabled"  value="0" class="span11"/>禁用
              </div>
            </div>
            <div class="control-group">
              <label class="control-label">是否超级用户 :</label>
              <div class="controls">
                <input type="radio" name="issys" checked="checked" value="1" class="span11" />是
                <input type="radio" name="issys" value="0" class="span11" />非
              </div>
            </div>
            <div class="form-actions">
              <button type="submit" class="badge badge-warning">提交</button>
              <a onclick = "window.history.back(-1);" class="badge badge-success">返回</a>
            </div>
          </form>
        </div>
      </div>
     </div>
    </div>
   </div>
  </div>
</body>
</html>