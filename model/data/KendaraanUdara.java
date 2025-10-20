package model.data;

public class KendaraanUdara extends Kendaraan{
    public KendaraanUdara(int kapasitasOrang, int jumlahRodaOrBaling, String nama){
        super(BahanBakar.AVTUR, kapasitasOrang, jumlahRodaOrBaling, nama);
    }

    @Override
    public String getNamaKendaraan() {
        return null;
    }
}
