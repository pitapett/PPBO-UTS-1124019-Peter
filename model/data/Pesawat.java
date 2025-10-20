package model.data;

public class Pesawat extends KendaraanUdara implements IKargoable {
    private boolean bisaTempur;

    public Pesawat(int kapasitasOrang, int jumlahRodaOrBaling, String nama, boolean bisaTempur){
        super(kapasitasOrang, jumlahRodaOrBaling, nama);  
    }

    @Override
    public String getNamaKendaraan() {

        return "Helikopter " + getNama();
    }

    @Override
    public void unloadKargo() {
        System.out.println("Pesawat kargo lagi unload");
    }

    @Override
    public void loadKargo() {
        System.out.println("Pesawat kargo lagi loading");
    }

    public boolean getBisaTempur(){
        return this.bisaTempur;
    }
}
