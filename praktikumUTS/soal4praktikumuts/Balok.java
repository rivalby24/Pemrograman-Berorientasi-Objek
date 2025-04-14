/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pbo.soal4praktikumuts;

/**
 *
 * @author BlazeBy
 */
public class Balok{
    private int panjang;
    private int lebar;
    private int tinggi;

    public Balok(){
        this.panjang = 1;
        this.lebar = 1;
        this.tinggi = 1;
    }

    public Balok(int panjangBaru, int lebarBaru, int tinggiBaru){
        this.panjang = panjangBaru;
        this.lebar = lebarBaru;
        this.tinggi = tinggiBaru;
    }
    
    public int getLuas(){
        return 2 * ((this.panjang*this.lebar)+(this.panjang*this.tinggi)+(this.lebar*this.tinggi));
    }
    
    public int getKeliling(){
        return 4 * (this.panjang+this.lebar+this.tinggi);
    }

    public int getVolume(){
        return this.panjang*this.lebar*this.tinggi;
    }
 
    public void setPanjang(int panjangBaru){
        this.panjang = panjangBaru;
    }
    
    public void setLebar(int lebarBaru){
        this.lebar = lebarBaru;
    }
    
    public void setTinggi(int tinggiBaru){
        this.tinggi = tinggiBaru;
    }
}

