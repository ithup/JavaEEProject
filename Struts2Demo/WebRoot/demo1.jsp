<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@taglib uri="/struts-tags" prefix="s" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<s:debug/>
	<s:property value="#contextMap"/><br>
	<s:property value="#session.user"/><br>
	<s:property value="#session.user1"/><br>
	<s:property value="#application.app"/><br>
	<s:property value="#application.app1"/>
</body>
</html>