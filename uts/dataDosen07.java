import java.util.Scanner;

public class dataDosen07 {

    //method untuk mengurutkan dosen berdasarkan NIDN (ascending)
    static void urutkanDosen(dosen07[] dosen) {
        for (int i = 0; i < dosen.length - 1; i++) {
            for (int j = 0; j < dosen.length - i - 1; j++) {
                if (dosen[j].nidn.compareTo(dosen[j + 1].nidn) > 0) {
                    dosen07 temp = dosen[j]; //menukar posisi jika NIDN lebih besar
                    dosen[j] = dosen[j + 1];
                    dosen[j + 1] = temp;
                }
            }
        }
    }

    //method untuk mencari dosen berdasarkan nama
    static void cariDosen(dosen07[] dosen, String namaDicari) {
        boolean ditemukan = false;
        for (dosen07 d : dosen) {
            if (d.nama.equalsIgnoreCase(namaDicari)) {
                System.out.println("\nDosen ditemukan:");
                d.tampilkan();
                ditemukan = true;
                break;
            }
        }

        if (!ditemukan) {
            System.out.println("\nDosen dengan nama '" + namaDicari + "' tidak ditemukan.");
        }
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        dosen07[] dosen = new dosen07[3];
        int jumlahData = 0;
        boolean running = true;

        while (running) {
            //menu utama
            System.out.println("\n==============================");
            System.out.println("             MENU             ");
            System.out.println("==============================");
            System.out.println("1. Input data dosen");
            System.out.println("2. Tampilkan semua data dosen");
            System.out.println("3. Cari dosen berdasarkan nama");
            System.out.println("4. Keluar");
            System.out.print("\nPilih menu (1-4): ");
            String pilihan = sc.nextLine();

            switch (pilihan) {
                case "1": //menginput data dosen
                    if (jumlahData >= dosen.length) {
                        System.out.println("Data dosen sudah penuh!");
                    } else {
                        for (int i = jumlahData; i < dosen.length; i++) {
                            dosen[i] = new dosen07();
                            System.out.println("\nInput data dosen ke-" + (i + 1));
                            dosen[i].isiData(sc);
                            jumlahData++;
                        }
                        System.out.println("Semua data dosen berhasil disimpan.");
                    }
                    break;
                case "2": //menampilkan seluruh data dosen
                    if (jumlahData == 0) {
                        System.out.println("Belum ada data dosen.");
                    } else {
                        urutkanDosen(dosen); //mengurutkan dulu
                        System.out.println("\n------------------------------");
                        System.out.println("           Data Dosen         ");
                        System.out.println("------------------------------");
                        for (int i = 0; i < jumlahData; i++) {
                            dosen[i].tampilkan();
                        }
                    }
                    break;
                case "3": //mencari dosen berdasarkan nama
                    if (jumlahData == 0) {
                        System.out.println("Belum ada data dosen.");
                    } else {
                        System.out.print("Masukkan nama dosen yang dicari: ");
                        String namaDicari = sc.nextLine();
                        cariDosen(dosen, namaDicari);
                    }
                    break;
                case "4": //keluar dari program
                    running = false;
                    System.out.println("Program selesai. Terima kasih!");
                    break;
                default:
                    System.out.println("Pilihan tidak valid!");
            }
        }

        sc.close();
    }
} 