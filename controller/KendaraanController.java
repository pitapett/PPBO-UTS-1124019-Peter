package controller;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

import model.data.BahanBakar;
import model.data.Helikopter;
import model.data.Kendaraan;
import model.data.Mobil;
import model.data.Pesawat;
import model.data.Truk;
import view.KendaraanView;
import model.KendaraanRepository;

public class KendaraanController {
    KendaraanRepository kendaraanRepository;
    KendaraanView kendaraanView;
    ArrayList<Kendaraan> listKendaraan;

    public KendaraanController(KendaraanRepository kendaraanRepository, KendaraanView kendaraanView) {
        this.listKendaraan = kendaraanRepository.getListKendaraan();
    }

    public ArrayList<Kendaraan> getAll() {
        return listKendaraan;
    }

    public ArrayList<Kendaraan> getSortedKendaraanByKapasitas() {
        

        Collections.sort(listKendaraan, new Comparator<Kendaraan>()) {

    @Override
            public int compare(Kendaraan o1., Kendaraan o2) {
                throw new UnsupportedOperationException("Unimplemented method 'compare'");
            }
        });

    }

    public void addKendaraan(BahanBakar bahanBakar, int kapasitasOrang, String nama) {
        listKendaraan.add(new Mobil(bahanBakar, kapasitasOrang, nama));
    }

    public void addKendaraan(String nama, int jumlahRodaOrBaling) {
        listKendaraan.add(new Truk(jumlahRodaOrBaling, nama));
    }

    public void addKendaraan(int kapasitasOrang, int jumlahRodaOrBaling, String nama) {
        listKendaraan.add(new Helikopter(kapasitasOrang, jumlahRodaOrBaling, nama));
    }

    public void addKendaraan(int kapasitasOrang, int jumlahRodaOrBaling, String nama, boolean bisaTempur) {
        listKendaraan.add(new Pesawat(kapasitasOrang, jumlahRodaOrBaling, nama, bisaTempur));
    }

}
