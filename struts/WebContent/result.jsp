<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<%
	String path = request.getContextPath();
	String basePath = request.getScheme() + "://" + request.getServerName() + ":" + request.getServerPort() + path;
	request.setAttribute("basePath", basePath);
%>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Result学习</title>
</head>
<body>
	<b>Result常用类型:</b><br/>
	<ol>
		<li><a href="${basePath }/studyResult/r1">dispatcher:服务器跳转(只跳转到页面)</a></li>
		<li><a href="${basePath }/studyResult/r2">redirect:客户端跳转(只跳转到页面)</a></li>
		<li><a href="${basePath }/studyResult/r3">chain:服务器跳转(跳转到Action)</a></li>
		<li><a href="${basePath }/studyResult/r4">redirectAction:客户端跳转(跳转到Action)</a></li>
		<li>freeMarker</li>
		<li>stream</li>
		<li>velocity</li>
		<li>....etc.</li>
		<li>详细参见<a href="http://struts.apache.org/docs/result-types.html">http://struts.apache.org/docs/result-types.html</a></li>
	</ol>
	<b>GlobalResult:</b><br/>
	<ol>
		<li>参见result_struts.xml配置global-results</li>
	</ol>
	<b>DynamicResult:</b><br/>
	<ol>
		<li><a href="${basePath }/studyResult/dynamicResult">动态Result</a></li>
	</ol>
	
	<br/>
	<a href="${basePath }/index">返回首页</a>
</body>
</html>