<%@ page contentType="text/html; charset=GBK" language="java" errorPage="" %>
<%@ page import="org.springframework.web.context.*" %>
<%@ page import="org.springframework.web.context.support.*" %>
<%@ page import="spring.*" %>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
<head>

<title>My JSP 'index.jsp' starting page</title>
<meta http-equiv="pragma" content="no-cache">
<meta http-equiv="cache-control" content="no-cache">
<meta http-equiv="expires" content="0">
<meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
<meta http-equiv="description" content="This is my page">
<!--
	<link rel="stylesheet" type="text/css" href="styles.css">
	-->
</head>

<body>
	<%
		WebApplicationContext ctx = WebApplicationContextUtils
				.getWebApplicationContext(application);
		HelloWorld hw1 = (HelloWorld) ctx.getBean("hello2");
		HelloWorld hw2 = (HelloWorld) ctx.getBean("hello2");
		out.println(hw1);
		out.println(hw2);
	%>
</body>
</html>
