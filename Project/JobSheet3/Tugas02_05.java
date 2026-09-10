
import java.util.Scanner;

public class Tugas02_05 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int jumlahCetak, totalHarga, hargaPerLembar = 500, biayaPenjilidan = 5000;

        System.out.print("Masukan jumlah lembar yang ingin dicetak: ");
        jumlahCetak = sc.nextInt();

        totalHarga = jumlahCetak * hargaPerLembar + biayaPenjilidan;

        System.out.println("Total biaya adalah: " + totalHarga);
    }
}
