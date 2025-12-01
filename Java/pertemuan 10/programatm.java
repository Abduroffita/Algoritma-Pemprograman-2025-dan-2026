import java.util.Scanner;

public class programatm {
    static Scanner scanner = new Scanner(System.in);

    // Validasi nama: hanya huruf dan spasi
    static boolean validasiNama(String nama) {
        return nama.matches("^[a-zA-Z\\s]+$");
    }

    public static void main(String[] args) {
        String nama;
        boolean statusNama = false;
        String nim;
        long saldo = 0;

        // 1 & 2 & 3 — Input dan validasi nama
        do {
            System.out.print("Masukkan Nama: ");
            nama = scanner.nextLine();

            statusNama = validasiNama(nama);
            System.out.println("Status nama: " + statusNama); // TRUE / FALSE

            if (!statusNama) {
                System.out.println("Nama tidak valid! Masukkan lagi.\n");
            }

        } while (!statusNama);

        // 4 & 5 — Input NIM dan konversi ke saldo
        System.out.print("Masukkan NIM (angka saja): ");
        nim = scanner.nextLine();

        try {
            saldo = Long.parseLong(nim); 
        } catch (NumberFormatException e) {
            System.out.println("NIM tidak valid! Saldo diset default 1000000");
            saldo = 1000000;
        }

        // 6 — Tampilkan data awal
        System.out.println("\n=== DATA AWAL ===");
        System.out.println("Nama: " + nama);
        System.out.println("Saldo awal: " + saldo);

        // 7 — Menu ATM (switch-case)
        int pilihan;

        do {
            System.out.println("\n=== MENU ATM ===");
            System.out.println("1. Cek Saldo");
            System.out.println("2. Tarik Tunai");
            System.out.println("3. Setor Tunai");
            System.out.println("4. Keluar");
            System.out.print("Pilih menu: ");

            try {
                pilihan = Integer.parseInt(scanner.nextLine());
            } catch (Exception e) {
                pilihan = 0;
            }

            switch (pilihan) {
                case 1:
                    System.out.println("\nSaldo Anda sekarang: " + saldo);
                    break;

                case 2:
                    System.out.print("\nMasukkan jumlah penarikan: ");
                    long tarik = Long.parseLong(scanner.nextLine());
                    if (tarik > saldo) {
                        System.out.println("Saldo tidak mencukupi!");
                    } else if (tarik <= 0) {
                        System.out.println("Jumlah tidak valid!");
                    } else {
                        saldo -= tarik;
                        System.out.println("Penarikan berhasil! Saldo sisa: " + saldo);
                    }
                    break;

                case 3:
                    System.out.print("\nMasukkan jumlah setoran: ");
                    long setor = Long.parseLong(scanner.nextLine());
                    if (setor <= 0) {
                        System.out.println("Jumlah tidak valid!");
                    } else {
                        saldo += setor;
                        System.out.println("Setoran berhasil! Saldo baru: " + saldo);
                    }
                    break;

                case 4:
                    System.out.println("\nTerima kasih telah menggunakan ATM!");
                    break;

                default:
                    System.out.println("Pilihan tidak valid!");
            }

        } while (pilihan != 4);
    }
}
