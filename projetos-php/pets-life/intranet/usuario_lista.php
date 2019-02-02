<?php include_once '../componentes/conectar.php';?>
<?php include_once '../componentes/bancoexecuta.php';?>


<html>
<head>
	<title>Lista de Usuários</title>
</head>
<body>
	<a href="intranet.php">Menu</a>
	<a href="usuario_cadastro.php">Novo Registro</a>
	<table border="1">
		<tr>
			<td>Código</td>
			<td>Usuário</td>
			<td>Senha</td>
			<td>Alterar</td>
			<td>Excluir</td>
		</tr>
	<?php 
		$comando = "select * from usuario_cad";
		$resposta = mysqlexecuta ( $id, $comando );
		while ( $linha = mysql_fetch_array ( $resposta ) )
		{
	?>		
		<tr>
			<td><?php echo $linha['codigo']; ?></td>
			<td><?php echo $linha['usuario']; ?></td>
			<td><?php echo $linha['senha']; ?></td>
			<td><a href="usuario_altera.php?codigo=<?php echo $linha['codigo']; ?>">Alterar</a></td>
			<td><a href="usuario_funcoes.php?acao=excluir&codigo=<?php echo $linha['codigo']; ?>">Excluir</a></td>
		</tr>
	<?php 
		}
		?>
	</table>


</body>
</html>
<?php include_once 'validasessao.php';?>