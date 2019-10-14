/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package MuhammadSholehuddinYusuf_Tugas3;

import java.util.Scanner;

/**
 *
 * @author MHS.YUSUF
 */
public class KendaraanMain {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("1. Efektivitas Mobil");
        System.out.println("2. Efektivitas Sepeda Motor");
        Kendaraan k = new Kendaraan();
        Mobil mbl1 = new Mobil();
        SepedaMotor sm1 = new SepedaMotor();

        System.out.print("\nMasukkan pilihan : ");
        int pilih = in.nextInt();
        switch (pilih) {

            case 1:

                System.out.println("\n================Data Mobil===============");

                System.out.print("Masukkan Id Kendaraan\t\t: ");
                int a = in.nextInt();
                mbl1.setIdKendaraan(a);

                System.out.print("Masukkan Nama Kendaraan\t\t: ");
                String b = in.next();
                mbl1.setNamaKendaraan(b);

                System.out.print("Masukkan Tipe Kendaraan\t\t: ");
                String c = in.next();
                mbl1.setTypeKendaraan(c);

                System.out.print("Masukkan Kapasitas Mesin\t: ");
                float d = in.nextFloat();
                mbl1.setKapasitasMesin(d);

                System.out.print("Masukkan Bahan bakar Kendaraan\t: ");
                float e = in.nextFloat();
                k.setBahanBakar(e);

                System.out.print("Masukkan Jarak Tempuh Awal\t: ");
                float f = in.nextFloat();
                k.setJarakTempuhAwal(f);

                System.out.print("Masukkan jarak Tempuh Kendaraan\t: ");
                float g = in.nextFloat();
                k.setJarakTempuh(g);   

                System.out.println("");
                mbl1.infoKendaraan();
                k.infoKendaraan();

                break;

            case 2:
                System.out.println("\n============Data Sepeda Motor==========");

                System.out.print("Masukkan Id Kendaraan\t\t: ");
                int aa = in.nextInt();
                sm1.setIdKendaraan(aa);

                System.out.print("Masukkan Nama Kendaraan\t\t: ");
                String bb = in.next();
                sm1.setNamaKendaraan(bb);

                System.out.print("Masukkan Tipe Kendaraan\t\t: ");
                String cc = in.next();
                sm1.setTypeKendaraan(cc);

                System.out.print("Masukkan Bahan bakar Kendaraan\t: ");
                float dd = in.nextFloat();
                k.setBahanBakar(dd);

                System.out.print("Masukkan Jarak Tempuh Awal\t: ");
                float ee = in.nextFloat();
                k.setJarakTempuhAwal(ee);

                System.out.print("Masukkan Jarak Tempuh Kendaraan\t: ");
                float ff = in.nextFloat();
                k.setJarakTempuh(ff);
                System.out.println("");

                System.out.println("");
                sm1.infoKendaraan();
                k.infoKendaraan();

                break;
        }

    }
    
}
