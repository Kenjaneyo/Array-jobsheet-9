import java.util.Scanner;
 
// Pertanyaan 4: hitung dan tampilkan jumlah mahasiswa lulus dan tidak lulus
public class ArrayNilai22 {
    public static void main(String[] args) {
        int[] nilaiAkhir = new int[10];
        Scanner input = new Scanner(System.in);
 
        // MODIFIKASI: variabel penghitung
        int jumlahLulus = 0;
        int jumlahTidakLulus = 0;
 
        for (int i = 0; i < nilaiAkhir.length; i++) {
            System.out.print("Masukkan nilai mahasiswa ke-" + (i + 1) + ": ");
            nilaiAkhir[i] = input.nextInt();
        }
 
        for (int i = 0; i < nilaiAkhir.length; i++) {
           if (nilaiAkhir[i] > 70) {
                System.out.println("Mahasiswa ke-" + (i + 1) + ": " + nilaiAkhir[i] + " (LULUS)");
           }}}}