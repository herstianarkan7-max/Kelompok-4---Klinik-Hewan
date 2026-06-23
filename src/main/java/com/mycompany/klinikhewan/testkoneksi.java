/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.klinikhewan;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class testkoneksi {
    
    private static Connection koneksi;
    
    public static Connection getKoneksi() {
        if (koneksi == null) {
            try {
                String url = "jdbc:mysql://localhost:3306/klinik_hewan";
                String user = "root";
                String password = "";
                
                koneksi = DriverManager.getConnection(url, user, password);

                System.out.println("Koneksi ke Database Berhasil!"); 
                
            } catch (SQLException e) {
                System.out.println("Koneksi Gagal: " + e.getMessage());
            }
        }
        return koneksi;
    }
    public static void main(String[] args) {
        getKoneksi();
    }
}