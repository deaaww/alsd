import java.util.Scanner;

public class mahasiswaDemo07 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        mahasiswa07[] arrayOfMahasiswa = new mahasiswa07[3];
        String dummy;

        System.out.println("-------------------------------");

        for (int i = 0; i < 3; i++) {
            arrayOfMahasiswa[i] = new mahasiswa07();

            System.out.println("Masukkan Data Mahasiswa ke-" + (i + 1));
            System.out.print("NIM     : ");

            arrayOfMahasiswa[i].nim = sc.nextLine();
            System.out.print("Nama    : ");

            arrayOfMahasiswa[i].nama = sc.nextLine();
            System.out.print("Kelas   : ");

            arrayOfMahasiswa[i].kelas = sc.nextLine();
            System.out.print("IPK     : ");
            dummy = sc.nextLine();
            arrayOfMahasiswa[i].ipk = Float.parseFloat(dummy);

            System.out.println("-------------------------------");
        }

        System.out.println("\n-------------------------------");

        for (int i = 0; i < 3; i++) {
            System.out.println("Data Mahasiswa ke-" + (i + 1));
            arrayOfMahasiswa[i].cetakInfo();
            System.out.println("-------------------------------");
        }

        sc.close();
    }
}