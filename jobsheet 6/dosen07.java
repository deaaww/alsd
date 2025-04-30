public class dosen07 {

    String kode, nama;
    boolean jenisKelamin;
    int usia;

    dosen07 (String kd, String nm, boolean jk, int usia) {
        this.kode = kd;
        this.nama = nm;
        this.jenisKelamin = jk;
        this.usia = usia;
    }

    void tampil() {
        System.out.println("\nKode : " + kode + ", Nama: " + nama + ", Jenis Kelamin: " + (jenisKelamin ? "Laki-laki" : "Perempuan") + ", Usia: " + usia);
    }
}