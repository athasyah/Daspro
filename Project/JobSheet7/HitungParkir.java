import java.util.Scanner;

public class HitungParkir {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        int jenis, durasi;
        int total = 0; 
        
        do {
            System.out.print("Masukkan jenis (1: mobil, 2: motor, 0: keluar): ");
            jenis = scanner.nextInt(); 
            
            if (jenis == 1 || jenis == 2) {
                System.out.print("Masukkan durasi (jam): ");
                durasi = scanner.nextInt(); 
                
                if (jenis == 1) {
                    total += durasi * 3000; 
                } else {
                    total += durasi * 2000; 
                }
            }
        } while (jenis != 0); 
        
        System.out.println("Total pembayaran parkir: Rp " + total);
        
        scanner.close();
    }
}