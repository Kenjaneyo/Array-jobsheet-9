import java.util.Scanner;
public class Tugas1PengelolaanNilai22 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        // Memasukkan banyaknya nilai mahasiswa
        int jumlah;
        do {
            System.out.print("Masukkan banyaknya nilai mahasiswa: ");
            jumlah = input.nextInt();
            if (jumlah <= 0) {
                System.out.println("Jumlah harus lebih dari 0, coba lagi.");
            }
        } while (jumlah <= 0);
 
        int[] nilai = new int[jumlah];
        int total = 0;
 
        // Memasukkan setiap nilai satu per satu
        for (int i = 0; i < nilai.length; i++) {
            System.out.print("Masukkan nilai mahasiswa ke-" + (i + 1) + ": ");
            nilai[i] = input.nextInt();
            total += nilai[i];
        }
 
        // Rata-rata
        double rata2 = (double) total / nilai.length;
 
        // Nilai tertinggi dan terendah
        int tertinggi = nilai[0];
        int terendah = nilai[0];
        for (int i = 1; i < nilai.length; i++) {
            if (nilai[i] > tertinggi) tertinggi = nilai[i];
            if (nilai[i] < terendah) terendah = nilai[i];
        }
 
        // Tampilkan semua nilai beserta status
        System.out.println("\n===== DATA NILAI MAHASISWA =====");
        for (int i = 0; i < nilai.length; i++) {
            String status = (nilai[i] > 70) ? "LULUS" : "TIDAK LULUS";
            System.out.println("Mahasiswa ke-" + (i + 1) + ": " + nilai[i] + " (" + status + ")");
        }
 
        System.out.println("\n===== RINGKASAN =====");
        System.out.printf("Rata-rata       : %.2f%n", rata2);
        System.out.println("Nilai tertinggi : " + tertinggi);
        System.out.println("Nilai terendah  : " + terendah);
 
        input.close();
    }
}
