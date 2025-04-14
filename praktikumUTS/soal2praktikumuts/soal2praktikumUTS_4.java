/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pbo.soal2praktikumuts;

/**
 *
 * @author BlazeBy
 */
public class soal2praktikumUTS_4 {
    public static void main(String[] args){
        for (int i = 1; i <= 6; i++){ 
            for (int j = 1; j < i; j++){ 
                System.out.print(" ");
            }
            for (int k = 1; k <= 7 - i; k++){
                System.out.print(k);
            }
            System.out.println();
        }
    }
}
