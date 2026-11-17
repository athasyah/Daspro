
import java.util.Scanner;

/**
 * Contoh1
 */
public class Contoh1 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[][] penjualan = {
                { 2, 8, 6, 0 }, // Dieng
                { 7, 3, 6, 0 }, // Soehat
                { 4, 6, 5, 0 }, // Sengkaling
                { 0, 0, 0, 0 }
        };

        for (int i = 0; i < penjualan.length - 1; i++) {
            int total = 0;

            for (int j = 0; j < 3; j++) {
                total += penjualan[i][j];

            }
            penjualan[i][3] = total;
        }

        for (int j = 0; j < 4; j++) {
            int total = 0;

            for (int i = 0; i < 3; i++) {
                total += penjualan[i][j];
            }

            penjualan[3][j] = total;
        }

        for (int i = 0; i < penjualan.length; i++) {
            for (int j = 0; j < penjualan[i].length; j++) {
                System.out.print(penjualan[i][j] + "\t");
            }
            System.out.println();
        }

    }
}