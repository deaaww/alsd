public class riwayat0307 {
    transaksiLayanan0307[] data;
    int front, rear, size, max;

    public riwayat0307(int kapasitas) {
        max = kapasitas;
        data = new transaksiLayanan0307[max];
        front = rear = size = 0;
    }

    public void tambah(transaksiLayanan0307 t) {
        if (size == max) {
            System.out.println("Riwayat penuh!");
            return;
        }
        data[rear] = t;
        rear = (rear + 1) % max;
        size++;
    }

        public void tampilkan() {
            if (size == 0) {
                System.out.println("Belum ada transaksi.");
                return;
            }

            System.out.println("\n-- Riwayat Transaksi --");
            System.out.println("Daftar Transaksi:");

            int i = front;
            for (int j = 0; j < size; j++) {
                transaksiLayanan0307 t = data[i];
                System.out.println(t.pasien.nama + " (" + t.durasiLayanan + " jam): Rp " + t.biaya);
                i = (i + 1) % max;
        }
    }
}