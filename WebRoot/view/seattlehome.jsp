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
	<meta http-equiv="description" content="Code by Gn">

	<!-- fonts-->
  <link href="https://fonts.googleapis.com/css?family=Raleway:100,600" rel="stylesheet" type="text/css">

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

  </head>
  
  <body>
  	<jsp:include page="../public/insertHTML/main_head.jsp"></jsp:include>
  	 <div class="content">
      <div class="head-content">
        <div class="title m-b-md">
		Welcome to Seattle!
        </div>

        <div class="links">
          <a href="showpage.action?pagename=travel">Travel & Viewpoints</a>
          <a href="showpage.action?pagename=foods">Foods & Restaurant</a>
          <a href="showpage.action?pagename=news">News & Recommend</a>
          <a href="showpage.action?pagename=hotels">Hotel & Stay</a>
          <a href="showpage.action?pagename=map">Map & traffic</a>
          <a href="showpage.action?pagename=feedback">Help & Feedback</a>
        </div>
      </div>

     <div class="body-content">
        
     </div>
    </div>
  </body>
</html>
