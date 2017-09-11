<%@ page language="java" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt"%>
<script type="text/javascript"
	src="${pageContext.request.contextPath}/js/jquery-1.7.2.js"></script>
<script type="text/javascript">
$(function (){
	var exam_no;
	//弹出模态框
	$(".badge-warning").click(function(){
		$("#fontt").text("");
		exam_no =$(this).attr("name");
		$("input[name='num']").val("");
		$("input[name='exam_no']").val(exam_no);
		$('#myModel').modal({
			backdrop:"static"
		});
		$("#createNum").attr("disabled",false);
	})
	//生成考试编号实现
	$("#createNum").click(function(){
		var exam_no =$("input[name='exam_no']").val();
		var num= $("input[name='num']").val();
		var data={examination_no:exam_no,num:num};
		$.post("${pageContext.request.contextPath}/exam/createExamNo.action",
				data,
				function(data){
					$("#fontt").text("已经生成"+data+"个编号，可以考试了！！！");
					$("#createNum").attr("disabled",true);
					setTimeout(function(){$('#myModel').modal('hide');}, 2000);
				}
			)
		})
		//开始考试，选择考试编号
		$(".badge-success").click(function(){
			exam_no =$(this).attr("name");
			$.ajax({
				url:"${pageContext.request.contextPath}/exam/findExaminfoNo.action",
				data:{data:$(this).attr("name")},
				success:function(data){
					var sel=$("#myModel2 select");
					$("input[name='studentName']").val("");
					$('#myModel2').modal({
						backdrop:"static"
					});
					$.each(data,function(i,data){
						var optionEle = $("<option></option>").append(this.examination_info_no).attr("value",this.examination_info_no);
						optionEle.appendTo(sel);
						})
					}
			});
		});
	
	$("#startExam").click(function(){
		var exam_info_no=$("#selet option:selected").val();
		var studentName=$("input[name='studentName']").val();
		var testData={'exam_info_no':exam_info_no,'studentName':studentName};
		$.post(
			"${pageContext.request.contextPath}/exam/toUdpExamInfo.action",
			testData,
			function(result){
				if(result==200){
					window.location.href="${pageContext.request.contextPath}/exam/toPaperinfo.action?examination_no="+exam_no+"&exam_info_no="+exam_info_no;
				}else{
					alert("进入考试失败！请重试。。。");
				}
			}
		);
	});
	
})

function pageQuestion(currentPage){
	$("#formS").attr("action","${pageContext.request.contextPath}/paper/paperInfo.action?page="+currentPage);
	$("#formS").submit();
}

</script>
<!-- 弹出模态框 ,生成考试编号，答题卡-->
<div id="myModel" class="modal fade" tabindex="-1" role="dialog">
  <div class="modal-dialog" role="document">
    <div class="modal-content">
      <div class="modal-header">
        <button type="button" class="close" data-dismiss="modal" aria-label="Close"><span aria-hidden="true">&times;</span></button>
        <h4 class="modal-title">根据试卷编号，生成一定数量的考试编号</h4>
      </div>
      <div class="modal-body">
    	  <div class="form-group">
            <label for="recipient-name" class="control-label">试卷编号：</label>
            <input type="text" class="form-control" name="exam_no" id="recipient-name">
          </div>
          <div class="form-group">
            <label for="recipient-name" class="control-label">编号个数：</label>
            <input type="text" class="form-control" name="num" id="recipient-name">
          </div>
          <div class="form-group">
				<font id="fontt" size="4px;" color="red"></font>
          </div>
          
      </div>
      <div class="modal-footer">
        <button type="button" class="btn btn-default" data-dismiss="modal">关闭</button>
        <button type="button" id="createNum" class="btn btn-primary">生成编号</button>
      </div>
    </div><!-- /.modal-content -->
  </div><!-- /.modal-dialog -->
</div><!-- /.modal -->

<!-- 选择考试编号，进入考试-->
<div id="myModel2" class="modal fade" tabindex="-1" role="dialog">
  <div class="modal-dialog" role="document">
    <div class="modal-content">
      <div class="modal-header">
        <button type="button" class="close" data-dismiss="modal" aria-label="Close"><span aria-hidden="true">&times;</span></button>
        <h4 class="modal-title">选择试卷编号，进行考试。。。</h4>
      </div>
      <div class="modal-body">
      <form action="${pageContext.request.contextPath}/exam/toPaperinfo.action" method="post">
    	 <div class="form-group">
			<label class="col-sm-2 control-label">考试编号</label>
			<div> <!-- 变成4列 -->
				<select id="selet" class="form-control" name="exam_info_no" style="width:220px;">
				</select>
			</div>
		</div>
          <div class="form-group">
            <label for="recipient-name" class="control-label">考生姓名：</label>
            <input type="text" class="form-control" name="studentName" id="recipient-name">
          </div>
          </form>
      </div>
      <div class="modal-footer">
        <button type="button" class="btn btn-default" data-dismiss="modal">关闭</button>
        <button id="startExam" type="button" class="btn btn-primary">准备考试</button>
      </div>
    </div><!-- /.modal-content -->
  </div><!-- /.modal-dialog -->
</div><!-- /.modal -->
<div id="content">
	<div id="content-header">
		<div id="breadcrumb">
			<a href="#" title="Go to Home" class="tip-bottom"><i
				class="icon-home"></i> Home</a> <a href="#">Student pages</a> <a
				href="#" class="current">Info</a>
		</div>
		<h1>试卷列表</h1>
	</div>

	<div class="container-fluid">

		<form id="formS" class="form-search"
			action="${pageContext.request.contextPath}/paper/paperInfo.action?page=1"
			method="post">
			<input id="userid" type="text" class="input-medium" name="examination_no"
				placeholder="试卷编号" value="${paperInfoTem.examination_no}"> 
			<input id="username" type="text" class="input-medium" name="examination_name" 
			placeholder="试卷名称" value="${paperInfoTem.examination_name}">
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
						<h5>试卷列表</h5>
					</div>
					<div class="widget-content ">
						<table class="table table-bordered table-striped with-check">
							<thead>
								<tr>
									<th>序号</th>
									<th>试卷编号</th>
									<th>试卷类型</th>
									<th>试卷名称</th>
									<th>试卷描述</th>
									<th>考试时长</th>
									<th>创建用户</th>
									<th>试卷总分</th>
									<th colspan="3">操作</th>
								</tr>
							</thead>
							<tbody>
								<c:forEach items="${pageinfo.list}" var="list" varStatus="index">
									<tr>
										<td>${index.count}</td>
										<td>${list.examination_no}</td>
										<td>${list.examination_type==1?"单元测试":"综合测试"}</td>
										<td>${list.examination_name}</td>
										<td>${list.examination_content}</td>
										<td>${list.exam_length}&nbsp;&nbsp;分钟</td>
										<td>${list.create_user}</td>
										<td>${list.totalScore}&nbsp;&nbsp;分</td>
										<td>
										<a name="${list.examination_no}" class="badge badge-warning">生成考试编号</a>
										</td>
										<td><a id="beginExam" name="${list.examination_no}" class="badge badge-success">开始考试</a></td>
									</tr>
								</c:forEach>
							</tbody>
						</table>
					</div>
				</div>

				<!-- end -->

				<div align="center">
					<ul class="pager">
						<li><a href="javascript:pageQuestion(1)">首页</a></li>
						<c:choose>
							<c:when test="${pageinfo.hasPreviousPage}">
								<li><a href="javascript:pageQuestion(${pageinfo.pageNum-1})">上一页</a></li>
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
								<li><a href="javascript:pageQuestion(${items})">${items}</a></li>
							</c:if>
						</c:forEach>
						<c:choose>
							<c:when test="${pageinfo.hasNextPage}">
								<li><a href="javascript:pageQuestion(${pageinfo.pageNum+1})">下一页</a></li>
							</c:when>
							<c:otherwise>
								<li>下一页</li>
							</c:otherwise>
						</c:choose>
						<li><a href="javascript:pageQuestion(${pageinfo.pages})">尾页</a></li>
					</ul>
				</div>
			</div>
		</div>
	</div>
</div>