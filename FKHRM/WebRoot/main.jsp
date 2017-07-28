<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
<!-- 引入jquery -->
<script type="text/javascript" src="static/js/jquery-1.8.3.js"></script>
<!-- 引入bootstrap样式 -->
<link rel="stylesheet" href="https://cdn.bootcss.com/bootstrap/3.3.7/css/bootstrap.min.css">
<style type="text/css">
    body{
      padding-top: 100px;
    }
  </style>
<!-- 引入bootstrap的js -->
<script src="https://cdn.bootcss.com/bootstrap/3.3.7/js/bootstrap.min.js" integrity="sha384-Tc5IQib027qvyjSMfHjOMaLkfuWVxZxUPnCJA7l2mCWNIpG9mGCD8wGNIcPD7Txa" crossorigin="anonymous"></script>
</head>
<body>
	<nav class="navbar navbar-inverse navbar-fixed-top">
      <div class="container-fluid">
        <div class="navbar-header">
          <button type="button" class="navbar-toggle collapsed" data-toggle="collapse" data-target="#navbar" aria-expanded="false" aria-controls="navbar">
            <span class="sr-only">Toggle navigation</span>
            <span class="icon-bar"></span>
            <span class="icon-bar"></span>
            <span class="icon-bar"></span>
          </button>
          <a class="navbar-brand" href="#">DT人事资源管理系统</a>
        </div>
        <div id="navbar" class="navbar-collapse collapse">
          <ul class="nav navbar-nav navbar-right">
            <li><a href="#">网站首页</a></li>
            <li><a href="#">注销退出</a></li>
            <li><a href="#">帮助</a></li>
          </ul>
        </div>
      </div>
    </nav>
     <div class="container">
    <div class="row">
      <div class="col-md-4 col-md-offset-4">
      <h2 class="text-center bg-primary">登录</h2>
      <form action="${pageContext.request.contextPath}/userLogin" method="post">
      <div class="form-group text-info">
        <label for=""><span class="glyphicon glyphicon-user"></span>用户</label>
        <input type="text" name="loginname" class="form-control" placeholder="用户名">
      </div>
      <div class="form-group text-info">
        <label for=""><span class="glyphicon glyphicon-lock"></span>密码</label>
        <input type="password" name="password" class="form-control" placeholder="密码">
      </div>
      <div class="checkbox text-info">
        <label for="">
          <input type="checkbox">记住我
        </label>
      </div>
      <div class="form-group text-center">
        <button class="btn btn-success">登录</button>
        <button class="btn btn-danger">取消</button>
      </div>
    </form>
      </div>
    </div>
  </div>
</body>
</html>