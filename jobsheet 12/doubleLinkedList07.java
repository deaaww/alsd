package dll;

public class doubleLinkedList07 {
    
    node07 head;
    node07 tail;

    public doubleLinkedList07() {
        head = null;
        tail = null;
    }
    
    public boolean isEmpty() {
        return head == null;
    }

    public void addFirst(mahasiswa07 data) {
        node07 newNode = new node07(data);
        if (isEmpty()) {
            head = tail = newNode;
        } else {
            newNode.next = head;
            head.prev = newNode;
            head = newNode;
        }
    }

        public void addLast(mahasiswa07 data) {
        node07 newNode = new node07(data);
        if (isEmpty()) {
            head = tail = newNode;
        } else {
            tail.next = newNode;
            newNode.prev = tail;
            tail = newNode;
        }
    }

    public void insertAfter(String keyNim, mahasiswa07 data) {
        node07 current = head;

        //cari node dengan nim = keyNim
        while (current != null && !current.data.nim.equals(keyNim)) {
            current = current.next;
        }

        if (current == null) {
            System.out.println("Node dengan NIM " + keyNim + " tidak ditemukan.");
            return;
        }

        node07 newNode = new node07(data);

        //jika current adalah tail, cukup tambahkan di akhir
        if (current == tail) {
            current.next = newNode;
            newNode.prev = current;
            tail = newNode;
        } else {
            //sisipkan di tengah
            newNode.next = current.next;
            newNode.prev = current;
            current.next.prev = newNode;
            current.next = newNode;
        }

        System.out.println("Node berhasil disisipkan setelah NIM " + keyNim);
    }

    //menambahkan agar search tidak error
    public node07 search(String nim) {
        node07 current = head;
        while (current != null) {
            if (current.data.nim.equals(nim)) {
                return current;
            }
            current = current.next;
        }
        return null;
    }
    
    //modifikasi pertanyaan 1 nomor 6
    public void print() {
        if (isEmpty()) {
            System.out.println("Linked List kosong.");
            return;
        }
        node07 current = head;
        while (current != null) {
            current.data.tampil();
            current = current.next;
        }
    }

    //percobaan 2 //moifikasi pertanyaan 2 nomor 2
    public void removeFirst() {
        if (isEmpty()) {
            System.out.println("List kosong, tidak bisa dihapus.");
            return;
        }
        System.out.println("Data yang terhapus adalah:");
        head.data.tampil();


        if (head == tail) {
            head = tail = null;
        } else {
            head = head.next;
            head.prev = null;
        }
   
        System.out.println("Data sudah berhasil dihapus.");
    }


    public void removeLast() {
        if (isEmpty()) {
            System.out.println("List kosong, tidak bisa dihapus.");
            return;
        }
        System.out.println("Data yang terhapus adalah:");
        tail.data.tampil();
   
        if (head == tail) {
            head = tail = null;
        } else {
            tail = tail.prev;
            tail.next = null;
        }
        System.out.println("Data sudah berhasil dihapus.");
    }
}