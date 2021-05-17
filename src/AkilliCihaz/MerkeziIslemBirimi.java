package AkilliCihaz;

public class MerkeziIslemBirimi implements IMerkeziIslemBirimi {
    Publisher p=new Publisher();
    SicaklikOlcer sc=new SicaklikOlcer();
    Eyleyici ey=new Eyleyici();
    SicaklikObs sicaklikBilgi=new SicaklikObs();
    SogutucuObs sogutucuBilgi=new SogutucuObs();
    String sogutucu="Sogutucu Ac";
    String sicaklik="Sicaklik Goster";
    int derece;
    String sogutucuDurumu="kapali";




    public MerkeziIslemBirimi() {
        p.attach(sicaklikBilgi);
        p.attach(sogutucuBilgi);
    }

    @Override

    public void sicaklikGetir() {
        derece=sc.sicaklikOlc();
        System.out.println("Sıcaklık Değeri:"+derece+" Derece");
        p.notify(String.valueOf(sicaklik));
    }
    @Override
    public void sogutucuAc() {

        try
        {
            Thread.sleep(1200);
        }
        catch(InterruptedException ex)
        {
            Thread.currentThread().interrupt();
        }
        if(sogutucuDurumu.equals("kapali")) {
            System.out.println("Soğutucu Açılıyor.");
            ey.sogutucuCalistir();
            p.notify(sogutucu);
            sogutucuDurumu="acik";
            sc.sicaklik=(sc.sicaklik+10)/2;
        }
        else {
            System.out.println("Soğutucu Zaten Açık.");
        }

    }
    @Override
    public void sogutucuKapa() {

        try
        {
            Thread.sleep(1200);
        }
        catch(InterruptedException ex)
        {
            Thread.currentThread().interrupt();
        }
        if(sogutucuDurumu.equals("acik")) {
            System.out.println("Soğutucu Kapatılıyor.");
            ey.sogutucuKapat();

            sogutucuDurumu="kapali";
        }
        else {
            System.out.println("Soğutucu Zaten Kapalı.");
        }


    }
}
