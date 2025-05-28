import java.util.Scanner;

public class klinikMain0307 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        antrian0307 antrian = new antrian0307();
        riwayat0307 riwayat = new riwayat0307(100);

        int pilihan;
        do {
            System.out.println("\n=== SISTEM ANTRIAN KLINIK ===");
            System.out.println("1. Tambah Pasien ke Antrian");
            System.out.println("2. Lihat Antrian");
            System.out.println("3. Layani Pasien");
            System.out.println("4. Cek Sisa Antrian Pasien");
            System.out.println("5. Lihat Riwayat Transaksi");
            System.out.println("0. Keluar");
            System.out.print("\nPilih: ");
            pilihan = sc.nextInt(); sc.nextLine();

            switch (pilihan) {
                case 1:
                    System.out.print("\nNama Pasien: ");
                    String nama = sc.nextLine();
                    System.out.print("NIK        : ");
                    String nik = sc.nextLine();
                    System.out.print("Keluhan    : ");
                    String keluhan = sc.nextLine();
                    pasien0307 p = new pasien0307(nama, nik, keluhan);
                    antrian.tambahPasien(p);
                    System.out.println(">> Pasien masuk ke dalam antrian.");
                    break;
                case 2:
                    System.out.println("\n-- Antrian Pasien --");
                    antrian.tampilkanAntrian();
                    break;
                case 3:
                    if (antrian.isEmpty()) {
                        System.out.println("\nAntrian kosong.");
                    } else {
                        pasien0307 pasienDilayani = antrian.layaniPasien();
                        System.out.println("\nPasien " + pasienDilayani.nama + " dipanggil");

                        System.out.print("Masukkan ID Dokter           : ");
                        String id = sc.nextLine();
                        System.out.print("Masukkan Nama Dokter         : ");
                        String namaDokter = sc.nextLine();
                        System.out.print("Masukkan Durasi Layanan (jam): ");
                        int durasi = sc.nextInt(); sc.nextLine();

                        dokter0307 d = new dokter0307(id, namaDokter);
                        transaksiLayanan0307 transaksi = new transaksiLayanan0307(pasienDilayani, d, durasi);
                        riwayat.tambah(transaksi);

                        System.out.println(">> Pasien telah dilayani, transaksi berhasil dicatat.");
                    }
                break;
                case 4:
                    int sisa = antrian.hitungSisaAntrian();
                    System.out.println("\n>> Sisa pasien dalam antrian: " + sisa);
                break;
                case 5:
                    riwayat.tampilkan();
                    break;
                case 0:
                    System.out.println("Keluar...");
                    break;
                default:
                    System.out.println("Pilihan tidak valid!");
            }
        } while (pilihan != 0);

        sc.close();
    }
}