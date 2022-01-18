package Sql;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import javax.swing.JOptionPane;

public class koneksisql {
    private static Connection koneksi;
    public static Connection getKoneksi(){
        if(koneksi==null){
            try{
            String url;
            url="jdbc:mysql://localhost:3306/sorumdb";
            String username = "root";
            String password ="";
            DriverManager.registerDriver(new com.mysql.jdbc.Driver());
            koneksi = DriverManager.getConnection(url,username,password);
            }catch (SQLException t){
                 JOptionPane.showMessageDialog(null,"tidak bisa masuk");

         }
    }return  koneksi;
    }static Object getConnection(){
        throw new UnsupportedOperationException("blm di implementasi mamank");
    }
}


