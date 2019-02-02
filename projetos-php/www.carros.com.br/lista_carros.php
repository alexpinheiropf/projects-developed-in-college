<?php include_once 'componentes/conectar.php';?>
<?php include_once 'componentes/bancoexecuta.php';?>
<html>
<head>
	<title>	Lista Carros</title>
</head>
<body>

<table border="1">
	<tr>
		<td>CODIGO</td>
		<td>DESCRIÇÃO</td>
		<td>PLACA</td>
		<td>ANO</td>
	</tr>
<?php
$comando = "select * from cadastro";
$resultado = mysqlexecuta ( $id, $comando );
while ( $linha = mysql_fetch_array ( $resultado ) )
{
	?>	
	<tr>
		<td> <?php echo $linha ['codigo'];?> </td>
		<td> <?php echo $linha ['descricao'];?></td>
		<td> <?php echo $linha ['placa'];?></td>
		<td> <?php echo $linha ['ano'];?></td>
	</tr>
<?php 
}
?>	
</table>





</body>
</html>
