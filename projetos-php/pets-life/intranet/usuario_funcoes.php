<?php include_once '../componentes/conectar.php';?>
<?php include_once '../componentes/bancoexecuta.php';?>
<?php include_once 'validasessao.php';?>
<?php

include( 'aes.class.php' );
$usuario = $_POST['usuario'];
$senha = $_POST['senha'];
/**
* Gerando um chave de 128 bits com o auxílio do método "keygen" e
* agregando um sal a geração da chave.
*
*/
$key = AES::keygen( AES::KEYGEN_128_BITS, "a1b2c3d4" );
/**
* Instância do objeto AES de criptografia e descriptografia de dados.
*
*/
$aes = new AES( $key );
// Cofigicando.
$encode = $aes->encrypt( $senha );
// Chave simétrica gerada de 128 bits
//echo "<p><b>Chave Simétrica 128 bits: ".$key."</b></p><br />";
echo "<p><b>Texto criptografado:
".base64_encode($encode)."</b></p><br />";
echo $usuario;
// Decodificando a string.
$decode = $aes->decrypt( $encode );
echo "<p><b>Texto descriptografado: ".$decode."</b></p><br />";

		$acao = $_GET['acao'];

if ($acao=="salvar")
{
	$usuario = $_POST['usuario'];
	$senha = $_POST['senha'];
	$comando = "insert into ";
	$comando .= "usuario_cad ";
	$comando .= " (usuario,senha)";
	$comando .= " values (";
	$comando .= " '".$usuario."',";
	$comando .= " '".base64_encode($encode)."'";
	$comando .= " )";
	mysqlexecuta ($id,$comando);
	echo '<script language= "JavaScript">
location.href="usuario_lista.php" </script>';

}

if ($acao=="alterar")
{
	
	$codigo = $_POST['codigo'];
	$usuario = $_POST['usuario'];
	$senha = $_POST['senha'];
	
	$comando = "update ";
	$comando .= "usuario_cad ";
	$comando .= "set ";
	$comando .= "usuario = '".$usuario."', ";
	$comando .= "senha = '".$senha."' ";
	$comando .= "where codigo = '".$codigo."' ";
	echo $comando;
	mysqlexecuta ($id,$comando);
	echo '<script language= "JavaScript">
location.href="usuario_lista.php" </script>';
}
if ($acao=="excluir")
{
	$codigo = $_GET['codigo'];
	$comando = "delete from ";
	$comando .= "usuario_cad ";
	$comando .= "where codigo = '".$codigo."'";
	mysqlexecuta ($id,$comando);
	echo '<script language= "JavaScript">
location.href="usuario_lista.php" </script>';
	
}


?>
