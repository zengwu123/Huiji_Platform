<%@ page language="java" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<script type="text/javascript"
	src="${pageContext.request.contextPath}/js/jquery-1.7.2.js"></script>
<script>
/* 	$(function() {
		$("#del").click(function() {
			if (confirm("是否确定删除？")) {
				var text = ""
				$("input[name=checkbox]").each(function() {
						if ($(this).attr("checked")) {
							text += ","+ $(this).val();
								}
							});
						alert("删除成功！")
						url = "${pageContext.request.contextPath}/role/delMore.action?text="+ text
						window.location.href = url;
					}
				})
			})
function befor(){
	$("#formS").attr("action","${pageContext.request.contextPath}/role/roleList.action?page=${pageBean.currPage-1}");
	$("#formS").submit();
}			
function first(){
	$("#formS").attr("action","${pageContext.request.contextPath}/role/roleList.action?page=1");
	$("#formS").submit();
}
function last(){
	$("#formS").attr("action","${pageContext.request.contextPath}/role/roleList.action?page=${pageBean.currPage+1}");
	$("#formS").submit();
}
function end(){
	$("#formS").attr("action","${pageContext.request.contextPath}/role/roleList.action?page=${pageBean.totalPage}");
	$("#formS").submit();
}	 */	
</script>
<div id="content">
  <div id="content-header">
    <div id="breadcrumb"> <a href="#" title="Go to Home" class="tip-bottom"><i class="icon-home"></i> Home</a> <a href="#">Student pages</a> <a href="#" class="current">Info</a> </div>
    <h1>资源列表</h1>
  </div>
  
  <div class="container-fluid">

	<%-- 	<form class="form-search" id="formS"
			action="${pageContext.request.contextPath }/role/roleList.action?page=1"
			method="post">
			<input type="text" class="input-medium" name="roleid"
				placeholder="角色ID"> <input
				type="text" class="input-medium" name="rolename" placeholder="角色姓名"
			>
			<button type="submit" class="btn btn-primary ">搜索</button>
		</form>
		<hr> --%>
		 <div class="row-fluid">
      <div class="span12">  

				<!-- begin -->

				<div class="widget-box"> 
					<div class="widget-title">
						<span class="icon"> <i class="icon-th"></i>
						</span>
						<h5>资源列表</h5>
					<!-- 	<a id="del" class="btn btn-warning">批量删除</a> -->
						<a href="${pageContext.request.contextPath}/resource/forAddResource.action" class="btn btn-info">添加角色</a>
					</div>
						<div class="widget-content ">
							<table class="table table-bordered table-striped with-check">
								<thead>
									<tr>
										<th><input type="checkbox" id="title-table-checkbox"
											name="title-table-checkbox" /></th>
										<th>资源ID</th>
										<th>资源名称</th>
										<th>资源类型</th>
										<th>资源链接</th>
										<th>资源描述</th>
										<th>是否被禁用</th>
										<th>创建时间</th>
										<th colspan="2">操作</th>
									</tr>
								</thead>
								<tbody>
									<c:forEach items="${list }" var="list">
										<tr>
											<td><input type="checkbox" name="checkbox" value="${list.resource_id}" /></td>
											<td>${list.resource_id}</td>
											<td>${list.resource_name}</td>
											<td>${list.resource_type}</td>
											<td>${list.resource_url}</td>
											<td>${list.resource_dec}</td>
											<td>${list.enabled==1?"正常":"禁用"}</td>
											<td>
											<a class="btn btn-info" href="${pageContext.request.contextPath }/resource/forUpdByResourceid.action?resource_id=${list.resource_id}">修改</a>
											</td>
											<td>
											<a class="btn btn-danger" onclick="if(confirm('是否确定删除？')==false)return false;" href="${pageContext.request.contextPath }/resource/delResource.action?resource_id=${list.resource_id}">删除</a>
											</td>
										</tr>
									</c:forEach>

								</tbody>
							</table>
						</div>
					</div>
					</div>
					<!-- end -->

				<%-- 	<div align="center">
						<ul class="pager">
							<c:choose>
								<c:when test="${pageBean.currPage!=1 }">
									<li><a onclick="javascript:first()">首页</a></li>
									<li><a onclick="javascript:befor()">上一页</a></li>
								</c:when>
								<c:otherwise>
									<li>首页 上一页</li>
								</c:otherwise>
							</c:choose>
							&nbsp;&nbsp;&nbsp;第&nbsp;${pageBean.currPage}&nbsp;页
							&nbsp;&nbsp;&nbsp;
							<c:choose>
								<c:when test="${pageBean.currPage!=pageBean.totalPage}">
									<li><a onclick="javascript:last()">下一页</a></li>
									<li><a onclick="javascript:end()">尾页</a></li>
								</c:when>
								<c:otherwise>
									<li>下一页 尾页</li>
								</c:otherwise>
							</c:choose>
						</ul>
					</div> --%>

				</div>
			</div>
		</div>
	</div>