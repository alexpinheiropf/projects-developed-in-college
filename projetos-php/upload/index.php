<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html xmlns="http://www.w3.org/1999/xhtml">
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
<title>Mail Send</title>
</head>
<body>

<!-- O tipo de encoding de dados, enctype, DEVE ser especificado abaixo -->
<form enctype="multipart/form-data" action="upload.php" method="">
<!-- MAX_FILE_SIZE deve preceder o campo input -->
<input type="hidden" name="MAX_FILE_SIZE" value="300000000" />
<!-- O Nome do elemento input determina o nome da array $_FILES -->
Enviar esse arquivo: <input name="arquivo" type="file" />
<input type="submit" value="Enviar arquivo" />
</form>

</body>
</html>