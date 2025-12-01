#include <iostream>
#include <string>
#include <iomanip>
using namespace std;

bool validasiNama(string nama) {
    for (char c : nama) {
        if (!isalpha(c) && c != ' ') {
            return false;
        }
    }
    return !nama.empty();
}

int main() {
    string nama;
    double saldo;
 string nim;
    bool namaValid = false;
    
    while (!namaValid) {
        cout << "Masukkan nama: ";
        getline(cin, nama);
        
        namaValid = validasiNama(nama);
        
        if (!namaValid) {
            cout << "Nama tidak valid! Hanya boleh mengandung huruf dan spasi." << endl;
        }
    }
    cout << "Masukkan NIM (hanya angka): ";
    cin >> nim;
    
    saldo = stod(nim);
    
    cout << "\n=== DATA AWAL ===" << endl;
    cout << "Nama: " << nama << endl;
    cout << "Saldo Awal: " << (saldo) << endl;
    
    int pilihan;
    double jumlah;
    string rekeningTujuan;
    
    do {
cout << "\n=== MENU ATM ===" << endl;
        cout << "1. Cek Saldo" << endl;
        cout << "2. Tarik Tunai" << endl;
        cout << "3. Setor Tunai" << endl;
        cout << "4. Transfer" << endl;
        cout << "5. Keluar" << endl;
        cout << "Pilih menu (1-5): ";
        cin >> pilihan;
        
        switch (pilihan) {
            case 1:
                cout << "\n--- CEK SALDO ---" << endl;
                cout << "Saldo Anda: " << (saldo) << endl;
                break;
                
            case 2:
                cout << "\n--- TARIK TUNAI ---" << endl;
                cout << "Saldo tersedia: " << (saldo) << endl;
                cout << "Masukkan jumlah penarikan: ";
                cin >> jumlah;
                
   if (jumlah <= 0) {
                    cout << "Jumlah tidak valid!" << endl;
                } else if (jumlah > saldo) {
                    cout << "Saldo tidak mencukupi!" << endl;
                } else {
                    saldo -= jumlah;
                    cout << "Penarikan berhasil!" << endl;
                    cout << "Jumlah ditarik: " << (jumlah) << endl;
                    cout << "Saldo sisa: " << (saldo) << endl;
                }
                break;
                
            case 3:
                cout << "\n--- SETOR TUNAI ---" << endl;
                cout << "Masukkan jumlah setoran: ";
                cin >> jumlah;
                
                if (jumlah <= 0) {
                    cout << "Jumlah tidak valid!" << endl;
                } else {
                    saldo += jumlah;
                    cout << "Setoran berhasil!" << endl;
                    cout << "Jumlah disetor: " << (jumlah) << endl;
                    cout << "Saldo sekarang: " << (saldo) << endl;
                }
                break;
                
            case 4:
 cout << "\n--- TRANSFER ---" << endl;
                cout << "Saldo Anda: " << (saldo) << endl;
                cout << "Masukkan nomor rekening tujuan: ";
                cin >> rekeningTujuan;
                cout << "Masukkan jumlah transfer: ";
                cin >> jumlah;
                
                if (jumlah <= 0) {
                    cout << "Jumlah tidak valid!" << endl;
                } else if (jumlah > saldo) {
                    cout << "Saldo tidak mencukupi!" << endl;
                } else {
                    saldo -= jumlah;
                    cout << "Transfer berhasil!" << endl;
                    cout << "Ke rekening: " << rekeningTujuan << endl;
                    cout << "Jumlah: " << (jumlah) << endl;
                    cout << "Saldo sisa: " << (saldo) << endl;
                }
                break;
                
            case 5:
                cout << "\nTerima kasih " << nama << " telah menggunakan ATM!" << endl;
                break;
                
            default:
                cout << "Pilihan tidak valid! Silakan pilih 1-5." << endl;
                break;
        }
        
    } while (pilihan != 5);

    return 0;
}