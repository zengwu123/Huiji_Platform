<%@ page language="java" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt"%>
<script type="text/javascript" src="${pageContext.request.contextPath}/js/jquery-1.7.2.js"></script>
<script type="text/javascript">
$(function(){
	$("#expoleExcle").click(function(){
		$.post(
		"${pageContext.request.contextPath}/exam/loadScoresToExcle.action",
		function(result){
			if(result==1){
				alert("导出成绩成功！请到D盘查看。。。")
			}else{
				alert("您还没有进行考试，请先考试在下载考试成绩。。。");
			}
		}
		);
	});
})
function pageQuestion(currentPage){
	$("#formS").attr("action","${pageContext.request.contextPath}/exam/paperInfoScoreList.action?page="+currentPage);
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
		<h1>考试成绩列表</h1>
	</div>
	<div class="container-fluid">
		<form id="formS" class="form-search" action="${pageContext.request.contextPath}/exam/paperInfoScoreList.action"
			method="post">
			<input type="text" class="input-medium" name="examination_info_no"
				placeholder="考试编号" value="${t_ExaminationInfo.examination_info_no}"> 
			<input type="text" class="input-medium" name="examination_user" placeholder="考试人员"
				value="${t_ExaminationInfo.examination_user}">
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
						<h5>考试成绩列表</h5>
						<a id="expoleExcle" class="badge badge-success">导出成绩信息</a>
					</div>
					<div class="widget-content ">
						<table class="table table-bordered table-striped with-check">
							<thead>
								<tr>
									<th>序号</th>
									<th>考试编号</th>
									<th>考试人员</th>
									<th>正确数量</th>
									<th>错误数量</th>
									<th>考试分数</th>
									<th>考试时长</th>
									<th>开始时间</th>
									<th>结束时间</th>
									<th>操作</th>
								</tr>
							</thead>
							<tbody>
								<c:forEach items="${pageinfo.list }" var="list" varStatus="index">
									<tr>
										<td>${index.count}</td>
										<td>${list.examination_info_no}</td>
										<td>${list.examination_user}</td>
										<td>${list.right_num}</td>
										<td>${list.error_num}</td>
										<td>${list.score}</td>
										<td>${list.examination_length}</td>
										<td><fmt:formatDate value="${list.start_time}" pattern="yyyy-MM-dd HH:mm:dd" /></td>
										<td><fmt:formatDate value="${list.end_time}" pattern="yyyy-MM-dd HH:mm:dd" /></td>
										<td><a class="badge badge-success" href="${pageContext.request.contextPath}/exam/answerDetials.action?page=1&examination_info_no=${list.examination_info_no}">答案明细</a></td>
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