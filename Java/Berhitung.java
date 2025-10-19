import java.util.Scanner;

public class Berhitung {

    public static void main(String[] args) {
        final double PI = 3.14159;
        Scanner sc = new Scanner(System.in);
        System.out.print("Masukkan jari-jari: ");
        double r = sc.nextDouble();
        double luas = PI * r * r;
        System.out.println("Luas lingkaran: " + luas);
        
        sc.close();
    }
}
