//jquery程序的入口
		$(function(){
			//点击btn按钮的事件
			$("#btn").click(function(){
				alert("eeeeeeeee");
				//ajax提交方式
				$.ajax({
					type:"post",
					url:"${pageContext.request.contextPath}/json/checkUserMsg.action",
					contentType : "application/json;charset=utf-8",
					data:'{"id":100 , "username" : "小明"}',
					success : function(data){
						//成功之后的回调函数 
						alert(data.username);
					}
				});
			});
		});