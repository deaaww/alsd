import java.util.Scanner;

public class siakadMain {
    
    static mahasiswa0708[] listMhs07 = {
        new mahasiswa0708("22001", "Ali Rahman  ", "Informatika"),
        new mahasiswa0708("22002", "Budi Santoso", "Informatika"),
        new mahasiswa0708("22003", "Citra Dewi  ", "Sistem Informasi Bisnis")
    };

    static mataKuliah0708[] listMK07 = {
        new mataKuliah0708("MK001", "Struktur Data", 3),
        new mataKuliah0708("MK002", "Basis Data   ", 3),
        new mataKuliah0708("MK003", "Desain Web   ", 3)
    };

    static penilaian0708[] listPenilaian07 = {
        new penilaian0708(listMhs07[0], listMK07[0], 80, 85, 90), // Ali - Struktur Data
        new penilaian0708(listMhs07[0], listMK07[1], 60, 70, 75), // Ali - Basis Data
        new penilaian0708(listMhs07[1], listMK07[0], 70, 76, 80), // Budi - Struktur Data
        new penilaian0708(listMhs07[2], listMK07[1], 85, 90, 95), // Citra - Basis Data
        new penilaian0708(listMhs07[2], listMK07[2], 70, 75, 80)  // Citra - Desain Web
    };

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        
        int pilihan07;

        do {
            System.out.println("\n=====        MENU SISTEM AKADEMIK       =====");
            System.out.println("1. Tampilkan Daftar Mahasiswa");
            System.out.println("2. Tampilkan Daftar Mata Kuliah");
            System.out.println("3. Tampilkan Data Penilaian");
            System.out.println("4. Urutkan Mahasiswa Berdasarkan Nilai Akhir");
            System.out.println("5. Cari Mahasiswa Berdasarkan NIM");
            System.out.println("0. Keluar");
            System.out.print("\nPilih menu: ");
            pilihan07 = sc.nextInt();
            sc.nextLine();

            switch (pilihan07) {
                case 1:
                    tampilMahasiswa07();
                    break;
                case 2:
                    tampilMatakuliah07();
                    break;
                case 3:
                    tampilDataPenilaian07();
                    break;
                case 4:
                    urutkanMahasiswa07();
                    break;
                case 5:
                    cariMahasiswa07(sc);
                    break;
                case 0:
                    System.out.println("Keluar dari program.");
                    break;
                default:
                    System.out.println("Pilihan tidak valid!");
            }
        } while (pilihan07 != 0);
    }

    public static void tampilMahasiswa07() {
        System.out.println("\nDaftar Mahasiswa:");
        for (mahasiswa0708 m : listMhs07) {
            m.tampilMahasiswa07();
        }
    }

    public static void tampilMatakuliah07() {
        System.out.println("\nDaftar Mata Kuliah:");
        for (mataKuliah0708 mk : listMK07) {
            mk.tampilMatakuliah07();
        }
    }

    public static void tampilDataPenilaian07() {
        System.out.println("\nData Penilaian:");
        for (penilaian0708 p : listPenilaian07) {
            p.tampilPenilaian07();
        }
    }

    public static void urutkanMahasiswa07() {
        bubbleSort07();
        tampilDataPenilaian07();
    }

    public static void bubbleSort07() {
        for (int i = 0; i < listPenilaian07.length - 1; i++) {
            for (int j = 1; j < listPenilaian07.length - i; j++) {
                if (listPenilaian07[j].nilaiAkhir07 > listPenilaian07[j - 1].nilaiAkhir07) {
                    penilaian0708 tmp = listPenilaian07[j];
                    listPenilaian07[j] = listPenilaian07[j - 1];
                    listPenilaian07[j - 1] = tmp;
                }
            }
        }
    }

    public static void cariMahasiswa07(Scanner sc) {
        System.out.print("\nMasukkan NIM mahasiswa yang dicari: ");
        String cariNim07 = sc.nextLine();
        boolean ditemukan07 = false;

        for (mahasiswa0708 m : listMhs07) {
            if (m.nim07.equals(cariNim07)) {
                System.out.println("Mahasiswa Ditemukan:");
                m.tampilMahasiswa07();
                ditemukan07 = true;
                break;
            }
        }

        if (!ditemukan07) {
            System.out.println("Mahasiswa dengan NIM " + cariNim07 + " tidak ditemukan.");
        }
    }
}