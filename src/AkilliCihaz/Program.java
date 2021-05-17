package AkilliCihaz;


import java.sql.ResultSet;
import java.sql.SQLException;

public class Program {


    public static void main(String[] args) throws SQLException {
        Veritabani veri=new Veritabani();
        veri.baglan();

        Kullanici kullanici1=new Kullanici.KullaniciBuilder("Sevdet","123")
                .build();


        String[] kullanici=new String[10];
        String[] sifre=new String[10];
        String sorgu="select * from kullanicilar";
        ResultSet rs=veri.listele(sorgu);
        int girisSayac=0;
        int sayac=0;
        while(rs.next()){
            kullanici[sayac]=rs.getString("kullanici");
            sifre[sayac]=rs.getString("sifre");

            sayac++;
        }
        while(girisSayac==0){
            kullanici1.girisAl();
            if(kullanici1.isim.equals(kullanici[0]) && kullanici1.sifre.equals(sifre[0])){
                System.out.println("Giriş Başarılı!");
                girisSayac++;
            }
            else if(kullanici1.isim.equals(kullanici[1]) && kullanici1.sifre.equals(sifre[1])){
                System.out.println("Giriş Başarılı!");
                girisSayac++;
            }
            else{
                System.out.println("Giriş Başarısız Tekrardan Giriniz.");
            }
        }

        AkilliCihaz c1=new AkilliCihaz();

        c1.basla();

        return;
    }

}
