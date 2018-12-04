/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package main;

import com.mysql.jdbc.Driver;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

/**
 *
 * @author Dreizehn
 */
public class aksicrud {
    
    public aksicrud() {
        koneksi();
    }
    
    private Connection connection;
    
    private void koneksi(){
                String DB="jdbc:mysql://localhost/becek"; 
                String user="root";
                String pass="";
        try {
            DriverManager.registerDriver(new Driver());
            connection = (Connection) DriverManager.getConnection(DB,user,pass);
            if(connection!=null){
                System.out.println("konek");
            }
        } catch (SQLException ex) {
            System.out.println(ex);
        }
    }
    //tampilkan data
    public String getData(){
        String data="";
        try {
            Statement statement = connection.createStatement();
            ResultSet rs = statement.executeQuery("SELECT * FROM baper");
            while(rs.next()){
                  data+=rs.getInt(1)+","+rs.getString(2)+","+rs.getString(3)+","+rs.getString(4)+"-";
            }
        } catch (SQLException ex) {
            System.out.println(ex);
        }
        return data;
    }
    
    public String insertData(String nama,String alamat,String status){
        String sql = "insert into baper values (null,?,?,?)";
        String value="";
        try {
            PreparedStatement statement = connection.prepareStatement(sql);
            statement.setString(1, nama);
            statement.setString(2, alamat);
            statement.setString(3, status);
            int rowsInserted = statement.executeUpdate();
                if (rowsInserted > 0) {
                    value="Berhasil";
                }else {
                    value="Gagal";
                }
        } catch (SQLException ex) {
            System.out.println(ex);
        }
        return value;
    }
    
    public String updateData(String nama,String alamat,String status,String id){
        String sql = "UPDATE baper SET nama=?, stb=?, status=? where id=?";
        String value="";
        try {
            PreparedStatement statement = connection.prepareStatement(sql);
            statement.setString(1, nama);
            statement.setString(2, alamat);
            statement.setString(3, status);
            statement.setString(4, id);
            int rowsInserted = statement.executeUpdate();
                if (rowsInserted > 0) {
                    value="Berhasil";
                }else {
                    value="Gagal";
                }
        } catch (SQLException ex) {
            System.out.println(ex);
        }
        return value;
    }
    
    public String deleteData(String id){
        String sql = "DELETE FROM baper where id=?";
        String value="";
        try {
            PreparedStatement statement = connection.prepareStatement(sql);
            statement.setString(1, id);
            int rowsInserted = statement.executeUpdate();
                if (rowsInserted > 0) {
                    value="Berhasil";
                }else {
                    value="Gagal";
                }
        } catch (SQLException ex) {
            System.out.println(ex);
        }
        return value;
    }
    public static void main(String[] args) {
        aksicrud ak = new aksicrud();
        System.out.println(ak.getData());
    }
}
