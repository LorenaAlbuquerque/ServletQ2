<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<form action="Aniversario" method="get">
		Digite seu ano de nascimento: <input type="number"
			name="anoNascimento" size=15> <br>
		<br> Já fez aniversário esse ano? <select
			name="opcaoJaAniversario">
			<option value=Sim>Sim</option>
			<option value=Não>Não</option>
		</select> <br>
		<br> <input type='submit' value="Enviar">
	</form>
</body>
</html>