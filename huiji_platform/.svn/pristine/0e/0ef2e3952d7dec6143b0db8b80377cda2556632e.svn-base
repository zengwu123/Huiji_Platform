<%@ page language="java" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt"%>
<script type="text/javascript"
	src="${pageContext.request.contextPath}/js/jquery-1.7.2.js"></script>
<script>
	$(function() {
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
}		
</script>
<div id="content">
  <div id="content-header">
    <div id="breadcrumb"> <a href="#" title="Go to Home" class="tip-bottom"><i class="icon-home"></i> Home</a> <a href="#">Student pages</a> <a href="#" class="current">Info</a> </div>
    <h1>角色列表</h1>
  </div>
  
  <div class="container-fluid">

		<form class="form-search" id="formS"
			action="${pageContext.request.contextPath }/role/roleList.action?page=1"
			method="post">
			<input type="text" class="input-medium" name="roleid"
				placeholder="角色ID" value="${role.roleid}"> <input
				type="text" class="input-medium" name="rolename" placeholder="角色姓名"
				value="${role.rolename}">
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
						<h5>角色列表</h5>
						<a id="del" class="btn btn-warning">批量删除</a>
						<a href="${pageContext.request.contextPath}/role/forAddRole.action" class="btn btn-info">添加角色</a>
					</div>
						<div class="widget-content ">
							<table class="table table-bordered table-striped with-check">
								<thead>
									<tr>
										<th><input type="checkbox" id="title-table-checkbox"
											name="title-table-checkbox" /></th>
										<th>角色ID</th>
										<th>角色名称</th>
										<th>角色说明</th>
										<th>角色编码</th>
										<th>标志信息</th>
										<th>是否被禁用</th>
										<th>修改时间</th>
										<th colspan="3">操作</th>
									</tr>
								</thead>
								<tbody>
									<c:forEach items="${pageBean.list }" var="list">
										<tr>
											<td><input type="checkbox" name="checkbox"
												value="${list.roleid}" /></td>
											<td>${list.roleid}</td>
											<td>${list.rolename}</td>
											<td>${list.descn}</td>
											<td>${list.code}</td>
											<td>${list.flaginfo}</td>
											<td>${list.enabled==1?"正常":"禁用"}</td>
											<td>
											<fmt:formatDate value="${list.update_time}" pattern="yyyy-MM-dd HH:mm:ss"/>
											</td>
											<td><a class="btn btn-info"
												href="${pageContext.request.contextPath }/role/updbyid.action?roleid=${list.roleid}">修改</a></td>
											<td><a class="btn btn-danger" onclick="if(confirm('是否确定删除？')==false)return false;"
												href="${pageContext.request.contextPath }/role/deletebyid.action?roleid=${list.roleid}">删除</a></td>
											<td><a class="btn btn-success"
												href="${pageContext.request.contextPath }/roleAuth/toAuthbyid.action?roleid=${list.roleid}">关联权限</a></td>
										</tr>
									</c:forEach>

								</tbody>
							</table>
						</div>
					</div>
					</div>
					<!-- end -->

					<div align="center">
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
					</div>

				</div>
			</div>
		</div>
	</div>