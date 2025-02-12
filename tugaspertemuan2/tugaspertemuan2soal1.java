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
public class pertemuan2soal1 {
        public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Masukan 3 Bilangan Pecahan Negatif: ");
        float a = input.nextFloat();
        float b = input.nextFloat();
        float c = input.nextFloat();
        
        float penjumlahan = a + b + c;
        float pengurangan = a - b - c;
        float pengkalian = a * b * c;
        float pembagian = a / b / c;
        
        System.out.println("hasil dari penjumlahan = " + penjumlahan);
        System.out.println("hasil dari pengurangan = " + pengurangan);
        System.out.println("hasil dari pengkalian = " + pengkalian);
        System.out.println("hasil dari pembagian = " + pembagian);
    }
}