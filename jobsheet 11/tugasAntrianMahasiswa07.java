public class tugasAntrianMahasiswa07 {
    private tugasMahasiswa07 head, tail;
    private int size;

    public tugasAntrianMahasiswa07() {
        head = tail = null;
        size = 0;
    }

    //cek apakah antrian kosong
    public boolean isEmpty() {
        return head == null;
    }

    public void tambahAntrian(String nama) {
        tugasMahasiswa07 baru = new tugasMahasiswa07(nama);
        if (isEmpty()) {
            head = tail = baru;
        } else {
            tail.next = baru;
            tail = baru;
        }
        size++;
        System.out.println("Mahasiswa " + nama + " berhasil ditambahkan ke antrian.");
    }

    public void panggilAntrian() {
        if (isEmpty()) {
            System.out.println("Antrian kosong!");
            return;
        }
        System.out.println("Memanggil Mahasiswa: " + head.nama);
        head = head.next;
        size--;
        if (head == null) {
            tail = null;
        }
    }

    public void tampilkanAntrian() {
        if (isEmpty()) {
            System.out.println("Antrian kosong!");
            return;
        }
        tugasMahasiswa07 current = head;
        System.out.println("Daftar Antrian Mahasiswa:");
        while (current != null) {
            System.out.println("- " + current.nama);
            current = current.next;
        }
    }

    public void kosongkanAntrian() {
        head = tail = null;
        size = 0;
        System.out.println("Antrian telah dikosongkan.");
    }

    public void tampilkanDepanBelakang() {
        if (isEmpty()) {
            System.out.println("Antrian kosong!");
        } else {
            System.out.println("Mahasiswa pertama : " + head.nama);
            System.out.println("Mahasiswa terakhir  : " + tail.nama);
        }
    }

    public void jumlahAntrian() {
        System.out.println("Jumlah mahasiswa dalam antrian: " + size);
    }
}