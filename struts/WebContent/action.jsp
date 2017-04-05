<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@taglib uri="/struts-tags" prefix="s" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<%
	String path = request.getContextPath();
	String basePath = request.getScheme() + "://" + request.getServerName() + ":" + request.getServerPort() + path;
	request.setAttribute("basePath", basePath);
%>
<html>
<head>
	<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
	<title>action study</title>
</head>
<body>
	<h1>Action学习</h1>
	<b>Action的三种写法：</b><br/>
	<ol>
		<li><a href="${basePath }/studyAction/action1">Action可以是一个普通的java类</a></li>
		<li><a href="${basePath }/studyAction/action2">Action可以实现Action接口</a></li>
		<li><a href="${basePath }/studyAction/action3">Action可以从ActionSupport继承</a></li>
	</ol>
	<br/>
	<b>Action的Method学习：</b><br/>
	<ol>
		<li><a href="${basePath }/studyAction/action1Add">Action配置Method</a></li>
		<li><a href="${basePath }/studyAction/action2!add">Action动态调用Method(DMI[struts.enable.DynamicMethodInvocation需要为true])</a></li>
		<li><a href="${basePath }/studyAction/action3add">Action通配符匹配调用add方法</a></li>
		<li><a href="${basePath }/studyAction/action3delete">Action通配符匹配调用delete方法</a></li>
	</ol>
	<br/>
	<b>Action接收参数：</b><br/>
	<ol>
		<li><a href="${basePath }/studyAction/paramsadd1?name=test&age=18">Action中get set接收参数 </a></li>
		<li><a href="${basePath }/studyAction/paramsadd2?user.name=test&user.age=19">Action中Mode接收参数 </a></li>
		<li><a href="${basePath }/studyAction/mdparamsadd?name=test&age=20">Action中ModeDriven方式接收参数</a></li>
	</ol>
	<b>Action访问JSP Servlet内置对象：</b><br/>
	<ol>
		<li>
			<a href="${basePath }/studyAction/web1Elementshow">访问request、session、application方式1(依赖容器)</a><br/>
		</li>
		<li>
			<a href="${basePath }/studyAction/web2Elementshow">访问request、session、application方式2(IOC)</a><br/>
		</li>
		<li>
			<a href="${basePath }/studyAction/web3Elementshow">访问HttpServletRequest、HttpSession、ServletContext方式1(依赖容器)</a><br/>
		</li>
		<li>
			<a href="${basePath }/studyAction/web4Elementshow">访问HttpServletRequest、HttpSession、ServletContext方式2(IOC)</a><br/>
		</li>
		<li>
			获取Action中设置的值:<br/>
			<s:property value="#request.attr1"/> | <%=request.getAttribute("attr1") %><br/>
			<s:property value="#session.attr2"/> | <%=session.getAttribute("attr2") %><br/>
			<s:property value="#application.attr3"/> | <%=application.getAttribute("attr3") %><br/>
		</li>
	</ol>
	<s:debug></s:debug>
	<br/>
	<a href="${basePath }/index">返回首页</a>
</body>
</html>