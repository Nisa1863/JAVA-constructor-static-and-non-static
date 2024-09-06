public class Main {

    // Daireyi temsil eden sınıf
    class Yapfonk {
        double PI;
        double r;

        // Parametresiz yapıcı fonksiyon
        public Yapfonk() {
            PI = 3.14;
            r = 4; // Varsayılan yarıçap 4 cm
        }

        // Parametreli yapıcı fonksiyon
        public Yapfonk(double pi, double yaricap) {
            PI = pi;
            r = yaricap;
        }

        // Alanı hesaplayan fonksiyon
        double Alan() {
            return PI * r * r;
        }
    }

    public static void main(String[] args) {
        System.out.println("TEST İŞLEMİ");

        // Parametresiz yapıcı fonksiyon ile nesne oluşturma
        Main mainObj = new Main();//dis sinif nesnesi//
        Yapfonk fd = mainObj.new Yapfonk();//ic sinif nesnesi//
        /*burada non static olusturduk yani bir dis sinif olusturduk
        ve bu dis sinif ic sinifa bagli oldugundan kodumuza ic sinifa
        entegre ettik entegre ettigimiz yapi ise mainObj yeni bir dis
        sinif olusturmus olduk
         */

        // Parametreli yapıcı fonksiyon ile nesne oluşturma
        Yapfonk fd2 = mainObj.new Yapfonk(3.14, 5);

        // Alan hesaplamaları
        System.out.println("Yarıçapı 4 cm olan dairenin alanı: " + fd.Alan());
        System.out.println("Yarıçapı 5 cm olan dairenin alanı: " + fd2.Alan());
    }
    /* bir sonraki kodda ayni ornegi static yani
    ic sinif ile nasil olusturulur yaptim ben tercihen
    ic sinif olusturma taraftariyim ama hatirlamadin ve
    dis sinif olusturman gerekti bu kod umarim yardimci olur
     */

}