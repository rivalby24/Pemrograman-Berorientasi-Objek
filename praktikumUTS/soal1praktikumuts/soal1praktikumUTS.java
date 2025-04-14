/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package pbo.soal1praktikumuts;
import java.util.Scanner;

/**
 *
 * @author BlazeBy
 */
public class soal1praktikumUTS {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        
        System.out.print("Masukan tiga digit integer : ");
        int angka = input.nextInt();

        int digit1 = angka/100;
        int digit2 = (angka/10)%10;
        int digit3 = angka%10;

        if (digit1 == digit3) {
            System.out.println(digit1+" "+digit2+" "+digit3+" adalah palindrom");
        } else {
            System.out.println(angka+" bukan palindrom");
        }
        
    }
}
