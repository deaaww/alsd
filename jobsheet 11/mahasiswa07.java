public class mahasiswa07 {
    
    String nim;
    String nama;
    String kelas;
    double ipk;

    public mahasiswa07() {}

    public mahasiswa07(String nm, String name, String kls, double ip) {
        this.nim = nm;
        this.nama = name;
        this.kelas = kls;
        this.ipk = ip;
    }

    public void tampilInformasi() {
        System.out.println(nama + "\t\t" + nim + "\t" + kelas + "\t" + ipk);
    }
}