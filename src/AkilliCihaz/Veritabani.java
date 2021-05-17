package AkilliCihaz;

import java.sql.*;

public class Veritabani {
   static String url = "jdbc:postgresql://localhost:5432/AkilliCihaz";
   static Connection con;

    static void baglan(){
        try{
            con = DriverManager.getConnection(url,"postgres","123sevdet");

        }
        catch(SQLException e){
            e.printStackTrace();
        }
    }
    static ResultSet listele(String sorgu){
        try{
            Statement st= con.createStatement();
            ResultSet rs= st.executeQuery(sorgu);
            return rs;
        }
        catch(SQLException e){
            e.printStackTrace();
            return null;
        }
    }
}
