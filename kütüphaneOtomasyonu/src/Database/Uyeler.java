package Database;

public class Uyeler {

    private int KütüphaneId;
    private String AdSoyad;
    private String Cinsiyet;
    private String TcKimlikNo;
    private String TelefonNo;

    public int getKütüphaneId() {
        return KütüphaneId;
    }

    public void setKütüphaneId(int KütüphaneId) {
        this.KütüphaneId = KütüphaneId;
    }

    public String getAdSoyad() {
        return AdSoyad;
    }

    public void setAdSoyad(String AdSoyad) {
        this.AdSoyad = AdSoyad;
    }

    public String getCinsiyet() {
        return Cinsiyet;
    }

    public void setCinsiyet(String Cinsiyet) {
        this.Cinsiyet = Cinsiyet;
    }

    public String getTcKimlikNo() {
        return TcKimlikNo;
    }

    public void setTcKimlikNo(String TcKimlikNo) {
        this.TcKimlikNo = TcKimlikNo;
    }

    public String getTelefonNo() {
        return TelefonNo;
    }

    public void setTelefonNo(String TelefonNo) {
        this.TelefonNo = TelefonNo;
    }

    public Uyeler(int KütüphaneId, String AdSoyad, String Cinsiyet, String TcKimlikNo, String TelefonNo) {
        this.KütüphaneId = KütüphaneId;
        this.AdSoyad = AdSoyad;
        this.TcKimlikNo = TcKimlikNo;
        this.Cinsiyet = Cinsiyet;
        this.TelefonNo = TelefonNo;
    }
}
