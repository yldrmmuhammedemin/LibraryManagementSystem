package Database;

public class Kitaplar {//Encapsulation Metodu Get-Set Örnekleri

    private String KitapAdı;
    private int KitapNo;
    private String Yazar;
    private String Yayınevi;
    private int SayfaSayısı;

    public Kitaplar(String KitapAdı, int KitapNo, int SayfaSayısı, String Yazar, String Yayınevi) {
        this.KitapAdı = KitapAdı;
        this.KitapNo = KitapNo;
        this.Yazar = Yazar;
        this.Yayınevi = Yayınevi;
        this.SayfaSayısı = SayfaSayısı;
    }

    public String getKitapAdı() {
        return KitapAdı;
    }

    public void setKitapAdı(String KitapAdı) {
        this.KitapAdı = KitapAdı;
    }

    public int getKitapNo() {
        return KitapNo;
    }

    public void setKitapNo(int KitapNo) {
        this.KitapNo = KitapNo;
    }

    public String getYazar() {
        return Yazar;
    }

    public void setYazar(String Yazar) {
        this.Yazar = Yazar;
    }

    public String getYayınevi() {
        return Yayınevi;
    }

    public void setYayınevi(String Yayınevi) {
        this.Yayınevi = Yayınevi;
    }

    public int getSayfaSayısı() {
        return SayfaSayısı;
    }

    public void setSayfaSayısı(int SayfaSayısı) {
        this.SayfaSayısı = SayfaSayısı;
    }
}
