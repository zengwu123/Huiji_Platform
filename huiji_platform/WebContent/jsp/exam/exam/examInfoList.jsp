<%@ page language="java" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt"%>
<script type="text/javascript"
	src="${pageContext.request.contextPath}/js/jquery-1.7.2.js"></script>
<script type="text/javascript">
$(function (){

	$("#expoleExcle").click(function(){
		
		$.post(
		"${pageContext.request.contextPath}/exam/expolExcle.action",
		{examination_info_no:$("#examination_info_no").val()},
		function(result){
			alert("导出成功");
		}
		);
	});
})

function pageQuestion(currentPage){
	$("#formS").attr("action","${pageContext.request.contextPath}/exam/answerDetials.action?page="+currentPage);
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
		<h1>答案明细列表</h1>
	</div>

	<div class="container-fluid">

		<form id="formS" class="form-search"
			action="${pageContext.request.contextPath}/exam/answerDetials.action"
			method="post">
			<input id="userid" type="text" class="input-medium" name="examination_id"
				placeholder="题目编号" value="${t_ExaminationList.examination_id}"> 
			<input id="username" type="text" class="input-medium" name="question_type" 
			placeholder="题目类型"
				value="${t_ExaminationList.question_type}">
			<input id="examination_info_no" name="examination_info_no" type="hidden" value="${t_ExaminationList.examination_info_no}">
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
						<h5>答案明细列表</h5>
						<a id="expoleExcle" class="badge badge-warning">导出详细信息</a>
						<a onclick = "window.history.back(-1);" class="badge badge-success">返回</a>
					</div>
					<div class="widget-content ">
						<table class="table table-bordered table-striped with-check">
							<thead>
								<tr>
									<th>序号</th>
									<th>考试编号</th>
									<th>题目类型</th>
									<th>题目序号</th>
									<th>选择答案</th>
									<th>正确答案</th>
									<th>创建时间</th>
								</tr>
							</thead>
							<tbody>
								<c:forEach items="${pageinfo.list }" var="list"
									varStatus="index">
									<tr>
										<td>${index.count}</td>
										<td>${list.examination_info_no}</td>
										<td>${list.question_type}</td>
										<td>${list.question_num}</td>
										<td>${list.choose_key}</td>
										<td>${list.right_key}</td>
										<td><fmt:formatDate value="${list.create_time}" pattern="yyyy-MM-dd HH:mm:dd" /></td>
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