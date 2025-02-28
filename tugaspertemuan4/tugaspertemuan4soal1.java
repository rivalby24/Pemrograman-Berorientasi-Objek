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
public class tugaspertemuan4soal1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        for(int i = 1;i<=3;i++){
            System.out.println("Masukan bilangan ke-"+i+": ");
            int ribu = input.nextInt();
            
            if(ribu>=1000 && ribu<=9999){
                System.out.println("Bilangan ke-" +i+ " merupakan ribuan");
            }else{
                System.out.println("Bilangan ke-" +i+ " bukan ribuan");
            }
        }
    }
}
