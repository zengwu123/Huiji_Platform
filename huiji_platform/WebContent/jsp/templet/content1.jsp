<%@ page language="java" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt"  prefix="fmt"%>
<div id="content">
  <div id="content-header">
    <div id="breadcrumb"> <a href="#" title="Go to Home" class="tip-bottom"><i class="icon-home"></i> Home</a> <a href="#" class="current">Tables</a> </div>
    <h1>Tables</h1>
    </div>
  <div class="container-fluid">
    <hr>
    <div class="row-fluid">
      <div class="span12">
        <div class="widget-box">
          <div class="widget-title"> <span class="icon"> <i class="icon-th"></i> </span>
            <h5>Items Info</h5>
          </div>
          <div class="widget-content nopadding">
            <table class="table table-bordered table-striped">
              <thead>
                <tr>
                  <th>编号</th>
                  <th>商品名称</th>
                  <th>商品价格</th>
                  <th>生产日期</th>
                  <th>描述</th>
                </tr>
              </thead>
              <tbody>
              <c:forEach items="${itemsList }" var="item">
                <tr class="odd gradeX">
                  <td>${item.id }</td>
                  <td>${item.name }</td>
                  <td>${item.price }</td>
                  <td class="center"> ${item.detail }</td>                  
                 <td><fmt:formatDate value="${item.createtime}" pattern="yyyy-MM-dd"/></td>
                </tr>
                </c:forEach>
               
              </tbody>
            </table>
          </div>
        </div>
     
      </div>
    </div>
  </div>
</div>