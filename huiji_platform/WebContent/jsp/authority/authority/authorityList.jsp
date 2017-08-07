<%@ page language="java" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt" %>
<script type="text/javascript"
	src="${pageContext.request.contextPath}/js/jquery-1.7.2.js"></script>
<script>
	$(function(){
		$("#del").click(function(){
		if (confirm("是否确定删除？")) {
			var list=new Array();
			$("input[name=checkbox]").each(function() {
					if ($(this).attr("checked")) {
						list.push($(this).val());
							}
						});
					alert(list)
			url="${pageContext.request.contextPath}/auth/delMore.action?text="+ list;
			window.location.href=url;
			}
		})
		
	})
	
function befor(){
	$("#formS").attr("action","${pageContext.request.contextPath}/auth/authority.action?page=${pageBean.currPage-1}");
	$("#formS").submit();
}			
function first(){
	$("#formS").attr("action","${pageContext.request.contextPath}/auth/authority.action?page=1");
	$("#formS").submit();
}
function last(){
	$("#formS").attr("action","${pageContext.request.contextPath}/auth/authority.action?page=${pageBean.currPage+1}");
	$("#formS").submit();
}
function end(){
	$("#formS").attr("action","${pageContext.request.contextPath}/auth/authority.action?page=${pageBean.totalPage}");
	$("#formS").submit();
}		
</script>
<div id="content">
  <div id="content-header">
    <div id="breadcrumb"> <a href="#" title="Go to Home" class="tip-bottom"><i class="icon-home"></i> Home</a> <a href="#">Student pages</a> <a href="#" class="current">Info</a> </div>
    <h1>权限信息列表</h1>
  </div>
  
  <div class="container-fluid">
  
     <form id="formS" class="form-search" action="${pageContext.request.contextPath }/auth/authority.action?page=1" method="post">
         <input type="text" class="input-medium"  name="authorityid" placeholder="权限id" value="${auth.authorityid}">	
         <input type="text" class="input-medium"  name="authorityname" placeholder="权限名称" value="${auth.authorityname}">
         <button type="submit" class="btn btn-primary ">搜索</button>
     </form> 
   <hr>
    <div class="row-fluid">
      <div class="span12">   
        
       <!-- begin -->
       
       <div class="widget-box">
          <div class="widget-title"> <span class="icon"> <i class="icon-th"></i> </span>
            <h5>权限列表</h5>
            <a id="del" class="btn btn-warning">批量删除</a>
            <a href="${pageContext.request.contextPath}/auth/toaddAuthority.action" class="btn btn-info">添加权限</a>
          </div>
          <div class="widget-content ">
            <table class="table table-bordered table-striped with-check">
              <thead>
                <tr>
                  <th><input type="checkbox" id="title-table-checkbox" name="title-table-checkbox" /></th>
                  <th>权限ID</th>
                  <th>权限名称</th>
                  <th>权限说明</th>
                  <th>权限功能</th>
                  <th>权限编码</th>
                  <th>功能名称</th>
                  <th>是否禁用</th>
                  <th>是否超级权限</th>
                  <th>修改时间</th>
                  <th colspan="3">操作</th>
                </tr>
              </thead>
              <tbody>
               <c:forEach items="${pageBean.list}" var="l">
                <tr>
                  <td><input type="checkbox" name="checkbox" value="${l.authorityid}"/></td>
                   <td>${l.authorityid}</td>
                  <td>${l.authorityname}</td>
                  <td>${l.descn}</td>
                  <td>${l.function}</td>
                  <td>${l.code}</td>
                  <td>${l.functionname}</td>
                  <td>${l.enabled==1?"正常":"禁用"}</td>
                  <td>${l.issys==1?"是":"非"}</td>
                  <td>
                  <fmt:formatDate value="${l.create_time}" pattern="yyyy-MM-dd HH:mm:ss"/>
                  </td>
                  <td><a class="btn btn-info" href="${pageContext.request.contextPath }/auth/toUpdAuthority.action?authorityid=${l.authorityid}">修改</a></td>
                  <td><a onclick="if(confirm('是否确认删除？')==false)return false;" class="btn btn-danger" href="${pageContext.request.contextPath }/auth/delAuthority.action?authorityid=${l.authorityid}">删除</a></td>
                  <td><a class="btn btn-success" href="${pageContext.request.contextPath }/resource/toShowResource.action?authorityid=${l.authorityid}">关联资源</a></td>
                </tr>
                </c:forEach>
              </tbody>
            </table>
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
							<span>&nbsp;&nbsp;&nbsp;第&nbsp;${pageBean.currPage}&nbsp;页
							&nbsp;&nbsp;&nbsp;</span>
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