import java.util.Scanner;

public class dosenMain07 {
 
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        dataDosen07 data = new dataDosen07();

        int pilihan;

        while (true) {
            System.out.println("\n====================================================================");
            System.out.println("                                 Menu                               ");
            System.out.println("====================================================================");
            System.out.println("1. Tambah Data");
            System.out.println("2. Tampilkan Data");
            System.out.println("3. Urutkan ASC");
            System.out.println("4. Urutkan DSC");
            System.out.println("5. Cari Dosen berdasarkan Nama (Sequential Search)");
            System.out.println("6. Cari Dosen berdasarkan Usia (Binary Search)");
            System.out.println("7. Keluar");
            System.out.print("\nPilih menu    : ");
            pilihan = sc.nextInt();
            sc.nextLine();
            System.out.println("");

            switch (pilihan) {
                case 1:
                    System.out.print("\nKode          : ");
                    String kode = sc.nextLine();
                    System.out.print("Nama          : ");
                    String nama = sc.nextLine();
                    System.out.println("------------------");
                    System.out.println("true  = Laki-laki");
                    System.out.println("false = Perempuan");
                    System.out.println("------------------");
                    System.out.print("Jenis Kelamin : ");
                    boolean jk = sc.nextBoolean();
                    System.out.print("Usia          : ");
                    int usia = sc.nextInt();
                    data.tambah(new dosen07(kode, nama, jk, usia));
                    break;
                case 2:
                    data.tampil();
                    break;
                case 3:
                    data.sortingASC();
                    data.tampil();
                    System.out.println("\nData telah diurutkan secara ascending.");
                    break;
                case 4:
                    data.sortingDSC();
                    data.tampil();
                    System.out.println("\nData telah diurutkan secara descending.");
                    break;
                case 5:
                    System.out.print("\nMasukkan Nama Dosen yang dicari: ");
                    String cariNama = sc.nextLine();
                    data.DataSequential05(cariNama);
                    break;
                case 6:
                    System.out.print("\nMasukkan Usia Dosen yang dicari: ");
                    int cariUsia = sc.nextInt();
                    data.DataBinary05(cariUsia);
                    break;
                case 7:
                    System.out.println("\nTerima Kasih Sudah Akses Data Dosen");
                    sc.close();
                    return;
                default:
                    System.out.println("Pilihan tidak valid!");
            }
        }
    }
}