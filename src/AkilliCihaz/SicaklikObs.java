package AkilliCihaz;

public class SicaklikObs implements IObserver {

    @Override
    public void update(String message) {
        if(message.equals("Sicaklik Goster")) {
            System.out.println("Abone'ye gelen mesaj:Sıcaklık değeri veritabanına kaydedildi.");
        }

    }

}
