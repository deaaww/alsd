public class mahasiswa07 {

    String nim;
    String nama;
    String kelas;
    double ipk;

    mahasiswa07() {
    }

    mahasiswa07(String nm, String name, String kls, double ip) {
        nim = nm;
        nama = name;
        ipk = ip;
        kelas = kls;
    }

    void tampilInformasi(){
        System.out.println("\n----------------------------------------");
        System.out.println("Nama    : "+nama);
        System.out.println("NIM     : "+nim);
        System.out.println("Kelas   : "+kelas);
        System.out.println("IPK     : "+ipk);
    }
}
