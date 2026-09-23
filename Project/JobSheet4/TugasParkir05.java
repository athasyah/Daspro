import java.util.Scanner;

public class TugasParkir05 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int jam, harga;

        System.out.print("Masukkan lama parkir(jam): ");
        jam = sc.nextInt();

        if (jam <= 2) {
            harga = 2000;
        } else {
            harga = (jam - 2) * 1000 + 2000;
        }

        System.out.println("Harga parkir adalah: " + harga);
    }
}
