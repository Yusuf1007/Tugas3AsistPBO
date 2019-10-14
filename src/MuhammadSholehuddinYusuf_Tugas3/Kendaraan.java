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
public class Kendaraan {
    final float e =  (float) 2.71828;
    final float log_a = (float) 0.3010299957;
    private int idKendaraan;
    protected float jarakTempuhAwal;
    protected float jarakTempuh;
    private float bahanBakar;

    public Kendaraan(){
        idKendaraan = 0;
        jarakTempuhAwal = 0;
        jarakTempuh = 0;
    }
    public Kendaraan(int idKendaraan, float jarakTempuhAwal, float jarakTempuh) {
        this.idKendaraan = idKendaraan;
        this.jarakTempuhAwal = jarakTempuhAwal;
        this.jarakTempuh = jarakTempuh;
    }

    public int getIdKendaraan() {
        return idKendaraan;
    }

    public void setIdKendaraan(int idKendaraan) {
        this.idKendaraan = idKendaraan;
    }

    public float getJarakTempuhAwal() {
        return jarakTempuhAwal;
    }

    public void setJarakTempuhAwal(float jarakTempuhAwal) {
        this.jarakTempuhAwal = jarakTempuhAwal;
    }

    public float getJarakTempuh() {
        return jarakTempuh;
    }

    public void setJarakTempuh(float jarakTempuh) {
        this.jarakTempuh = jarakTempuh;
    }

    public float getBahanBakar() {
        return bahanBakar;
    }

    public void setBahanBakar(float bahanBakar) {
        this.bahanBakar = bahanBakar;
    }
    public float totalJarak(){
        return (getJarakTempuhAwal()+getJarakTempuh());
    }
    public float xy(){
        float x = getJarakTempuh();
        float y = getBahanBakar();
        return (float) (x/Math.floor(y));
    }
    public float efektivitas(){
        return (float) (Math.pow(e, xy())*log_a);
    }
    public void keefektivitasan(){
        if (efektivitas()>0 && efektivitas()<=0.5) {
            System.out.println("Efektif");
        }else{
            System.out.println("Tidak efektif");
        }
    }
    public void infoKendaraan(){
        System.out.println("Bahan Bakar\t\t: "+getBahanBakar());
        System.out.println("Jarak Tempuh\t\t: " + getJarakTempuh());
        System.out.println("Total Jarak Tempuh\t: " + totalJarak());
        System.out.println("Efektivitas\t\t: "+efektivitas());
        System.out.print("Keefektivitasan\t\t: ");keefektivitasan();
    }
    
    
}
