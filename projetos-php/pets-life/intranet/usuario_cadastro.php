<?php include_once 'validasessao.php';?>

<html>
<head>
<meta charset="utf-8">
<title>Cadastro de Usuários</title>
</head>
<body>
	<a href="intranet.php">Menu</a>

	<form method="post" action="teste.php?acao=salvar">
		<table border="1">
			<tr>
				<td>Usuário</td>
				<td><input type="text" name="usuario"></td>
			</tr>
			<tr>
				<td>Senha:</td>
				<td><input type="password" name="senha"></td>
			</tr>
			<tr>
				
				
				<td> <input type="submit"> </td>
				<td><input type="reset" ></td>
			</tr>

		</table>
	</form>

</body>
</html>
