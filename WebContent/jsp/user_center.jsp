<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html lang="en">
<head>
<meta charset="UTF-8">
<meta name="viewport" content="width=device-width, initial-scale=1.0">
<meta http-equiv="X-UA-Compatible" content="ie=edge">
<title>用户中心</title>
<link rel="stylesheet" type="text/css" href="css/bootstrap.min.css">
<link rel="stylesheet" href="css/user_center.css">
<link rel="stylesheet" href="css/head.css">
<link rel="stylesheet" href="css/file.css">
</head>
<body>
	<div class="nav_head">
		<P>用户名</P>
		<button class="btn btn-default">
			<a href="index.jsp">退出</a>
		</button>
		<div class="nav dropdown">
			<a class="btn btn-link" href="user_center.jsp" id="UserCenter">|
				用户中心</a>
		</div>
		<div class="nav">
			<a class="btn btn-link" href="index.jsp">首页</a>
		</div>
	</div>
	<div class="title">
		<img src="img/title.png">
		<div class="second_title">
			<div class="find">
				<input type="text" class="form-control" id="search"> <a
					type="button" class="btn btn-warning" id="search-button"
					href="after_search.jsp"> <span
					class="glyphicon glyphicon-search"></span>
				</a>
				<button type="button" class="btn btn-warning">
					<a href="release_goods.jsp">发布闲置</a>
				</button>
			</div>
		</div>
	</div>
	<!-- 返回最上开始 -->
	<div class="back_to_top">
		<a href="#"><img src="img/index-回到最上.png"></a>
	</div>
	<!-- 返回最上结束 -->
	<div class="list">
		<div class="list_nav " style="height: 400px">
			<ul class="list-group">
				<li class="list-group-item"><a href="user_center.jsp">个人资料</a></li>
				<li class="list-group-item"><a href="release_records.jsp">发布记录</a></li>
				<li class="list-group-item"><a href="purchase_record.jsp">购买记录</a></li>
				<li class="list-group-item"><a href="collection.jsp">我的收藏</a></li>
				<li class="list-group-item"><a href="browse_history.jsp">浏览历史</a></li>
				<li class="list-group-item"><a href="c_password.jsp">修改密码</a></li>
				<li class="list-group-item"><a href="logon_record.jsp">登录记录</a></li>
			</ul>
		</div>
		<div class="list_body" style="height: 400px">
			<p class="text-center">个人资料</p>
			<hr>
			<div
				style="width: 400px; float: left; display: flex; flex-direction: column; align-items: center;">
				<c:choose>
					<c:when test="${empty sessionScope.userInfo}">
						<img src="img/u640.png" style="width: 400; height: 170px;" />
					</c:when>
					<c:otherwise>
						<img alt="图片" src="${userInfo.image}"
							style="width: 400; height: 170px;">
						<button class="btn btn-link" style="left: -45px; top: 30px">更改头像</button>
					</c:otherwise>
				</c:choose>
			</div>
			<div style="width: 396px; float: left;">
				<p style="width: 390px;">
					昵称：<span>${userInfo.username}</span>
				</p>
				<p style="width: 390px;">
					邮箱：<span>${userInfo.email}</span>
				</p>
				<p style="width: 390px;">
					性别：<span>${userInfo.sex}</span>
				</p>
				<p style="width: 390px;">
					年龄：<span>${userInfo.age}</span>
				</p>
				<p style="width: 390px;">
					注册时间：<span>${userInfo.registtime}</span>
				</p>
			</div>
		</div>
	</div>

	<script src="js/jquery-3.3.1.min.js"></script>
	<script src="js/bootstrap.min.js"></script>
	<script src="js/user_center.js"></script>
</body>
</html>
