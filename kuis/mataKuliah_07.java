public class mataKuliah_07 {

    public String kodeMK;
    public String namaMK;
    public int sks;

    //konstruktor
    public mataKuliah_07 (String kodeMK, String namaMK, int sks) {
        this.kodeMK = kodeMK;
        this.namaMK = namaMK;
        this.sks = sks;
    }

    //menampilkan informasi mata kuliah
    public void tampilkanInfo() {
        System.out.println("\nKode  : " + kodeMK);
        System.out.println("Nama  : " + namaMK);
        System.out.println("SKS   : " + sks);
    }

    //mengubah atribut nama mata kuliah
    public void ubahNamaMK(String namaMKBaru) {
        this.namaMK = namaMKBaru;
    }

    //mengubah atribut sks
    public void ubahSks(int sksBaru) {
        if (sksBaru < 2) {
            tampilkanInfo();
            System.out.println("Gagal Mengubah jumlah SKS karena minimal harus 2.");
        } else {
            int sksLama = this.sks;
            this.sks = sksBaru;
            tampilkanInfo();
            System.out.println("SKS berhasil diubah dari " + sksLama + " menjadi " + this.sks);
        }
    }

}