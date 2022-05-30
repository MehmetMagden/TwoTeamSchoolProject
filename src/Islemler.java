import java.util.Scanner;

public class Islemler implements IslemlerInterface{

    static  Scanner scan = new Scanner(System.in);
    String scm ="";
    static int secim =0;

    void islemler(int i){
        secim=i;
        System.out.println("islemler");
        System.out.println("1-ekleme 2-arama 3-listeleme 4-silme 5-anaMenu Q-cikis");

        scm = scan.next();

        switch (scm){

            case "1":
                ekleme();
                islemler(secim);
                break;
            case "2":
                arama();
                islemler(secim);
                break;
            case "3":
                listeleme();
                islemler(secim);
                break;
            case "4":
                silme();
                islemler(secim);
                break;
            case "5":
                anaMenu();
                islemler(secim);
                break;
            case "Q":
                cikis();
                islemler(secim);
                break;
            default:
                System.out.println("lütfengeçerli bir giriş yapınız");
                islemler(secim);


        }





    }







    @Override
    public void ekleme() {
        if(secim==1){
            ogrenciEkleme();
        }else if(secim==2){
            ogretmenEkleme();
        }


    }

    private void ogrenciEkleme() {
        System.out.println("KimlikID?");
        String kimlikID = scan.next();
        System.out.println("ad?");
        String ad = scan.next();
        System.out.println("soyad?");
        String soyAd = scan.next();
        System.out.println("yas?");
        String yas = scan.next();
        System.out.println("numara?");
        String numara = scan.next();
        System.out.println("sinif?");
        String sinif = scan.next();

        Ogrenci ogrenci = new Ogrenci(ad,soyAd,yas,numara,sinif);
        Ogrenci.ogrenciListesiMap.put(kimlikID,ogrenci);

    }

    private void ogretmenEkleme() {

        System.out.println("KimlikID?");
        String kimlikID = scan.next();
        System.out.println("ad?");
        String ad = scan.next();
        System.out.println("soyad?");
        String soyAd = scan.next();
        System.out.println("yas?");
        String yas = scan.next();
        System.out.println("bolum?");
        String bolum = scan.next();
        System.out.println("sicil?");
        String sicil = scan.next();

        Ogretmen ogretmen = new Ogretmen(ad,soyAd,yas,bolum,sicil);
        Ogretmen.ogretmenListesiMap.put(kimlikID,ogretmen);




    }

    @Override
    public void arama() {
        System.out.println("KimlikID?");
        String kimlikID = scan.next();

        if(secim==1 && Ogrenci.ogrenciListesiMap.containsKey(kimlikID)){
            System.out.println(Ogrenci.ogrenciListesiMap.get(kimlikID));
        }else if ( secim==2 && Ogretmen.ogretmenListesiMap.containsKey(kimlikID)){
            System.out.println(Ogretmen.ogretmenListesiMap.get(kimlikID));
        }else {
            System.out.println("Girilen id mevcut değil");
            islemler(secim);
        }


    }

    @Override
    public void listeleme() {

        if( secim==1){
            System.out.println(Ogrenci.ogrenciListesiMap.toString());
        }else if ((secim==2)){
            System.out.println(Ogretmen.ogretmenListesiMap.toString());
        }


    }

    @Override
    public void silme() {

        System.out.println("KimlikID?");
        String kimlikID = scan.next();

        if(secim==1 && Ogrenci.ogrenciListesiMap.containsKey(kimlikID)){
            System.out.println(Ogrenci.ogrenciListesiMap.remove(kimlikID));
        }else if ( secim==2 && Ogretmen.ogretmenListesiMap.containsKey(kimlikID)){
            System.out.println(Ogretmen.ogretmenListesiMap.remove(kimlikID));
        }else {
            System.out.println("Girilen id mevcut değil");
            islemler(secim);
        }



    }

    @Override
    public void anaMenu() {
        AnaMenu anaMenu = new AnaMenu();
        anaMenu.giris();

    }

    @Override
    public void cikis() {
        System.exit(0);

    }
}
