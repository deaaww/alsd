public class mataKuliah08 {

    String kodeMK;
    String nama;
    int sks;
    int jumlahJam;

    void tampilInformasi() {
        System.out.println("\nKode Matkul       : " + kodeMK);
        System.out.println("Nama Matkul       : " + nama);
        System.out.println("Bobot SKS         : " + sks);
        System.out.println("Jumlah Jam Matkul : " + jumlahJam + " jam.");
    }

    void ubahSks(int sksBaru) {
        sks = sksBaru;
        System.out.println("\nPerubahan bobot SKS menjadi " + sksBaru);
    }

    void tambahJam(int jam) {
        jumlahJam += jam;
        System.out.println("Penambahan jam matkul: " + jam + " jam.");
    }

    void kurangiJam(int jam) {
        if (jumlahJam > jam) {
            jumlahJam -= jam;
            System.out.println("Pengurangan jam matkul: " + jam + " jam.");
        } else {
            System.out.println("Pengurangan tidak dapat dilakukan, jumlah jam tidak mencukupi.");
        }
    }

    public mataKuliah08() {
    }

    public mataKuliah08(String kodeMK, String nama, int sks, int jumlahJam) {
        this.kodeMK = kodeMK;
        this.nama = nama;
        this.sks = sks;
        this.jumlahJam = jumlahJam;
    }

}