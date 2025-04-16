public class mataKuliah0708 {
    String kodeMK07, namaMK07;
    int sks07;

    public mataKuliah0708(String kodeMK07, String namaMK07, int sks07) {
        this.kodeMK07 = kodeMK07;
        this.namaMK07 = namaMK07;
        this.sks07 = sks07;
    }

    public void tampilMatakuliah07() {
        System.out.println("Kode MK: " + kodeMK07 + " | Nama: " + namaMK07 + " | SKS: " + sks07);
    }
}