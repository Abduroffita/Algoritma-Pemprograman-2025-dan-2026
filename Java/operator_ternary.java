import java.util.Scanner;

public class operator_ternary {

    public static void main(String[] args) {
        // operator ternary
        double input, x;
    
        Scanner inputUser = new Scanner(System.in);

        System.out.print("Masukkan nilai : ");

        input = inputUser.nextInt();

        x = (input == 10) ? (input*input) : (input/2);

        System.out.println("Hasilnya : " + x);

        inputUser.close();

    }
}
