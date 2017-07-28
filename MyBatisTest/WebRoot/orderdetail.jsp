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
  <caption>订单详细信息</caption>
  <thead>
    <tr>
      <th>订单ID</th>
      <th>商品ID</th>
      <th>商品数量</th>
     </tr>
  </thead>
  <tbody>
  
 <c:forEach items="${orderdetail }" var="orderdetail">
  	 <tr>
      <td>${orderdetail.orders_id}</td>
      <td>${orderdetail.items_id}</td>
      <td>${orderdetail.items_num}</td>
    </tr>
  </c:forEach>
  </tbody>
</table>
</body>
</html>
