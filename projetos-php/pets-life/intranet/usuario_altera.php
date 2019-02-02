<?php include_once '../componentes/conectar.php';?>
<?php include_once '../componentes/bancoexecuta.php';?>
<?php include_once 'validasessao.php';?>

<html>
<head>
<title>Cadastro de Clientes</title>
</head>
<body>
	<a href="intranet.php">Menu</a>

<?php 
	$codigo = $_GET['codigo'];
	$comando = "select * from usuario_cad";
	$comando .= " where codigo = '".$codigo."'";
	$resposta = mysqlexecuta ( $id, $comando );
	while ( $linha = mysql_fetch_array ( $resposta ) )
	{
		$codigo = $linha['codigo'];
		$nome = $linha['usuario'];
		$email = $linha['senha'];
	}
?>	
	<form method="post" action="usuario_funcoes.php?acao=alterar">
		<table border="1">
			<tr>
				<td>Código</td>
				<td><input type="text" name="txmostra" disabled="disabled" value="<?php echo $codigo;?>">
				<input type="hidden" name="codigo" value="<?php echo $codigo;?>">
				</td>
				
			</tr>
		
		<tr>
				<td>Usuário</td>
				<td><input type="text" name="usuario" value="<?php echo $nome;?>"></td>
			</tr>
			<tr>
				<td>Senha</td>
				<td><input type="text" name="senha" value="<?php echo $email;?>"></td>
			</tr>
			<tr>
				<td> <input type="submit"> </td>
				<td><input type="reset" ></td>
			</tr>

		</table>
	</form>

</body>
</html>