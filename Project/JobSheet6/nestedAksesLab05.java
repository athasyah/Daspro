
import java.util.Scanner;

public class nestedAksesLab05 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        boolean mahasiswaAktif, sedangDisanksi, punyaIzinDosen, asistenLab;

        System.out.print("Apakah mahasiswa aktif: ");
        mahasiswaAktif = sc.nextBoolean();

        System.out.print("Apakah sedang disanksi: ");
        sedangDisanksi = sc.nextBoolean();

        System.out.println("Apakah Mahasiswa Memiliki Izin dosen: ");
        punyaIzinDosen = sc.nextBoolean();

        System.out.println("apakah mahasiswa merupakan asisten lab: ");
        asistenLab = sc.nextBoolean();

        if (mahasiswaAktif && !sedangDisanksi) {
            if (punyaIzinDosen || asistenLab) {
                System.out.println("Akses laboratorium diberikan");
            } else {
                System.out.println("Akses ditolak: membutuhkan izin dosen atau status asisten lab ");
            }
        } else {
            System.out.println("Akses ditolak: stastus mahasiswa tidak memenuhi syarat");
        }
    }
}
