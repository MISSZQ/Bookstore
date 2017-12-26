<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>用户注册</title>
</head>
<link rel="stylesheet" href="css/stylel.css">
<body>

<div class="register-container">
	<h1>ShareLink</h1>
	
	<div class="connect">
		<p>Link the world. Share to world.</p>
	</div>
	
	<form action="${pageContext.request.contextPath}/user_register.do" method="post" id="registerForm">
		<div>
			<input type="text" name="userName" class="username" placeholder="您的用户名" autocomplete="off"/>
		</div>
		<div>
			<input type="password" name="userPassword" class="password" placeholder="输入密码" oncontextmenu="return false" onpaste="return false" />
		</div>
		<div>
			<input type="password" name="confirm_password" class="confirm_password" placeholder="再次输入密码" oncontextmenu="return false" onpaste="return false" />
		</div>
		
		<div>
			<input type="email" name="userEmail" class="email" placeholder="输入邮箱地址" oncontextmenu="return false" onpaste="return false" />
		</div>
		
		<div>
			<input type="text" name="userAddress" class="useraddress" placeholder="您的家庭住址" autocomplete="off"/>
		</div>
		<div>
			<input type="text" name="userTelephone"  placeholder="输入电话号码"/>
		</div>

		

		<button id="submit" type="submit">注 册</button>
	</form>
	<a href="login.jsp">
		<button type="button" class="register-tis">已经有账号？</button>
	</a>

</div>

</body>
<script src="js/jquery.min.js"></script>
<script src="js/common.js"></script>
<!--背景图片自动更换-->
<script src="js/supersized.3.2.7.min.js"></script>
<script src="js/supersized-init.js"></script>
<!--表单验证-->
<script src="js/jquery.validate.min.js?var1.14.0"></script>
</html>