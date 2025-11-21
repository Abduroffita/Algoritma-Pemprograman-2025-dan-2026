package pertemuan_7;
import java.util.Scanner;

public class nilai7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Masukan nilai tugas:");
        double tugas = sc.nextDouble();
        System.out.print("Masukan nilai uts:");
        double uts = sc.nextDouble();
        System.out.print("Masukan nilai uas:");
        double uas = sc.nextDouble();

        double nilaiAkhir = (0.3 * tugas) + (0.35 * uts) + (0.4 * uas);

        System.out.println("Nilai Akhir: " + nilaiAkhir);
        if (nilaiAkhir >= 60) {
            System.out.println("Status: Lulus!");
        } else {
            System.out.println("Status: Tidak Lulus.");
        }

    }
}