import java.util.Scanner;

public class mahasiswaDemo07 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        /*int jumMhs = 5;
        mahasiswaBerprestasi07 list = new mahasiswaBerprestasi07(jumMhs);*/

        System.out.println("-----------------------------------");
        System.out.print("Masukkan jumlah mahasiswa: ");
        int jumMhs = sc.nextInt();
        sc.nextLine();
        System.out.println("-----------------------------------");

        mahasiswaBerprestasi07 list = new mahasiswaBerprestasi07(jumMhs);
        
        System.out.println("----------------------------------------");

        for (int i = 0; i < jumMhs; i++) {
            System.out.println("Masukkan data mahasiswa ke-" + (i + 1) + ":");
            System.out.print("NIM   : ");
            String nim = sc.nextLine();
            System.out.print("Nama  : ");
            String nama = sc.nextLine();
            System.out.print("Kelas : ");
            String kelas = sc.nextLine();
            System.out.print("IPK   : ");
            String ip = sc.nextLine();
            double ipk = Double.parseDouble(ip);
            //double ipk = sc.nextDouble();
            //sc.nextLine();
            System.out.println("----------------------------------------");

            

            list.tambah (new mahasiswa07(nim, nama, kelas, ipk));
            
            /*mahasiswa07 m = new mahasiswa07(nim, nama, kelas, ipk);
            list.tambah(m);*/
        }

        /*System.out.println("\nData mahasiswa sebelum Sorting:");
        list.tampil();

        System.out.println("Data mahasiswa setelah Sorting berdasarkan IPK (DESC):");
        list.bubbleSort();
        list.tampil();

        System.out.println("Data yang sudah terurut menggunakan SELECTION SORT (ASC):");
        list.selectionSort();
        list.tampil();

        System.out.println("Data yang sudah terurut menggunakan INSERTION SORT (ASC):");
        list.insertionSort();
        list.tampil();*/

        System.out.println("\n========================================");
        System.out.println("========================================");

        list.tampil(); 
        
        /*//melakukan pencarian data sequential
        System.out.println("\n========================================");
        System.out.println("========================================");

        System.out.println("\n----------------------------------------");
        System.out.println("              Pencarian data            ");
        System.out.println("----------------------------------------");
        System.out.println("Masukkan IPK mahasiswa yang dicari : ");
        System.out.print("IPK: ");
        double cari = sc.nextDouble();

        System.out.println("Menggunakan Sequential Searching");
        double posisi = list.sequentialSearching(cari);
        int pss = (int) posisi;
        list.tampilPosisi(cari, pss);
        list.tampilDataSearch(cari, pss);*/

        //melakukan pencarian data binary
        System.out.println("\n========================================");
        System.out.println("========================================");

        System.out.println("\n----------------------------------------");
        System.out.println("              Pencarian data            ");
        System.out.println("----------------------------------------");
        System.out.println("Masukkan IPK mahasiswa yang dicari : ");
        System.out.print("IPK: ");
        double cari = sc.nextDouble();

        System.out.println("Menggunakan Sequential Searching");
        double posisi2 = list.sequentialSearching(cari);
        int pss2 = (int) posisi2;
        list.tampilPosisi(cari, pss2);
        list.tampilDataSearch(cari, pss2);

        sc.close();
    }
}