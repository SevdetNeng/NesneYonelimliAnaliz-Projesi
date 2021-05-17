package AkilliCihaz;

import java.util.Scanner;

public class Kullanici {
    public String isim;
    public String sifre;
    public String soyad;

    public Kullanici(KullaniciBuilder builder){
        this.isim=builder.isim;
        this.sifre=builder.sifre;
        this.soyad=builder.soyad;
    }
    public void girisAl(){
        System.out.println("Kullanıcı Adınızı Giriniz:");
        Scanner sc=new Scanner(System.in);
        isim=sc.next();
        System.out.println("Şifrenizi Giriniz:");
        sifre=sc.next();
    }
    public String getKullanici(){
        return isim;
    }
    public String getSifre(){
        return sifre;
    }

   public static class KullaniciBuilder {
        public String isim;
        public String sifre;
        public String soyad;

        public KullaniciBuilder(String isim,String sifre){
            this.isim=isim;
            this.sifre=sifre;

        }
        public KullaniciBuilder Soyad(String soyad) {
            this.soyad=soyad;
            return this;
        }
        public Kullanici build(){
            return new Kullanici(this);
        }
    }
}


