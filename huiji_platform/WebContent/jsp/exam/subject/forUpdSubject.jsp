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

<title>修改科目信息</title>
</head>
<body>
<div id="content">
<div id="content-header">
  <div id="breadcrumb"> <a href="#" title="Go to Home" class="tip-bottom"><i class="icon-home"></i> Home</a> <a href="#" class="tip-bottom">Form elements</a> <a href="#" class="current">Common elements</a> </div>
  <h1>科目信息</h1>
</div>
<div class="container-fluid">
  <hr>
  <div class="row-fluid">
    <div class="span6">
<div class="widget-box">
        <div class="widget-title"> <span class="icon"> <i class="icon-align-justify"></i> </span>
         <h5>修改科目信息</h5>
        </div>
        <div class="widget-content nopadding">
          <form action="${pageContext.request.contextPath }/exam/updateSub.action" method="post" class="form-horizontal">
            <div class="control-group">
              <label class="control-label">科目编号 :</label>
              <div class="controls">
                <input type="text" name="subject_no" value="${subjectInfo.subject_no}" readonly="readonly" class="span11"/>
              </div>
            </div>
            <div class="control-group">
              <label class="control-label">科目代码 :</label>
              <div class="controls">
                <input type="text" readonly="readonly" name="subject_code" value="${subjectInfo.subject_code}" class="span11" placeholder="登陆账号" />
              </div>
            </div>
            <div class="control-group">
              <label class="control-label">科目名称 :</label>
              <div class="controls">
                <input type="text" name="subject_name"  value="${subjectInfo.subject_name}" class="span11" placeholder="用户姓名"  />
              </div>
            </div>
            <div class="control-group">
              <label class="control-label">科目内容 :</label>
              <div class="controls">
                <input type="text" name="class_content"  value="${subjectInfo.class_content}" class="span11" placeholder="密码" />
              </div>
            </div>
            <div class="control-group">
              <label class="control-label">科目目标 :</label>
              <div class="controls">
                <input type="text" name="calss_target" value="${subjectInfo.calss_target}" class="span11" />
              </div>
            </div>
            <div class="control-group">
              <label class="control-label">课时总数 :</label>
              <div class="controls">
                <input type="text" name="class_hour" value="${subjectInfo.class_hour}" class="span11" />
              </div>
            </div>
            <div class="control-group">
              <label class="control-label">上级科目 :</label>
              <div class="controls">
                <input type="text" readonly="readonly" name="father_subject" value="${subjectInfo.father_subject}" class="span11" />
              </div>
            </div>
            
            <div class="form-actions">
              <button type="submit" class="btn btn-success">提交</button>
               <input type="button" value="返回" onclick = "window.history.back(-1);" class="btn btn-success">
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