public class pasien0307 {

    String nama, nik, keluhan;
    pasien0307 next;

    public pasien0307(String nama, String nik, String keluhan) {
        this.nama = nama;
        this.nik = nik;
        this.keluhan = keluhan;
        this.next = null;
    }

    void tampilkanInformasi() {
        System.out.println("Nama    : " + nama);
        System.out.println("NIK     : " + nik);
        System.out.println("Keluhan : " + keluhan);
    }
}