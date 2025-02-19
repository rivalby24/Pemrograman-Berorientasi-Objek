/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.tugaspertemuan3;
import java.util.Scanner;
/**
 *
 * @author BlazeBy
 */
public class tugaspertemuan3soal3 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Masukan Jumlah Peserta: ");
        int penumpang = input.nextInt();
        int kapasitas = 7;
        
        int mobil = penumpang / kapasitas;
        if (penumpang % kapasitas != 0){
            mobil = mobil + 1;
        }
        System.out.println("Jumlah mobil yang diperlukan: " + mobil);
    }
}