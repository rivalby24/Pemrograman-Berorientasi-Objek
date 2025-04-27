/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pbo.soal2tugaspertemuan8_9;

/**
 *
 * @author BlazeBy
 */
public class Employee extends Person {
    protected String kantor;
    protected double gaji;
    protected MyDate tanggalDipekerjakan;

    public Employee(String nama, String alamat, String telp, String email,
                    String kantor, double gaji, MyDate tanggalDipekerjakan) {
        super(nama, alamat, telp, email);
        this.kantor = kantor;
        this.gaji = gaji;
        this.tanggalDipekerjakan = tanggalDipekerjakan;
    }

    @Override
    public String toString() {
        return "Employee: " + nama;
    }
}

