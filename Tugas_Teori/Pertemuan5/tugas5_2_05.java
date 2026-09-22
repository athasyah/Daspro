
import java.util.Scanner;

public class tugas5_2_05 {
    public static void main(String[] args) {
        Scanner atha = new Scanner(System.in);
        int layanan;

        System.out.println("Daftar Layanan:");
        System.out.println(
                "1. Legalisir Ijazah\n2. Surat Keterangan Aktif Kuliah\n3. Pembayaran UKT\n4. Pengajuan Cuti Akademik");
        System.out.print("Pilih layanan (input angka): ");
        layanan = atha.nextInt();

        switch (layanan) {
            case 1:
                System.out.println("Legalisir ijazah berada di Loket A");
                break;
            case 2:
                System.out.println("Surat keterangan aktif kuliah berada di Loket B");
                break;
            case 3:
                System.out.println("Pembayaran UKT berada di Loket C");
                break;
            case 4:
                System.out.println("Pengajuan cuti akademik berada di Loket D");
                break;
            default:
                System.out.println("Pelayanan pada nomor " + layanan + " tidak tersedia");
                break;
        }
    }
}
