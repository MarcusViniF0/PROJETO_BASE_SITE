<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Cadastrar</title>
</head>
<body>
<jsp:include page="cabecalho.jsp"></jsp:include>
	<form action="SalvoCadastro.jsp"method="post">
	<label>Nome:</label>
	<input type="text" name="nome">
	<label>Email:</label>
	<input type="text" name="email">
	<label>Senha:</label>
	<input type="password" name="senha">
	
	<input type="submit" value="Cadastrar">
	</form>
</body>
</html>