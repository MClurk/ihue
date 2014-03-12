<%@ page language="java" contentType="text/html; charset=utf-8"
	pageEncoding="utf-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8">
<title>Login</title>
</head>
<body>
	<form action="/login" method="post">
		<p>
			<label>Username</label><input id="username" name="username"
				type="text">
		<p>
			<label>Password</label><input id="password" name="password"
				type="password">
		<p>
			<input value="Login" type="submit">
	</form>
</body>
</html>