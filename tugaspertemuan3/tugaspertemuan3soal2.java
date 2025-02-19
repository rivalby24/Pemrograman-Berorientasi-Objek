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
public class tugaspertemuan3soal2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Masukan Nilai UTS: ");
        int uts = input.nextInt();
        System.out.println("Masukan Nilai UAS: ");
        int uas = input.nextInt();
        System.out.println("Masukan Nilai Tugas: ");
        int tugas = input.nextInt();
        
        double nilaiUTS = uts * 0.35;
        double nilaiUAS = uas * 0.45;
        double nilaiTugas = tugas * 0.20;
        double jumlahNilai = nilaiUTS + nilaiUAS + nilaiTugas;
        
        if (jumlahNilai <= 100 && jumlahNilai >= 80){
            System.out.println("Nilai anda adalah A!");
        }else if(jumlahNilai < 80 && jumlahNilai >= 70){
            System.out.println("Nilai anda adalah B!");
        }else if(jumlahNilai < 70 && jumlahNilai >= 50){
            System.out.println("Nilai anda adalah C!");
        }
    }
}
