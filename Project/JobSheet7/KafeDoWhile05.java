
import java.util.Scanner;

public class KafeDoWhile05 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int kopi, teh, roti, hargaKopi = 12000, hargaTeh = 7000, hargaRoti = 20000, totalHarga;
        String namaPelanggan;

        do {
            System.out.print("Masukan nama pelanggan (ketik 'batal' untuk keluar): ");
            namaPelanggan = sc.nextLine();

            if (namaPelanggan.equalsIgnoreCase("batal")) {
                System.out.println("Transaksi dibatalkan.");
                break;
            }

            System.out.print("Masukan jumlah kopi: ");
            kopi = sc.nextInt();

            System.out.print("Masukan jumlah teh: ");
            teh = sc.nextInt();

            System.out.print("Masukan jumlah roti: ");
            roti = sc.nextInt();

            totalHarga = hargaKopi * kopi + hargaTeh * teh + hargaRoti * roti;

            System.out.println("Total harga yang harus dibayar: " + totalHarga);
            sc.nextLine();
        } while (true);

        System.out.println("Semua transaksi selesai.");
    }
}
