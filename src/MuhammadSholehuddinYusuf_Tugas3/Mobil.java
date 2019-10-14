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
public class Mobil extends Kendaraan{
    private String namaKendaraan;
    private String typeKendaraan;
    private float kapasitasMesin;
    private float bahanBakar;

    public Mobil() {
        
    }
    public Mobil(String namaKendaraan, String typeKendaraan, float kapasitasMesin, float bahanBakar, int idKendaraan, float jarakTempuhAwal, float jarakTempuh) {
        super(idKendaraan, jarakTempuhAwal, jarakTempuh);
        this.namaKendaraan = namaKendaraan;
        this.typeKendaraan = typeKendaraan;
        this.kapasitasMesin = kapasitasMesin;
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

    public float getKapasitasMesin() {
        return kapasitasMesin;
    }

    public void setKapasitasMesin(float kapasitasMesin) {
        this.kapasitasMesin = kapasitasMesin;
    }
    public float getBahanBakar() {
        return bahanBakar;
    }

    public void setBahanBakar(float bahanBakar) {
        this.bahanBakar = bahanBakar;
    }
    @Override
    public void infoKendaraan(){
        System.out.println("==================Mobil==================");
        System.out.println("Id Kendaraan\t\t: "+getIdKendaraan());
        System.out.println("Nama Kendaraan\t\t: "+getNamaKendaraan());
        System.out.println("Tipe Kendaraan\t\t: "+getTypeKendaraan());
        System.out.println("Kapasitas Mesin\t\t: "+getKapasitasMesin());
        
    }
    
    
    
}
