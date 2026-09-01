
import java.util.Scanner;

public class Tugas02_05 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int panjang, lebar, diameter, sisi, luas_tanah, luas_taman;
        double luas_kolam, sisa_tanah;

        System.out.print("Input panjang tanah: ");
        panjang = sc.nextInt();
        System.out.print("Input lebar tanah: ");
        lebar = sc.nextInt();
        System.out.print("Input diameter kolam: ");
        diameter = sc.nextInt();
        System.out.print("Input panjang sisi taman: ");
        sisi = sc.nextInt();

        luas_tanah = panjang * lebar;
        luas_kolam = (diameter/2) * (diameter/2) * 3.14;
        luas_taman = sisi * sisi;
        sisa_tanah = luas_tanah - luas_kolam - luas_taman;

        System.out.println("sisa tanah adalah: " + sisa_tanah + "m");

    }
}
