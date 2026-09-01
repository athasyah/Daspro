
import java.util.Scanner;

/*
 * Alur pengerjaan:
 * 1. Memasukkan gaji pokok, tunjangan anak, dan jumlah anak.
 * 2. Menghitung potongan dana pensiun sebesar 10% dari gaji pokok.
 * 3. Menghitung total tunjangan anak berdasarkan jumlah anak
 *    dikalikan dengan tunjangan untuk setiap anak.
 * 4. Menghitung gaji bersih dengan mengurangi gaji pokok
 *    dengan potongan dana pensiun, kemudian menambahkan
 *    total tunjangan anak.
 * 5. Menampilkan hasil perhitungan gaji bersih.
 */

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
        System.out.println("Gaji bersih: " + gaji_bersih);

    }
}
