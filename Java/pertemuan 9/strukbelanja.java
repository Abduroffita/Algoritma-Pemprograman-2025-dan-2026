import java.util.Scanner;

public class strukbelanja {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Masukkan nama barang: ");
        String nama = input.next();
        System.out.print("Masukkan harga barang: ");
        float harga = input.nextFloat();
        System.out.print("Masukkan jumlah beli: ");
        int jumlah = input.nextInt();

        float total = harga * jumlah;
<<<<<<< HEAD
        float diskon = (total > 73600) ? total * 0.6f : 0;
=======
        float diskon = (total > 736000) ? total * 0.6f : 0;
>>>>>>> 15a9a4ae9472e481a9aaa768f5a9b5a8ceb84a7a
        float totalBayar = total - diskon;

        System.out.println("\n===== STRUK PEMBELIAN =====");
        System.out.println("Nama Barang   : " + nama);
        System.out.println("Harga Satuan  : " + harga);
        System.out.println("Jumlah Beli   : " + jumlah);
        System.out.println("Total Harga   : " + total);
        System.out.println("Diskon        : " + diskon);
        System.out.println("Total Bayar   : " + totalBayar);
    }
}
