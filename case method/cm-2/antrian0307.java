public class antrian0307 {
    pasien0307 head, tail;

    public void tambahPasien(pasien0307 baru) {
        if (head == null) {
            head = tail = baru;
        } else {
            tail.next = baru;
            tail = baru;
        }
    }

    public pasien0307 layaniPasien() {
        if (head == null) return null;
        pasien0307 dilayani = head;
        head = head.next;
        if (head == null) tail = null;
        return dilayani;
    }

    public void tampilkanAntrian() {
        pasien0307 current = head;
        if (current == null) {
            System.out.println("Antrian kosong.");
            return;
        }
        while (current != null) {
            current.tampilkanInformasi();
            current = current.next;
        }
    }

    public boolean isEmpty() {
        return head == null;
    }

    public int hitungSisaAntrian() {
        int count = 0;
        pasien0307 current = head;
        while (current != null) {
            count++;
            current = current.next;
        }
        return count;
    }
}