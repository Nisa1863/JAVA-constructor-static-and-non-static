public class Main {

    // Static iç sınıf
    static class Yapfonk {
        // static sinif olusturduk//
        double PI;
        double r;

        public Yapfonk() {
            PI = 3.14;
            r = 4;
        }

        public Yapfonk(double pi, double yaricap) {
            PI = pi;
            r = yaricap;
        }

        double Alan() {
            return PI * r * r;
        }
    }

    public static void main(String[] args) {
        Yapfonk fd = new Yapfonk();   // Dış sınıf örneğine gerek kalmadan isi hallettik//
        Yapfonk fd2 = new Yapfonk(3.14, 5);

        System.out.println("Yarıçapı 4 cm olan dairenin alanı: " + fd.Alan());
        System.out.println("Yarıçapı 5 cm olan dairenin alanı: " + fd2.Alan());
    }
}
