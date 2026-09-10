
import java.util.Scanner;

public class Tugas01_05 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double hargaLaptop, uangMuka, hargaDitambahBunga, cicilanPerBulan, uangSisa, bunga;
        int bulan;

        System.out.print("Masukan harga laptop: ");
        hargaLaptop = sc.nextDouble();

        System.out.print("Masukan uang muka: ");
        uangMuka = sc.nextDouble();

        System.out.print("Masukan jumlah bulan: ");
        bulan = sc.nextInt();

        uangSisa = hargaLaptop - uangMuka;
        bunga = uangSisa * 0.02;
        cicilanPerBulan = uangSisa / bulan;
        hargaDitambahBunga = cicilanPerBulan + bunga;

        System.out.println("Harga bayar per bulan adalah : " + hargaDitambahBunga);

        sc.close();
    }
}