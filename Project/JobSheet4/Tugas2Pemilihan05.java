
import java.util.Scanner;

public class Tugas2Pemilihan05 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Input jumlah sks: ");
        int jumlahSks = sc.nextInt();

        if (jumlahSks > 24) {
            System.out.println("sks melebihi batas");
        } else {
            System.out.println("KRS valid");
        }
    }
}
