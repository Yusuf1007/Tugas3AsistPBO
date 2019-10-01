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
public class Pelajar {
    private String NIP;
    private String Nama;
    private double nilaiUjian1;
    private double nilaiUjian2;
    private double nilaiTugas;
    private double nilaiAkhir;
    private String sip;
    
    public Pelajar(){
        NIP = " ";
        Nama = " ";
        nilaiUjian1 = 0;
        nilaiUjian2 = 0;
        nilaiAkhir = 0;
        sip = "";
    }
    public Pelajar(String NIP, String Nama, double nilaiUjian1, double nilaiUjian2, double nilaiTugas, String sip) {
        this.NIP = NIP;
        this.Nama = Nama;
        this.nilaiUjian1 = nilaiUjian1;
        this.nilaiUjian2 = nilaiUjian2;
        this.nilaiTugas = nilaiTugas;
        this.sip =sip;
    }

    public String getNIP() {
        return NIP;
    }

    public void setNIP(String NIP) {
        this.NIP = NIP;
    }

    public String getNama() {
        return Nama;
    }

    public void setNama(String Nama) {
        this.Nama = Nama;
    }

    public double getNilaiUjian1() {
        return nilaiUjian1;
    }

    public void setNilaiUjian1(double nilaiUjian1) {
        this.nilaiUjian1 = nilaiUjian1;
    }

    public double getNilaiUjian2() {
        return nilaiUjian2;
    }

    public void setNilaiUjian2(double nilaiUjian2) {
        this.nilaiUjian2 = nilaiUjian2;
    }

    public double getNilaiTugas() {
        return nilaiTugas;
    }

    public void setNilaiTugas(double nilaiTugas) {
        this.nilaiTugas = nilaiTugas;
    }
    public double nilaiAkhir(){
        return(0.4*nilaiUjian1) + (0.4*nilaiUjian2) + (0.2*nilaiTugas);
    }
    public String isiLulus(){
        if(nilaiAkhir() >=60 && nilaiAkhir() <=100){
            sip = "Lulus";
        }
        else if(nilaiAkhir() >=0 && nilaiAkhir <60){
            sip = "Tidak Lulus";
        }
        return sip;
    }
    public void Status(){
        System.out.println("Status\t\t : " + isiLulus());
    }
    
    
    
}
