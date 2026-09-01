
import java.util.Scanner;

/*
 * Alur pengerjaan:
 * 1. Memasukkan panjang dan lebar tanah untuk menghitung luas tanah.
 * 2. Memasukkan diameter kolam untuk menghitung luas kolam berbentuk lingkaran.
 * 3. Memasukkan panjang sisi taman untuk menghitung luas taman berbentuk persegi.
 * 4. Menghitung luas tanah dengan rumus panjang × lebar.
 * 5. Menghitung luas kolam dengan rumus π × r × r, dengan r = diameter ÷ 2.
 * 6. Menghitung luas taman dengan rumus sisi × sisi.
 * 7. Menghitung sisa tanah dengan mengurangi luas tanah dengan luas kolam
 *    dan luas taman.
 * 8. Menampilkan hasil sisa tanah ke layar.
 */

public class Tugas02_05 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        //deklarasi variable dan tipe data
        int panjang, lebar, diameter, sisi, luas_tanah, luas_taman;
        double luas_kolam, sisa_tanah;

        // Inputan
        System.out.print("Input panjang tanah: ");
        panjang = sc.nextInt();
        System.out.print("Input lebar tanah: ");
        lebar = sc.nextInt();
        System.out.print("Input diameter kolam: ");
        diameter = sc.nextInt();
        System.out.print("Input panjang sisi taman: ");
        sisi = sc.nextInt();

        //Proses
        luas_tanah = panjang * lebar;
        luas_kolam = (diameter/2.0) * (diameter/2.0) * 3.14;
        luas_taman = sisi * sisi;
        sisa_tanah = luas_tanah - luas_kolam - luas_taman;

        //Output
        System.out.println("sisa tanah adalah: " + sisa_tanah + "m");

    }
}
