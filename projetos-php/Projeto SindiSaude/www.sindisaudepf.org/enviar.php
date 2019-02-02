<?php
 
$nome = $_POST['nome'];
$email = $_POST['email'];
$assunto = $_POST['assunto'];
$msg = $_POST['mensagem'];
 
 
$headers = "From: ". $nome;
 
$corpoemail = '<b>Fale Conosco - Fabricando a Web</b>
             
               Nome: '   .$nome.' /n
               Email:'   .$email.'/n
               Assunto:' .$assunto.' /n
               Mensagem:'.$msg.' /n';
 
 
 
 
if(mail("contato@sindisaudepf.org", "Fale Conosco",$corpoemail,$headers)){
 
 
       echo "<script>alert('Mensagem enviada com sucesso!');</script>"; 
       header("Location: contato.php");
 
} else{
 
      echo "<script>alert('Erro ao enviar, tente diretamente pelo email contato@sindisaudepf.org');</script>";
      header("Location: index.php");
 
}