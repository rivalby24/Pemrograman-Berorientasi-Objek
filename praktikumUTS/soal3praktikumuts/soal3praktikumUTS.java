/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package pbo.soal3praktikumuts;
import java.util.Scanner;

/**
 *
 * @author BlazeBy
 */
public class soal3praktikumUTS {
    public static int reverse(int nomor){
        int reversed = 0;
        while (nomor != 0) {
            int digit = nomor%10;
            reversed = reversed*10+digit;
            nomor/=10;
        }
        return reversed;
    }
    
    public static boolean isPalindrome(int nomor){
        return nomor == reverse(nomor);
    }
    
     public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        
        System.out.print("Masukkan bilangan bulat: ");
        int nomor = input.nextInt();
        
        if (isPalindrome(nomor)){
            System.out.println(nomor+" adalah palindrom.");
        } else {
            System.out.println(nomor+" bukan palindrom.");
        }
    }
}
