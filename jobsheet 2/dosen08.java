public class dosen08 {
    
    String idDosen;
    String nama;
    boolean statusAktif;
    int tahunBergabung;
    String bidangKeahlian;

    void tampilInformasi() {
        System.out.println("\nID Dosen            : " + idDosen);
        System.out.println("Nama Dosen          : " + nama);
        System.out.println("Status Dosen        : " + (statusAktif ? "Aktif" : "Tidak Aktif"));
        System.out.println("Tahun Bergabung     : " + tahunBergabung);
        System.out.println("Bidang Keahlian     : " + bidangKeahlian);
    }

    void setStatusAktif(boolean status) {
        statusAktif = status;
        System.out.println("\nStatus dosen saat ini " + (status ? "Aktif" : "Tidak Aktif"));
    }

    void hitungMasaKerja(int thnSkrg) {
        thnSkrg -= tahunBergabung;
        System.out.println("Lama masa kerja     : " + thnSkrg + " tahun");
    }

    void ubahKeahlian(String bidang) {
        bidangKeahlian = bidang;
        System.out.println("\n----- Perubahan Bidang Keahlian -----");
        System.out.println("Bidang keahlian menjadi " + bidang);
    }

    public dosen08() {
    }

    public dosen08(String idDosen, String nama, boolean statusAktif, int tahunBergabung, String bidangKeahlian) {
        this.idDosen = idDosen;
        this.nama = nama;
        this.statusAktif = statusAktif;
        this.tahunBergabung = tahunBergabung;
        this.bidangKeahlian = bidangKeahlian;

    }


}