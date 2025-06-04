package pertemuan14;

public class binarryTreeArrayMain07 {
    public static void main(String[] args) {

        binarryTreeArray07 bta = new binarryTreeArray07();
        
        mahasiswa07 mhs1 = new mahasiswa07("244160121", "Ali", "A", 3.57);
        mahasiswa07 mhs2 = new mahasiswa07("244160185", "Candra", "C", 3.41);
        mahasiswa07 mhs3 = new mahasiswa07("244160221", "Badar", "B", 3.75);
        mahasiswa07 mhs4 = new mahasiswa07("244160220", "Dewi", "B", 3.35);

        mahasiswa07 mhs5 = new mahasiswa07("244160131", "Devi", "A", 3.48);
        mahasiswa07 mhs6 = new mahasiswa07("244160205", "Ehsan", "D", 3.61);
        mahasiswa07 mhs7 = new mahasiswa07("244160170", "Fizi", "B", 3.86);

        mahasiswa07[] dataMahasiswas = {mhs1, mhs2, mhs3, mhs4, mhs5, mhs6, mhs7, null, null, null};
        int idxLast = 6;
        bta.populateData(dataMahasiswas, idxLast);
        System.out.println("\nInorder Traversal Mahasiswa: ");
        bta.traverseInOrder(0);
    }
}