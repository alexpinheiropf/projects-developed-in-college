<?php
// Nas vers�es do PHP anteriores a 4.1.0, $HTTP_POST_FILES deve ser utilizado ao inv�s // de $_FILES.
$uploaddir = 'upload/';
$uploadfile = $uploaddir.basename($_FILES['userfile'] ['name'] );
$extension = ".".strtolower(end(explode(".", $_FILES["arquivo"]["name"])));

echo '<pre>';
$nameFile = date("Ymdhs");

if (move_uploaded_file($_FILES["arquivo"]["tmp_name"],
$uploaddir.$nameFile.$extension)) {
	echo "Arquivo v�lido e enviado com sucesso.\n";
} else {
	echo "Poss�vel ataque de upload de arquivo!\n";
}
echo 'Aqui est� mais informa��es de debug:';
print_r($_FILES );
print "</pre>";
?>