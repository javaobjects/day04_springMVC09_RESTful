<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
		<a href="login.action?username=tomcat&password=123456">非RESTful风格的路径</a><br/><br/>
		
		<a href="loginRestful/tomcat/123456">RESTful风格的路径</a>
</body>
</html>