<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
<form action="signup" method="POST">
	First Name :<input type="text" name="fName" value="${firstname}"/><br/>
	Last Name :<input type="text" name="lName" value="${lastname}"/><br/>
	User Name :<input type="text" name="uName" value="${username}"/><br/>
	Password :<input type="password" name="password"/><br/>
	Re-enter Password :<input type="password" name="passwordAgain"/>
	<input type=submit value=submit>
	

</form>
</body>
</html>