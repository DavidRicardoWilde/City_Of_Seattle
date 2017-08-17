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
	<script type="text/javascript" src="public/js/jquery/jquery.easyui.min.js"></script>
	<script type="text/javascript" src="public/js/jquery/easyui-lang-zh_CN.js"></script>
  
	<style type="text/css" >
	img{
		height: 300px;
		width:300px;
	}
	div{
		text-align: center;
	}
	</style>
</head>
	
	<script>
	$(function(){
	//alert("fucntion load before the page");
			var url="./trServiceData";
			//test code
			$.ajax({
				type:'GET',
				url:url,
				dataType:'json',
				//data: url,
				//data: $("#mainForm").serialize() + "&_=" + Math.random().toString(),
				success:function(data){
					if(data.total != 'underfined'&& data.total != "0"){
						//alert("test");
						//alert("data = "+data.rows.title);
						//alert("data = "+JSON.stringify(data));
						//alert("title = "+data.rows[0].title);
						//alert("content = "+data.rows[1].content);
							
						var num=Number(data.total);

						var divdbStr="divdbStr";
						
						
						//alert("data num = "+num);
						for(var i=0;i<num;i++){
							//alert("i = "+i);
							//$('#dbh3').html(data.rows[i].title);
							//$('#dbp').html(data.rows[i].content);
							var div=document.getElementById("basediv");
							var title=document.createElement("h3");
							var content=document.createElement("p");
							var image=document.createElement("img");
							
							//alert("step 1");
							//alert(divdbStr+num.toString());
							var divdb=document.createElement("div");
							divdb.setAttribute("id", divdbStr+num.toString());
							//alert("step 2");
							div.appendChild(divdb);
							
							//alert("step 3");
							title.innerHTML=data.rows[i].title;
							divdb.appendChild(title);
							
							//alert("step 4");
							content.innerHTML=data.rows[i].content;
							divdb.appendChild(content);
							//alert("src:"+"file:///"+data.rows[i].imagepath);
							
							image.src=data.rows[i].imagepath;
							//iamge.src=data.rows[i].imagepath.replace(/\//,'\\');
							divdb.appendChild(image);
						}
					}else{
						//test code
						//data = "{\"total\":2,\"rows\":[{\"title\":\"test title\",\"content\":\"test content\"},{\"title\":\"test title2\",\"content\":\"test content2\"}]}"; //test end
						alert(data);
						$('#dbh3').html(data.title);
						$('#dbp').html(data.content);
					}
				},
				error:function(){
					alert("something is woring in ajax QvQ ");
				}
			});
  	});
</script>
 <body>
    	<h1 style="text-align:center;color:#afafaf;font-szie:32px;">Travel in Seattle</h1>
    	<div id="basediv">
			</div>
  </body>
</html>
