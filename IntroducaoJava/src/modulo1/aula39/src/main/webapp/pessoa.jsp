<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>

<%
	String nome = (String)request.getAttribute("nome");
%>

<!DOCTYPE html>
<html>
	<head>
		<meta charset="ISO-8859-1">
		<title>Pessoa</title>
	</head>
	<body>
		<h1>Pessoa</h1>
		<%= nome %>
	</body>
</html>