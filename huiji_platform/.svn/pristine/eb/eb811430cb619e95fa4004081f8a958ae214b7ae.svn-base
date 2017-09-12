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

<title>添加题库信息</title>
<script type="text/javascript" src="${pageContext.request.contextPath}/js/jquery-1.7.2.js"></script>
</head>
<body>
<div id="content">
<div id="content-header">
  <div id="breadcrumb"> <a href="#" title="Go to Home" class="tip-bottom"><i class="icon-home"></i> Home</a> <a href="#" class="tip-bottom">Form elements</a> <a href="#" class="current">Common elements</a> </div>
  <h1>Common Form Elements</h1>
</div>
<div class="container-fluid">
  <hr>
  <div class="row-fluid">
    <div class="span6">
      <div class="widget-box">
        <div class="widget-title"> <span class="icon"> <i class="icon-align-justify"></i> </span>
          <h5>Personal-info</h5>
        </div>
			<div class="widget-content nopadding">
				<form id="frm" action="${pageContext.request.contextPath}/exam/creatQue.action" enctype="multipart/form-data" method="POST" class="form-horizontal">
					<div class="control-group">
					<label class="control-label">科目名称：</label>
						<div class="controls">
						<input type="text" name="subject_name" value="${Subject}" readonly="readonly">
						</div>
					</div>

					<div class="control-group">
					<label class="control-label">上传题库：</label>
						<div class="controls">
							 <input type="file" name="uploadFile">
						</div>
					</div>

					<div class="control-group">
					<label class="control-label">题库名称：</label>
						<div class="controls">
							 <input type="text" name="questions_name">
						</div>
					</div>
					<div class="control-group">
					<label class="control-label">题库描述：</label>
						<div class="controls">
							<input type="text" name="questions_desc"></input>
						</div>
					</div>
					
					<div class="form-actions" style="margin-left: 85px;">
						<button class="btn btn-success" id="p">生成题库</button>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
						<input class="btn btn-success" type="button" value="返回"
							onclick="window.history.back(-1);">
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