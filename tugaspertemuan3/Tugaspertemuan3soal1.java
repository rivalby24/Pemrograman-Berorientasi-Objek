/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.tugaspertemuan3;
import java.util.Scanner;
/**
 *
 * @author BlazeBy
 */
public class Tugaspertemuan3soal1 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Masukan 2 buah bilangan: ");
        int a = input.nextInt();
        int b = input.nextInt();
        
        if(a%2==0 && b%2==0){
            int jumlah = a + b;
            System.out.println("Hasil dari pertambahan 2 bilangan genap: " + jumlah);
        }else if (a%2!=0 && b%2!=0){
            int kali = a * b;
            System.out.println("Hasil dari perkalian 2 bilangan ganjil: "+ kali);
        }else{
            System.out.println("Kedua bilangan tidak memiliki kesamaan.");
        }
    }
}
