package model.data;

public abstract class Kendaraan {
    private BahanBakar bahanBakar;
    private int kapasitasOrang;
    private int jumlahRodaOrBaling;
    private String nama;

    public Kendaraan(BahanBakar bahanBakar, int kapasitasOrang, int jumlahRodaOrBaling, String nama) {
        this.bahanBakar = bahanBakar;
        this.kapasitasOrang = kapasitasOrang;
        this.jumlahRodaOrBaling = jumlahRodaOrBaling;
        this.nama = nama;
    }

    public String getBahanBakar() {
        switch (bahanBakar) {
            case BENSIN:
                return "Bensin";

            case DIESEL:
                return "Diesel";

            case AVTUR:
                return "Avtur";

            default:
                return "apadong";
        }
    }

    public int getKapasitasOrang() {
        return kapasitasOrang;
    }

    public String getNama() {
        return nama;
    }

    public abstract String getNamaKendaraan();

    public int getJumlahRodaOrBaling() {
        return jumlahRodaOrBaling;
    }

}
