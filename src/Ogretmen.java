import java.util.HashMap;
import java.util.Map;

public class Ogretmen extends Kisi{

    static Map<String,Ogretmen> ogretmenListesiMap = new HashMap<>();


    private String bolum ="girilmedi";
    private String sicil ="girilmedi";

    public Ogretmen() {
    }

    public Ogretmen(String ad, String soyAd, String yas, String bolum, String sicil) {
        super(ad, soyAd, yas);
        this.bolum = bolum;
        this.sicil = sicil;
    }

    public String getBolum() {
        return bolum;
    }

    public void setBolum(String bolum) {
        this.bolum = bolum;
    }

    public String getSicil() {
        return sicil;
    }

    public void setSicil(String sicil) {
        this.sicil = sicil;
    }

    @Override
    public String toString() {
        return "Ogretmen{" +
                "bolum='" + bolum + '\'' +
                ", sicil='" + sicil + '\'' +
                "} " + super.toString();
    }
}
