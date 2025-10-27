<?php
$tugas = readline("Masukkan nilai tugas: ");
$uts = readline("Masukkan nilai UTS: ");        
$uas = readline("Masukkan nilai UAS: ");

$nilaiakhir = ($tugas * 0.3) + ($uts * 0.3) + ($uas * 0.4);

echo "Nilai Akhir = " . $nilaiakhir . "\n";
if ($nilaiakhir >= 60) {
    echo "Status : Lulus!\n";
} else {
    echo "Status : Tidak Lulus.\n";
}
?>