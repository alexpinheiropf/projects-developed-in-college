<?php include_once '/componentes/conectar.php';?>
<?php include_once '/componentes/bancoexecuta.php';?>

<?php
$acao = $_GET['acao'];

if ($acao=="salvar")
{
	$participante = $_POST['txparticipante'];
	$fone = $_POST['txfone'];
	$comando = "insert into ";
	$comando .= "participante_cad";
	$comando .= " (participante,fone)";
	$comando .= " values (";
	$comando .= " '".$participante."',";
	$comando .= " '".$fone."'";
	$comando .= " )";
	mysqlexecuta ($id,$comando);
	echo '<script language= "JavaScript">
location.href="final.php" </script>';
}



#if ($acao=="salvar")
#{
#	$codigo = $_GET['codigo'];
#	$comando = "delete from ";
#	$comando .= "etiqueta_cad ";
#	$comando .= "where etiqueta = '".$codigo."'";
#	mysqlexecuta ($id,$comando);
#	echo '<script language= "JavaScript">
#location.href="final.php" </script>';
#}
