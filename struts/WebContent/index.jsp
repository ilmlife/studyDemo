<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<%
	String path = request.getContextPath();
	String basePath = request.getScheme() + "://" + request.getServerName() + ":" + request.getServerPort() + path;
	request.setAttribute("basePath", basePath);
%>
<html>
<head>
	<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
	<title>Basic Struts 2 Application - Welcome</title>
</head>
<body>
	<h1>Welcome To Struts 2!</h1><br/>
	<ol>
		<li><a href="${basePath }/studyNameSpace/nameSpace">NameSpace学习</a></li>
		<li><a href="${basePath }/studyAction/action1">Action学习</a></li>
		<li><a href="${basePath }/studyResult/r1">Result学习</a></li>
		<li><a href="${basePath }/studyOgnl/ognl_1">OGNL学习</a></li>
	</ol>
</body>
</html>