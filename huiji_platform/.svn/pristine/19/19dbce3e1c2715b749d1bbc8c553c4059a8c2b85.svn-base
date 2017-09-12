<%@ page language="java" contentType="text/html;charset=UTF-8" pageEncoding="UTF-8" %>
<%@ taglib uri="http://tiles.apache.org/tags-tiles" prefix="tiles" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<head>
        <title>慧极科技</title><meta charset="UTF-8" />
        <meta name="viewport" content="width=device-width, initial-scale=1.0" />
		<link rel="stylesheet" href="${pageContext.request.contextPath }/css/bootstrap.min.css" />
		<link rel="stylesheet" href="${pageContext.request.contextPath }/css/bootstrap-responsive.min.css" />
        <link rel="stylesheet" href="${pageContext.request.contextPath }/css/matrix-login.css" />
        <link href="${pageContext.request.contextPath }/font-awesome/css/font-awesome.css" rel="stylesheet" />
		<link href='http://fonts.googleapis.com/css?family=Open+Sans:400,700,800' rel='stylesheet' type='text/css'>
		<script src="${pageContext.request.contextPath }/js/jquery.min.js"></script>
		<script type="text/javascript" src="${pageContext.request.contextPath }/js/jquery-1.7.2.js"></script>
    </head>
<script type="text/javascript">
	$(function(){
		//判断输入的登陆id是否存在
		$("#logidid_check").change(function(){
			$.ajax({
				url:"${pageContext.request.contextPath }/checkLongId.action",
				data:{loginid:$("#logidid_check").val()},
				success:function(result){
					if(result=='success'){
						show_validate_msg("#logidid_check","error","登陆id已经存在！");
						$("#regist_btn").attr("ajax_va","error");
					}
					else{
						show_validate_msg("#logidid_check","success","id可以使用");
						$("#regist_btn").attr("ajax_va","success");
					}
				}
			});
		});
		
	 	//点击注册按钮，进行注册
		$("#regist_btn").click(function(){
			//对表单进行验证
			if(!validate_regist_form()){
				return false;
			} 
			//判断登陆id 是否存在
			if($(this).attr("ajax_va")=="error"){
				return false;
			}
			//发送ajax 请求，注册用户
			$.ajax({
				url:"${pageContext.request.contextPath }/registration.action",
				type:"post",
				data:$("#registForm").serialize(),
				success:function(result){
					var length=0;
					for(j2 in result){
						length++;
					}
					if(length>0){
						if(undefined!=result.loginid){
							show_validate_msg("#logidid_check","error",result.loginid);
						}else{
							show_validate_msg("#logidid_check","success","");
						}
						if(undefined!=result.username){
							show_validate_msg("#username","error",result.username);
						}else{
							show_validate_msg("#username","success","");
						}
						if(undefined!=result.password){
							show_validate_msg("#password","error",result.password);
						}else{
							show_validate_msg("#password","success","");
						}
					}else{
						$("font").text("");
					    alert("注册成功！请登陆。。。");
					    window.location.href="${pageContext.request.contextPath}/jsp/login.jsp";
					}
				}
			}); 
		});
		
		//对表单内容进行校验
		function validate_regist_form(){
			
			//校验登陆id
			var loginid=$("#loginid").val();
			//只能有数字和字母，6-10位
			var regxlogid=/^[a-zA-Z0-9]{6,10}$/;
			if(!regxlogid.test(loginid)){
				show_validate_msg("#loginid","error","只能有数字和字母，6-10位");
				return false;
			}else{
				show_validate_msg("#loginid","success","输入正确");
			}
			
			//校验用户名
			var username=$("#username").val();
			var regxName=/(^[a-zA-Z0-9_-]{6,16}$)|(^[\u2E80-\u9FFF]{2,5})/;
			if(!regxName.test(username)){
				show_validate_msg("#username","error","用户名可以是2-5位中文或者6-16位英文和数字的组合");
				return false;
			}else{
				show_validate_msg("#username","success","输入正确");
			}
			
			//校验密码
			var password =$("#password").val();
			//检测密码由6-21字母和数字组成，不能是纯数字或纯英文
			var regxPass=/^(?![0-9]+$)(?![a-zA-Z]+$)[0-9A-Za-z]{6,21}$/;
			if(!regxPass.test(password)){
				show_validate_msg("#password","error","检测密码由6-21字母和数字组成，不能是纯数字或纯英文");
				return false;
			}else{
				show_validate_msg("#password","success","输入正确");
			}
			
			//校验用户类型  用户类型只能是数字组成
			 var usertype=$("#usertype").val();
			var regxUsertype=/^[1-3]/;
			if(!regxUsertype.test(usertype)){
				show_validate_msg("#usertype","error","用户类型只能是1,2,3");
				return false;
			}else{
				show_validate_msg("#usertype","success","输入正确");
			} 
			return true;
		};
		//验证信息显示位置
		function show_validate_msg(ele,status,msg){
			$(ele).next("font").text("");
			if("success"==status){
			$(ele).next("font").text(msg).attr("color","green");
			}else if("error"==status){
			$(ele).next("font").text(msg).attr("color","red");
			}
		} 
	});
 
</script>
<body>
<div style="width:500px;margin-left: 450px;margin-top:-80px;background-color: white;
			padding-left: 100px;padding-bottom: 40px;">
		<h3>您正在注册用户...</h3>
		<form id="registForm" onsubmit="return false;">
			<input type="hidden" name="userid" value="${user.userid}">
			<div class="control-group">
              <label class="control-label">登陆ID :</label>
              <div class="controls">
                <input id="logidid_check" style="height: 30px;" type="text" name="loginid" class="span3" placeholder="登陆账号" />
                <font></font>
              </div>
            </div>
            <div class="control-group">
              <label class="control-label">用户姓名 :</label>
              <div class="controls">
                <input id="username" style="height: 30px;" type="text" name="username" class="span3" placeholder="用户姓名"  />
                <font></font>
              </div>
            </div>
            <div class="control-group">
              <label class="control-label">密码 :</label>
              <div class="controls">
                <input id="password" style="height: 30px;" type="password" name="password" class="span3" placeholder="密码" />
                <font></font>
              </div>
            </div>
            <div class="control-group">
              <label class="control-label">用户类型 :</label>
              <div class="controls">
                <input id="usertype" style="height: 30px;" type="text" name="usertype" class="span3"placeholder="请填写数字" />
                <font></font>
              </div>
            </div>
            
             <div class="control-group">
              <div class="controls">
               	是否有效 :<input type="radio" name="userflag"  value="1" checked="checked" class="span1" />有效
                <input type="radio" name="userflag"  value="0" class="span1" />无效
              </div>
            </div>
            <div class="control-group">
              <div class="controls">
               	是否禁止 :<input type="radio" name="enabled" checked="checked" value="1" class="span1"/>正常
			   <input type="radio" name="enabled"  value="0" class="span1"/>禁用
              </div>
            </div>
            <div class="control-group">
              <div class="controls">
                是否超级用户 :<input type="radio" name="issys" checked="checked" value="1" class="span1" />是
                <input type="radio" name="issys" value="0" class="span1" />非
              </div>
            </div>
			<span class="pull-left">
			<a href="${pageContext.request.contextPath}/jsp/login.jsp" class="badge badge-success">登陆</a></span> 
			<span class="pull-left">&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
			<a id="regist_btn" class="badge badge-warning">注册</a></span>
	</form>
	</div>
</body>

</html>
