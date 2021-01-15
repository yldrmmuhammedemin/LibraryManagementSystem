package Database;

public abstract class VeritabaniBaglantisi {//Polimorfizm

    public void yapanlar(String projeyapanlar) {
        System.out.println("Projeyi Yapanlar:"+projeyapanlar);
    }
    
    public void basarili() {
            System.out.println("Veritabanına Başarıyla Bağlanıldı.");
  
    }
}
