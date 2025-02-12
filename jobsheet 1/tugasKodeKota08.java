import java.util.Scanner;

public class tugasKodeKota08 {
    
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        char[] kode = {'A', 'B', 'D', 'E', 'F', 'G', 'H', 'L', 'N', 'T'}; //kode plat mobil

        char[][] kota = {
                {'B', 'A', 'N', 'T', 'E', 'N'},
                {'J', 'A', 'K', 'A', 'R', 'T', 'A'},
                {'B', 'A', 'N', 'D', 'U', 'N', 'G'},
                {'C', 'I', 'R', 'E', 'B', 'O', 'N'},
                {'B', 'O', 'G', 'O', 'R'},
                {'P', 'E', 'K', 'A', 'L', 'O', 'N', 'G', 'A', 'N'},
                {'S', 'E', 'M', 'A', 'R', 'A', 'N', 'G'},
                {'S', 'U', 'R', 'A', 'B', 'A', 'Y', 'A'},
                {'M', 'A', 'L', 'A', 'N', 'G'},
                {'T', 'E', 'G', 'A', 'L'}
        }; //nama kota

        System.out.println("==============================================================================");

        while (true) {
            System.out.print("\nMasukkan kode plat nomor (huruf kapital, atau ketik 'keluar' untuk selesai): ");
            String kodePlat = sc.nextLine();

            if (kodePlat.equalsIgnoreCase("keluar")) {
                break; //keluar
            }

            if (kodePlat.length() != 1) {
                System.out.println("Kode plat nomor harus terdiri dari satu huruf kapital.");
                continue; //input lagi
            }

            char kode1 = kodePlat.charAt(0);

            boolean ditemukan = false;
            for (int i = 0; i < kode.length; i++) {
                if (kode[i] == kode1) {
                    ditemukan = true;
                    System.out.print("Kota : ");
                    for (int j = 0; j < kota[i].length; j++) {
                        System.out.print(kota[i][j]);
                    }
                    System.out.println();
                    break;
                }
            }

            if (!ditemukan) {
                System.out.println("Kode plat nomor tidak ditemukan.");
            }
        }

        System.out.println("\n==============================================================================");

        System.out.println("Terima kasih telah menggunakan program ini.");
        sc.close();
    }

}