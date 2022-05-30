import java.util.Scanner;

public class AnaMenu implements AnaMenuInterface{

   String scm ="";
   static Scanner scan = new Scanner(System.in);
   static Islemler islemler = new Islemler();


    void giris(){

        System.out.println("Okul Projesi");
        System.out.println("lütfen seçim yapınız");
        System.out.println("1-ogrenci isleri 2- ogretmen isleri Qcikis");

        scm = scan.next().toUpperCase();

        switch (scm){
            case "1":
                ogrenciIslemleri();
                break;

            case "2":
                ogretmenIslemleri();
                break;

            case "Q":
                cikis();
                break;

        }





    }




    @Override
    public void ogrenciIslemleri() {
        islemler.islemler(1);

    }

    @Override
    public void ogretmenIslemleri() {
        islemler.islemler(2);
    }

    @Override
    public void cikis() {
        System.exit(0);
    }
}
