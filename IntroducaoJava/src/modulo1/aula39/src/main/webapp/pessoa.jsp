<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>

<%
	String nome = (String)request.getAttribute("nome");
%>

<!DOCTYPE html>
<html>
	<head>
		<meta charset="utf-8">
		<title>Pesso</title>
	</head>
	<body>
		<h1>Pessoa olá</h1>
		<%= nome %>
	</body>
</html>