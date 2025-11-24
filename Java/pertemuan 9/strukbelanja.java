import java.util.Scanner;

public class StrukBelanja {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Masukkan nama barang: ");
        String nama = input.next();
        System.out.print("Masukkan harga barang: ");
        float harga = input.nextFloat();
        System.out.print("Masukkan jumlah beli: ");
        int jumlah = input.nextInt();

        float total = harga * jumlah;
        float diskon = (total > 100000) ? total * 0.10f : 0;
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
