public class nilaiMhs07 {
   
    public static int cariMaxUTS(int[] uts, int left, int right) {
        if (left == right) {
            return uts[left];
        }
       
        int mid = (left + right) / 2;
        int maxKiri = cariMaxUTS(uts, left, mid);
        int maxKanan = cariMaxUTS(uts, mid + 1, right);
       
        return Math.max(maxKiri, maxKanan);
    }
   
    //Divide and Conquer untuk mencari nilai UTS terendah
    public static int cariMinUTS(int[] uts, int left, int right) {
        if (left == right) {
            return uts[left];
        }
       
        int mid = (left + right) / 2;
        int minKiri = cariMinUTS(uts, left, mid);
        int minKanan = cariMinUTS(uts, mid + 1, right);
       
        return Math.min(minKiri, minKanan);
    }


    //Brute Force untuk menghitung rata-rata nilai UAS
    public static double hitungRataUAS(int[] uas) {
        int total = 0;
        for (int nilai : uas) {
            total += nilai;
        }
        return (double) total / uas.length;
    }
}