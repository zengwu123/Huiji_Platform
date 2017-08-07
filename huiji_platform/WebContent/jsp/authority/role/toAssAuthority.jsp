<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt"%>
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
<link
	href='http://fonts.googleapis.com/css?family=Open+Sans:400,700,800'
	rel='stylesheet' type='text/css'>

<title>此处关联权限信息</title>
</head>
<body>
	<div id="content">
		<div id="content-header">
			<div id="breadcrumb">
				<a href="#" title="Go to Home" class="tip-bottom"><i
					class="icon-home"></i> Home</a> <a href="#" class="tip-bottom">Form
					elements</a> <a href="#" class="current">Common elements</a>
			</div>
			<h1>权限关联模块</h1>
		</div>
		<div class="container-fluid">
			<div class="row-fluid">
				<div class="span6">
				
						</div>
						<div class="widget-content nopadding">
						<form action="${pageContext.request.contextPath}/roleAuth/doAssRoleAuth.action">
						<table class="table table-hover table-bordered">
						
						<tr>
						<td>
						<input name="roleid" type="hidden" value="${roleid}">
						<input class="btn btn-success" type="submit" value="关联角色">&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
						<input class="btn btn-success"  type="button" value="返回" onclick = "window.history.back(-1);">
						&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
						<c:forEach items="${authority }" var="list">
						<input type="checkbox" name="checked" ${list.isrole!='1' ? "checked='checked'":"" } value="${list.authorityid}"/>&nbsp;&nbsp;&nbsp;
								&nbsp;&nbsp;&nbsp;&nbsp;
								${list.authorityname }
								&nbsp;&nbsp;&nbsp;
								&nbsp;&nbsp;&nbsp;
								&nbsp;&nbsp;&nbsp;
						</c:forEach>
						</td>
						</tr>
						</table>
						</form>
						</div>
					</div>
				</div>
			</div>

</body>
</html>