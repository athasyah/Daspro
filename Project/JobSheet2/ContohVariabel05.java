public class ContohVariabel05 {
    public static void main(String[] args) {
        
        String SalahSatuHobySayaAdalah = "Bermain petak umpet";
        boolean isPandai = true;
        char jenisKelamin = 'L';
        byte umurSayaSekarang = 19;
        double ipk = 3.90, tinggi = 1.78;

        System.out.println(SalahSatuHobySayaAdalah);
        System.out.println("Apakah pandai? " +  isPandai);
        System.out.println("Jenis kelamin: " + jenisKelamin);
        System.out.println("Umurku saat ini: " + umurSayaSekarang);
        System.out.println(String.format("Saya beripk %s, dengan tinggi badan %s", ipk, tinggi ));

    }
}
