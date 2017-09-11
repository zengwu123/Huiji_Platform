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

<title>生成试卷模板</title>
</head>
<body>
<div id="content">
<div id="content-header">
  <div id="breadcrumb"> <a href="#" title="Go to Home" class="tip-bottom"><i class="icon-home"></i> Home</a> <a href="#" class="tip-bottom">Form elements</a> <a href="#" class="current">Common elements</a> </div>
  <h1>生成试卷模板</h1>
</div>
<div class="container-fluid">
  <hr>
  <div class="row-fluid">
    <div class="span6">
<div class="widget-box">
        <div class="widget-title"> <span class="icon"> <i class="icon-align-justify"></i> </span>
         <h5>生成试卷模板</h5>
        </div>
        <div class="widget-content nopadding">
          <form action="${pageContext.request.contextPath }/paper/createPaperTem.action" method="post" class="form-horizontal">
          	<input type="hidden" name="subject_no" value="${subject_no}">
            <div class="control-group">
              <label class="control-label">试卷名称 :</label>
              <div class="controls">
                <input type="text" name="examination_name"  class="span11"/>
              </div>
            </div>
            <div class="control-group">
              <label class="control-label">试卷描述 :</label>
              <div class="controls">
                <input type="text" name="examination_content" class="span11"/>
              </div>
            </div>
            <div class="control-group">
              <label class="control-label">考试时长:</label>
              <div class="controls controls-row">
                <select name="exam_length" style="width:100px;">
					<option value="45">45</option>
					<option value="60">60</option>
					<option value="90">90</option>
					<option value="120">120</option>
				</select>&nbsp;&nbsp;分钟
              </div>
            </div>
            <div class="control-group">
              <label class="control-label">单选题 :</label>
		          <div class="controls controls-row">
		              	分值：<select name="paperScore1" style="width:60px;">
							<c:forEach begin="1" end="10" var="i" varStatus="index">
								<option value="${i}">${i}</option>
							</c:forEach>
						</select>&nbsp;&nbsp;
						题数：<select name="paperNum1" style="width:60px;">
							<c:forEach begin="1" end="50" var="i" varStatus="index">
								<option value="${i}">${i}</option>
							</c:forEach>
						</select>
		          </div>
		    </div>
		    <div class="control-group">
              <label class="control-label">多选题 :</label>
		          <div class="controls controls-row">
		              	分值：<select name="paperScore2" style="width:60px;">
							<c:forEach begin="1" end="10" var="i" varStatus="index">
								<option value="${i}">${i}</option>
							</c:forEach>
						</select>&nbsp;&nbsp;
						题数：<select name="paperNum2" style="width:60px;">
							<c:forEach begin="1" end="50" var="i" varStatus="index">
								<option value="${i}">${i}</option>
							</c:forEach>
						</select>
		          </div>
		    </div>
		    <div class="control-group">
              <label class="control-label">判断题 :</label>
		          <div class="controls controls-row">
		              	分值：<select name="paperScore3" style="width:60px;">
							<c:forEach begin="1" end="10" var="i" varStatus="index">
								<option value="${i}">${i}</option>
							</c:forEach>
						</select>&nbsp;&nbsp;
						题数：<select name="paperNum3" style="width:60px;">
							<c:forEach begin="1" end="50" var="i" varStatus="index">
								<option value="${i}">${i}</option>
							</c:forEach>
						</select>
		          </div>
		    </div>
            <div class="form-actions" style="margin-left: 85px;">
              <button type="submit" class="btn btn-success">生成试卷模板</button>&nbsp;&nbsp;&nbsp;&nbsp;
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