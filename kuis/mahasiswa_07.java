public class mahasiswa_07 {
    
    public String nim;
    public String nama;
    public int tahunMasuk;
    public mataKuliah_07[] mataKuliahDiambil;
    public int jumMatkul;

    //konstruktor
    public mahasiswa_07(String nim, String nama, int tahunMasuk, int kapasitasMK) {
        this.nim = nim;
        this.nama = nama;
        this.tahunMasuk = tahunMasuk;
        this.mataKuliahDiambil = new mataKuliah_07[kapasitasMK];
        this.jumMatkul = 0;
    }

    public void tampilkanInfo() {
        System.out.println("NIM                        : " + nim);
        System.out.println("Nama                       : " + nama);
        System.out.println("Tahun Masuk                : " + tahunMasuk);
        System.out.println("=====================================================");
        System.out.println("\nMata Kuliah yang diambil   : ");
        for (int i = 0; i < jumMatkul; i++) {
            mataKuliahDiambil[i].tampilkanInfo();
            System.out.println();
        }
    }

    public void tambahMataKuliah(mataKuliah_07 mataKuliah) {
        if (jumMatkul < mataKuliahDiambil.length) {
            mataKuliahDiambil[jumMatkul] = mataKuliah;
            jumMatkul++;
        } else {
            System.out.println("Kapasitas Mata Kuliah Penuh.");
        }
    }

    public int hitungTotalSks() {
        int totalSks = 0;
        for (int i = 0; i < jumMatkul; i++) {
            totalSks += mataKuliahDiambil[i].sks;
        }
        return totalSks;
    }
}