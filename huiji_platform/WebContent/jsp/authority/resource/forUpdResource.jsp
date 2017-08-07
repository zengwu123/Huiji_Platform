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
<title>修改资源信息</title>
</head>
<body>

<div id="content">
<div id="content-header">
  <div id="breadcrumb"> <a href="#" title="Go to Home" class="tip-bottom"><i class="icon-home"></i> Home</a> <a href="#" class="tip-bottom">Form elements</a> <a href="#" class="current">Common elements</a> </div>
  <h1>修改资源信息</h1>
</div>
<div class="container-fluid">
  <hr>
  <div class="row-fluid">
    <div class="span6">
<div class="widget-box">
        <div class="widget-title"> <span class="icon"> <i class="icon-align-justify"></i> </span>
          <h5>修改资源信息</h5>
        </div>
        <div class="widget-content nopadding">
          <form action="${pageContext.request.contextPath }/resource/updResource.action" method="post" class="form-horizontal">
            <div class="control-group">
              <label class="control-label">资源Id :</label>
              <div class="controls">
                <input type="text" class="span11" name="resource_id" value="${pumResource.resource_id}" readonly="readonly" />
              </div>
            </div>
            <div class="control-group">
              <label class="control-label">资源名称 :</label>
              <div class="controls">
                <input type="text" class="span11" name="resource_name" value="${pumResource.resource_name}" />
              </div>
            </div>
            <div class="control-group">
              <label class="control-label">资源类型 :</label>
              <div class="controls">
                <input type="text" class="span11" name="resource_type"  value="${pumResource.resource_type}"/>
              </div>
            </div>
            <div class="control-group">
              <label class="control-label">资源链接 :</label>
              <div class="controls">
                <input type="text" class="span11" name="resource_url"  value="${pumResource.resource_url}"/>
              </div>
            </div>
            
            <div class="control-group">
              <label class="control-label">资源描述 :</label>
              <div class="controls">
                <input type="text" class="span11" name="resource_dec"  value="${pumResource.resource_dec}"/>
              </div>
            </div>
            <div class="control-group">
              <label class="control-label">是否被禁用 :</label>
              <div class="controls">
                <input type="radio" class="span11" ${pumResource.enabled==1?"checked='checked'":""} name="enabled" value="1"/>正常
                <input type="radio" class="span11" ${pumResource.enabled==0?"checked='checked'":""} name="enabled" value="0"/>禁止
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