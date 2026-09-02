import java.util.Scanner;

public class Tugas01_05 {
    public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);

        //deklarasi variable dan tipe data
        int gaji_pokok, tunjangan_anak, jumlah_anak;
        float potongan_dana_pensiun, gaji_bersih;

        // Inputan
        System.out.print("Input gaji pokok: ");
        gaji_pokok = sc.nextInt();
        System.out.print("Input tunjangan anak: ");
        tunjangan_anak = sc.nextInt();
        System.out.print("Input jumlah anak: ");
        jumlah_anak = sc.nextInt();

        //Proses
        potongan_dana_pensiun = gaji_pokok / 100 * 10;
        gaji_bersih = gaji_pokok - potongan_dana_pensiun + (jumlah_anak * tunjangan_anak);

        //Output
        System.out.println("Potongan dana pensiun: " + potongan_dana_pensiun);
        System.out.println("Gaji bersih: " + gaji_bersih);

    }
}
