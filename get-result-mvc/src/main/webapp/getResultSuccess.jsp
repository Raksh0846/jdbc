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
Integer sid=(Integer)session.getAttribute("id");
String sname=(String)session.getAttribute("name");
Integer marks=(Integer)session.getAttribute("smarks");
Integer marks2=(Integer)session.getAttribute("smarks2");
Integer marks3=(Integer)session.getAttribute("smarks3");
out.println(sid+" "+sname+" "+marks+" "+marks2+" "+marks3);
%>
</body>
</html>