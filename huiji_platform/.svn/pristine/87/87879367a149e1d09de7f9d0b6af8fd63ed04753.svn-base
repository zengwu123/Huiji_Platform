<%@ page language="java" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt"%>
<script type="text/javascript"
	src="${pageContext.request.contextPath}/js/jquery-1.7.2.js"></script>
<script type="text/javascript">
	function pageQuestion(currentPage){
		$("#formS").attr("action","${pageContext.request.contextPath}/que/questionsInfoList.action?page="+currentPage);
		$("#formS").submit();
	}
    $(function(){
	$("option").each(function(){
		if($("#question_type").val()==$(this).val()){
		$(this).attr("selected","selected");
		}
	});
	$(".badge-success").click(function(){
		$.ajax({
			url:"${pageContext.request.contextPath}/que/getAnswerByNo.action",
			type:"post",
			data:{question_no:$(this).attr("myAttr")},
			success:function(result){
				 $("#tables").empty("");
				 $.each(result,function(i,item){
					var tr=$("<tr></tr>")
					var td1=$("<td></td>").append(item.answer_num);
					var td2=$("<td></td>").append(item.answer_name);
					td1.appendTo(tr);
					td2.appendTo(tr);
					tr.appendTo("#tables");
				}); 
			}
		})
		$("#myModal").modal({
			backdrop:"static"
		});
	});
})
</script>

<!--查看答案模态框 -->
<div class="modal fade" id="myModal" tabindex="-1" role="dialog">
	<div class="modal-dialog" role="document">
		<div class="modal-content">
			<div class="modal-header">
				<h4 class="modal-title">题目答案</h4>
			</div>
			<div class="modal-body">
				<table id="tables" class="table table-bordered table-striped with-check">
				
				</table>
			</div>
			<div class="modal-footer">
				<button type="button" class="btn btn-default" data-dismiss="modal">返回</button>
			</div>
		</div>
	</div>
</div>

<div id="content">
	<div id="content-header">
		<div id="breadcrumb">
			<a href="#" title="Go to Home" class="tip-bottom"><i
				class="icon-home"></i> Home</a> <a href="#">Student pages</a> <a
				href="#" class="current">Info</a>
		</div>
		<h1>题目列表</h1>
	</div>

	<div class="container-fluid">

		<form id="formS" class="form-search"
			action="${pageContext.request.contextPath}/que/questionsInfoList.action?page=1"
			method="post">
			<div class="control-group">
			<input id="question_no" type="text" class="input-medium" name="question_no" placeholder="题目编号" value="${tExaQuestionDetailed.question_no}"> 
			<select name="question_type" style="width:150px;">
				<option value="1">单选题</option>
				<option value="2">多选题</option>
				<option value="3">判断题</option>
			</select>
			<input id="question_type" type="hidden" value="${tExaQuestionDetailed.question_type}">
			<button type="submit" class="btn btn-primary ">搜索</button>
			</div>
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
									<th>题目编号</th>
									<th>题目名称</th>
									<th>题目类型</th>
									<th>正确答案</th>
									<th>创建时间</th>
									<th>操作</th>
								</tr>
							</thead>
							<tbody>
								<c:forEach items="${pageinfo.list }" var="list"
									varStatus="index">
									<tr>
										<td>${index.count}</td>
										<td>${list.question_no}</td>
										<td>${list.question_name}</td>
										<td>${list.question_type}</td>
										<td>${list.right_key}</td>
										<td><fmt:formatDate value="${list.create_time}" pattern="yyyy-MM-dd HH:mm:dd" /></td>
										<td>
									    <a class="badge badge-success" myAttr="${list.question_no}">查看答案</a> 
											
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