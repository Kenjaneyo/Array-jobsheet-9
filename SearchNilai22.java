import java.util.Arrays;
import java.util.Scanner;
public class SearchNilai22 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int[] nilai = {78, 65, 90, 55, 88, 72};
        int key = 100;
        boolean ditemukan = false;
 
        for (int i = 0; i < nilai.length; i++) {
            if (nilai[i] == key) {
                System.out.println("Nilai " + key + " ditemukan pada indeks ke-" + i);
                ditemukan = true;
                break;
            }
        }
        if (!ditemukan) {
            System.out.println("Nilai yang dicari tidak ditemukan.");
            System.out.println("Nilai " + key + " tidak ada di dalam array " + Arrays.toString(nilai));
    }
}}