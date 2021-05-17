package AkilliCihaz;

import java.util.Random;


public class SicaklikOlcer {
    Random rand=new Random();
    int sicaklik;
    int sayac=0;
    public int sicaklikOlc() {
        if(sayac==0) {
            sicaklik=rand.nextInt(50-10) + 10;
            sayac++;
            return sicaklik;
        }
        else {
            return sicaklik;
        }
    }

}
