public class Latihan1B_05 {
    public static void main(String[] args) {
        int a = 10;

        for (int i = 0; i < a; i++) {

            for (int j = 0; j < a - i; j++) {
                System.out.print(" ");
            }

            for (int k = 0; k < i; k++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
