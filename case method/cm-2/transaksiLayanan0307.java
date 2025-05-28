public class transaksiLayanan0307 {
    pasien0307 pasien;
    dokter0307 dokter;
    int durasiLayanan;
    int biaya;

    public transaksiLayanan0307(pasien0307 pasien, dokter0307 dokter, int durasiLayanan) {
        this.pasien = pasien;
        this.dokter = dokter;
        this.durasiLayanan = durasiLayanan;
        this.biaya = hitungBiaya();
    }

    public int hitungBiaya() {
        return durasiLayanan * 50000;
    }

     void tampilkan() {
        System.out.println("== TRANSAKSI ==");
        pasien.tampilkanInformasi();
        System.out.println("Dokter: " + dokter.namaDokter + " (ID: " + dokter.idDokter + ")");
        System.out.println("Durasi Layanan: " + durasiLayanan + " jam");
        System.out.println("Biaya: Rp " + biaya);
    }
}