<%@ page language="java" import="java.util.*" pageEncoding="ISO-8859-1"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <base href="<%=basePath%>">
    
    <title>My JSP 'bring2uhomepage.jsp' starting page</title>
    
	<meta http-equiv="pragma" content="no-cache">
	<meta http-equiv="cache-control" content="no-cache">
	<meta http-equiv="expires" content="0">    
	<meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
	<meta http-equiv="description" content="This is my page">
	<!--
	<link rel="stylesheet" type="text/css" href="styles.css">
	-->
	<!-- CSS -->
    <!-- CSS External File (including CDN) -->
		<link rel="stylesheet" href="https://cdn.bootcss.com/bootstrap/3.3.7/css/bootstrap.min.css" integrity="sha384-BVYiiSIFeK1dGmJRAkycuHAHRg32OmUcww7on3RYdg4Va+PmSTsz/K68vbdEjh4u" crossorigin="anonymous">
  	<!-- css for main_head.jsp -->
  <link rel="stylesheet" type="text/css" href="public/css/main_head.css" />
  	<!-- myself css -->
  <link rel="stylesheet" type="text/css" href="public/css/seattlehome.css" />
  
  <!-- js -->
    <!-- js External File (including CDN) -->
  <script src="https://cdn.bootcss.com/bootstrap/3.3.7/js/bootstrap.min.js" integrity="sha384-Tc5IQib027qvyjSMfHjOMaLkfuWVxZxUPnCJA7l2mCWNIpG9mGCD8wGNIcPD7Txa" crossorigin="anonymous"></script>
	
	<!-- jquery -->
	<script type="text/javascript" src="public/js/jquery/jquery-3.2.1.min.js"></script>
	<!-- font -->
	<link href="https://fonts.googleapis.com/css?family=Raleway:100,600" rel="stylesheet" type="text/css">

  </head>
  
  <body>
      <jsp:include page="../../public/bring2u/insertHTML/login_head.jsp"></jsp:include>
    <div class="content">
      <div class="head-content">
        <div class="title m-b-md">
				  Welcome to Bring To You!
        </div>

     	<div class="body-content">
        
     </div>
    </div>
    </div>
  </body>
</html>
