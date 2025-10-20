package model.data;

public class Helikopter extends KendaraanUdara {

    public Helikopter(int kapasitasOrang, int jumlahRodaOrBaling, String nama) {
        super(kapasitasOrang, jumlahRodaOrBaling, nama);

    }

    @Override
    public String getNamaKendaraan() {

        return "Helikopter " + getNama();
    }
}
