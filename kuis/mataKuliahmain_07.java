public class mataKuliahmain_07 {
    public static void main(String[] args) {

        System.out.println("================= Data Mata Kuliah =================");
        
        mataKuliah_07 mk1 = new mataKuliah_07("MK1001", "Pemrograman Dasar", 2);
        mk1.tampilkanInfo();

        mataKuliah_07 mk2 = new mataKuliah_07("MK1002", "Pengantar Akuntansi Manajemen Bisnis",  2);
        mk2.tampilkanInfo();

        System.out.println("\n=============== Mata Kuliah Terbaru ===============");

        mk1.ubahNamaMK("Algoritma & Struktur Data");
        mk1.tampilkanInfo();

        mk2.ubahNamaMK("Analisis Proses Bisnis");
        mk2.tampilkanInfo();
        
        System.out.println("\n===================================================");

        System.out.println("                Pengubahan Jumlah SKS");

        System.out.println("===================================================");
        
        mk1.ubahSks(3);

        mk2.ubahSks(1);

        System.out.println("===================================================");
    }
}