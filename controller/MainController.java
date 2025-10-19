package controller;

public class MainController {
    

    public void handleMenu(int pilihan) {
        switch (pilihan) {
            case 1:
                System.out.println("Menu 1 dipilih.");
                break;
            default:
                System.out.println("Menu tidak valid.");
                break;
        }
    }
}
