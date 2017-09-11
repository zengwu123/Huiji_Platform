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
</head>
<title>修改权限信息</title>
<script type="text/javascript">
$(function(){
	var s=$("#fun").val().split(",");
	$.each(s,function(index,val){
		$(":checkbox[name='function'][value="+val+"]").prop("checked",true);
	})
	
})
</script>
</head>
<body>

<div id="content">
<div id="content-header">
  <div id="breadcrumb"> <a href="#" title="Go to Home" class="tip-bottom"><i class="icon-home"></i> Home</a> <a href="#" class="tip-bottom">Form elements</a> <a href="#" class="current">Common elements</a> </div>
  <h1>修改权限信息</h1>
</div>
<div class="container-fluid">
  <hr>
  <div class="row-fluid">
    <div class="span6">
<div class="widget-box">
        <div class="widget-title"> <span class="icon"> <i class="icon-align-justify"></i> </span>
          <h5>修改权限信息</h5>
        </div>
        <div class="widget-content nopadding">
          <form action="${pageContext.request.contextPath }/auth/updateAuthority.action" method="post" class="form-horizontal">
            <div class="control-group">
              <label class="control-label">权限Id :</label>
              <div class="controls">
                <input type="text" class="span11" name="authorityid" value="${pumAuthority.authorityid}" readonly="readonly" />
              </div>
            </div>
            <div class="control-group">
              <label class="control-label">权限名称 :</label>
              <div class="controls">
                <input type="text" class="span11" name="authorityname" value="${pumAuthority.authorityname}" />
              </div>
            </div>
            <div class="control-group">
              <label class="control-label">权限说明 :</label>
              <div class="controls">
                <input type="text" class="span11" name="descn"  value="${pumAuthority.descn}"/>
              </div>
            </div>
            <div class="control-group">
              <label class="control-label">权限编码 :</label>
              <div class="controls">
                <input type="text" class="span11" name="code"  value="${pumAuthority.code}"/>
              </div>
            </div>
            
            <div class="control-group">
              <label class="control-label">权限操作 :</label>
              <div class="controls">
                <input type="hidden" value="${pumAuthority.function}" id="fun">
                <input type="checkbox" class="span11" name="function"  value="1"/>增加
                <input type="checkbox" class="span11" name="function"  value="2"/>删除
                <input type="checkbox" class="span11" name="function"  value="3"/>修改
                <input type="checkbox" class="span11" name="function"  value="4"/>查看
                <input type="checkbox" class="span11" name="function"  value="5"/>授权
              </div>
            </div>
            <div class="control-group">
              <label class="control-label">是否被禁用 :</label>
              <div class="controls">
                <input type="radio" ${pumAuthority.enabled==1?"checked='checked'":""} class="span11" name="enabled" value="1"/>正常
                <input type="radio" ${pumAuthority.enabled==0?"checked='checked'":""} class="span11" name="enabled" value="0"/>禁用
              </div>
            </div>
            <div class="control-group">
              <label class="control-label">是否超级管理员 :</label>
              <div class="controls">
                <input type="radio" ${pumAuthority.issys==1?"checked='checked'":""} class="span11" name="issys" value="1"/>是
                <input type="radio" ${pumAuthority.issys==0?"checked='checked'":""} class="span11" name="issys" value="0"/>非
              </div>
            </div>
            <div class="control-group">
              <label class="control-label">标志信息 :</label>
              <div class="controls">
                <input type="text" class="span11" name="flaginfo" value="${pumAuthority.flaginfo}"/>
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