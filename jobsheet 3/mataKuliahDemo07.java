import java.util.Scanner;

public class mataKuliahDemo07 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Masukkan jumlah mata kuliah: ");
        int jumlahMataKuliah = Integer.parseInt(sc.nextLine());

        mataKuliah07[] arrayOfMataKuliah07 = new mataKuliah07[jumlahMataKuliah];
        String kode, nama, dummy;
        int sks, jumlahJam;

        for (int i = 0; i < 3; i++) {

            System.out.println("Masukkan Data Mata Kuliah ke-" + (i + 1));

            System.out.print("Kode        : ");
            kode =sc.nextLine();

            System.out.print("Nama        : ");
            nama =sc.nextLine();

            System.out.print("SKS         : ");
            dummy =sc.nextLine();
            sks = Integer.parseInt(dummy);

            System.out.print("Jumlah Jam  : ");
            dummy =sc.nextLine();
            jumlahJam = Integer.parseInt(dummy);

            System.out.println("-------------------------------");

            arrayOfMataKuliah07[i] = new mataKuliah07("", "", 0, 0); // Inisialisasi objek
            arrayOfMataKuliah07[i].tambahData(kode, nama, sks, jumlahJam); // Menggunakan method tambahData
        }

        System.out.println("\n-------------------------------");

        for (int i = 0; i < jumlahMataKuliah; i++) {
            System.out.println("Data Mata Kuliah ke-" + (i + 1));
            arrayOfMataKuliah07[i].cetakInfo(); // Menggunakan method cetakInfo
        }

        sc.close();
    }
}