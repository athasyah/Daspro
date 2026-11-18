
import java.util.Scanner;

public class BioskopWithScanne05 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int baris, kolom, pilihan;
        String nama;
        String[][] penonton = new String[4][2];

        while (true) {
            System.out.println("\n=== MENU BIOSKOP ===");
            System.out.println("1. Input data penonton");
            System.out.println("2. Tampilkan daftar penonton");
            System.out.println("3. Exit");
            System.out.print("Pilih menu: ");

            pilihan = sc.nextInt();
            sc.nextLine();

            switch (pilihan) {

                // MODIFIKASI NO 3
                // case 1:
                // System.out.print("Masukkan nama: ");
                // nama = sc.nextLine();

                // System.out.print("Masukkan baris: ");
                // baris = sc.nextInt();

                // System.out.print("Masukkan kolom: ");
                // kolom = sc.nextInt();
                // sc.nextLine();

                // if (baris < 1 || baris > penonton.length) {
                // System.out.println("Nomor baris tidak tersedia!");
                // } else if (kolom < 1 || kolom > penonton[baris - 1].length) {
                // System.out.println("Nomor kolom tidak tersedia!");
                // } else {
                // penonton[baris - 1][kolom - 1] = nama;
                // System.out.println("Data penonton berhasil ditambahkan!");
                // }
                // break;

                case 1:
                    System.out.print("Masukkan nama: ");
                    nama = sc.nextLine();

                    while (true) {
                        System.out.print("Masukkan baris: ");
                        baris = sc.nextInt();

                        if (baris < 1 || baris > penonton.length) {
                            System.out.println("Nomor baris tidak tersedia!");
                            continue;
                        }

                        System.out.print("Masukkan kolom: ");
                        kolom = sc.nextInt();
                        sc.nextLine();

                        if (kolom < 1 || kolom > penonton[baris - 1].length) {
                            System.out.println("Nomor kolom tidak tersedia!");
                            continue;
                        }

                        if (penonton[baris - 1][kolom - 1] != null) {
                            System.out.println("Kursi sudah terisi! Silakan pilih kursi lain.");
                            continue;
                        }

                        penonton[baris - 1][kolom - 1] = nama;
                        System.out.println("Data penonton berhasil ditambahkan!");
                        break;
                    }
                    break;

                case 2:
                    System.out.println("Daftar Penonton:");

                    for (int i = 0; i < penonton.length; i++) {
                        for (int j = 0; j < penonton[i].length; j++) {
                            if (penonton[i][j] == null) {
                                System.out.print("***\t");
                            } else {
                                System.out.print(penonton[i][j] + "\t");
                            }
                        }
                        System.out.println();
                    }
                    break;

                case 3:
                    System.out.println("Terima kasih!");
                    sc.close();
                    return;

                default:
                    System.out.println("Pilihan tidak tersedia!");
            }
        }
    }
}
