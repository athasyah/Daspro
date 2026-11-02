import java.util.Scanner;

/**
 * Latihan4_05
 */
public class Latihan4_05 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int jumlahProduk, jumlahHari;
        int nomorProduk = 1;
        int totalSeluruhProduk = 0;

        do {
            System.out.print("Masukkan jumlah produk: ");
            jumlahProduk = input.nextInt();

            if (jumlahProduk < 1) {
                System.out.println("Jumlah produk minimal 1!");
            }
        } while (jumlahProduk < 1);

        do {
            System.out.print("Masukkan jumlah hari: ");
            jumlahHari = input.nextInt();

            if (jumlahHari < 1) {
                System.out.println("Jumlah hari minimal 1!");
            }
        } while (jumlahHari < 1);

        while (nomorProduk <= jumlahProduk) {

            int totalProduk = 0;

            System.out.println("\nProduk ke-" + nomorProduk);

            for (int hari = 1; hari <= jumlahHari; hari++) {

                int terjual;

                do {
                    System.out.print(
                            "Jumlah terjual hari ke-" + hari + ": ");

                    terjual = input.nextInt();

                    if (terjual < 0) {
                        System.out.println(
                                "Jumlah terjual tidak boleh negatif!");
                    }

                } while (terjual < 0);

                totalProduk += terjual;
            }

            double rataRata = (double) totalProduk / jumlahHari;

            System.out.println("\nRekap Produk ke-" + nomorProduk);
            System.out.println("Total penjualan: " + totalProduk);
            System.out.println("Rata-rata harian: " + rataRata);

            totalSeluruhProduk += totalProduk;

            nomorProduk++;
        }

        System.out.println("\n===== REKAP SELURUH PENJUALAN =====");
        System.out.println(
                "Total seluruh produk: " + totalSeluruhProduk);

        input.close();
    }
}