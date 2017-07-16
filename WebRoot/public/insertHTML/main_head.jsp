<%@ page language="java" import="java.util.*" pageEncoding="ISO-8859-1"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <body>
		<div class="head_content">
      <nav class="navbar navbar-default">
        <div class="container-fluid">
          <div class="navbar-header">
            <a class="navbar-brand" href="#">Seattle</a>
          </div><!--navbar-header -->
          <div class="collapse navbar-collapse" id="bs-example-navbar-collapse-1">
            <form class="navbar-form navbar-right">
              <div class="form-group">
                username: <input type="text" id="username" name="username" class="form-control" placeholder="username or email">
                password: <input type="password" id="keywords" name="keywords" class="form-control" placeholder="password">
              </div>
              <input type="button" value="Login" onclick="onClickAjaxLogin"></input>
              <!-- <input type="button" value="Login" class="btn btn-default" onclick=""></input> -->
            </form>
           </div><!-- /.navbar-collapse -->
         </div> <!--container-fluid -->
      </nav>
    </div> <!-- head_content -->
    
    <!-- had login -->
    <!-- 使用jquery完成显示和隐藏 -->
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
