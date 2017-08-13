<%@ page language="java" import="java.util.*" pageEncoding="utf-8"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <base href="<%=basePath%>">
    
    <title>POST</title>
    
	<meta http-equiv="pragma" content="no-cache">
	<meta http-equiv="cache-control" content="no-cache">
	<meta http-equiv="expires" content="0">    
	<meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
	<meta http-equiv="description" content="Code by Gn">
	
		<!-- CSS -->
	    <!-- CSS External File (including CDN) -->
	  <link rel="stylesheet" href="https://cdn.bootcss.com/bootstrap/3.3.7/css/bootstrap.min.css" integrity="sha384-BVYiiSIFeK1dGmJRAkycuHAHRg32OmUcww7on3RYdg4Va+PmSTsz/K68vbdEjh4u" crossorigin="anonymous">
	  	<!-- myself css -->
	  <link rel="stylesheet" type="text/css" href="public/css/postpage.css" />
	  	
  </head>
  
  <body>
	<div class="content">
		<div class="post">
			admin id is <%= (Integer)request.getSession().getAttribute("adminId") %>
			<form action="adminPost" class="postform" method="post" enctype="multipart/form-data">
			<!-- <form action="adminPost" class="postform" method="post"> -->
				<div class="title">
					title:
					<input id="title" name="title" type="text" placeholder="content">
				</div>
				<div class="textcontent">
					content:
					<textarea id="content" name="content" placeholder="content"></textarea>
				</div>
				<div class="image">
					<input type="file" id="image" name="image"/>
					<!-- <input type="file" id="image" name="image" hidden="true" /> -->
				</div>
				<div>
					<select id="unitname" name="unitname">
						<option value="TV">travel&viewpoints</option>
						<option value="FR">foods&restaurant</option>
						<option value="NR">news&recommend</option>
						<option value="hs">hotel&stay</option>
					</select>
				</div>
				<div>
					<input type="number" id="poster" name="poster" readonly="readonly" value=<%= (Integer)request.getSession().getAttribute("adminId") %>>				
				</div>
				<div>
					<input type="submit" name="submit" value="submit">	
				</div>
			</form>
			<script charset="Shift_JIS" src="http://chabudai.sakura.ne.jp/blogparts/honehoneclock/honehone_clock_wh.js"></script> 
			<!-- <script charset="Shift_JIS" src="http://chabudai.sakura.ne.jp/blogparts/honehoneclock/honehone_clock_tr.js"></script>  -->
	</div>
	</div>
  </body>
</html>
