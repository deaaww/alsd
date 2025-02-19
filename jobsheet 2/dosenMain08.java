public class dosenMain08 {
    
    public static void main(String[] args) {
        
        //Konstruktor Default
        dosen08 dosen1 = new dosen08();
        dosen1.idDosen = "DO01";
        dosen1.nama = "Triana Fatmawati, S.T., M.T.";
        dosen1.tahunBergabung = 2015;
        dosen1.bidangKeahlian = "Teknologi Informasi";

        System.out.println("\n==================== DATA DOSEN 1 ===================");
        dosen1.tampilInformasi();
        dosen1.setStatusAktif(false);
        dosen1.hitungMasaKerja(2025);
        dosen1.ubahKeahlian("Teknik Mesin");
        System.out.println("\n        ----------------");
        System.out.println("        | INFO TERBARU |");
        System.out.println("        ----------------");
        dosen1.tampilInformasi();

        System.out.println("\n-----------------------------------------------------");
        System.out.println("-----------------------------------------------------");

        //Konstruktor Berparameter
        dosen08 dosen2 = new dosen08("DO02", "Drs. Sutrisno M.SI.", true, 2007, "Akuntansi");

        System.out.println("\n==================== DATA DOSEN 2 ===================");
        dosen2.tampilInformasi();
        dosen2.setStatusAktif(true);
        dosen2.hitungMasaKerja(2025);
        dosen2.ubahKeahlian("Teknik Sipil");
        System.out.println("\n        ----------------");
        System.out.println("        | INFO TERBARU |");
        System.out.println("        ----------------");
        dosen2.tampilInformasi();
    }
}