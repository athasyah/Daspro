
import java.util.Scanner;

public class Contoh2 {
    public static void main(String[] args) {
        String[] kota = { "Tokyo", "Osaka", "Sapporo",
                "Fukuoka", "Naha" };

        double[][] suhu = new double[5][7];
        Scanner sc = new Scanner(System.in);

        // Input suhu
        for (int i = 0; i < suhu.length; i++) {
            for (int j = 0; j < suhu[i].length; j++) {
                System.out.print(kota[i] + " hari " + (j + 1) + ": ");
                suhu[i][j] = sc.nextDouble();
            }
        }
        double max = suhu[0][0];
        double min = suhu[0][0];

        int kotaMax = 0, hariMax = 0;
        int kotaMin = 0, hariMin = 0;

        for (int i = 0; i < suhu.length; i++) {
            for (int j = 0; j < suhu[i].length; j++) {

                if (suhu[i][j] > max) {
                    max = suhu[i][j];
                    kotaMax = i;
                    hariMax = j;
                }

                if (suhu[i][j] < min) {
                    min = suhu[i][j];
                    kotaMin = i;
                    hariMin = j;
                }
            }
        }

        // Menampilkan hasil
        System.out.println("\n=== HASIL SUHU ===");

        System.out.println("Suhu tertinggi: " + max + "°C");
        System.out.println("Kota: " + kota[kotaMax]);
        System.out.println("Hari ke-" + (hariMax + 1));

        System.out.println("\nSuhu terendah: " + min + "°C");
        System.out.println("Kota: " + kota[kotaMin]);
        System.out.println("Hari ke-" + (hariMin + 1));

        sc.close();
    }
}
