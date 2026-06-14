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
                
                // Pesan ini akan muncul jika koneksi sukses
                System.out.println("Koneksi ke Database Berhasil!"); 
                
            } catch (SQLException e) { // Ini pasangan dari 'try' di atas
                System.out.println("Koneksi Gagal: " + e.getMessage());
            }
        }
        return koneksi; // Mengembalikan nilai koneksinya
    }
    
    // --- TAMBAHKAN BLOK INI AGAR FILE BISA DI-RUN ---
    public static void main(String[] args) {
        getKoneksi(); // Memanggil fungsi di atas untuk dites
    }
    // ------------------------------------------------
}