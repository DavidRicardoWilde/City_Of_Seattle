<%@ page language="java" import="java.util.*" pageEncoding="utf-8"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <base href="<%=basePath%>">
    
    <title>Seattle</title>
    
	<meta http-equiv="pragma" content="no-cache">
	<meta http-equiv="cache-control" content="no-cache">
	<meta http-equiv="expires" content="0">    
	<meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
	<meta http-equiv="description" content="This is my page">

	<!-- fonts-->
	<link href="https://fonts.googleapis.com/css?family=Raleway:100,600" rel="stylesheet" type="text/css">

	<!-- CSS -->
	<link rel="stylesheet" type="text/css" href="public/css/seattlehome.css">

  </head>
  
  <body>
		<div class="content">
      <div class="title m-b-md">
				welcome to Seattle
      </div>

      <div class="links">
        <a href="">Documentation</a>
        <a href="">Laracasts</a>
        <a href="">News</a>
        <a href="">Forge</a>
        <a href="">GitHub</a>
        </div>
      </div>
  </body>
</html>
