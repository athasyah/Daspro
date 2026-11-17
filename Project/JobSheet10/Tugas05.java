import java.util.Scanner;

public class Tugas05 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int[][] survei = new int[10][6];
        double total, rataRata;

        System.out.println("=== INPUT HASIL SURVEI ===");

        for (int i = 0; i < 10; i++) {
            System.out.println("\nResponden ke-" + (i + 1));

            for (int j = 0; j < 6; j++) {
                do {
                    System.out.print("Pertanyaan ke-" + (j + 1) + " (1-5): ");
                    survei[i][j] = input.nextInt();

                    if (survei[i][j] < 1 || survei[i][j] > 5) {
                        System.out.println("Nilai harus antara 1-5!");
                    }
                } while (survei[i][j] < 1 || survei[i][j] > 5);
            }
        }

        System.out.println("\n=== RATA-RATA SETIAP RESPONDEN ===");

        for (int i = 0; i < 10; i++) {
            total = 0;

            for (int j = 0; j < 6; j++) {
                total += survei[i][j];
            }

            rataRata = total / 6;

            System.out.printf("Responden %d: %.2f%n",
                    (i + 1), rataRata);
        }

        System.out.println("\n=== RATA-RATA SETIAP PERTANYAAN ===");

        for (int j = 0; j < 6; j++) {
            total = 0;

            for (int i = 0; i < 10; i++) {
                total += survei[i][j];
            }

            rataRata = total / 10;

            System.out.printf("Pertanyaan %d: %.2f%n",
                    (j + 1), rataRata);
        }

        total = 0;

        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 6; j++) {
                total += survei[i][j];
            }
        }

        rataRata = total / (10 * 6);

        System.out.println("\n=== RATA-RATA KESELURUHAN ===");
        System.out.printf("Rata-rata seluruh survei: %.2f%n",
                rataRata);

        input.close();
    }

}