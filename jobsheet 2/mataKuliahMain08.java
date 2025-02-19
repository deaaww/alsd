public class mataKuliahMain08 {
    
    public static void main(String[] args) {
        
        //Konstruktor Default
        mataKuliah08 mk1 = new mataKuliah08();
        mk1.kodeMK = "SIB1F001";
        mk1.nama = "Algoritma dan Struktur Data";
        mk1.sks = 2;
        mk1.jumlahJam = 3;

        System.out.println("=================== INFORMASI MATA KULIAH 1 ==================");
        mk1.tampilInformasi();
        mk1.ubahSks(3);
        mk1.tambahJam(6);
        mk1.kurangiJam(5);
        System.out.println("\n        ----------------");
        System.out.println("        | INFO TERBARU |");
        System.out.println("        ----------------");
        mk1.tampilInformasi();

        System.out.println("\n--------------------------------------------------------------");
        System.out.println("--------------------------------------------------------------");
        
        //Konstruktor Berparameter
        mataKuliah08 mk2 = new mataKuliah08("SIB1F002", "Basis Data", 3, 2);

        System.out.println("\n=================== INFORMASI MATA KULIAH 2 ==================");
        mk2.tampilInformasi();
        mk2.ubahSks(2);
        mk2.tambahJam(4);
        mk2.kurangiJam(8);
        System.out.println("\n        ----------------");
        System.out.println("        | INFO TERBARU |");
        System.out.println("        ----------------");
        mk2.tampilInformasi();
    }
}