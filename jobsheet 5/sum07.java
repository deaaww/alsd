public class sum07 {
    
    double keuntungan[];

    sum07(int el) {
        keuntungan = new double[el];
    }

    double totalBF() {
        double total = 0;
        for (int i = 0; i < keuntungan.length; i++) {
            total = total + keuntungan[i];
        }
        return total;
    }

    double totalDC(double arr[], int l, int r) {
        if (l == r) {
            return arr[1];
        }

        int mid = (l + r) / 2;
        double lsum07 = totalDC(arr, l, mid);
        double rsum07 = totalDC(arr, mid + 1, r);
        return lsum07 + rsum07;
    }
}