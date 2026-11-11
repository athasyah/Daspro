
import java.util.Scanner;

public class Tugas1_05 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Masukkan jumlah mahasiswa: ");
        int n = input.nextInt();

        if (n <= 0) {
            System.out.println("Jumlah mahasiswa harus lebih dari 0.");
        } else {
            int[] nilaiMhs = new int[n];
            int total = 0;
            int tertinggi, terendah;
            double rata2;

            for (int i = 0; i < nilaiMhs.length; i++) {
                System.out.print("Masukkan nilai mahasiswa ke-" + (i + 1) + ": ");
                nilaiMhs[i] = input.nextInt();

                total += nilaiMhs[i];
            }

            rata2 = (double) total / nilaiMhs.length;

            tertinggi = nilaiMhs[0];
            terendah = nilaiMhs[0];

            for (int i = 1; i < nilaiMhs.length; i++) {
                if (nilaiMhs[i] > tertinggi) {
                    tertinggi = nilaiMhs[i];
                }

                if (nilaiMhs[i] < terendah) {
                    terendah = nilaiMhs[i];
                }
            }

            System.out.println("\n=== DAFTAR NILAI MAHASISWA ===");

            for (int i = 0; i < nilaiMhs.length; i++) {
                String status = (nilaiMhs[i] > 70)
                        ? "LULUS" : "TIDAK LULUS";

                System.out.println("Mahasiswa ke-" + (i + 1)
                        + ": " + nilaiMhs[i] + " (" + status + ")");
            }

            System.out.println("\n=== HASIL PENGELOLAAN NILAI ===");
            System.out.println("Jumlah mahasiswa: " + n);
            System.out.println("Total nilai: " + total);
            System.out.println("Rata-rata: " + rata2);
            System.out.println("Nilai tertinggi: " + tertinggi);
            System.out.println("Nilai terendah: " + terendah);
        }

        input.close();
    }
}
