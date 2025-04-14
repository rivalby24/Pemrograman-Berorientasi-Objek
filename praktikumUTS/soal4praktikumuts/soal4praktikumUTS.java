/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package pbo.soal4praktikumuts;

/**
 *
 * @author BlazeBy
 */
public class soal4praktikumUTS {
    public static void main(String[] args) {
        Balok balok1 = new Balok();
        System.out.println("Balok dengan panjang : " +1+ ", lebar : " +1+ " dan tinggi : " +1+ 
                           ". Luasnya : " +balok1.getLuas()+ ", sedangkan kelilingnya : " + 
                           balok1.getKeliling()+" dan volumenya : "+balok1.getVolume());
        Balok balok2 = new Balok(30, 40, 50);
        System.out.println("Balok dengan panjang : " +30+ ", lebar : " +40+ " dan tinggi : " +50+ 
                           ". Luasnya : " +balok2.getLuas()+ ", sedangkan kelilingnya : " + 
                           balok2.getKeliling()+ " dan volumenya : " +balok2.getVolume());
        Balok balok3 = new Balok(25, 35, 45);
        System.out.println("Balok dengan panjang : " +25+ ", lebar : " +35+ " dan tinggi : " +45+ 
                           ". Luasnya : " +balok3.getLuas()+ ", sedangkan kelilingnya : " + 
                           balok3.getKeliling()+ " dan volumenya : " +balok3.getVolume());
    }
}
