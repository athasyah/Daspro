
import java.util.Scanner;

public class Latihan1_05 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int bil1, bil2, bil3;

        System.out.print("Masukan bilangan pertama: ");
        bil1 = sc.nextInt();

        System.out.print("Masukan bilangan kedua: ");
        bil2 = sc.nextInt();

        System.out.print("Masukan bilangan ketiga: ");
        bil3 = sc.nextInt();

        if (bil1 > bil2) {
            if (bil1 > bil3) {
                System.out.println("Bilangan terbesar adalah: " + bil1);
            } else {
                System.out.println("Bilangan terbesar adalah: " + bil3);
            }
        } else {
            if (bil2 > bil3) {
                System.out.println("Bilangan terbesar adalah: " + bil2);
            } else {
                System.out.println("Bilangan terbesar adalah: " + bil3);
            }
        }
    }

}