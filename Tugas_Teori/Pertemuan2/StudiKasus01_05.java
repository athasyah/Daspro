
import java.util.Scanner;

public class StudiKasus01_05 {
public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    int panjang,lebar,keliling;

    System.out.print("Input panjang: ");
    panjang = sc.nextInt();
    System.out.print("Input lebar: ");
    lebar = sc.nextInt();

    keliling = 2 * (panjang + lebar);

    System.out.println("Keliling: " + keliling);
}
}