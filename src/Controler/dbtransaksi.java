package Controler;
import Sql.koneksisql;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;

public class dbtransaksi {
    Connection conn = null;
    ResultSet rs = null;
    PreparedStatement pst = null;
    
    private String sql;
    public  String idmotor;
    public  String totalharga;
    public  String nama;
    public  String nomorhp;
    public  String alamat;
    public  String statuspembayaran;
    public  String tersedia;
    
    public void simpan()throws SQLException{
        conn = koneksisql.getKoneksi();
        sql ="INSERT INTO transaksidb(idmotor,total_harga,nama,nomor_hp,alamat,status_pembayaran)VALUE(?,?,?,?,?,?)";
        pst = conn.prepareStatement(sql);
        pst.setString(1, idmotor);
        pst.setString(2, totalharga);
        pst.setString(3, nama);
        pst.setString(4, nomorhp);
        pst.setString(5, alamat);
        pst.setString(6, statuspembayaran);
        pst.execute();
        pst.close();
    }
    public ResultSet UpdateJTable()throws SQLException{
        conn = koneksisql.getKoneksi();
        sql = "select*from transaksidb";
        pst = conn.prepareStatement(sql);
        rs=pst.executeQuery();
        return rs;
    }
        public void hapus()throws SQLException{
        conn = koneksisql.getKoneksi();
        String sql="delete from transaksidb where idmotor=?";
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
        String sql ="Update transaksidb set total_harga=?, nama=?, nomor_hp=?, alamat=?, status_pembayaran=? where idmotor=?";
        pst = conn.prepareStatement(sql);
        pst.setString(1, totalharga);
        pst.setString(2, nama);
        pst.setString(3, nomorhp);
        pst.setString(4, alamat);
        pst.setString(5, statuspembayaran);
        pst.setString(6, idmotor);
        pst.executeUpdate();
        pst.close(); 
    }
    public void ubah()throws SQLException{
        conn = koneksisql.getKoneksi();
        String sql ="Update motordb set tersedia=? where idmotor=?";
        pst = conn.prepareStatement(sql);
        pst.setString(1, tersedia);
        pst.setString(2, idmotor);
        pst.executeUpdate();
        pst.close(); 
    }
}
