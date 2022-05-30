public class Kisi {

    private String ad ="girilmedi";
    private String soyAd ="girilmedi";
    private String Yas ="girilmedi";

    public Kisi() {
    }

    public Kisi(String ad, String soyAd, String yas) {
        this.ad = ad;
        this.soyAd = soyAd;
        Yas = yas;
    }

    public String getAd() {
        return ad;
    }

    public void setAd(String ad) {
        this.ad = ad;
    }

    public String getSoyAd() {
        return soyAd;
    }

    public void setSoyAd(String soyAd) {
        this.soyAd = soyAd;
    }

    public String getYas() {
        return Yas;
    }

    public void setYas(String yas) {
        Yas = yas;
    }

    @Override
    public String toString() {
        return "Kisi{" +
                "ad='" + ad + '\'' +
                ", soyAd='" + soyAd + '\'' +
                ", Yas='" + Yas + '\'' +
                '}';
    }
}
