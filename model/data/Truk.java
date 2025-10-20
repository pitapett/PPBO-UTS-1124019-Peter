package model.data;

public class Truk extends KendaraanDarat implements IKargoable {
    public Truk(int jumlahRodaOrBaling, String nama) {
        super(BahanBakar.DIESEL, 3, jumlahRodaOrBaling, nama);
    }

    @Override
    public String getNamaKendaraan() {

        return "Truk " + getNama();
    }

    @Override
    public void unloadKargo() {
        System.out.println("Truk kargo lagi unload");
    }

    @Override
    public void loadKargo() {
        System.out.println("Truk kargo lagi loading");
    }
}
