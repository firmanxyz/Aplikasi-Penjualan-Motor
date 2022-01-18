package Controler;
import Sql.koneksisql;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;

public class dbmotor {
    Connection conn = null;
    ResultSet rs = null;
    PreparedStatement pst = null;
    
    private String sql;
    public  String idmotor;
    public  String merek;
    public  String tipe;
    public  String warna;
    public  String kapasitas;
    public  String harga;
    public  String tersedia;
    
    public void simpan()throws SQLException{
        conn = koneksisql.getKoneksi();
        sql ="INSERT INTO motordb(idmotor,merek,tipe,warna,kapasitas,harga,tersedia)VALUE(?,?,?,?,?,?,?)";
        pst = conn.prepareStatement(sql);
        pst.setString(1, idmotor);
        pst.setString(2, merek);
        pst.setString(3, tipe);
        pst.setString(4, warna);
        pst.setString(5, kapasitas);
        pst.setString(6, harga);
        pst.setString(7, tersedia);
        pst.execute();
        pst.close();
    }
    public ResultSet UpdateJTable()throws SQLException{
        conn = koneksisql.getKoneksi();
        sql = "select*from motordb";
        pst = conn.prepareStatement(sql);
        rs=pst.executeQuery();
        return rs;
    }
    public void hapus()throws SQLException{
        conn = koneksisql.getKoneksi();
        String sql="delete from motordb where idmotor=?";
        try {
            pst = conn.prepareStatement(sql);
            pst.setString(1, idmotor);
            pst.execute();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }
    }
    public void edit()throws SQLException{
        conn = koneksisql.getKoneksi();
        String sql ="Update motordb set merek=?, tipe=?, warna=?, kapasitas=?, harga=?, tersedia=? where idmotor=?";
        pst = conn.prepareStatement(sql);
        pst.setString(1, merek);
        pst.setString(2, tipe);
        pst.setString(3, warna);
        pst.setString(4, kapasitas);
        pst.setString(5, harga);
        pst.setString(6, tersedia);
        pst.setString(7, idmotor);
        pst.executeUpdate();
        pst.close(); 
    }
}
