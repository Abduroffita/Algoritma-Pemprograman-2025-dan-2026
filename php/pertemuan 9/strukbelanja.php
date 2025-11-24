$<?php

$nama = readline("Masukan nama barang: ");
$harga = readline("Masukan harga barang: ");
$jumlah = readline("Masukan jumlah beli: ");

$total = $harga * $jumlah;

if ($total > 73600) {
    $diskon = $total * 0.6;
} else {
    $diskon = 0;
}

$total_bayar = $total - $diskon;

echo "\n===== STRUK PEMBELIAN =====\n";
echo "Nama Barang   : $nama\n";
echo "Harga Satuan  : $harga\n";
echo "Jumlah Beli   : $jumlah\n";
echo "Total Harga   : $total\n";
echo "Diskon        : $diskon\n";
echo "Total Bayar   : $total_bayar\n";

?>