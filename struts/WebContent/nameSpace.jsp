<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
	<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
	<title>nameSpace study</title>
</head>
<%
	String path = request.getContextPath();
	String basePath = request.getScheme() + "://" + request.getServerName() + ":" + request.getServerPort() + path;
	request.setAttribute("basePath", basePath);
%>
<body>
	<h1>NameSpace学习</h1>
	<ol>
		<li>NameSpace决定了Action的访问路径</li>
		<li>NameSpace默认为"",可以接受所有URL路径对该package下的Action的请求</li>
		<li>NameSpace写为/,对应Action访问路径为/XXX.Action</li>
		<li>NameSpace写为/AAA,对应Action访问路径为/AAA/XXX.Action</li>
		<li>NameSpace一般以模块命名,具体看具体规则约束</li>
	</ol>
	<br/>
	<a href="${basePath }/index">返回首页</a>
</body>
</html>