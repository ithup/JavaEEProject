<%@ page language="java" import="java.util.*" pageEncoding="utf-8"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%
	String path = request.getContextPath();
	String basePath = request.getScheme() + "://"
			+ request.getServerName() + ":" + request.getServerPort()
			+ path + "/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
<head>
<base href="<%=basePath%>">

<title>订单信息</title>
<meta http-equiv="pragma" content="no-cache">
<meta http-equiv="cache-control" content="no-cache">
<meta http-equiv="expires" content="0">
<meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
<meta http-equiv="description" content="This is my page">
<link rel="stylesheet" type="text/css" href="css/bootstrap.min.css">
<script type="text/javascript" src="js/jquery-2.1.0.js"></script>
<script type="text/javascript" src="js/bootstrap.min.js"></script>
</head>

<body>
	<table class="table table-condensed">
  <caption>订单信息</caption>
  <thead>
    <tr>
      <th>订单号</th>
      <th>用户账号</th>
      <th>用户名</th>
      <th>收货地址</th>
      <th>订单创建时间</th>
      <th>订单说明</th>
      <th>订单详细信息</th>
     </tr>
  </thead>
  <tbody>
  
 <c:forEach items="${order }" var="order">
  	 <tr>
      <td>${order.number }</td>
      <td>${order.user_id }</td>
      <td>${order.user.username }</td>
      <td>${order.user.address }</td>
      <td>${order.createtime }</td>
      <td>${order. note}</td>
      <td>
      	<a href="${pageContext.request.contextPath }/orderDetailServlet?id=${order.id}">订单详情</a>
      </td>
    </tr>
  </c:forEach>
  </tbody>
</table>
</body>
</html>
