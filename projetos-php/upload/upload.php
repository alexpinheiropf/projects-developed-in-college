<?php
// Nas versões do PHP anteriores a 4.1.0, $HTTP_POST_FILES deve ser utilizado ao invés // de $_FILES.
$uploaddir = 'upload/';
$uploadfile = $uploaddir.basename($_FILES['userfile'] ['name'] );
$extension = ".".strtolower(end(explode(".", $_FILES["arquivo"]["name"])));

echo '<pre>';
$nameFile = date("Ymdhs");

if (move_uploaded_file($_FILES["arquivo"]["tmp_name"],
$uploaddir.$nameFile.$extension)) {
	echo "Arquivo válido e enviado com sucesso.\n";
} else {
	echo "Possível ataque de upload de arquivo!\n";
}
echo 'Aqui está mais informações de debug:';
print_r($_FILES );
print "</pre>";
?>