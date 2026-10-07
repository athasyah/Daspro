import java.util.Scanner;

public class StudiKasus1_05 {
    public static void main(String[] args) {
        Scanner atha = new Scanner(System.in);

        int hargaPerCup = 18000;
        int jumlahCup, uangBayar, totalHarga, totalBayar, kembalian, kurang;
        int diskon = 0;

        System.out.print("Input jumlah cup\t: ");
        jumlahCup = atha.nextInt();

        System.out.print("Input uang bayar\t: ");
        uangBayar = atha.nextInt();

        totalHarga = jumlahCup * hargaPerCup;

        if (totalHarga >= 100000) {
            diskon = totalHarga * 10 / 100;
        }

        totalBayar = totalHarga - diskon;

        System.out.println("Total harga\t\t: " + totalHarga);
        System.out.println("Diskon\t\t\t: " + diskon);
        System.out.println("Total bayar\t\t: " + totalBayar);

        if (uangBayar >= totalBayar) {
            kembalian = uangBayar - totalBayar;
            System.out.println("Kembalian\t\t: " + kembalian);
        } else {
            kurang = totalBayar - uangBayar;
            System.out.println("Uang tidak cukup, kurang Rp " + kurang);
        }
    }
}
