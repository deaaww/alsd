import java.util.Scanner;

public class tugasDataMatkul08 {
    
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        System.out.println("========================================");

        System.out.print("Masukkan jumlah mata kuliah: ");
        int n = sc.nextInt();
        sc.nextLine();

        System.out.println("========================================");
        
        String[] namaMatkul = new String[n];
        int[] sks = new int[n];
        int[] semester = new int[n];
        String[] hariKuliah = new String[n];
        
        for (int i = 0; i < n; i++) {
            System.out.println("\nMasukkan data mata kuliah ke-" + (i + 1));
            System.out.print("Nama Mata Kuliah: ");
            namaMatkul[i] = sc.nextLine();
            
            System.out.print("SKS: ");
            sks[i] = sc.nextInt();
            
            System.out.print("Semester: ");
            semester[i] = sc.nextInt();
            sc.nextLine();
            
            System.out.print("Hari Kuliah: ");
            hariKuliah[i] = sc.nextLine();
        }

        System.out.println("\n========================================");
        
        int pilihan;
        do {
            System.out.println("\nMenu:");
            System.out.println("1. Tampilkan seluruh jadwal kuliah");
            System.out.println("2. Tampilkan jadwal berdasarkan hari");
            System.out.println("3. Tampilkan jadwal berdasarkan semester");
            System.out.println("4. Cari mata kuliah");
            System.out.println("5. Keluar");
            System.out.print("\nPilih menu: ");
            pilihan = sc.nextInt();
            sc.nextLine();
            
            switch (pilihan) {
                case 1:
                    tampilkanSeluruhJadwal(namaMatkul, sks, semester, hariKuliah);
                    break;
                case 2:
                    System.out.print("Masukkan hari kuliah: ");
                    String hari = sc.nextLine();
                    tampilkanJadwalBerdasarkanHari(namaMatkul, sks, semester, hariKuliah, hari);
                    break;
                case 3:
                    System.out.print("Masukkan semester: ");
                    int sem = sc.nextInt();
                    tampilkanJadwalBerdasarkanSemester(namaMatkul, sks, semester, hariKuliah, sem);
                    break;
                case 4:
                    System.out.print("Masukkan nama mata kuliah: ");
                    String nama = sc.nextLine();
                    cariMataKuliah(namaMatkul, sks, semester, hariKuliah, nama);
                    break;
                case 5:
                    System.out.println("Program selesai.");
                    break;
                default:
                    System.out.println("Pilihan tidak valid!");
            }
        } while (pilihan != 5);

        sc.close();
    }
    
    static void tampilkanSeluruhJadwal(String[] nama, int[] sks, int[] semester, String[] hari) {
        System.out.println("\nJadwal Kuliah:");
        for (int i = 0; i < nama.length; i++) {
            System.out.println(nama[i] + " - " + sks[i] + " SKS - Semester " + semester[i] + " - " + hari[i]);
        }

        System.out.println("========================================");
    }
    
    static void tampilkanJadwalBerdasarkanHari(String[] nama, int[] sks, int[] semester, String[] hari, String targetHari) {
        System.out.println("\nJadwal Kuliah pada hari " + targetHari + ":");
        for (int i = 0; i < nama.length; i++) {
            if (hari[i].equalsIgnoreCase(targetHari)) {
                System.out.println(nama[i] + " - " + sks[i] + " SKS - Semester " + semester[i]);
            }
        }

        System.out.println("========================================");
    }
    
    static void tampilkanJadwalBerdasarkanSemester(String[] nama, int[] sks, int[] semester, String[] hari, int targetSemester) {
        System.out.println("\nJadwal Kuliah pada Semester " + targetSemester + ":");
        for (int i = 0; i < nama.length; i++) {
            if (semester[i] == targetSemester) {
                System.out.println(nama[i] + " - " + sks[i] + " SKS - " + hari[i]);
            }
        }

        System.out.println("========================================");
    }
    
    static void cariMataKuliah(String[] nama, int[] sks, int[] semester, String[] hari, String targetNama) {
        System.out.println("\nHasil pencarian untuk mata kuliah: " + targetNama);
        for (int i = 0; i < nama.length; i++) {
            if (nama[i].equalsIgnoreCase(targetNama)) {
                System.out.println(nama[i] + " - " + sks[i] + " SKS - Semester " + semester[i] + " - " + hari[i]);
                return;
            }
        }

        System.out.println("Mata kuliah tidak ditemukan.");
    }
}