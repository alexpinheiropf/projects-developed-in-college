<html>
<head>
<title>Aula 4</title>
<link href="modelos/modelo.css" rel="stylesheet">
</head>
<body>
	<div id="container">
	<?php include_once 'componentes/header.php';?>
	<?php include_once 'componentes/menu.php';?>
	<div id="work">
			<form method="post" action="controller.php">
				<table>
					<tr>
						<td>Nome</td>
						<td><input type="text" name="txnome"></td>
					</tr>
					<tr>
						<td>Email</td>
						<td><input type="text" name="txemail"></td>
					</tr>
					<tr>
						<td>Idade</td>
						<td><input type="text" name="txidade"></td>
					</tr>
					
					<tr>
						<td><input type="submit" value="Enviar"></td>
					</tr>
				</table>
			</form>
		</div>
	<?php include_once 'componentes/footer.php';?>
</div>
</body>
</html>