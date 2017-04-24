<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%
	String path = request.getContextPath();//项目名称
	String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+ path +"/";
%>    
    
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<script type="text/javascript" src="<%=basePath %>static/js/jquery.min.js"></script>
<script type="text/javascript" src="<%=basePath %>static/js/index.js" charset="utf-8"></script>


<title>登录页面</title>
</head>
<body>

	<button id="btn">Ajax登录</button>

	<p>


	<form action="<%=basePath %>sys/login" method="get">
		用户名：<input type="text" name="userName"/>
		<br/>
		密码：<input type="password" name="pwd"/>
		<br/>
		出生日期：<input type="text" name="birthday"/>
		<input type="submit" value="提交"/>
	</form>
	
	<p>
</body>
</html>