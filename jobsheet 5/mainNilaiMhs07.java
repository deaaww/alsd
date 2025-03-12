public class mainNilaiMhs07 {
    public static void main(String[] args) {

        //Data nilai UTS dan UAS sesuai tabel
        int[] nilaiUTS = {78, 85, 90, 76, 92, 88, 80, 82};
        int[] nilaiUAS = {82, 88, 87, 79, 95, 85, 83, 84};

        //Nilai UTS tertinggi dan terendah dengan Divide and Conquer
        int maxUTS = nilaiMhs07.cariMaxUTS(nilaiUTS, 0, nilaiUTS.length - 1);
        int minUTS = nilaiMhs07.cariMinUTS(nilaiUTS, 0, nilaiUTS.length - 1);

        //Rata-rata nilai UAS dengan Brute Force
        double rataUAS = nilaiMhs07.hitungRataUAS(nilaiUAS);

        System.out.println("Nilai UTS Tertinggi: " + maxUTS);
        System.out.println("Nilai UTS Terendah: " + minUTS);
        System.out.println("Rata-rata Nilai UAS: " + rataUAS);
    }
}