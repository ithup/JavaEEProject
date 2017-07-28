<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
<link rel="stylesheet"
	href="http://cdn.static.runoob.com/libs/bootstrap/3.3.7/css/bootstrap.min.css">
<script
	src="http://cdn.static.runoob.com/libs/jquery/2.1.1/jquery.min.js"></script>
<script
	src="http://cdn.static.runoob.com/libs/bootstrap/3.3.7/js/bootstrap.min.js"></script>
</head>
<body>
	<table class="table table-hover">
		<caption>用户列表</caption>
		<thead>
			<tr>
				<th>用户ID</th>
				<th>用户姓名</th>
				<th>登录名</th>
				<th>密码</th>
			</tr>
		</thead>
		<tbody>
			<c:forEach items="${user }" var="user">
				<tr>
					<td>${user.id }</td>
					<td>${user.username }</td>
					<td>${user.loginname }</td>
					<td>${user.password }</td>
					<td><a href="#">修改</a></td>
				</tr>
			</c:forEach>
		</tbody>
	</table>
</body>
</html>