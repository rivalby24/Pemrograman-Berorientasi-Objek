/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pbo.tugaspertemuan6;

/**
 *
 * @author BlazeBy
 */
public class PersegiPanjang {
    int panjang;
    int lebar;
    
    PersegiPanjang(){
        panjang = 0;
        lebar = 0;
    }
    
    PersegiPanjang(int panjangBaru, int lebarBaru){
        panjang = panjangBaru;
        lebar = lebarBaru;
    }
    
    int getLuas(){
        return panjang * lebar;
    }
    
    int getKeliling(){
        return (2 * panjang) + (2 * lebar);
    }
    
    void setPanjangBaru(int panjangBaru){
        panjang = panjangBaru;
    }
    
    void setLebarBaru(int lebarBaru){
        lebar = lebarBaru;
    }
    
    
}
