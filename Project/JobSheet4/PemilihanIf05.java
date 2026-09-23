
import java.util.Scanner;

public class PemilihanIf05 {
    public static void main(String[] args) {
Scanner sc = new Scanner(System.in);

System.out.println("----- CETAK KRS SIAKAD -----");
System.out.print("Apakah UKT sudah lunas? (true/false) : ");
boolean uktunas = sc.nextBoolean();

if (uktunas) {
    System.out.println("Pembayaran UKT terverifikasi");
    System.out.println("SIlahkan cetak KRS dan minta tanda tangan DPA");
} else {
    System.out.println("Registrasi ditolak. Silahkan lunasi UKT terlebih dahulu");
}
    }
}
