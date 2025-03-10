/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package pbo.tugaspertemuan6;

/**
 *
 * @author BlazeBy
 */
public class tugaspertemuan6 {

    public static void main(String[] args) {
        //persegipanjang1
        PersegiPanjang persegipanjang1 = new PersegiPanjang();
        persegipanjang1.panjang = 1;
        persegipanjang1.lebar = 1;
        System.out.println("Luas dari Persegi Panjang adalah: "+persegipanjang1.getLuas()+
                ", dan Keliling dari Persegi Panjang adalah: "+persegipanjang1.getKeliling());
        //persegipanjang2
        PersegiPanjang persegipanjang2 = new PersegiPanjang();
        persegipanjang2.setPanjangBaru(30);
        persegipanjang2.setLebarBaru(40);
        System.out.println("Luas dari Persegi Panjang adalah: "+persegipanjang2.getLuas()+
                ", dan Keliling dari Persegi Panjang adalah: "+persegipanjang2.getKeliling());
        //persegipanjang3
        PersegiPanjang persegipanjang3 = new PersegiPanjang(25, 35);
        System.out.println("Luas dari Persegi Panjang adalah: "+persegipanjang3.getLuas()+
                ", dan Keliling dari Persegi Panjang adalah: "+persegipanjang3.getKeliling());
    }
}
