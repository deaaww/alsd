public class sllMain07 {
    public static void main(String[] args) {
        
        singleLinkedList07 sll = new singleLinkedList07();

        mahasiswa07 mhs1 = new mahasiswa07("24212200", "Alvaro", "1A", 4.0);
        mahasiswa07 mhs2 = new mahasiswa07("23212201", "Bimon", "2B", 3.8);
        mahasiswa07 mhs3 = new mahasiswa07("22212202", "Cintia", "3C", 3.5);
        mahasiswa07 mhs4 = new mahasiswa07("21212203", "Dirga", "4D", 3.6);

        sll.print();

        sll.addFirst(mhs4);
        sll.print();

        sll.addLast(mhs1);
        sll.print();

        sll.insertAfter("Dirga", mhs3);
        sll.insertAt(2, mhs2);

        sll.print();

        //tambahan modifikasi

        System.out.println("===============================================");
        System.out.println("\ndata index 1: ");
        sll.getData(1);

        System.out.println("data mahasiswa a/n Bimon berada pada index : " + sll.indexOf("bimon"));
        System.out.println();

        sll.removeFirst();
        sll.removeLast();
        sll.print();
        sll.removeAt(0);
        sll.print();
    }
}

//MODIFIKASI 2.1.2 PERTANYAAN NO 3

/*import java.util.Scanner;

public class sllMain07 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        singleLinkedList07 sll = new singleLinkedList07();

        System.out.print("Masukkan jumlah mahasiswa: ");
        int jumlah = sc.nextInt();
        sc.nextLine();

        for (int i = 0; i < jumlah; i++) {
            System.out.println("\nData Mahasiswa ke-" + (i + 1));
            System.out.print("NIM   : ");
            String nim = sc.nextLine();
            System.out.print("Nama  : ");
            String nama = sc.nextLine();
            System.out.print("Kelas : ");
            String kelas = sc.nextLine();
            System.out.print("IPK   : ");
            double ipk = sc.nextDouble();
            sc.nextLine();

            mahasiswa07 mhs = new mahasiswa07(nim, nama, kelas, ipk);

            sll.addLast(mhs);
            sll.print();
        }

        sc.close();
    }
}*/