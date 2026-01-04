<%@page import="java.io.PrintWriter"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<%-- <%
		String user=request.getParameter("u");
		String pass=request.getParameter("p");
		PrintWriter pw=response.getWriter();
		if(user.equals("XY") && pass.equals("123")){
			pw.print("<h1>Login Success</h1>");
		}else{
			pw.print("<h1>Login fail</h1>");
		}
	
	%> --%>
	<% 
		String user=request.getParameter("u");
		String pass=request.getParameter("p");
		PrintWriter pw=response.getWriter();
		if(user.equals("XY") && pass.equals("123")){
	%>
		
		<h1>Login Success</h1>
	<% 
		}else
		{
	%>
		<h1>Login fail</h1>
		<%@ include file="login2.jsp" %>
		<!-- directive tag -->
		<!-- alrenative for request dispacher  --> 
		
	<% 
		}
	%>
	

</body>
</html>