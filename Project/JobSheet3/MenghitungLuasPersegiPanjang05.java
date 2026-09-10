
import java.util.Scanner;

public class MenghitungLuasPersegiPanjang05 {
    public static void main(String[] args) {
        Scanner atha = new Scanner(System.in);

        int panjang, lebar, luas;

        System.out.print("Masukan panjang persegi panjang: ");
        panjang = atha.nextInt();

        System.out.print("Masukan lebar persegi panjang: ");
        lebar = atha.nextInt();

        luas = panjang * lebar;
        System.out.println("Luas persegi panjang adalah : " + luas);
    }
}
