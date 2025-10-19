package view;
import controller.MainController;

public class MainView {
    private MainController controller;

    public MainView(MainController controller) {
        this.controller = controller;
    }

    public void render() {
        int pilihan = getMenu();
        while (pilihan != 0) {
            controller.handleMenu(pilihan);
            pilihan = getMenu();
        }
    }

    public int getMenu() {
        System.out.println("=== MAIN MENU ===");
        System.out.println("1. Menu 1");
        System.out.println("0. Keluar");
        System.out.print("Pilih menu> ");
        int pilihan = utils.Dialog.readInt();
        return pilihan;
    }
}
