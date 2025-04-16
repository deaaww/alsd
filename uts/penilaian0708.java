public class penilaian0708 {
    mahasiswa0708 mahasiswa07;
    mataKuliah0708 mataKuliah07;
    double nilaiTugas07, nilaiUTS07, nilaiUAS07, nilaiAkhir07;

    public penilaian0708(mahasiswa0708 mahasiswa07, mataKuliah0708 mataKuliah07, double tugas07, double uts07, double uas07) {
        this.mahasiswa07 = mahasiswa07;
        this.mataKuliah07 = mataKuliah07;
        this.nilaiTugas07 = tugas07;
        this.nilaiUTS07 = uts07;
        this.nilaiUAS07 = uas07;
        hitungNilaiAkhir07();
    }

    public void hitungNilaiAkhir07() {
        nilaiAkhir07 = (0.3 * nilaiTugas07) + (0.3 * nilaiUTS07) + (0.4 * nilaiUAS07);
    }

    public void tampilPenilaian07() {
        System.out.println(mahasiswa07.nama07 + " | " + mataKuliah07.namaMK07 + " | Nilai Akhir: " + nilaiAkhir07);
    }
}