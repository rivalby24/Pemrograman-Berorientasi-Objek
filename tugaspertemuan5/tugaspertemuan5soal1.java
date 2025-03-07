/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.tugaspertemuan5;
import java.util.Scanner;

/**
 *
 * @author BlazeBy
 */
public class tugaspertemuan5soal1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        for (int i = 1; i <= 3; i++) {
            System.out.print("Masukkan bilangan ke-" + i + ": ");
            int bilangan = input.nextInt();
            cekBilanganRibuan(i, bilangan);
        }
    }
    
    static void cekBilanganRibuan(int index, int bilangan) {
        if (bilangan >= 1000 && bilangan <= 9999) {
            System.out.println("Bilangan ke-" + index + " merupakan ribuan");
        } else {
            System.out.println("Bilangan ke-" + index + " bukan ribuan");
        }
    }
}
