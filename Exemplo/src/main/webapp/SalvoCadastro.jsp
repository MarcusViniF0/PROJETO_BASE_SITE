<%@page import="br.com.exemplo.bens.UsuarioDAO"%>
<%@page import="br.com.exemplo.bens.Usuario"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Página - Salvar Cadastro</title>
</head>
<body>
<jsp:include page="cabecalho.jsp"></jsp:include>
<%
String snome=request.getParameter("nome");
String semail=request.getParameter("email");
String ssenha=request.getParameter("senha");

Usuario usu = new Usuario();
usu.setNome(snome);
usu.setEmail(semail);
usu.setSenha(ssenha);

UsuarioDAO usuDAO = new UsuarioDAO();
usuDAO.cadastro(usu);

%>
<h1>Salvo com sucesso!</h1>
</body>
</html>