/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pbo.soal2tugaspertemuan8_9;

/**
 *
 * @author BlazeBy
 */
public class soal2tugaspertemuan8_9 {
    public static void main(String[] args) {
        Person p = new Person("Alby", "Bandung", "0896352741", "alby@email.com");
        Student s = new Student("Nada", "Bandung", "0863952147", "nada@email.com", Student.mhs_thn_kedua);
        Employee e = new Employee("Adit", "Surabaya", "0836925417", "adit@email.com", "Kantor 1", 6000000, new MyDate(10, 3, 2025));
        Faculty f = new Faculty("Denis", "Yogyakarta", "0876945123", "denis@email.com", "Kantor 2", 10000000, new MyDate(15, 3, 2024), "08:00-17:00", "Lektor");
        Staff st = new Staff("Ucup", "Bali", "08564231379", "nada@email.com", "Kantor C", 9000000, new MyDate(20, 1, 2025), "Administrasi");

        System.out.println(p);
        System.out.println(s);
        System.out.println(e);
        System.out.println(f);
        System.out.println(st);
    }
}
