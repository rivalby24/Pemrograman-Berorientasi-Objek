/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pbo.soal1tugaspertemuan8_9;

/**
 *
 * @author BlazeBy
 */
public class ObjekGeometri {
    private String warna;
    private boolean terisi = false;

    // Konstruktor tanpa argumen
    public ObjekGeometri() {
    }

    // Konstruktor dengan parameter
    public ObjekGeometri(String warna, boolean terisi) {
        this.warna = warna;
        this.terisi = terisi;
    }

    // Getter dan setter
    public String getWarna() {
        return warna;
    }

    public void setWarna(String warna) {
        this.warna = warna;
    }

    public boolean isTerisi() {
        return terisi;
    }

    public void setTerisi(boolean terisi) {
        this.terisi = terisi;
    }

    // Method toString
    @Override
    public String toString() {
        return "GeometricObject: warna = " + warna + ", terisi = " + terisi;
    }
}
