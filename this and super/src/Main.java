
 class ustSinif {
     int id;
     /* id identifier den geliryani kimlik anlamina gelir
     programda veriyi veya kaydi benzersiz sekilde tanimlamak
     icin kullanilir
      */
     String ad;

     //ustsinif yapilandiricisi//
     ustSinif(int id, String ad) {
         this.id = id;
         this.ad = ad;
     }
     /* ust sinif olusturduk ve this kullanarak bu
     ust sinif alt siniftan ad e id ceker
      */
 }
    class altSinif extends ustSinif{
    /* extends aslinda kaliitm miras alma
    kullanma sebebimiz java da bir sinifin
    baska bir siniftan turetilebilmesini saglar
    altsinif ustsinifin tum ozelliklerini ve
    metodlarini miras alir yani altsinif
    ust sinifin id ve ad ozelliklerini kullanabilir
     */
    float maas;
    altSinif(int id,String ad ,float maas){
        super(id,ad);
        this.maas=maas;
        /* superi neden kullandik cunku
        id ve ad alt sinifada gostermek icin ve superin 3 farkli kullanimi
        super(): Üst sınıfın yapıcı fonksiyonunu çağırmak için kullanılır.
        super.özellik: Üst sınıftaki bir özelliğe erişmek için kullanılır,
        genelllikle ayni isimdeki alt sinif ozelliginden ayirmak icin
        super.metod(): Üst sınıftaki bir metodu çağırmak için kullanılır

         */
    }
    void mesaj(){
        System.out.println(id+" "+ad+" "+ maas);
    }
}
class Yapfonk{
    public static void main (String[]args){
        altSinif kisi1= new altSinif(1,"nisa nur",40000f);
        altSinif kisi2= new altSinif(2,"hayriye",3000f);
        kisi1.mesaj();
        kisi2.mesaj();

    }
    /* constructor da this ve super methodlari da var
    dir this methodu bilgiyi cekebilmemk icin bilinmesi
    gerekiyor benim fikrimce super i diger dillerde hic
    rastladigimi hatirlamiyorum ama thisi sıklıkla
    karsilastigimi soyleyebilirim
     */
}