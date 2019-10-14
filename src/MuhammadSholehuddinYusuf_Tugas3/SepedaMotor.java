/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package MuhammadSholehuddinYusuf_Tugas3;

/**
 *
 * @author MHS.YUSUF
 */
public class SepedaMotor extends Kendaraan {
    private String namaKendaraan;
    private String typeKendaraan;
    private float bahanBakar;

    public SepedaMotor() {
        
    }

    public SepedaMotor(String namaKendaraan, String typeKendaraan, float bahanBakar, int idKendaraan, float jarakTempuhAwal, float jarakTempuh) {
        super(idKendaraan, jarakTempuhAwal, jarakTempuh);
        this.namaKendaraan = namaKendaraan;
        this.typeKendaraan = typeKendaraan;
        this.bahanBakar = bahanBakar;
    }

    public String getNamaKendaraan() {
        return namaKendaraan;
    }

    public void setNamaKendaraan(String namaKendaraan) {
        this.namaKendaraan = namaKendaraan;
    }

    public String getTypeKendaraan() {
        return typeKendaraan;
    }

    public void setTypeKendaraan(String typeKendaraan) {
        this.typeKendaraan = typeKendaraan;
    }
    public float getBahanBakar() {
        return bahanBakar;
    }

    public void setBahanBakar(float bahanBakar) {
        this.bahanBakar = bahanBakar;
    }
    @Override
    public void infoKendaraan(){
        System.out.println("===============Sepeda Motor===============");
        System.out.println("Id Kendaraan\t\t: "+getIdKendaraan());
        System.out.println("Nama Kendaraan\t\t: "+getNamaKendaraan());
        System.out.println("Tipe Kendaraan\t\t: "+getTypeKendaraan());
        
    }

    
    
    
    
}
