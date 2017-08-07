$(function(){
   
	
	$('#to-login1').click(function(){
		alert("eeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeee");
	});
	
	$('#to-login').click(function(){	
	var username=$("input[name='username']").val();
	var password=$("input[name='password']").val();
	var user={username:username,password:password};
		/*alert(username);
		alert(password);
	alert("登录");*/
		$.ajax({
			type:"post",
			url:"/huiji_platform/loginCheckUser.action",
			//数据格式是json串，商品信息
			data:user,
			success:function(data){//返回json结果
			/*alert(data);*/
				if(data =="success"){
					$("#loginform").submit(); 
				}else{
					//把登录异常信息动态填充到DIV中
					   $("#message").html("<p id='label2'> 用户名或者密码错误，请再次输入...</p> ");
					   $("#message").css({color:"red"});
				}
				
			}
			
		});
	});
    
    
    if($.browser.msie == true && $.browser.version.slice(0,3) < 10) {
        $('input[placeholder]').each(function(){ 
       
        var input = $(this);       
       
        $(input).val(input.attr('placeholder'));
               
        $(input).focus(function(){
             if (input.val() == input.attr('placeholder')) {
                 input.val('');
             }
        });
       
        $(input).blur(function(){
            if (input.val() == '' || input.val() == input.attr('placeholder')) {
                input.val(input.attr('placeholder'));
            }
        });
    });
    }
});