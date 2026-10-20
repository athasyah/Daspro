import java.util.Scanner;

class jamBelajar {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        double totalJam = 0;
        double jamBelajar;

        for (int hari = 1; hari <= 7; hari++) {
            System.out.print("Masukkan jam belajar hari ke-" + hari + ": ");
            jamBelajar = input.nextDouble();

            if (jamBelajar > 10) {
                System.out.println("Input tidak valid! Maksimal 10 jam.");
                hari--;
                continue;
            }

            totalJam += jamBelajar;
        }

        System.out.println("Total jam belajar selama seminggu: " + totalJam + " jam");

        input.close();
    }
}