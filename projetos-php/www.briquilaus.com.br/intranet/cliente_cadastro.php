<html>
<head>
<title>Cadastro de Clientes</title>
</head>
<body>
	<a href="intranet.php">Menu</a>

	<form method="post" action="cliente_funcoes.php?acao=salvar">
		<table border="1">
			<tr>
				<td>Nome</td>
				<td><input type="text" name="txnome"></td>
			</tr>
			<tr>
				<td>E-mail</td>
				<td><input type="text" name="txemail"></td>
			</tr>
			<tr>
				<td> <input type="submit"> </td>
				<td><input type="reset" ></td>
			</tr>

		</table>
	</form>

</body>
</html>