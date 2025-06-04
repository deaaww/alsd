package pertemuan14;

public class binarryTree07 {

    node07 root;

    public binarryTree07() {
        root = null;
    }

    boolean isEmpty() {
        return root == null;
    }

    public void add(mahasiswa07 mahasiswa) {
        node07 newNode = new node07(mahasiswa);
        if (isEmpty()) {
            root = newNode;
        } else {
            node07 current = root;
            node07 parent = null;
            while (true) {
                parent = current;
                if (mahasiswa.ipk < current.mahasiswa.ipk) {
                    current = current.left;
                    if (current == null) {
                        parent.left = newNode;
                        return;
                    } 
                } else {
                    current = current.right;
                    if (current == null) {
                        parent.right = newNode;
                        return;
                    }
                }
            }
        }
    }

    boolean find(double ipk) {
        boolean result = false;
        node07 current = root;
        while (current != null) {
            if (current.mahasiswa.ipk == ipk) {
                result = true;
                break;
            } else if (ipk > current.mahasiswa.ipk) {
                current = current.right;
            } else {
                current = current.left;
            }
        }
        return result;
    }

    void traversePreOrder(node07 node) {
        if (node != null) {
            node.mahasiswa.tampilInformasi();
            traversePreOrder(node.left);
            traversePreOrder(node.right);
        }
    }

    void traverseInOrder(node07 node) {
        if (node != null) {
            traverseInOrder(node.left);
            node.mahasiswa.tampilInformasi();
            traverseInOrder(node.right);
        }
    }

    void traversePostOrder(node07 node) {
        if (node != null) {
            traversePostOrder(node.left);
            traversePostOrder(node.right);
            node.mahasiswa.tampilInformasi();
        }
    }

    node07 getSuccessor(node07 del) {
        node07 successor = del.right;
        node07 successorParent = del;
        while (successor.left != null) {
            successorParent = successor;
            successor = successor.left;
        }
        if (successor != del.right) {
            successorParent.left = successor.right;
            successor.right = del.right;
        }
        return successor;
    }

    void delete(double ipk) {
        if (isEmpty()) {
            System.out.println("Binary tree kosong");
            return;
        }

        //cari node (current) yang akan dihapus
        node07 parent = root;
        node07 current = root;
        boolean isLeftChild = false;

        while (current != null) {
            if (current.mahasiswa.ipk == ipk) {
                break;
            } else if (ipk < current.mahasiswa.ipk) {
                parent = current;
                current = current.left;
                isLeftChild = true;
            } else if (ipk > current.mahasiswa.ipk) {
                parent = current;
                current = current.right;
                isLeftChild = false;
            }
        }
        //penghapusan
        if (current == null) {
            System.out.println("Data tidak ditemukan");
            return;
        } else {
            //jika tidak ada anak (leaf), maka node dihapus
            if (current.left == null && current.right == null) {
                if (current == root) {
                    root = null;
                } else {
                    if (isLeftChild) {
                        parent.left = null;
                    } else {
                        parent.right = null;
                    }
                }
            } else if (current.left == null ) { //jika hanya punya 1 anak (kanan)
                if (current == root) {
                    root = current.right;
                } else {
                    if (isLeftChild) {
                        parent.left = current.right;
                    } else {
                        parent.right = current.right;
                    }
                }
            } else if (current.right == null) { //jika hanya punya 1 anak (kiri)
                if (current == root) {
                    root = current.left;
                } else {
                    if (isLeftChild) {
                        parent.left = current.left;
                    } else {
                        parent.right = current.left;
                    }
                }
            } else { //jika punya 2 anak
                node07 successor = getSuccessor(current);
                System.out.println("Jika 2 anak, current = ");
                successor.mahasiswa.tampilInformasi();
                if (current == root) {
                    root = successor;
                } else {
                    if (isLeftChild) {
                        parent.left = successor;
                    } else {
                        parent.right = successor;
                    }
                }
                successor.left = current.left;
            }
        }
    }

    //tugas method 1 > menambahkan node dengan cara rekursif

    public void addRekursif(mahasiswa07 mhs) {
        root = tambahRekursif(root, mhs);
    }

    private node07 tambahRekursif(node07 current, mahasiswa07 mhs) {
        if (current == null) {
            return new node07(mhs);
        }
        if (mhs.ipk < current.mahasiswa.ipk) {
            current.left = tambahRekursif(current.left, mhs);
        } else {
            current.right = tambahRekursif(current.right, mhs);
        }
        return current;
    }

    //tugas method 2 > menampilkan data mahasiswa dengan ipk paling kecil & ipk paling besar

    public void cariMinIPK() { //ipk paling kecil
        node07 current = root;
        if (isEmpty()) {
            System.out.println("Tree kosong");
            return;
        }
        while (current.left != null) {
            current = current.left;
        }
        System.out.println("Mahasiswa dengan IPK paling kecil:");
        current.mahasiswa.tampilInformasi();
    }

    public void cariMaxIPK() { //ipk paling besar
        node07 current = root;
        if (isEmpty()) {
            System.out.println("Tree kosong");
            return;
        }
        while (current.right != null) {
            current = current.right;
        }
        System.out.println("Mahasiswa dengan IPK paling besar:");
        current.mahasiswa.tampilInformasi();
    }

    //tugas method 3 > menampilkan data mahasiswa dengan ipk si atas suatu batas tertentu

    public void tampilMahasiswaIPKdiAtas(double ipkBatas) {
        tampilIPKDiAtasRekursif(root, ipkBatas);
    }

    private void tampilIPKDiAtasRekursif(node07 node, double ipkBatas) {
        if (node != null) {
            tampilIPKDiAtasRekursif(node.left, ipkBatas);
            if (node.mahasiswa.ipk > ipkBatas) {
                node.mahasiswa.tampilInformasi();
            }
            tampilIPKDiAtasRekursif(node.right, ipkBatas);
        }
    }
}