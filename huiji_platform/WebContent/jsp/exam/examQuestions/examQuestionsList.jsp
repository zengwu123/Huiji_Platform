<%@ page language="java" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt"%>
<script type="text/javascript"
	src="${pageContext.request.contextPath}/js/jquery-1.7.2.js"></script>
<script type="text/javascript">
$(function (){
	$("#del").click(function (){
		if(confirm("是否确认批量删除？")){
			var text="";
			$("input[name=checkbox]").each(function(){
				 if($(this).attr("checked")){
					text+=","+$(this).val();
				}; 
			});
			alert("删除成功！")
			url="${pageContext.request.contextPath}/user/delMore.action?text="+text
			window.location.href=url;	
		}
	})
})

function pageQuestion(currentPage){
	$("#formS").attr("action","${pageContext.request.contextPath}/que/QuestionsList.action?page="+currentPage);
	$("#formS").submit();
}
</script>
<div id="content">
	<div id="content-header">
		<div id="breadcrumb">
			<a href="#" title="Go to Home" class="tip-bottom"><i
				class="icon-home"></i> Home</a> <a href="#">Student pages</a> <a
				href="#" class="current">Info</a>
		</div>
		<h1>题库列表</h1>
	</div>

	<div class="container-fluid">

		<form id="formS" class="form-search"
			action="${pageContext.request.contextPath}/que/QuestionsList.action?page=1"
			method="post">
			<input id="userid" type="text" class="input-medium" name="questions_no"
				placeholder="题库编号" value="${tExaQuestions.questions_no}"> 
			<input id="username" type="text" class="input-medium" name="questions_name" 
			placeholder="题库名称"
				value="${tExaQuestions.questions_name}">
			<button type="submit" class="btn btn-primary ">搜索</button>
		</form>
		<hr>
		<div class="row-fluid">
			<div class="span12">


				<!-- begin -->

				<div class="widget-box">
					<div class="widget-title">
						<span class="icon"> <i class="icon-th"></i>
						</span>
						<h5>题库列表</h5>
					</div>
					<div class="widget-content ">
						<table class="table table-bordered table-striped with-check">
							<thead>
								<tr>
									<th>序号</th>
									<th>题库编号</th>
									<th>科目编号</th>
									<th>题库名称</th>
									<th>题库描述</th>
									<th>创建时间</th>
									<th>修改时间</th>
									<th colspan="2">操作</th>
								</tr>
							</thead>
							<tbody>
								<c:forEach items="${pageinfo.list }" var="list"
									varStatus="index">
									<tr>
										<td>${index.count}</td>
										<td>${list.questions_no}</td>
										<td>${list.subject_no}</td>
										<td>${list.questions_name}</td>
										<td>${list.questions_desc}</td>
										<td><fmt:formatDate value="${list.create_time}"
												pattern="yyyy-MM-dd HH:mm:dd" /></td>
										<td><fmt:formatDate value="${list.update_time}"
												pattern="yyyy-MM-dd HH:mm:ss"></fmt:formatDate></td>
										<td>
 <a class="badge badge-success" href="${pageContext.request.contextPath}/paper/forCreatePaperTem.action?subject_no=${list.subject_no}">生成试卷模板</a> 
											
										</td>
									</tr>
								</c:forEach>

							</tbody>
						</table>
					</div>
				</div>

				<!-- end -->

				<div align="center">
					<ul class="pager">
						<li><a onclick="javascript:pageQuestion(1)">首页</a></li>
						<c:choose>
							<c:when test="${pageinfo.hasPreviousPage}">
								<li><a
									onclick="javascript:pageQuestion(${pageinfo.pageNum-1})">上一页</a></li>
							</c:when>
							<c:otherwise>
								<li>上一页</li>
							</c:otherwise>
						</c:choose>
						<c:forEach items="${pageinfo.navigatepageNums}" var="items">
							<c:if test="${items==pageinfo.pageNum}">
								<li class="active"><span><font color="red"><b>${items}</b></font></span></li>
							</c:if>
							<c:if test="${items!=pageinfo.pageNum}">
								<li><a onclick="javascript:pageQuestion(${items})">${items}</a></li>
							</c:if>
						</c:forEach>
						<c:choose>
							<c:when test="${pageinfo.hasNextPage}">
								<li><a
									onclick="javascript:pageQuestion(${pageinfo.pageNum+1})">下一页</a></li>
							</c:when>
							<c:otherwise>
								<li>下一页</li>
							</c:otherwise>
						</c:choose>
						<li><a onclick="javascript:pageQuestion(${pageinfo.pages})">尾页</a></li>
					</ul>
				</div>
			</div>
		</div>
	</div>
</div>