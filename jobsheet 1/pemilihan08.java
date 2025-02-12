import java.util.Scanner;

public class pemilihan08 {

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        System.out.println("--- PROGRAM MENGHITUNG NILAI AKHIR ---");
        System.out.println("======================================");

        System.out.print("Masukkan Nilai Tugas : ");
        double tugas = sc.nextDouble();

        System.out.print("Masukkan Nilai Kuis  : ");
        double kuis = sc.nextDouble();

        System.out.print("Masukkan Nilai UTS   : ");
        double uts = sc.nextDouble();

        System.out.print("Masukkan Nilai UAS   : ");
        double uas = sc.nextDouble();

        System.out.println("======================================");
        System.out.println("\n======================================");

        if (tugas < 0 || tugas > 100) {
            System.out.println("Nilai tidak valid");
        } else if (kuis < 0 || kuis > 100) {
            System.out.println("Nilai tidak valid");
        } else if (uts < 0 || uts > 100) {
            System.out.println("Nilai tidak valid");
        } else if (uas < 0 || uas > 100) {
            System.out.println("Nilai tidak valid");
        } else {
            double nilaiAkhir = (tugas * 0.2) + (kuis * 0.2) + (uts * 0.3) + (uas * 0.3);
            System.out.println("Nilai AKhir          : " + nilaiAkhir);

            String nilaiHuruf = " ";
            if (nilaiAkhir > 80 && nilaiAkhir <= 100) {
                nilaiHuruf = "A";
                System.out.println("Nilai Huruf          : A");
                System.out.println("Nilai Setara         : 4");
                System.out.println("Kualifikasi          : Sangat Baik");
            } else if (nilaiAkhir > 73 && nilaiAkhir <= 80) {
                nilaiHuruf = "B+";
                System.out.println("Nilai Huruf          : B+");
                System.out.println("Nilai Setara         : 3.5");
                System.out.println("Kualifikasi          : Lebih dari Baik");
            } else if (nilaiAkhir > 65 && nilaiAkhir <= 73) {
                nilaiHuruf = "B";
                System.out.println("Nilai Huruf          : B");
                System.out.println("Nilai Setara         : 3");
                System.out.println("Kualifikasi          : Baik");
            } else if (nilaiAkhir > 60 && nilaiAkhir <= 65) {
                nilaiHuruf = "C+";
                System.out.println("Nilai Huruf          : C+");
                System.out.println("Nilai Setara         : 2.5");
                System.out.println("Kualifikasi          : Lebih dari Cukup");
            } else if (nilaiAkhir > 50 && nilaiAkhir <= 60) {
                nilaiHuruf = "C";
                System.out.println("Nilai Huruf          : C");
                System.out.println("Nilai Setara         : 2");
                System.out.println("Kualifikasi          : Cukup");
            } else if (nilaiAkhir > 39 && nilaiAkhir <= 50) {
                nilaiHuruf = "D";
                System.out.println("Nilai Huruf          : D");
                System.out.println("Nilai Setara         : 1");
                System.out.println("Kualifikasi          : Kurang");
            } else {
                nilaiHuruf = "E";
                System.out.println("Nilai Huruf          : E");
                System.out.println("Nilai Setara         : 0");
                System.out.println("Kualifikasi          : Gagal");
            }

            System.out.println("======================================");
            System.out.println("\n======================================");
        
            if (nilaiHuruf.equals("A") || nilaiHuruf.equals("B+") || nilaiHuruf.equals("B") || nilaiHuruf.equals("C+") || nilaiHuruf.equals("C")) {
                System.out.println("SELAMAT ANDA DINYATAKAN LULUS");
            } else {
                System.out.println("---MAAF ANDA DINYATAKAN TIDAK LULUS---");
            }    
        }

        System.out.println("======================================");

        sc.close();
    }
}