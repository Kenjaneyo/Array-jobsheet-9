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
            String status = (nilaiAkhir[i] > 70) ? "LULUS" : "TIDAK LULUS";
            System.out.println("Mahasiswa ke-" + (i + 1) + ": " + nilaiAkhir[i] + " (" + status + ")");
 
            // MODIFIKASI: hitung tiap status
            if (nilaiAkhir[i] > 70) {
                jumlahLulus++;
            } else {
                jumlahTidakLulus++;
            }
        }
 
        // MODIFIKASI: tampilkan di akhir program
        System.out.println("Jumlah mahasiswa lulus       : " + jumlahLulus);
        System.out.println("Jumlah mahasiswa tidak lulus : " + jumlahTidakLulus);
    }
}