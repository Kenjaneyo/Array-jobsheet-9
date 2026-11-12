import java.util.Scanner;

public class Tugas2PemesananKafe22 {
    public static void main(String[] args) {
         Scanner input = new Scanner(System.in);
 
        String[] menu = {"Nasi Goreng", "Mie Goreng", "Roti Bakar", "Kentang Goreng", "Teh Tarik", "Cappucino", "Chocolate Ice"};
        int[] harga = {15000, 13000, 10000, 12000, 8000, 18000, 20000};
 
        System.out.println("============ KAFE KAMPUS ============");
        System.out.println("Daftar Menu:");
        for (int i = 0; i < menu.length; i++) {
            System.out.println((i + 1) + ". " + menu[i] + " - Rp " + harga[i]);
        }
 
        System.out.println("\n--- Pencarian Menu ---");
        String cari;
        do {
            System.out.print("Cari menu (ketik 'selesai' untuk lanjut memesan): ");
            cari = input.nextLine();
 
            if (!cari.equalsIgnoreCase("selesai")) {
                int indeks = -1;
                for (int i = 0; i < menu.length; i++) {
                    if (menu[i].equalsIgnoreCase(cari)) {
                        indeks = i;
                        break;
                    }
                }
 
                if (indeks != -1) {
                    System.out.println("Menu " + menu[indeks] + " tersedia, harga Rp " + harga[indeks]);
                } else {
                    System.out.println("Maaf, menu " + cari + " tidak tersedia.");
                }
            }
        } while (!cari.equalsIgnoreCase("selesai"));
 
        System.out.println("\n--- Pemesanan ---");
        int jumlah;
        do {
            System.out.print("Masukkan jumlah item yang ingin dipesan: ");
            jumlah = input.nextInt();
            input.nextLine();
            if (jumlah <= 0) {
                System.out.println("Jumlah item harus lebih dari 0.");
            }
        } while (jumlah <= 0);
 
        String[] pesanan = new String[jumlah];
        int[] hargaPesanan = new int[jumlah];
        int totalBiaya = 0;
 
        for (int i = 0; i < jumlah; i++) {
            int indeks;
            do {
                System.out.print("Pesanan ke-" + (i + 1) + " (nama menu): ");
                String nama = input.nextLine();
 
                indeks = -1;
                for (int j = 0; j < menu.length; j++) {
                    if (menu[j].equalsIgnoreCase(nama)) {
                        indeks = j;
                        break;
                    }
                }
 
                if (indeks == -1) {
                    System.out.println("Menu tidak tersedia, silakan masukkan lagi.");
                }
            } while (indeks == -1);
 
            pesanan[i] = menu[indeks];
            hargaPesanan[i] = harga[indeks];
            totalBiaya += harga[indeks];
        }
 
        System.out.println("\n========== STRUK PESANAN ==========");
        System.out.printf("%-4s%-18s %9s%n", "No", "Menu", "Harga");
        System.out.println("--------------------------------");
        for (int i = 0; i < pesanan.length; i++) {
            System.out.printf("%-4d%-18s Rp %6d%n", (i + 1), pesanan[i], hargaPesanan[i]);
        }
        System.out.println("--------------------------------");
        System.out.printf("%-22s Rp %6d%n", "TOTAL BIAYA", totalBiaya);
        System.out.println("================================");
 
        input.close();
    }
}
