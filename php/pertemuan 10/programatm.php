<?php
// Fungsi untuk validasi nama
function validasiNama($nama) {
    // Cek apakah nama hanya mengandung huruf dan spasi
    return preg_match('/^[a-zA-Z\s]+$/', $nama) && !empty(trim($nama));
}
// Proses input
if ($_SERVER['REQUEST_METHOD'] === 'POST') {
    $nama = $_POST['nama'] ?? '';
    $nim = $_POST['nim'] ?? '';
    $pilihan = $_POST['pilihan'] ?? '';
    $jumlah = $_POST['jumlah'] ?? 0;
    $rekeningTujuan = $_POST['rekening_tujuan'] ?? '';
    // Validasi nama
    $namaValid = validasiNama($nama);
    if (!$namaValid && !empty($nama)) {
        $error = "Nama tidak valid! Hanya boleh mengandung huruf dan spasi.";
    }
 // Jika nama valid dan NIM diinput, hitung saldo
    if ($namaValid && !empty($nim) && is_numeric($nim)) {
        $saldo = (float)$nim;
        $dataAwalDitampilkan = true;
    }
    
    // Proses menu ATM
    if (isset($_POST['saldo'])) {
        $saldo = (float)$_POST['saldo'];
        
        switch ($pilihan) {
            case '1':
                $pesan = "Saldo Anda: " . ($saldo);
                break;
            case '2':
                if ($jumlah <= 0) {
                    $pesan = "Jumlah tidak valid!";
                } else if ($jumlah > $saldo) {
                    $pesan = "Saldo tidak mencukupi!";
                } else {
                    $saldo -= $jumlah;
 $pesan = "Penarikan berhasil!<br>Jumlah ditarik: " . ($jumlah) . 
                            "<br>Saldo sisa: " . ($saldo);
                }
                break;
            case '3':
                if ($jumlah <= 0) {
                    $pesan = "Jumlah tidak valid!";
                } else {
                    $saldo += $jumlah;
                    $pesan = "Setoran berhasil!<br>Jumlah disetor: " .($jumlah) . 
                            "<br>Saldo sekarang: " .($saldo);
                }
                break;
            case '4':
                if ($jumlah <= 0) {
                    $pesan = "Jumlah tidak valid!";
                } else if ($jumlah > $saldo) {
                    $pesan = "Saldo tidak mencukupi!";
                } else {
 $saldo -= $jumlah;
                    $pesan = "Transfer berhasil!<br>Ke rekening: " . htmlspecialchars($rekeningTujuan) . 
                            "<br>Jumlah: " . ($jumlah) . 
                            "<br>Saldo sisa: " . ($saldo);
                }
                break;
            case '5':
                $pesan = "Terima kasih $nama telah menggunakan ATM!";
                $keluar = true;
                break;
            default:
                $pesan = "Pilihan tidak valid! Silakan pilih 1-5.";
                break;
        }
    }
}
?>

