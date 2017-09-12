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

<title>此处关联角色信息信息</title>
</head>
<body>
	<div id="content">
		<div id="content-header">
			<div id="breadcrumb">
				<a href="#" title="Go to Home" class="tip-bottom"><i
					class="icon-home"></i> Home</a> <a href="#" class="tip-bottom">Form
					elements</a> <a href="#" class="current">Common elements</a>
			</div>
			<h1>角色关联模块</h1>
		</div>
		<div class="container-fluid">
			<div class="row-fluid">
				<div class="span6">
				
						</div>
						<div class="widget-content nopadding">
						<form action="${pageContext.request.contextPath}/association/doAssUserRole.action">
						<table class="table table-hover table-bordered">
						
						<tr>
						<td>
						<input name="userid" type="hidden" value="${userid}">
						<button class="badge badge-warning" type="submit">关联角色</button>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
						<a class="badge badge-success" onclick = "window.history.back(-1);">返回</a>
						&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
						<c:forEach items="${userRole }" var="list">
						<input type="checkbox" name="checked" ${list.isrole!='1' ? "checked='checked'":"" } value="${list.roleid}"/>&nbsp;&nbsp;&nbsp;
								&nbsp;&nbsp;&nbsp;&nbsp;
								${list.rolename }
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