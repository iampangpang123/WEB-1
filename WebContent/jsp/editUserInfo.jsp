<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<script src="../jquery/jquery-1.8.3.js"></script>
<script src="../js/bootstrap.js"></script>
<link rel="stylesheet" href="editUserInfo.css">
<link rel="stylesheet" href="../css/bootstrap.css">
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>

	<center>

		<h3>
			<p style="margin-top: 50px">用户个人信息修改</p>
		</h3>
		<form method="post" action='<c:url value='editUserInfo.action'/>' enctype="multipart/form-data">

			<p>
				uuid：<input type="hidden" class="input-xxlarge" name="uuid"
					id="uuid" size="30" placeholder="请输入姓名"
					value="${sessionScope.userInfo.uuid}">
			</p>
			<p>
				姓名：<input type="text" class="input-xxlarge" name="username"
					id="username" size="30" placeholder="请输入姓名"
					value="${sessionScope.userInfo.username}">
			</p>
			<p>
				密码：<input type="password" class="input-xxlarge" id="password"
					value="${sessionScope.userInfo.password}" name="password" size="30"
					placeholder="请输入密码">
			</p>
			<p>
				年龄：<input type="text" class="input-xxlarge" id="age" name="age"
					size="30" placeholder="请输入年龄" value="${sessionScope.userInfo.age}">
			</p>
			<p>
				女：<input type="radio" class="input-xxlarge" id="sex" name="sex"
					size="30" value="女" checked="checked"> 男：<input
					type="radio" class="input-xxlarge" id="sex" name="sex" size="30"
					value="男">
			</p>
			<p>
				email：<input type="text" class="input-xxlarge" id="email"
					value="${sessionScope.userInfo.email}" name="email" size="30"
					placeholder="请输入email">
			</p>
			<p>
				注册时间：<input type="hidden" class="input-xxlarge" id="registtime"
					value="${sessionScope.userInfo.registtime}" name="registtime"
					size="30" readonly="readonly">
			</p>
			<p>
				头像： <img src="${sessionScope.userInfo.image} style=" width: 400; height: 170px;" />
			</p>

			<p>
				修改头像头像：<input type="file" class="input-xxlarge" name="image"
					size="30">
			</p>

			<p>
				地址：<input type="text" class="input-xxlarge" id="address"
					value="${sessionScope.userInfo.address}" name="address" size="30"
					placeholder="请输入地址">
			</p>
			<p>
				手机号：<input type="text" class="input-xxlarge" id="phone" name="phone"
					size="30" placeholder="请输入手机号"
					value="${sessionScope.userInfo.phone}">
			</p>
			<p>
				&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<input
					type="submit" class="btn btn-primary" value="确定">&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
				<input type="reset" class="btn btn-primary" value="取消">
			</p>
		</form>

	</center>
</body>


</html>