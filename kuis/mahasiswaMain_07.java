public class mahasiswaMain_07 {
    public static void main(String[] args) {
        
        System.out.println("=====================================================");
        System.out.println("               Informasi Mahasiswa 1"); 
        System.out.println("=====================================================");       
        
        mahasiswa_07 mhs1 = new mahasiswa_07("244107060087", "DEA", 2024, 4);

        mataKuliah_07 mk1 = new mataKuliah_07("MK1001", "Algoritma & Struktur Data", 2);
        mataKuliah_07 mk2 = new mataKuliah_07("MK1002", "Analisis Proses Bisnis", 2);
        mataKuliah_07 mk3 = new mataKuliah_07("MK1003", "Matematika Lanjut", 2);

        mhs1.tambahMataKuliah(mk1);
        mhs1.tambahMataKuliah(mk2);
        mhs1.tambahMataKuliah(mk3);
        

        mhs1.tampilkanInfo();
        System.out.println("Total SKS yang diambil      : " + mhs1.hitungTotalSks());
        System.out.println("=====================================================");
        
        System.out.println("\n=====================================================");
        System.out.println("               Informasi Mahasiswa 2"); 
        System.out.println("=====================================================");

        mahasiswa_07 mhs2 = new mahasiswa_07("234107060087", "SELA", 2023, 3);
        
        mataKuliah_07 mk4 = new mataKuliah_07("MK1004", "Sistem Operasi", 2);
        mataKuliah_07 mk5 = new mataKuliah_07("MK1005", "Pengenalan Sistem Informasi", 2);
        mataKuliah_07 mk6 = new mataKuliah_07("MK1006", "Basis Data", 2);

        mhs2.tambahMataKuliah(mk4);
        mhs2.tambahMataKuliah(mk5);
        mhs2.tambahMataKuliah(mk6);

        mhs2.tampilkanInfo();
        System.out.println("Total SKS yang diambil      : " + mhs2.hitungTotalSks());
        System.out.println("=====================================================");
    }
}