/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Tugas2;

/**
 *
 * @author MHS.YUSUF
 */
public class TesPelajar {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Pelajar mhs1 = new Pelajar();
        
        mhs1.setNama("Piyek Alapola");
        mhs1.setNIP("06111940000046");
        mhs1.setNilaiUjian1(90);
        mhs1.setNilaiUjian2(95);
        mhs1.setNilaiTugas(100);
        
        System.out.println("=========Nilai Mahasiswa=========");
        System.out.println("Nama\t\t : " + mhs1.getNama());
        System.out.println("NIP\t\t : " + mhs1.getNIP());
        System.out.println("Nilai Ujian 1\t : " + mhs1.getNilaiUjian1());
        System.out.println("Nilai Ujian 2\t : " + mhs1.getNilaiUjian2());
        System.out.println("Nilai Tugas \t : " + mhs1.getNilaiTugas());
        System.out.println("---------------------------------");
        System.out.println("Nilai Akhir\t : " + mhs1.nilaiAkhir());
        mhs1.Status();
        
        
    }
    
}
