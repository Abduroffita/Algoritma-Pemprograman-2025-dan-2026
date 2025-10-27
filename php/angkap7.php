<?php 
$a = readline("Masukkan angka pertama: ");
$b = readline("Masukkan angka kedua: ");

if ($a > $b) {
    echo "$a lebih besar dari $b\n";
} elseif ($a < $b) {
    echo "$a lebih kecil dari $b\n";
} else {
    echo "Keduanya sama besar\n";
}

echo "Apakah keduanya sama? ";
echo($a == $b)? "true\n": "false\n"; 
?>

