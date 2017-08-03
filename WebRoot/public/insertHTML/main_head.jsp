<%@ page language="java" import="java.util.*" pageEncoding="utf-8"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
	<head>
		<!-- jQuery -->
		<script type="text/javascript" src="public/js/jquery/jquery-3.2.1.min.js"></script>
	
		<script type="text/javascript">
			function onClickLogin(){
			//alert("this is onClickLogin function");
				$("#username").attr('placeholder','username');
				$("#password").attr('placeholder','keywords');
				
				if($("#username").val()==''){
					$("#username").attr('placeholder','please enter your usrename');
					return false;
				}
				
				if($("#password").val()==''){
				$("#password").attr('placeholder','please enter your password');
				return false;
				}
				
				$.ajax({
					type:'GET',
					url:"./adminLoginAction",
					dataType:"json",
					data:$("#adminLoginForm").serialize() + "&_=" + Math.random().toString(),
					success:function(data){
						alert("success");
 						if(data.success != 'underfined'&& data.success == "1"){
						//var actionStr='showpage.action?username='+$("#username").val()+'&password='+$("#password").val();
						var actionStr='showpage.action?pagename=adminPostPage';
 						document.location=actionStr;
 					}else{
 						alert(data.errMsg);
 					}
				},
				error:function(){
					//test code
					alert("something is wrong in ajax =.=");
					alert("data success = "+data.success);//cannot show
				},
				});
				
				return false;
			}
		</script>
	</head>

  <body>
		<div class="head_content">
      <nav class="navbar navbar-default">
        <div class="container-fluid">
          <div class="navbar-header">
            <a class="navbar-brand" href="#">Seattle</a>
          </div><!--navbar-header -->
          <div class="collapse navbar-collapse" id="bs-example-navbar-collapse-1">
            <form class="navbar-form navbar-right" id="adminLoginForm">
              <div class="form-group">
                username: <input type="text" id="username" name="username" class="form-control" placeholder="username or email">
                password: <input type="password" id="password" name="password" class="form-control" placeholder="password">
              </div>
              <input type="button" value="Login" name="commit" onclick="onClickLogin()"></input>
              <!-- <input type="button" value="Login" class="btn btn-default" onclick=""></input> -->
            </form>
           </div><!-- /.navbar-collapse -->
         </div> <!--container-fluid -->
      </nav>
    </div> <!-- head_content -->

    <!-- plan B -->
    <!--
      <div class="head_content">
      <nav class="navbar navbar-default">
        <div class="container-fluid">
          <div class="navbar-header">
            <a class="navbar-brand" href="#">Seattle</a>
          </div>
          <div class="collapse navbar-collapse" id="bs-example-navbar-collapse-1">
            <form class="navbar-form navbar-right">
              <div class="form-group">
                username / password
              </div>
              <input type="button" value="Login" onclick="onClickAjaxLogin"></input>
              
            </form>
           </div>
         </div> 
      </nav>
    </div> 
    -->
    
    <!-- had login -->
    <!-- ä½¿ç¨jqueryå®ææ¾ç¤ºåéè -->
    <div class="head_content" style="display:none">
      <nav class="navbar navbar-default">
        <div class="container-fluid">
          <div class="navbar-header">
            <a class="navbar-brand" href="#">Seattle</a>
          </div><!--navbar-header -->
          <div class="collapse navbar-collapse" id="bs-example-navbar-collapse-1">
            <p class="navbar-right" style="padding-top:15px">Welcome, Admin!</p>
           </div><!-- /.navbar-collapse -->
         </div> <!--container-fluid -->
      </nav>
    </div><!-- head_content-->
  </body>
</html>
