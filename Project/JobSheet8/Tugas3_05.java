import java.util.Scanner;

public class Tugas3_05 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int jumlahToko;

        do {
            System.out.print("Masukkan jumlah toko (minimal 1): ");
            jumlahToko = sc.nextInt();

            if (jumlahToko < 1) {
                System.out.println("Jumlah toko tidak boleh kurang dari 1!");
            }
        } while (jumlahToko < 1);

        int nomorToko = 1;
        int totalBarangSeluruhToko = 0;
        int barangTerbanyak = -1;
        int tokoTerbanyak = 0;

        while (nomorToko <= jumlahToko) {
            System.out.println("\nToko " + nomorToko);

            int jumlahPelanggan;

            do {
                System.out.print("Masukkan jumlah pelanggan: ");
                jumlahPelanggan = sc.nextInt();

                if (jumlahPelanggan < 0) {
                    System.out.println(
                            "Jumlah pelanggan tidak boleh negatif!");
                }
            } while (jumlahPelanggan < 0);

            int nomorPelanggan = 1;
            int totalBarangToko = 0;

            while (nomorPelanggan <= jumlahPelanggan) {
                int jumlahBarang;

                do {
                    System.out.print(
                            "Jumlah barang pelanggan "
                                    + nomorPelanggan + ": ");
                    jumlahBarang = sc.nextInt();

                    if (jumlahBarang < 0) {
                        System.out.println(
                                "Jumlah barang tidak boleh negatif!");
                    }
                } while (jumlahBarang < 0);

                totalBarangToko += jumlahBarang;
                nomorPelanggan++;
            }

            System.out.println(
                    "Toko " + nomorToko
                            + " - pelanggan: " + jumlahPelanggan
                            + ", total barang: " + totalBarangToko);

            totalBarangSeluruhToko += totalBarangToko;

            if (totalBarangToko > barangTerbanyak) {
                barangTerbanyak = totalBarangToko;
                tokoTerbanyak = nomorToko;
            }

            nomorToko++;
        }

        System.out.println("\nTotal barang seluruh toko: "
                + totalBarangSeluruhToko);
        System.out.println("Toko dengan barang terbanyak: "
                + tokoTerbanyak);

        sc.close();
    }
}
