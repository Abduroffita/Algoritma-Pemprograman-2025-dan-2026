import java.util.Scanner;
public class kalkulator{
        public static void main(String[] args) {
        //a. statis
        Scanner Input = new Scanner(System.in);
        System.out.print("Masukkan nomor1: ");
        int nomor1 = Input.nextInt();
        System.out.print("Masukkan nomor2: ");
        int nomor2 = Input.nextInt();
        System.out.println(nomor1 * nomor2);
        //b. dinamis
        char operator;
        double Nomor1, Nomor2;
        Scanner input = new Scanner(System.in);

        System.out.println("Masukan operator (+-*/'%')=");
        operator = input.next().charAt(0);

        System.out.println("Masukan Nomor1 =");
        Nomor1 = input.nextDouble();
        System.out.println("Masukan Nomor2 =");
        Nomor2 = input.nextDouble();

        input.close();
        
        switch (operator) {
            case '+':
                System.out.println(Nomor1 + Nomor2);
                break;

            case '-':
                System.out.println(Nomor1 - Nomor2);
                break;

            case '*':
                System.out.println(Nomor1 * Nomor2);
                break;

            case '/':
                System.out.println(Nomor1 / Nomor2);
                break;

            case '%':
                System.out.println(Nomor1 % Nomor2);
                break;

            default:
                System.out.println("Error! operator salah");
                break;
        }

}
}