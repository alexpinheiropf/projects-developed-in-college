<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-
transitional.dtd">
<html xmlns="http://www.w3.org/1999/xhtml">
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
<title>Mail Send</title>
</head>
<body>
<?php

$nome     = $_POST["txnome"];
$email    = $_POST["txemail"];
$assunto  = $_POST["txassunto"];
$telefone = $_POST["txtelefone"];
$mensagem = $_POST["txmensagem"];

echo $nome;

require 'phpmailer/PHPMailerAutoload.php';
$mail = new PHPMailer;
$mail->isSMTP(); // Set mailer to use SMTP
$mail->SMTPDebug = 1; // ver os erros
$mail->Host = 'smtp.gmail.com'; // Specify main and backup server
$mail->SMTPAuth = true; // Enable SMTP authentication
$mail->Username = 'aulaphpmail@gmail.com'; // SMTP username
$mail->Password = 'Enviaphpaula'; // SMTP password
$mail->SMTPSecure = 'ssl'; // Enable encryption, 'ssl' also accepted
$mail->Port = 465; //Set the SMTP port number - 587 for authenticated TLS
$mail->setFrom('jeanccsaffi@gmail.com', 'Jean'); //Set who the message is to be sent from
//$mail->addReplyTo('labnol@gmail.com', 'First Last'); //Set an alternative reply-to address
$mail->addAddress('jeanccsaffi@gmail.com', 'Jean'); // Add a recipient
//$mail->addAddress('ellen@example.com'); // Name is optional
//$mail->addCC('cc@example.com');
//$mail->addBCC('bcc@example.com');
$mail->WordWrap = 50; // Set word wrap to 50 characters
//$mail->addAttachment('/usr/labnol/file.doc'); // Add attachments
//$mail->addAttachment('/images/image.jpg', 'new.jpg'); // Optional name
$mail->isHTML(true); // Set email format to HTML
$mail->Subject = 'Assunto Mail';
$mail->Body = 'Texto do Corpo <b>em negrito! Pode ser colocado tags do HTML para incorporar a mensagem
</b>';
$mail->AltBody = 'Texto do Corpo sem html';
//Read an HTML message body from an external file, convert referenced images to embedded,
//convert HTML into a basic plain-text alternative body
//$mail->msgHTML(file_get_contents('contents.html'), dirname(__FILE__));
if(!$mail->send()) {
echo 'Mensagem não pode ser enviada! Verifique.';
echo 'Erro: ' . $mail->ErrorInfo;
exit;
}
echo 'Mensagem Enviada';
?>
</body>
</html>