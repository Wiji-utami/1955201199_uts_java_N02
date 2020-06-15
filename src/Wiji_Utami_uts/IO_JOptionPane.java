/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Wiji_Utami_uts;

import javax.swing.JOptionPane;

/**
 *
 * @author Admin
 */
public class IO_JOptionPane {
    public static void main(String[] args) {
        System.out.println("Operasi Menghitung Volume Kubus");
 
       int s=Integer.parseInt(JOptionPane.showInputDialog("Masukkan Sisi \t : "));
       int hitung=s*s*s;
       
        String tampil=("Volume Kubus Adalah \t : "+hitung);
        JOptionPane.showMessageDialog(null, tampil,"Hasil Hitung" ,JOptionPane.INFORMATION_MESSAGE);
    }
}
