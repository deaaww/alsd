public class tugasMain07 {
    public static void main(String[] args) {

        tugasAntrianMahasiswa07 antrian = new tugasAntrianMahasiswa07();

        antrian.tambahAntrian("Dea");
        antrian.tambahAntrian("Fathin");
        antrian.tambahAntrian("Galuh");
        System.out.println();

        antrian.tampilkanAntrian();
        antrian.tampilkanDepanBelakang();
        antrian.jumlahAntrian();
        System.out.println();

        antrian.panggilAntrian();
        antrian.tampilkanAntrian();
        antrian.jumlahAntrian();
        System.out.println();

        antrian.panggilAntrian();
        antrian.tampilkanAntrian();
        antrian.jumlahAntrian();
        System.out.println();

        antrian.kosongkanAntrian();
        System.out.println();
        antrian.tampilkanAntrian();
    }
}