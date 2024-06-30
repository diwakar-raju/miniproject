<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<%
HttpSession ht=request.getSession();
String str;
if(ht.getAttribute("AAA").equals(1))
{
	str="palindrome";
}
else
{
	str="not palindrome";
}


%>
<h1>
<%=
str
%>
</h1>
</body>
</html>