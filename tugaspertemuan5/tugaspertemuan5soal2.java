/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.tugaspertemuan5;
import java.util.Scanner;

/**
 *
 * @author BlazeBy
 */
public class tugaspertemuan5soal2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Masukkan nilai awal: ");
        int batasAwal = input.nextInt();       
        System.out.print("Masukkan nilai akhir: ");
        int batasAkhir = input.nextInt();
        
        if (batasAwal >= 1 && batasAkhir <= 100) {
            cetakBilanganPrima(batasAwal, batasAkhir);
            cetakBilanganKomposit(batasAwal, batasAkhir);
        } else {
            System.out.println("Input tidak valid! Batas awal harus >=1 dan batas akhir harus <=100.");
        }
    }
    
    static void cetakBilanganPrima(int batasAwal, int batasAkhir) {
        System.out.print("Bilangan prima " + batasAwal + " sd " + batasAkhir + " adalah: ");
        for (int i = batasAwal; i <= batasAkhir; i++) {
            if (i < 2) continue;
            if (adalahBilanganPrima(i)) {
                System.out.print(i + " ");
            }
        }
        System.out.println("");
    }
    
    static void cetakBilanganKomposit(int batasAwal, int batasAkhir) {
        System.out.print("Bilangan komposit " + batasAwal + " sd " + batasAkhir + " adalah: ");
        for (int i = batasAwal; i <= batasAkhir; i++) {
            if (i < 2) continue;
            if (!adalahBilanganPrima(i)) {
                System.out.print(i + " ");
            }
        }
        System.out.println("");
    }
    
    static boolean adalahBilanganPrima(int angka) {
        if (angka < 2) return false;
        int faktor = 0;
        for (int j = 1; j <= angka; j++) {
            if (angka % j == 0) {
                faktor++;
            }
        }
        return faktor == 2;
    }
}
