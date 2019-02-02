<?php include_once '/componentes/conectar.php';?>
<?php include_once '/componentes/bancoexecuta.php';?>

<html>
<head>
<title>Cadastro de Clientes</title>
</head>
<body>
	<a href="intranet.php">Menu</a>

<?php 
	$codigo = $_GET['codigo'];
	$comando = "select * from cliente_cad";
	$comando .= " where codigo = '".$codigo."'";
	$resposta = mysqlexecuta ( $id, $comando );
	while ( $linha = mysql_fetch_array ( $resposta ) )
	{
		$codigo = $linha['codigo'];
		$nome = $linha['nome'];
		$email = $linha['email'];
	}
?>	
	<form method="post" action="cliente_funcoes.php?acao=alterar">
		<table border="1">
			<tr>
				<td>Código</td>
				<td><input type="text" name="txmostra" disabled="disabled" value="<?php echo $codigo;?>">
				<input type="hidden" name="txcodigo" value="<?php echo $codigo;?>">
				</td>
				
			</tr>
		
		<tr>
				<td>Nome</td>
				<td><input type="text" name="txnome" value="<?php echo $nome;?>"></td>
			</tr>
			<tr>
				<td>E-mail</td>
				<td><input type="text" name="txemail" value="<?php echo $email;?>"></td>
			</tr>
			<tr>
				<td> <input type="submit"> </td>
				<td><input type="reset" ></td>
			</tr>

		</table>
	</form>

</body>
</html>