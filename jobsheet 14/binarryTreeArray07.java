package pertemuan14;

public class binarryTreeArray07 {
    
    mahasiswa07 [] dataMahasiswa;
    int idxLast;

    public binarryTreeArray07() {
        this.dataMahasiswa = new mahasiswa07[10];
    }

    void populateData (mahasiswa07 dataMhs[], int idxLast) {
        this.dataMahasiswa = dataMhs;
        this.idxLast = idxLast;
    }

    void traverseInOrder(int idxStart) {
        if(idxStart <= idxLast) {
            if (dataMahasiswa[idxStart] != null) {
                traverseInOrder(2*idxStart+1);
                dataMahasiswa[idxStart].tampilInformasi();
                traverseInOrder(2*idxStart+2);
            }
        }
    }

    //tugas 4 method add(mahasiswa data) untuk memasukkan data ke dalam binary tree

    void add(mahasiswa07 data) {
        if (idxLast < dataMahasiswa.length - 1) {
            dataMahasiswa[++idxLast] = data;
        } else {
            System.out.println("Tree sudah penuh.");
        }
    }

    //tugas 4 method traversePreOrder()
    
    void traversePreOrder(int idxStart) {
        if (idxStart <= idxLast && dataMahasiswa[idxStart] != null) {
            dataMahasiswa[idxStart].tampilInformasi();
            traversePreOrder(2 * idxStart + 1);
            traversePreOrder(2 * idxStart + 2);
        }
    }
}