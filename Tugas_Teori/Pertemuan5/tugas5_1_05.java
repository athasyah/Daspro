import java.util.Scanner;

public class tugas5_1_05 {
    public static void main(String[] args) {
        Scanner atha = new Scanner(System.in);

        int jam, harga;

        System.out.print("Masukkan lama parkir(jam): ");
        jam = atha.nextInt();

        harga = (jam <= 2) ? 2000 : (jam - 2) * 1000 + 2000;

        System.out.println("Harga parkir adalah: " + harga);
    }
}
