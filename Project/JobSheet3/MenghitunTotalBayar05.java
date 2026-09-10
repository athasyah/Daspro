
import java.util.Scanner;

public class MenghitunTotalBayar05 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double harga;
        double potongan, jml_bayar, diskon = 0.15;

        System.out.print("Masukan harga pakaian: ");
        harga = sc.nextInt();

        potongan = diskon * harga;
        jml_bayar = harga - potongan;

        System.out.println("Jumlah yang harus anda bayar adalah: " + jml_bayar);

    }
}
