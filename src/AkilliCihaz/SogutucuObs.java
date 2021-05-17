package AkilliCihaz;

public class SogutucuObs implements IObserver {

    @Override
    public void update(String message) {
        if(message.equals("Sogutucu Ac"))
            System.out.println("Abone'ye gelen mesaj:Soğutucu açılma bilgisi veritabanına kaydedildi.");

    }

}
