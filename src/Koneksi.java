/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

import java.sql.Connection;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.sql.DriverManager;
import java.sql.SQLException;
/**
 *
 * @author SMKI Utama7
 */
public class Koneksi {   
    public static Connection Koneksi;
    public static Connection getKoneksi(){
        // Cek Apakah Koneksi Null?
        if (Koneksi == null)
        {
            try {
                String url = "jdbc:mysql://localhost:3306/db_penjualan_barang_pas_xiib";
                String user = "root";
                String password = "";
                DriverManager.registerDriver(new com.mysql.cj.jdbc.Driver());
                Koneksi = DriverManager.getConnection(url, user, password);
                System.out.print("Berhasil Membuat Koneksi");
            } catch (SQLException t) {
                System.out.println("Error Membuat Koneksi");
            }
        }
        return Koneksi;
    }
}
