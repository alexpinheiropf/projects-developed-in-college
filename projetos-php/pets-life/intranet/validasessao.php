<?php
session_start();
if(!isset($_SESSION["usuario"]))
{
	echo '<script language= "JavaScript">
location.href="index.php" </script>';
	exit;
}
?>