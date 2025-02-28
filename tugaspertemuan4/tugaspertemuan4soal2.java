/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.tugaspertemuan4;
import java.util.Scanner;
/**
 *
 * @author BlazeBy
 */
public class tugaspertemuan4soal2 {
    public static void main(String[] args) {
        Scanner input1 = new Scanner(System.in);
        
        System.out.print("Masukkan nilai awal: ");
        int batasAwal = input1.nextInt();
        
        System.out.print("Masukkan nilai akhir: ");
        int batasAkhir = input1.nextInt();
        
        if (batasAwal >= 1 && batasAkhir <= 100) {
            System.out.print("Bilangan prima " + batasAwal + " sd " + batasAkhir + " adalah: ");
            for (int i = batasAwal; i <= batasAkhir; i++) {
                if (i < 2) continue;
                int hitung = 0;
                for (int j = 1; j <= i; j++) {
                    if (i % j == 0) {
                        hitung++;
                    }
                }
                if (hitung == 2) {
                    System.out.print(i + " ");
                }
            }
            
            System.out.println("");
            
            System.out.print("Bilangan komposit " + batasAwal + " sd " + batasAkhir + " adalah: ");
            for (int i = batasAwal; i <= batasAkhir; i++) {
                if (i < 2) continue;
                int faktor = 0;
                for (int j = 1; j <= i; j++) {
                    if (i % j == 0) {
                        faktor++;
                    }
                }
                if (faktor > 2) {
                    System.out.print(i + " ");
                }
            }
        } else {
            System.out.println("Input tidak valid! Batas awal harus >=1 dan batas akhir harus <=100.");
        }
    }
}