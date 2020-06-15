/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Wiji_Utami_uts;

import java.util.Scanner;

/**
 *
 * @author Admin
 */
    public class IO_Scanner {
    public static void main(String[] args) {
        System.out.println("Operasi Menghitung Luas Segitiga");
        double a,t,hasil;
        Scanner in=new Scanner(System.in);
        System.out.println("Masukkan Alas \t : ");
        a=in.nextInt();
        System.out.println("Masukkan Tinggi \t :");
        t=in.nextInt();

        hasil=0.5*a*t;
        System.out.println("Luas Segitiga Adalah \t :"+hasil);
        
    }
    
    }
