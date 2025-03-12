import java.util.Scanner;

public class dosenDemo07 {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        System.out.println("-----------------------------------------------");
        System.out.print("          Masukkan Jumlah Dosen: ");
        int jmlDosen = sc.nextInt();
        sc.nextLine();
        System.out.println("-----------------------------------------------");

        dosen07[] arrayOfDosen07 = new dosen07[jmlDosen];

        for (int i = 0; i < jmlDosen; i++) {
            System.out.println("Masukkan Data Dosen ke-" + (i + 1) + ":");
            arrayOfDosen07[i] = new dosen07("", "", false, 0);
            arrayOfDosen07[i].inputData(sc);
            System.out.println("-----------------------------------------------");
        }

        System.out.println("\n-----------------------------------------------");
        for (dosen07 dosen : arrayOfDosen07) {
            System.out.println("----------------- DATA DOSEN ------------------");
            System.out.println("-----------------------------------------------");
            dosen.cetakInfo();
        }

        System.out.println("\n-------------- DATA SEMUA DOSEN ---------------");
        
        dataDosen07.dataSemuaDosen07(arrayOfDosen07);

        dataDosen07.jumlahDosenPerJenisKelamin07(arrayOfDosen07);

        dataDosen07.rerataUsiaDosenPerJenisKelamin07(arrayOfDosen07);

        dataDosen07.infoDosenPalingTua07(arrayOfDosen07);
        
        dataDosen07.infoDosenPalingMuda07(arrayOfDosen07);

        sc.close();
    }
}