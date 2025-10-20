package model.data;

public class Mobil extends KendaraanDarat {

    public Mobil(BahanBakar bahanBakar, int kapasitasOrang, String nama) {
        super(bahanBakar, kapasitasOrang, 4, nama);

        
    }

    @Override
    public String getNamaKendaraan() {
        
        return "Mobil " + getNama() ;
    }
}
