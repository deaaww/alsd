import java.util.Scanner;

public class dosen07 {
    
    String nidn, nama, email, prodi;
    int tahunMasuk, tahunSekarang = 2025;

    //method untuk menghitung masa kerja
    int hitungMasaKerja() {
        return tahunSekarang - tahunMasuk;
    }

    //method untuk menmpilkan informasi dosen
    void tampilkan() {
        System.out.println("NIDN          : " + nidn);
        System.out.println("Nama          : " + nama);
        System.out.println("Email         : " + email);
        System.out.println("Masa Kerja    : " + hitungMasaKerja() + " tahun");
        System.out.println("Program Studi : " + prodi);
        System.out.println("------------------------------------");
    }

    //method untuk mengisi data dosen
    void isiData(Scanner input) {
        System.out.print("NIDN          : ");
        nidn = input.nextLine();
        System.out.print("Nama          : ");
        nama = input.nextLine();
        System.out.print("Email         : ");
        email = input.nextLine();
        System.out.print("Tahun Masuk   : ");
        tahunMasuk = Integer.parseInt(input.nextLine());
        System.out.print("Program Studi : ");
        prodi = input.nextLine();
        System.out.println();
    }
}