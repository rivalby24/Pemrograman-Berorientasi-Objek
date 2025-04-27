/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pbo.soal2tugaspertemuan8_9;

/**
 *
 * @author BlazeBy
 */
public class Faculty extends Employee {
    private String jamKerja;
    private String pangkat;

    public Faculty(String nama, String alamat, String telp, String email,
                   String kantor, double gaji, MyDate tanggalDipekerjakan,
                   String jamKerja, String pangkat) {
        super(nama, alamat, telp, email, kantor, gaji, tanggalDipekerjakan);
        this.jamKerja = jamKerja;
        this.pangkat = pangkat;
    }

    @Override
    public String toString() {
        return "Faculty: " + nama;
    }
}
