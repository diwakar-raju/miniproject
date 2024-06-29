<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>

<h1>YOUR MARKS IS:
<%
HttpSession hs=request.getSession();
out.print(hs.getAttribute("AAA"));
%>
</h1>
</body>
</html>