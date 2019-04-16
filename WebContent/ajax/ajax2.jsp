<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
<head>
<title></title>
<script type="text/javascript">
      //创建xmlHttp对象
	function createXMLHttpRequest() {
		try {
			return new XMLHttpRequest(); //大多数浏览器
		} catch (e) {
			try {
				return ActvieXObject("Msxml2.XMLHTTP"); //IE6.0
			} catch (e) {
				try {
					return ActvieXObject("Microsoft.XMLHTTP"); //IE5.5及更早版本	
				} catch (e) {
					alert("哥们儿，您用的是什么浏览器啊？");
					throw e;
				}
			}
		}
	}
	window.onload = function() {
         //获取整个用户名输入框
		var userEle = document.getElementById("usernameEle");
		userEle.onblur = function() {
			//得到xmlHttp队像
			var xmlHttp = createXMLHttpRequest();
			//打开与服务器的连接
			xmlHttp.open("POSt", " <c:url value='/Ajax2Servlet'/>", "true");
			//是post请求，所以需要设置响应头
			xmlHttp.setRequestHeader("Content-Type", "application/x-www-form-urlencoded");
			//得到用户名输入框的值
			xmlHttp.send("username=" + userEle.value);
			//得到服务器的响应
			xmlHttp.onreadystatechange = function() {
				if (xmlHttp.readyState == 4 && xmlHttp.status == 200) {            
                     //得到服务器响应的值，就是Ajax2Servlet响应过来的值
                     var text=xmlHttp.responseText;
                      var span=document.getElementById("errorSpan");
                     if(text==1){            
                        span.innerHTML="用户名自己被注册";
                     }else{
                      span.innerHTML="";
                     }

				}
			}

		}

	}
</script>

</head>

<body>
	<form action="" method="post">
		用户名： <input type="text" name="username" id="usernameEle"><span
			id="errorSpan"></span></br> 密码： <input type="text" name="password"></br>
		<input type="submit" value="注册">

	</form>


</body>
</html>
