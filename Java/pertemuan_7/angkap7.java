import java.util.Scanner;

public class angkap7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Masukan angka pertama:");
        int a = sc.nextInt();
        System.out.print("Masukan angka kedua:");
        int b = sc.nextInt();

        if(a > b) 
            System.out.println(a + " lebih besar dari " + b);
         else if (a < b) 
            System.out.println(a + " lebih kecil dari " + b);
         else 
            System.out.println("Kedua angka sama.");

        System.out.println("Apakah keduanya sama? " + (a == b));
    }
}
