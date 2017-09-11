<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
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
</head>
<title>修改角色信息</title>
</head>
<body>

<div id="content">
<div id="content-header">
  <div id="breadcrumb"> <a href="#" title="Go to Home" class="tip-bottom"><i class="icon-home"></i> Home</a> <a href="#" class="tip-bottom">Form elements</a> <a href="#" class="current">Common elements</a> </div>
  <h1>修改角色信息</h1>
</div>
<div class="container-fluid">
  <hr>
  <div class="row-fluid">
    <div class="span6">
<div class="widget-box">
        <div class="widget-title"> <span class="icon"> <i class="icon-align-justify"></i> </span>
          <h5>添加角色信息</h5>
        </div>
        <div class="widget-content nopadding">
          <form action="${pageContext.request.contextPath }/role/doAddRole.action" method="post" class="form-horizontal">
            <div class="control-group">
              <label class="control-label">角色Id :</label>
              <div class="controls">
                <input type="text" value="${roleid}" class="span11" name="roleid" readonly="readonly" />
              </div>
            </div>
            <div class="control-group">
              <label class="control-label">角色名称 :</label>
              <div class="controls">
                <input type="text" class="span11" name="rolename" />
              </div>
            </div>
            <div class="control-group">
              <label class="control-label">角色说明 :</label>
              <div class="controls">
                <input type="text" class="span11" name="descn"/>
              </div>
            </div>
            <div class="control-group">
              <label class="control-label">角色编码 :</label>
              <div class="controls">
                <input type="password" class="span11" name="code"/>
              </div>
            </div>
            <div class="control-group">
              <label class="control-label">标志信息 :</label>
              <div class="controls">
                <input type="text" class="span11" name="flaginfo"/>
              </div>
            </div>
            <div class="control-group">
              <label class="control-label">角色排序 :</label>
              <div class="controls">
                <input type="text" class="span11" name="sort"/>
              </div>
            </div>
            <div class="control-group">
              <label class="control-label">是否被禁用 :</label>
              <div class="controls">
                <input type="radio" checked="checked" class="span11" name="enabled" value="1"/>正常
                <input type="radio" class="span11" name="enabled" value="0"/>禁用
              </div>
            </div>
            
            <div class="form-actions">
              <button type="submit" class="badge badge-success">提交</button>
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