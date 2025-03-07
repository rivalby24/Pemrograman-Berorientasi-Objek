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
public class tugaspertemuan5soal3 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Masukkan nilai n (1-1000): ");
        int n = input.nextInt();
        
        if (n >= 1 && n <= 1000) {
            cetakSegitigaBintang(n);
        } else {
            System.out.println("Nilai n harus di antara 1 hingga 1000");
        }
    }
    
    static void cetakSegitigaBintang(int n) {
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
