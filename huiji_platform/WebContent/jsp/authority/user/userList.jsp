<%@ page language="java" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt" %>
<script type="text/javascript" src="${pageContext.request.contextPath}/js/jquery-1.7.2.js"></script>
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

function befor(){
	$("#formS").attr("action","${pageContext.request.contextPath}/user/userList.action?page=${pageBean.currPage-1}");
	$("#formS").submit();
}
function first(){
	
	$("#formS").attr("action","${pageContext.request.contextPath}/user/userList.action?page=1");
	$("#formS").submit();
}
function last(){
	$("#formS").attr("action","${pageContext.request.contextPath}/user/userList.action?page=${pageBean.currPage+1}");
	$("#formS").submit();
}
function end(){
	$("#formS").attr("action","${pageContext.request.contextPath}/user/userList.action?page=${pageBean.totalPage}");
	$("#formS").submit();
}
</script>
<div id="content">
  <div id="content-header">
    <div id="breadcrumb"> <a href="#" title="Go to Home" class="tip-bottom"><i class="icon-home"></i> Home</a> <a href="#">Student pages</a> <a href="#" class="current">Info</a> </div>
    <h1>用户列表</h1>
  </div>
  
  <div class="container-fluid">
  
     <form id="formS" class="form-search" action="${pageContext.request.contextPath}/user/userList.action?page=1" method="post">
         <input id="userid" type="text" class="input-medium"  name="userid" placeholder="用户ID" value="${user.userid}">	
         <input id="username" type="text" class="input-medium"  name="username" placeholder="用户名" value="${user.username}">
         
         <button type="submit" class="btn btn-primary ">搜索</button>
     </form> 
   <hr>
    <div class="row-fluid">
      <div class="span12">   
      
        
       <!-- begin -->
       
       <div class="widget-box">
          <div class="widget-title"> <span class="icon"> <i class="icon-th"></i> </span>
            <h5>用户列表</h5>
            <a id="del" class="badge badge-important">批量删除</a> 
            <a href="${pageContext.request.contextPath}/user/forAdd.action" class="badge badge-success">添加用户</a> 
          </div>
          <div class="widget-content ">
            <table class="table table-bordered table-striped with-check">
              <thead>
                <tr>
                  <th><input type="checkbox" id="title-table-checkbox" name="title-table-checkbox" /></th>
                   <th>用户ID</th>
                  <th>用户姓名</th>
                  <th>是否有效</th>
                  <th>是否被禁用</th>
                  <th>登陆次数</th>
                  <th>是否超级用户</th>
                  <th>修改时间</th>
                  <th colspan="3">操作</th>
                </tr>
              </thead>
              <tbody>
               <c:forEach items="${pageBean.list }" var="list">
                <tr>
                  <td><input id="checkbox" type="checkbox" name="checkbox" value="${list.userid}"/></td>
                  <td>${list.userid}</td>
                  <td>${list.username}</td>
                  <td>${list.userflag==1?"有效":"无效"}</td>
                  <td>${list.enabled==1?"正常":"禁用"}</td>
                  <td>${list.logincount}</td>
                  <td>${list.issys==1?"是":"非"}</td>
                  <td>
                  <fmt:formatDate value="${list.update_time}" pattern="yyyy-MM-dd HH:mm:ss"></fmt:formatDate>
                  </td>
                  <td ><a class="badge badge-warning" href="${pageContext.request.contextPath}/user/forUdpById.action?userid=${list.userid}">修改</a></td>
                  <td><a onclick="if(confirm('确定删除?')==false)return false;" class="badge badge-important" href="${pageContext.request.contextPath}/user/delById.action?userid=${list.userid}">删除</a></td>
                  <td><a class="badge badge-success" href="${pageContext.request.contextPath}/association/associationUser.action?userid=${list.userid}">关联角色</a></td>
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
	&nbsp;&nbsp;&nbsp;第&nbsp;${pageBean.currPage}&nbsp;页 &nbsp;&nbsp;&nbsp;
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