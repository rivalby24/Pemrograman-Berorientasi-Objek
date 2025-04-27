/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pbo.soal2tugaspertemuan8_9;
import java.util.Calendar;
import java.util.GregorianCalendar;
/**
 *
 * @author BlazeBy
 */
public class MyDate {
    private int hari, bulan, tahun;

    public MyDate() {
        Calendar calendar = new GregorianCalendar();
        this.tahun = calendar.get(Calendar.YEAR);
        this.bulan = calendar.get(Calendar.MONTH);
        this.hari = calendar.get(Calendar.DAY_OF_MONTH);
    }
    
    public MyDate(int hari, int bulan, int tahun) {
        this.hari = hari;
        this.bulan = bulan;
        this.tahun = tahun;
    }

    public String toString() {
        return hari + "/" + bulan + "/" + tahun;
    }
}


