<?php
$dbname = "carros"; // Indique o nome do banco de dados que ser� aberto
$usuario = "root"; // Indique o nome do usu�rio que tem acesso
$password = "root"; // Indique a senha do usu�rio
                  // 1� passo - Conecta ao servidor MySQL
if (! ($id = mysql_connect ( "localhost", $usuario, $password ))) {
	echo "N�o foi poss�vel estabelecer uma conex�o com o gerenciador MySQL. Favor Contactar o Administrador.";
	exit ();
}
if (! ($con = mysql_select_db ( $dbname, $id ))) {
	echo "Reposit�rio n�o encontrado.";
	exit ();
}
?>