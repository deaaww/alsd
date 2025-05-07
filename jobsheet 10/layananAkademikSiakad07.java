import java.util.Scanner;

public class layananAkademikSiakad07 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        antrianLayanan07 antrian = new antrianLayanan07(5);

        int pilihan;

        do {
            System.out.println("\n=== Menu Antrian Layanan Akademik ===");
            System.out.println("1. Tambah Mahasiswa ke Antrian");
            System.out.println("2. Layani Mahasiswa");
            System.out.println("3. Lihat Mahasiswa Terdepan");
            System.out.println("4. Lihat Semua Antrian");
            System.out.println("5. Jumlah Antrian");
            System.out.println("6. Cek Antrian paling belakang");
            System.out.println("7. Jumlah Mahasiswa dalam Antrian");
            System.out.println("0. Keluar");
            System.out.print("\nPilih menu: ");
            pilihan = sc.nextInt();
            sc.nextLine();

            switch (pilihan) {
                case 1:
                    System.out.print("\nNIM   : ");
                    String nim = sc.nextLine();
                    System.out.print("Nama  : ");
                    String nama = sc.nextLine();
                    System.out.print("Prodi : ");
                    String prodi = sc.nextLine();
                    System.out.print("Kelas : ");
                    String kelas = sc.nextLine();
                    mahasiswa07 mhs = new mahasiswa07(nim, nama, prodi, kelas);
                    antrian.tambahAntrian(mhs);
                    break;
                case 2:
                    mahasiswa07 dilayani = antrian.layaniMahasiswa();
                    if (dilayani != null) {
                        System.out.print("\nMelayani Mahasiswa: ");
                        dilayani.tampilkanData();
                    }
                    break;
                case 3:
                    antrian.lihatTerdepan();
                    break;
                case 4:
                    antrian.tampilkanSemua();
                    break;
                case 5:
                    System.out.println("\nJumlah dalam antrian: " + antrian.getJumlahAntrian());
                    break;
                case 6:
                    antrian.lihatAkhir();
                    break;
                case 7:
                    System.out.println("\nJumlah Mahasiswa dalam antrian: " + antrian.getJumlahAntrian());
                    break;
                case 0:
                    System.out.println("\nTerima kasih.");
                    break;
                default:
                    System.out.println("\nPilihan tidak valid!");
            }
        } while (pilihan != 0);

        sc.close();
    }
}