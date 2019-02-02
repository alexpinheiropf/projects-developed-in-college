<?php include_once 'validasessao.php';?>

<html>
<head>
<title>Promoção Cadastrou Ganhou !!!</title>
<link href="modelos/modelo.css" rel="stylesheet">
</head>
<body>
	<div id="container">
	
	<?php include_once 'componentes/header.php';?>
<html>
<head>
<title>Cadastro de Clientes</title>
</head>
<body>


	<form method="post" action="cliente_funcoes.php?acao=salvar">
		
		<input type="hidden" name="txcodigo" value="<?php echo $codigo;?>"> 
		<center>
			<table border="0">
			<tr>
					<td><font color=white><h2>Código: </h2></font></td>
					<td><font color=white><h2><?php 
		                	$codigo = $_GET['codigo'];
			                echo $codigo; 
		                ?></h2></font></td>
					
				</tr>
				<tr>
					<td><font color=white><h2>Nome:</h2></font></td>
					<td><input type="text" name="txparticipante"></td>
				</tr>
				<tr>
					<td><font color=white><h2>Fone:</h2></font></td>
					<td><input type="text" name="txfone"></td>
				</tr>
				<tr>
				</tr>
			</table>
		</center>
		<center>
			<td><input type="submit"></td>
		</center>
	</form>
	</font>
</body>
<a href="index.php">Página Inicial</a>
		</html>