import java.util.Scanner;

public class bonusGaji {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        double jamKerja, gajiHarian, bonus;

        while (true) {
            System.out.print("Masukkan jam kerja: ");
            jamKerja = input.nextDouble();

            if (jamKerja < 0) {
                break;
            }

            System.out.print("Masukkan gaji harian: Rp");
            gajiHarian = input.nextDouble();

            if (jamKerja > 8) {
                bonus = 0.20 * gajiHarian;
            } else {
                bonus = 0;
            }

            System.out.println("Bonus pegawai: Rp" + bonus);
            System.out.println();
        }

        System.out.println("Program selesai.");
        input.close();
    }
}
