<?php
session_start();
if(!isset($_SESSION["codigo"]))
{
	echo '<script language= "JavaScript">
location.href="index.php" </script>';
	exit;
}
?>
