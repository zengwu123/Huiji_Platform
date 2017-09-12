<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta charset="UTF-8"/>
<meta name="viewport" content="width=device-width, initial-scale=1.0" />
<link rel="stylesheet" href="../../css/bootstrap.min.css" />
<link rel="stylesheet" href="../../css/bootstrap-responsive.min.css" />
<link rel="stylesheet" href="../../css/colorpicker.css" />
<link rel="stylesheet" href="../../../css/datepicker.css" />
<link rel="stylesheet" href="../../css/uniform.css" />
<link rel="stylesheet" href="../../css/select2.css" />
<link rel="stylesheet" href="../../css/matrix-style.css" />
<link rel="stylesheet" href="../../css/matrix-media.css" />
<link rel="stylesheet" href="../../css/bootstrap-wysihtml5.css" />
<link href="font-awesome/css/font-awesome.css" rel="stylesheet" />
<link
	href='http://fonts.googleapis.com/css?family=Open+Sans:400,700,800'
	rel='stylesheet' type='text/css' />
<title>试题页面</title>
<style type="text/css">
.time-item strong {
	color: #FF4500;
	line-height: 40px;
	font-size: 30px;
	font-family: Arial;
	padding: 0 10px;
	margin-right: 10px;
	border-radius: 5px;
	box-shadow: 1px 1px 3px rgba(0, 0, 0, 0.2);
}
.time-css{
	position:fixed;  
    top: 35px;  
    right: 10px;  
    width: 300px;  
    height: 60px;
    z-index:9999;
}
</style>
<script type="text/javascript" src="${pageContext.request.contextPath}/js/jquery-1.7.2.js"></script>
<script type="text/javascript" src="${pageContext.request.contextPath}/js/jquery.min.js"></script>
<script type="text/javascript" src="${pageContext.request.contextPath}/js/bootstrap.css"></script>
<script type="text/javascript">
	$(function() {
			    
			//进入答案明细表
			$("#answerDetials").click(function(){
				url="${pageContext.request.contextPath}/exam/answerDetials.action?page=1&examination_info_no="+$("#exam_info_no").val();
				window.location.href=url;
			});
			var intDiff = parseInt($("#exam_length").val()) * 60;//倒计时总秒数量

			function timer(intDiff) {
				var tiem=window.setInterval(
						function() {
							var day = 0, hour = 0, minute = 0, second = 0;//时间默认值		
							if(intDiff>=0){
								day = Math.floor(intDiff / (60 * 60 * 24));
								hour = Math.floor(intDiff / (60 * 60))- (day * 24);
								minute = Math.floor(intDiff / 60)- (day * 24 * 60) - (hour * 60);
								second = Math.floor(intDiff)- (day * 24 * 60 * 60)- (hour * 60 * 60) - (minute * 60);
								if (minute <= 9)
									minute = '0' + minute;
								if (second <= 9)
									second = '0' + second;
								$('#day_show').html(day + "天");
								$('#hour_show').html('<s id="h"></s>' + hour + '时');
								$('#minute_show').html('<s></s>' + minute + '分');
								$('#second_show').html('<s></s>' + second + '秒');
								intDiff--;
								if(intDiff==5*60){
								alert('注意，还有 5 分钟!\n时间结束后，如您没有交卷，试卷将自动提交!');
								}
							}else{
								commitPaper();
								alert("时间到，考试结束!");
								/* 清除计时器计时 */
								clearInterval(tiem);
							}
						}, 1000);
			}

			$(function() {
				timer(intDiff);
			});
		})
		
		function commitPaper() {
		var radioNum=$("input[type='radio']:checked").length;
		var checkbox=$("input[type='checkbox']:checked").length;
		var sumNum=radioNum+checkbox;
			    if(sumNum==0){
					alert("请至少选择一题，否则为空卷不能提交。。。");
					return;
				}
				if(!confirm("是否确认提交试卷？")){
					return;
				}
					/* //单选题	多选题    判断题 */
					var single = new Array();
					var mulCho = new Array();
					var judge = new Array();

					$("input[id='ws']:checked").each(function() {
						single.push($(this).attr("name"), $(this).val(), "@");
					});
					var name = "";
					$("input[id='mc']:checked").each(function() {
						if (name != $(this).attr("name")) {
							mulCho.push("##" + $(this).attr("name") + "#");
							name = $(this).attr("name")
						}
						mulCho.push($(this).val());
					})
					$("input[id='mm']:checked").each(function() {
						judge.push($(this).attr("name"), $(this).val(), "@");
					})

					var data = {
								'single' : single.toString() + '',
								'mulCho' : mulCho.toString() + '',
								'judge' : judge.toString() + '',
								'exam_info_no' : $("#exam_info_no").val()
							};
					$.post(
							"${pageContext.request.contextPath}/exam/examTest.action",
							data, 
							function(data) {
								$("font").text("");
								$("#myModalLabel").text("");
								$("#myModalLabel").append("考试情况");
								$("<font></font>").append(data[0]).attr("color", "red").appendTo("#scores");
								$("<font></font>").append(data[1]).attr("color", "red").appendTo("#rightNum");
								$("<font></font>").append(data[2]).attr("color", "red").appendTo("#errorNum");
								$("#myModal").modal({
									backdrop : "static"
								});
							})
				}
			
</script>
</head>
<body>

	     
	<div class="modal fade" id="myModal" tabindex="-1" role="dialog" aria-labelledby="myModalLabel">
	  <div class="modal-dialog" role="document">
	    <div class="modal-content">
	      <div class="modal-header">
	       <h4 class="modal-title" id="myModalLabel"></h4>
	      </div>
	      <div class="modal-body">
	        	<h3 id="scores">考试得分：</h3>
	        	<h3 id="rightNum">正确个数：</h3>
	        	<h3 id="errorNum">错误个数：</h3>
	      </div>
	      <div class="modal-footer">
	        <button type="button" class="btn btn-default" data-dismiss="modal">取消</button>
	        <button id="answerDetials" type="button" class="btn btn-primary">答案明细</button>
	      </div>
	    </div>
	  </div>
	</div>

	<div id="content">
		<div id="content-header">
			<div id="breadcrumb">
				<a href="#" title="Go to Home" class="tip-bottom"><i class="icon-home"></i> Home</a>
				<a href="#" class="tip-bottom">Form elements</a> <a href="#" class="current">Common elements</a>
				
			</div>
			<div class="time-css">
			<div class="time-item" align="right">
				<strong id="hour_show">0时</strong>
				<strong id="minute_show">0分</strong>
				<strong id="second_show">0秒</strong>	
		    </div><!--倒计时模块-->
		    </div>
			<div align="center">
				<h1>${infoList.examination_name}（${infoList.examination_type==1?"单元测试":"综合测试"}）${sum}分</h1>
				<h4>
					考试时长：<font color="green" size="5px">${infoList.exam_length}</font>（分钟）
					<input id="exam_info_no" type="hidden" value="${exam_info_no}">
					<input id="exam_length" type="hidden" value="${infoList.exam_length}"/>
				</h4>
			</div>
		</div>
		<div style="padding-left: 8%; padding-right: 8%;">
			<form onsubmit="return false;">
				<c:set var="flag" value="1" scope="page" />
				<br>
				<c:forEach items="${infoList.extendTPaperInfo}" var="items"
					varStatus="ix">
					<c:if test="${items.question_type==1}">
						<c:if test="${flag eq '1'}">
							<h4>一、选择题（每题${items.question_nscore}分，共${items.question_num}题，总分${items.total_score}分）</h4>
							<c:set var="flag" value="2" scope="page" />
						</c:if>
						<h5>${ix.count}&nbsp;&nbsp;${items.question_name}</h5>
						<ul>
							<c:forEach items="${items.tPaperList}" var="i" varStatus="index">
								<li style="list-style-type: none; font-size: 15px;">&nbsp;&nbsp;
									<label><input id="ws" name="${items.examination_id}" type="radio"
										value="${i.answer_num}" />&nbsp;&nbsp;${i.answer_content} </label>
								</li>
							</c:forEach>
						</ul>
						<hr color="grey">
					</c:if>

					<br>
					<c:if test="${items.question_type==2}">
						<c:if test="${flag eq '2'}">
							<h4>二、多选题（每题${items.question_nscore}分，共${items.question_num}题，总分${items.total_score}分）</h4>
							<c:set var="flag" value="3" scope="page" />
						</c:if>
						<h5>${ix.count}&nbsp;&nbsp;${items.question_name}</h5>
						<ul>
							<c:forEach items="${items.tPaperList}" var="i" varStatus="index">
								<li style="list-style-type: none; font-size: 15px;">&nbsp;&nbsp;
									<input id="mc" name="${items.examination_id}" type="checkbox" value="${i.answer_num}" />&nbsp;&nbsp;${i.answer_content}
								</li>
							</c:forEach>
						</ul>
						<hr color="grey">
					</c:if>

					<br>
					<c:if test="${items.question_type==3}">
						<c:if test="${flag eq '3' }">
							<h4>三、判断题（每题${items.question_nscore}分，共${items.question_num}题，总分${items.total_score}分）</h4>
							<c:set var="flag" value="0" scope="page" />
						</c:if>

						<h5>${ix.count}&nbsp;&nbsp;${items.question_name}</h5>
						<ul>
							<c:forEach items="${items.tPaperList}" var="i" varStatus="index">
								<li style="list-style-type: none; font-size: 15px;">&nbsp;&nbsp;
									<label>
									<input id="mm" name="${items.examination_id}" type="radio"
										value="${i.answer_num}" />&nbsp;&nbsp;${i.answer_content}</label>
								</li>
							</c:forEach>
						</ul>
						<hr color="grey">
					</c:if>
				</c:forEach>
				<a href="javascript:commitPaper();" class="btn btn-success btn-lg btn-block">提交试卷</a>
			</form>
		</div>
	</div>
</body>
</html>