package utils;

import java.util.Scanner;

public class Dialog {
    static Scanner scn = new Scanner(System.in);

    public static int readInt() {
        while (!scn.hasNextInt()) {
            System.out.println("Input tidak valid. Silakan masukkan angka.");
            scn.next();
        }
        int result = scn.nextInt();
        scn.nextLine();
        return result;
    }

    public static String readLine() {
        String result = scn.nextLine();
        return result;
    }

    public static double readDouble() {
        double result = scn.nextDouble();
        scn.nextLine();
        return result;
    }

    public static boolean readBoolean() {
        boolean result = scn.nextBoolean();
        return result;
    }

    public static boolean konfirmasi(String text) {
        System.out.println(text + " (Y/N)");
        String konfirmasi = readLine();
        return konfirmasi.toLowerCase().equals("y");
    }

}