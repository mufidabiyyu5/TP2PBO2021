/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
// package mobil;

import com.sun.jdi.connect.spi.Connection;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.Toolkit;
import java.awt.image.ImageObserver;
import java.sql.DriverManager;
import javax.swing.JOptionPane;

/**
 *
 * @author Acer
 */
public class mobil {
    Connection koneksi;

    public static java.sql.Connection Koneksi() {
        try {
            Class.forName("com.mysql.jdbc.Driver");
            java.sql.Connection koneksi = DriverManager.getConnection("jdbc:mysql://localhost/mobil", "root", "");

            return koneksi;
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);

            return null;
        }
    }
    
}
