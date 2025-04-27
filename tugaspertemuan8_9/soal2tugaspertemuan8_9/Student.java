/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pbo.soal2tugaspertemuan8_9;

/**
 *
 * @author BlazeBy
 */
public class Student extends Person {
    public static final String mhs_baru = "Mahasiswa Baru";
    public static final String mhs_thn_kedua = "Tahun Kedua";
    public static final String mhs_junior = "Junior";
    public static final String mhs_senior = "Senior";

    protected String status;

    public Student(String nama, String alamat, String telp, String email, String status) {
        super(nama, alamat, telp, email);
        this.status = status;
    }

    @Override
    public String toString() {
        return "Student: " + nama + ", Status: " + status;
    }
}

