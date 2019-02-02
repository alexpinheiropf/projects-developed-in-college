<html>
<head>
<title>Promoção Cadastrou Ganhou !!!</title>
<link href="modelos/modelo.css" rel="stylesheet">
</head>
<body>
	<div id="container">
	<?php include_once 'componentes/header.php';?>
	<left>
		<div id="work"></div>
		</left>
		
		
		<form method="post" action="validacodigo.php?acao=validar">
		
			<table>
				<tr>
					<div id="work_um">
						<h1>Cadastre seu Código:</h1>
						<input type="text" name="txcodigo" maxlength="6"> <input type="submit">
					</div>

				</tr>
			</table>

		</form>

</body>
</html>