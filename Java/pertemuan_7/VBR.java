public class VBR {
    public static void main(String[] args) {
        // volume kubus
        int s1 = 6;
        int s2 = 6;
        int s3 = 6;
        int VKubus = s1 * s2 * s3;
        System.out.println(VKubus);
        // volume balok
        int p = 10;
        int l = 5;
        int t = 8;
        int VBalok = p * l * t;
        System.out.println(VBalok);
        // p volume prisma segitiga
        int LAlas = 8;
        int t1 = 8;
        int VPrismaSegitiga = LAlas * t1;
        System.out.println(VPrismaSegitiga);
        // volume tabung
        int r1 = 7;
        int r2 = 4;
        int t2 = 5;
        double VTabung = 22.0/7.0 * r1 * r2 * t2;
        System.out.println(VTabung);
        // volume bola
        int R1 = 3;
        int R2 = 4;
        int R3 = 7;
        double VBola = 4.0/3.0 * 22.0/7.0 * R1 * R2 * R3;
        System.out.println(VBola);
        // volume limas
        int Lalas = 6;
        int T = 9;
        double VLimas = 1.0/3.0 * Lalas * T;
        System.out.println(VLimas);
    }
}
