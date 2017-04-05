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
		<title>OGNL学习</title>
	</head>
	
	<body>
		<%-- <b>访问值栈中action的普通属性:</b><a href="${basePath }/studyOgnl/ognl_1?name=u&age=20">访问</a>
		<ol>
			<li>访问结果(通过get方法访问):[name=<s:property value="name" />]|[age=<s:property value="age"/>]</li>
		</ol>
		<b>访问值栈中对象的普通属性(get set方法):</b><a href="${basePath }/studyOgnl/ognl_2?user.name=u&user.age=20">访问</a>
		<ol>
			<li>访问结果:[user.age=<s:property value="user.age" />] | [user['age']=<s:property value="user['age']"/>] | user[\"age\"]=<s:property value="user[\"age\"]"/></li>
		</ol>
		<b>访问值栈中对象的普通属性(get set方法):</b><a href="${basePath }/studyOgnl/ognl_2?user.score.name=testName">访问</a>
		<ol>
			<li>访问结果:user.score.name=<s:property value="user.score.name"/></li>
		</ol>
		<b>访问值栈中对象的普通方法:</b><a href="${basePath }/studyOgnl/ognl_1?name=u&age=20">访问</a>
		<ol>
			<li>
				访问结果:name.length()=
				<s:if test="name != null">
					<s:property value="name.length()"/>
				</s:if>
			</li>
		</ol>
		<b>访问值栈中对象的普通方法:</b><a href="${basePath }/studyOgnl/ognl_2?user.name=u&user.age=20">访问</a>
		<ol>
			<li>
				访问结果:user.show()=
				<s:if test="user != null">
					<s:property value="user.show()"/>
				</s:if>
			</li>
		</ol>
		<b>访问值栈中action的普通方法:</b><a href="${basePath }/studyOgnl/ognl_2?user.name=u&user.age=20">访问</a>
		<ol>
			<li>访问结果:show()=<s:property value="show()"/></li>
		</ol>
		<hr/>	
		
		<b>静态方法属性的访问:</b>
		<ol>
			<li>访问结果:@com.ilmlife.constant.StaticClass@scShow()=<s:property value="@com.ilmlife.constant.StaticClass@scShow()"/></li>
			<li>访问结果:@com.ilmlife.constant.StaticClass@SC_FILED=<s:property value="@com.ilmlife.constant.StaticClass@SC_FILED"/></li>
			<li>访问结果:@@max(2,3)=<s:property value="@@max(2,3)" /></li>
		</ol>
		<hr/>
		
		<b>访问普通类的构造方法:</b>
		<ol>
			<li>访问结果:new com.ilmlife.action.mode.UserInfo(18)=<s:property value="%{new com.ilmlife.action.mode.UserInfo(18)}"/></li>
		</ol>
		<hr/> --%>
		<ol>
			<li>
				<b>访问List:<s:property value="users"/></b><a href="${basePath }/studyOgnl/ognl_2?user.name=u&user.age=20">访问</a><br/>
				<s:if test="%{users!=null}">
					<b>访问List中第一个元素:<s:property value="users[0]"/></b><br/>
					<b>访问List中元素某个属性的集合:<s:property value="users.{age}"/></b>
				</s:if>
			</li>
		</ol>
		<s:debug></s:debug>
		<br/>
		<a href="${basePath }/index">返回首页</a>
	</body>
</html>