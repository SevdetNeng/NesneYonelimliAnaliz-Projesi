package AkilliCihaz;
import java.util.Scanner;

public class AkilliCihaz implements IAkilliCihaz {
    MerkeziIslemBirimi mib=new MerkeziIslemBirimi();

    public static boolean isNumeric(String str) {
        try {
            Double.parseDouble(str);
            return true;
        } catch(NumberFormatException e){
            return false;
        }
    }

    public void basla() {
        int secim=0;
        String secimMetin;

        int cikis=0;
        do {
            System.out.println("Lütfen aşağıdaki menüden numarasına göre komut seçimi yapınız.");
            System.out.println("1.Sıcaklık Göster");
            System.out.println("2.Soğutucuyu Aç");
            System.out.println("3.Soğutucuyu Kapat");
            System.out.println("4.Çıkış");
            Scanner sc=new Scanner(System.in);
            secimMetin=sc.next();
            if(!isNumeric(secimMetin)) {
                System.out.println("Lütfen 1-4 arasında rakam girişi yapınız.");
                try
                {
                    Thread.sleep(1500);
                }
                catch(InterruptedException ex)
                {
                    Thread.currentThread().interrupt();
                }
                continue;
            }


            if(Integer.valueOf(secimMetin) < 0 || Integer.valueOf(secimMetin)>4  ) {
                System.out.println("Seçim değeri 1 ile 4 arasında olmalıdır.");
                try
                {
                    Thread.sleep(1500);
                }
                catch(InterruptedException ex)
                {
                    Thread.currentThread().interrupt();
                }
                continue;
            }


            switch(Integer.valueOf(secimMetin)) {
                case 1:

                    mib.sicaklikGetir();
                    break;
                case 2:

                    mib.sogutucuAc();
                    break;

                case 3:
                    mib.sogutucuKapa();
                    break;
                case 4:
                    System.out.println("Akıllı Cihaz Kapatılıyor...");

                    cikis=1;
            }


        }
        while(cikis==0);
        return;

    }
}
