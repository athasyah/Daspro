import java.util.Scanner;

public class Tugas1Pemilihan05 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("----- CETAK KRS SIAKAD -----");
        System.out.print("Apakah UKT sudah lunas? (true/false) : ");
        boolean uktlunas = sc.nextBoolean();

        String pesan = (uktlunas)
                ? "Pembayaran UKT terverifikasi\nSIlahkan cetak KRS dan minta tanda tangan DPA"
                : "Registrasi ditolak. Silahkan lunasi UKT terlebih dahulu";

        System.out.println(pesan);
    }
}
