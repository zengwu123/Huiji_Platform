<%@ page language="java" contentType="text/html;charset=UTF-8" pageEncoding="UTF-8" %>
<%@ taglib uri="http://tiles.apache.org/tags-tiles" prefix="tiles" %>
<!DOCTYPE html>
<html lang="en">
    
<head>
        <title>慧极科技</title><meta charset="UTF-8" />
        <meta name="viewport" content="width=device-width, initial-scale=1.0" />
		<link rel="stylesheet" href="${pageContext.request.contextPath }/css/bootstrap.min.css" />
		<link rel="stylesheet" href="${pageContext.request.contextPath }/css/bootstrap-responsive.min.css" />
        <link rel="stylesheet" href="${pageContext.request.contextPath }/css/matrix-login.css" />
        <link href="${pageContext.request.contextPath }/font-awesome/css/font-awesome.css" rel="stylesheet" />
		<link href='http://fonts.googleapis.com/css?family=Open+Sans:400,700,800' rel='stylesheet' type='text/css'>
		<script src="${pageContext.request.contextPath }/js/jquery.min.js"></script>
    </head>
<body>
	<div id="loginbox">
		<form id="loginform" class="form-vertical" action="${pageContext.request.contextPath }/login.action" method="post">
			<div class="control-group normal_text">
				<div id="message">您正在注册用户...</div>
			</div>
			<div class="form-group has-success">
				<label class="control-label" for="inputSuccess1">Input with success</label>
				<input type="text" class="form-control" id="inputSuccess1" aria-describedby="helpBlock2">
				<span id="helpBlock2" class="help-block">A block of help </span>
			</div>
			<div class="form-group has-warning">
				<label class="control-label" for="inputWarning1">Inputwarning</label>
			    <input type="text" class="form-control" id="inputWarning1">
			</div>
			<div class="form-group has-error">
				<label class="control-label" for="inputError1">Input </label>
			    <input type="text" class="form-control" id="inputError1">
			</div>
			<span class="pull-left"><a href="#" class="flip-link btn btn-info" id="to-recover">注册账号?</a>
			</span> <span class="pull-right"><input type="submit" class="btn btn-success" id="to-login" value="登陆"></span>
	</form>
	</div>
</body>

</html>
