
import java.util.Scanner;

public class Tugas2_05 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        String[] menu = {
            "Nasi Goreng", "Mie Goreng", "Roti Bakar",
            "Kentang Goreng", "Teh Tarik", "Cappucino",
            "Chocolate Ice"
        };

        int[] harga = {
            15000, 13000, 10000, 12000, 8000, 18000, 20000
        };

        int pilihan;

        do {
            System.out.println("\n==================================");
            System.out.println("       KAFE KAMPUS POLINEMA");
            System.out.println("==================================");
            System.out.println("1. Cari Menu");
            System.out.println("2. Pesan Menu");
            System.out.println("0. Keluar");
            System.out.println("----------------------------------");
            System.out.print("Pilih menu: ");
            pilihan = input.nextInt();
            input.nextLine();

            switch (pilihan) {
                case 1:
                    System.out.println("\n=== PENCARIAN MENU ===");
                    System.out.print("Masukkan nama menu: ");
                    String cari = input.nextLine();

                    int posisi = -1;

                    for (int i = 0; i < menu.length; i++) {
                        if (menu[i].equalsIgnoreCase(cari)) {
                            posisi = i;
                            break;
                        }
                    }

                    if (posisi != -1) {
                        System.out.println("Menu ditemukan!");
                        System.out.println("Nama  : " + menu[posisi]);
                        System.out.println("Harga : Rp" + harga[posisi]);
                    } else {
                        System.out.println("Maaf, menu tidak tersedia.");
                    }
                    break;

                case 2:
                    System.out.println("\n=== DAFTAR MENU ===");

                    for (int i = 0; i < menu.length; i++) {
                        System.out.println((i + 1) + ". " + menu[i]
                                + " - Rp" + harga[i]);
                    }

                    System.out.print("\nMasukkan jumlah item yang ingin dipesan: ");
                    int jumlah = input.nextInt();
                    input.nextLine();

                    if (jumlah <= 0) {
                        System.out.println("Jumlah pesanan harus lebih dari 0.");
                        break;
                    }

                    String[] pesanan = new String[jumlah];
                    int[] hargaPesanan = new int[jumlah];

                    int totalBiaya = 0;

                    for (int i = 0; i < jumlah; i++) {
                        boolean ditemukan = false;

                        while (!ditemukan) {
                            System.out.print("Masukkan nama menu pesanan ke-"
                                    + (i + 1) + ": ");
                            String namaPesanan = input.nextLine();

                            for (int j = 0; j < menu.length; j++) {
                                if (menu[j].equalsIgnoreCase(namaPesanan)) {
                                    pesanan[i] = menu[j];
                                    hargaPesanan[i] = harga[j];
                                    totalBiaya += harga[j];
                                    ditemukan = true;
                                    break;
                                }
                            }

                            if (!ditemukan) {
                                System.out.println(
                                    "Menu tidak tersedia. Silakan masukkan kembali."
                                );
                            }
                        }
                    }

                    System.out.println("\n==================================");
                    System.out.println("          STRUK PEMESANAN");
                    System.out.println("==================================");

                    for (int i = 0; i < pesanan.length; i++) {
                        System.out.println((i + 1) + ". " + pesanan[i]
                                + " - Rp" + hargaPesanan[i]);
                    }

                    System.out.println("----------------------------------");
                    System.out.println("Total biaya : Rp" + totalBiaya);
                    System.out.println("==================================");
                    System.out.println("Terima kasih telah memesan!");
                    break;

                case 0:
                    System.out.println("\nTerima kasih telah mengunjungi Kafe Kampus!");
                    break;

                default:
                    System.out.println("\nPilihan tidak valid. Silakan pilih kembali.");
            }

        } while (pilihan != 0);

        input.close();
    }
}
