public class dataDosen07 {
    
    dosen07[] DataDosen = new dosen07[5];
    int jumDosen = 0;

    void tambah(dosen07 dsn) {
        if (jumDosen < DataDosen.length) {
            DataDosen[jumDosen] = dsn;
            jumDosen++;
        } else {
            System.out.println("Data sudah penuh!");
        }
    }

    void tampil() {
        for (int i = 0; i < jumDosen; i++) {
            DataDosen[i].tampil();
        }
    }

    void sortingASC() { //bubble sort
        for (int i = 0; i < jumDosen - 1; i++) {
            for (int j = 0; j < jumDosen - i - 1; j++) {
                if (DataDosen[j].usia > DataDosen[j + 1].usia) {
                    dosen07 temp = DataDosen[j];
                    DataDosen[j] = DataDosen[j + 1];
                    DataDosen[j + 1] = temp;
                }
            }
        }
    }

    void sortingDSC() { //insertion sort
        for (int i = 1; i < jumDosen; i++) {
            dosen07 dosenSementara = DataDosen[i];
            int j = i - 1;
            while (j >= 0 && DataDosen[j].usia < dosenSementara.usia) {
                DataDosen[j + 1] = DataDosen[j];
                j--;
            }
            DataDosen[j + 1] = dosenSementara;
        }
    }

    void DataSequential05(String nama) {
        boolean ditemukan = false;
        int jumlahHasil = 0;

        for (int i = 0; i < jumDosen; i++) {
            if (DataDosen[i].nama.equalsIgnoreCase(nama)) {
                DataDosen[i].tampil();
                ditemukan = true;
                jumlahHasil++;
            }
        }

        if (!ditemukan) {
            System.out.println("Data dengan nama \"" + nama + "\" tidak ditemukan!");
        } else if (jumlahHasil > 1) {
            System.out.println("Peringatan: Ditemukan lebih dari satu dosen dengan nama \"" + nama + "\".");
        }
    }

    void DataBinary05(int usia) {
        sortingASC();
        int kiri = 0, kanan = jumDosen - 1;
        boolean ditemukan = false;
        int jumlahHasil = 0;

        while (kiri <= kanan) {
            int tengah = kiri + (kanan - kiri) / 2;
            
            if (DataDosen[tengah].usia == usia) {
                int i = tengah;
                while (i >= 0 && DataDosen[i].usia == usia) {
                    DataDosen[i].tampil();
                    ditemukan = true;
                    jumlahHasil++;
                    i--;
                }
                i = tengah + 1;
                while (i < jumDosen && DataDosen[i].usia == usia) {
                    DataDosen[i].tampil();
                    jumlahHasil++;
                    i++;
                }
                break;
            } else if (DataDosen[tengah].usia < usia) {
                kiri = tengah + 1;
            } else {
                kanan = tengah - 1;
            }
        }

        if (!ditemukan) {
            System.out.println("Data dengan usia " + usia + " tidak ditemukan!");
        } else if (jumlahHasil > 1) {
            System.out.println("Peringatan: Ditemukan lebih dari satu dosen dengan usia " + usia + ".");
        }
    }
}