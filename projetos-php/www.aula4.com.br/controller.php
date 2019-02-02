<?php
$nome = $_POST ['txnome'];
$email = $_POST ['txemail'];
$idade = $_POST ['txidade'];
echo 'O usuario ' . $nome;
echo '<br>';
echo 'tem o email:' . $email;
echo '<br>';
echo 'idade:' . $idade;
echo '<br>';

if ($idade >= 18)
	echo 'Maior de Idade';
else
	echo 'Menor de Idade';

echo '<table border="1">';
for ($x=0;$x<$idade;$x++)
{
	echo '<tr>';
		echo '<td>';
			echo 'Idade:'.$x;
		echo '</td>';
	echo '</tr>';
}
echo '</table>';

?>