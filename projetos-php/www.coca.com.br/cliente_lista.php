<?php include_once '/componentes/conectar.php';?>
<?php include_once '/componentes/bancoexecuta.php';?>

<html>
<head>
	<title>Lista de Clientes</title>
</head>
<body>
	<a href="intranet.php">Menu</a>
	<a href="cliente_cadastro.php">Novo Registro</a>
	<table border="1">
		<tr>
			<td>ID</td>
			<td>Participante</td>
			<td>Fone</td>
			<td>Alterar</td>
			<td>Excluir</td>
		</tr>
	<?php 
		$comando = "select * from participante_cad";
		$resposta = mysqlexecuta ( $id, $comando );
		while ( $linha = mysql_fetch_array ( $resposta ) )
		
		
		{
			

			
	?>		
		<tr>
			<td><?php echo $linha['id']; ?></td>
			<td><?php echo $linha['participante']; ?></td>
			<td><?php echo $linha['fone']; ?></td>
			<td><a href="cliente_altera.php?codigo=<?php echo $linha['codigo']; ?>">Alterar</a></td>
			<td><a href="cliente_funcoes.php?acao=excluir&codigo=<?php echo $linha['codigo']; ?>">Excluir</a></td>
		</tr>
	<?php 
		}
		?>
	</table>


</body>
</html>