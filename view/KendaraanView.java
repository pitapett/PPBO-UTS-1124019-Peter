package view;

import java.util.ArrayList;

import controller.KendaraanController;
import model.data.BahanBakar;
import model.data.Helikopter;
import model.data.Kendaraan;

public class KendaraanView {
    private KendaraanController controller;

    public KendaraanView() {
        
    }

    public void render() {
        int pilihan = getMenu();
        while (pilihan != 0) {
            handleMainMenu(pilihan);
            pilihan = getMenu();
        }
    }

    public int getMenu() {
        System.out.println("=== MAIN MENU ===");
        System.out.println("1. Tambah Kendaraan");
        System.out.println("2. Tampilkan semua kendaraan");
        System.out.println("3. Urutkan kendaraan berdasarkan kapasitas");
        System.out.println("0. Keluar");
        System.out.print("Pilih menu> ");
        int pilihan = utils.Dialog.readInt();
        return pilihan;
    }

    public void handleMainMenu(int pilihan) {
        switch (pilihan) {
            case 1:
                hadleMenuAddKendaraan();
            case 2:
                getAllKendaraan();
            case 3:
                getAllKendaraanSortedByKapasitas();
                break;
            default:
                System.out.println("Menu tidak valid.");
                break;
        }
    }

    public int getMenuKendaraan() {
        System.out.println("Menu:");
        System.out.println("1. Mobil");
        System.out.println("2. Truk");
        System.out.println("3. Pesawat");
        System.out.println("4. Helikopter");
        System.out.println("0. Keluar");
        System.out.print("Pilihanmu: ");
        return utils.Dialog.readInt();
    }

    public void hadleMenuAddKendaraan() {
        BahanBakar bahanBakar;
        int kapasitasOrang;
        String nama;
        int jumlahRodaOrBaling;

        switch (getMenuKendaraan()) {
            case 1:
                bahanBakar = getMenuBahanBakar();
                System.out.println("Kapasitas :");
                kapasitasOrang = utils.Dialog.readInt();
                nama = utils.Dialog.readLine();
                jumlahRodaOrBaling = 4;

                break;

            default:
                break;
        }
    }

    public BahanBakar getMenuBahanBakar() {
        System.out.println("Menu:");
        System.out.println("1. Bensin");
        System.out.println("2. Diesel");
        System.out.println("3. Avtur");
        System.out.print("Pilihanmu: ");
        int pilihan = utils.Dialog.readInt();
        switch (pilihan) {
            case 1:
                return BahanBakar.BENSIN;

            case 2:
                return BahanBakar.DIESEL;

            case 3:
                return BahanBakar.AVTUR;

            default:
                return BahanBakar.BENSIN;

        }
    }

    public void getAllKendaraan() {
        ArrayList<Kendaraan> listKendaraan = controller.getAll();
        for (Kendaraan kendaraan : listKendaraan) {

            System.out.println(kendaraan.getNamaKendaraan() + ", kapasitas: " + kendaraan.getKapasitasOrang());
        }
    }

    public void getAllKendaraanSortedByKapasitas() {
        controller.getSortedKendaraanByKapasitas();
        ArrayList<Kendaraan> listKendaraan = controller.getAll();
        for (Kendaraan kendaraan : listKendaraan) {

            System.out.println(kendaraan.getNamaKendaraan() + ", kapasitas: " + kendaraan.getKapasitasOrang());
        }
    }

    public void setController(KendaraanController kendaraanController){
        this.controller = kendaraanController;
    }

}