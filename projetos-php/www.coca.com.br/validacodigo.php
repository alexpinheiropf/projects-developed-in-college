
<html>
<head>
	<title>Promoção Cadastrou Ganhou !!!</title>
	<link href="modelos/modelo.css" rel="stylesheet">
</head>
<body>


<div id="container">
	<?php include_once 'componentes/header.php';?>
	
<?php include_once '/componentes/conectar.php';?>
<?php include_once '/componentes/bancoexecuta.php';?>
<?php




$acao =$_GET['acao']; 
if ($acao == "logoff")
{
		session_start();
		session_unset();
		session_destroy();
		echo '<script language= "JavaScript">
location.href="intranet.php" </script>';
		
		
}

if($acao=="validar")
{
	$codigo = $_POST['txcodigo'];
	$comando = "select * from etiqueta_cad where ";
	$comando .= " etiqueta = '".$codigo."'";
	$resposta = mysqlexecuta ( $id, $comando );
	$valida = 0;
	
	
	while ( $linha = mysql_fetch_array ( $resposta ) ) 
	{
		$valida = 1;
	}
	if ($valida==0){
		
		$codigo = $_POST ['txcodigo'];
		echo "<font color= white><center><h1>CÓDIGO $codigo É INVÁLIDO !!!</h1></center></font>";
		echo "<br>";
		echo "<br>";
		echo "<br>";
		echo "<a href = 'index.php'>Tente Novamente</a>";
	}
	else
	{
		
		session_start();
		$_SESSION["codigo"] = $codigo;
		$comando = "delete from etiqueta_cad where etiqueta = '".$codigo."'" ;
		echo $comando;
		mysqlexecuta ( $id, $comando );
		echo '<script language= "JavaScript">
location.href="cliente_cadastro.php?codigo='.$codigo.'" </script>';
		
		
		
	}

}

?>
<form method="post" action="cliente_cadastro.php">
</body>
</html>