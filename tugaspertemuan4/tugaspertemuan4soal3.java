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
public class tugaspertemuan4soal3 {
    public static void main(String[] args) {
        Scanner input3 = new Scanner(System.in);
        System.out.print("Masukan nilai n (1-1000): ");
        int n = input3.nextInt();
        if(n>=1 && n<=1000){
            for(int i=1;i<=n;i++){
                for(int j=1;j<=i;j++){
                    System.out.print("*");
                }
                System.out.println();
            }
        }else{
            System.out.println("Nilai n harus diantara 1 hingga 1000");
        }
    }
}
