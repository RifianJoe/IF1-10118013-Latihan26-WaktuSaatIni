/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package if1.pkg10118013.latihan26.waktusaatini;
import java.util.*;

/**
 *
 * @author Rifian
 * Nama : Rifian Joe Premilenio
 * Kelas : IF-1
 * NIM : 10118013
 * Deskripsi Program : Menampilkan Waktu Saat ini
 */
public class IF110118013Latihan26WaktuSaatIni {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int detik, menit, jam, tHari, bulan, tahun;
        GregorianCalendar date = new GregorianCalendar();
        String namaBulan[] = {"Jan", "Feb", "Mar", "Apr", "Mei", "Jun", "Jul", "Aug", "Sep", "Oct", "Nov", "Des"};
        String namaHari[] = {"Senin", "Selasa", "Rabu", "Kamis", "Jumat", "Sabtu", "Minggu"};    
        detik = date.get(Calendar.SECOND);
        menit = date.get(Calendar.MINUTE);
        jam =  date.get(Calendar.HOUR_OF_DAY);
        tHari = date.get(Calendar.DAY_OF_MONTH);
        bulan = date.get(Calendar.MONTH);
        tahun = date.get(Calendar.YEAR);
        System.out.println("Hari ini adalah hari : "+tHari+" "+namaBulan[bulan]+" "+tahun+" "+jam+":"+menit+":"+detik);
        System.out.println("(Developed by : Rifian Joe Premilenio)");
    }
    
}
