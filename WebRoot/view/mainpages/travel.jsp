<%@ page language="java" import="java.util.*" pageEncoding="ISO-8859-1"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <base href="<%=basePath%>">
    
    <title>travel</title>
    
	<meta http-equiv="pragma" content="no-cache">
	<meta http-equiv="cache-control" content="no-cache">
	<meta http-equiv="expires" content="0">    
	<meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
	<meta http-equiv="description" content="This is my page">
	<!--
	<link rel="stylesheet" type="text/css" href="styles.css">
	-->
	<!-- css -->
	<link ref="stylesheet" type="text/css" href="public/css/base_mainpages.css">
		<!-- bootstrap -->
	<link rel="stylesheet" href="https://cdn.bootcss.com/bootstrap/3.3.7/css/bootstrap.min.css" integrity="sha384-BVYiiSIFeK1dGmJRAkycuHAHRg32OmUcww7on3RYdg4Va+PmSTsz/K68vbdEjh4u" crossorigin="anonymous">
	<!-- js -->
	<!--jQuery -->
	<script type="text/javascript" src="public/js/jquery/jquery-3.2.1.min.js"></script>
  </head>
	
	<script>
		$(document).ready(function(){
			//alert("fucntion load before the page"); test code
			
		});
	</script>
	
  <body>
    	<h1>Travel in Seattle</h1>
    	<div id="dbd" class="" closed="true">

			</div>
  </body>
</html>
