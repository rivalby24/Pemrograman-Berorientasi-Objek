/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.pertemuan2;
import java.util.Scanner;
/**
 *
 * @author BlazeBy
 */
public class pertemuan2soal2 {
        public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.println("Masukan Jumlah tabungan anda (dalam juta): ");
        int a = input.nextInt();
        
        System.out.println("Apakah anda sudah memiliki calon pasangan?: (true/false)");
        boolean b = input.nextBoolean();
        
        if (a > 100 && b){
            System.out.println("Selamat, Anda bisa menikah :D");
        } else {
            System.out.println("Maaf, Anda belum bisa menikah :(");
        }
    }
}
