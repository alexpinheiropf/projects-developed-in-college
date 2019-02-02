<?php
$ladoA = $_POST ['txladoA'];
$ladoB = $_POST ['txladoB'];
$ladoC = $_POST ['txladoC'];
// echo "O lado A e: ".$ladoA;
// echo "<br>";
// echo "O lado B e: ".$ladoB;
// echo "<br>";
// echo "O lado C e: ".$ladoC;
// echo "<br>";

if (($ladoA > $ladoB + $ladoC)||($ladoB > $ladoA + $ladoC)||($ladoC > $ladoB + $ladoA))
	echo "N tringualo";
else if ($ladoA == $ladoB && $ladoB == $ladoC)
	echo "Equilatero";
else {
	if (($ladoA == $ladoB && $ladoB != $ladoC) || ($ladoA == $ladoC && $ladoB != $ladoA) || ($ladoB == $ladoC && $ladoC != $ladoA))
		echo "Isosceles";
	else {
		if ($ladoA != $ladoB && $ladoB != $ladoC && $ladoA != $ladoC)
			echo "Escaleno";
	}
}

?>