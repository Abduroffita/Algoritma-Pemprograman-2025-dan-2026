public class operator_unary {
    public static void main(String[] args) {
        // unary + dan -
        int nomor = 1;
        System.out.println(-nomor);
        System.out.println(+nomor);

        // Unary decrement dan increment
        int angka = 5;
        angka++; //angka = angka + 1
        System.out.println(angka);
       
        int angka2 = 15;
        angka2--; //angka2 = angka2 - 1
        System.out.println(angka2);

        // Unary prefix dan postfix
        int a = 6;
        System.out.println(++a); //prefix = Di eksekusi dulu baru ditampilkan

        int b = 6;
        System.out.println(b++); //postfix = Ditampilkan dulu baru dieksekusi //System.out.println(b);

        // unary boolean dengan ! untuk negasi
        boolean assalamualaikum = true;
        System.out.println(assalamualaikum);
        System.out.println(!assalamualaikum);

    }
}
