<%@page import="br.com.exemplo.bens.Usuario"%>
<%@page import="java.util.List"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<jsp:include page="cabecalho.jsp"></jsp:include>
</body>
<%
//List<Usuario>lista =usuDAO.buscarTodos(usu);
List<Usuario>listaResultado = (List<Usuario>)request.getAttribute("lista");
%>
<table border="1">
	<tr bgcolor="#eaeaea">
		<th>ID</th>
		<th>Nome</th>
		<th>Email</th>
		<th>Senha</th>
	</tr>
<%
for(Usuario u:listaResultado){
%>
<tr>
	<th><%=u.getId()%></th>
	<th><%=u.getNome()%></th>
	<th><%=u.getEmail()%></th>
	<th><%=u.getSenha()%></th>
</tr>
<% 
}
%>
</table>
</html>