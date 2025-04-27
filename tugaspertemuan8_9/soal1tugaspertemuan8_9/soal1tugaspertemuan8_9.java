/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package pbo.soal1tugaspertemuan8_9;
import java.util.Scanner;
/**
 *
 * @author BlazeBy
 */
public class soal1tugaspertemuan8_9 {
     public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        // Meminta input dari pengguna
        System.out.println("Masukkan tiga sisi segitiga: ");
        double sisi1 = input.nextDouble();
        double sisi2 = input.nextDouble();
        double sisi3 = input.nextDouble();
        
        System.out.print("Masukkan warna segitiga: ");
        String color = input.next();
        
        System.out.print("Apakah segitiga terisi? (true/false): ");
        boolean filled = input.nextBoolean();
        
        // Membuat objek Segitiga
        Segitiga segitiga = new Segitiga(sisi1, sisi2, sisi3);
        segitiga.setWarna(color);
        segitiga.setTerisi(filled);
        
        // Menampilkan informasi segitiga
        System.out.println("\nInformasi Segitiga:");
        System.out.println("Luas: " + segitiga.getArea());
        System.out.println("Keliling: " + segitiga.getPerimeter());
        System.out.println("Warna: " + segitiga.getWarna());
        System.out.println("Terisi: " + segitiga.isTerisi());
        System.out.println(segitiga.toString());
    }
}