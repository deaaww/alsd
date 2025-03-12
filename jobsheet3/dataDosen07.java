public class dataDosen07 {
    
    public static void dataSemuaDosen07(dosen07[] arrayOfDosen07) {
        for (dosen07 dosen : arrayOfDosen07) {
            dosen.cetakInfo();
        }
    }

    public static void jumlahDosenPerJenisKelamin07(dosen07[] arrayOfDosen07) {
        int pria = 0, wanita = 0;
        for (dosen07 dosen : arrayOfDosen07) {
            if (dosen.jenisKelamin) {
                pria++;
            } else {
                wanita++;
            }
        }

        System.out.println("Jumlah Dosen Pria   : " + pria);
        System.out.println("Jumlah Dosen Wanita : " + wanita);

        System.out.println("-----------------------------------------------");
    }

    public static void rerataUsiaDosenPerJenisKelamin07(dosen07[] arrayOfDosen07) {
        int totalUsiaPria = 0, totalUsiaWanita = 0;
        int hitungPria = 0, hitungWanita = 0;

        for (dosen07 dosen : arrayOfDosen07) {
            if (dosen.jenisKelamin) {
                totalUsiaPria += dosen.usia;
                hitungPria++;
            } else {
                totalUsiaWanita += dosen.usia;
                hitungWanita++;
            }
        }

        System.out.println("Rata-rata Usia Dosen Pria   : " + (hitungPria > 0 ? (totalUsiaPria / hitungPria) : 0));
        System.out.println("Rata-rata Usia Dosen Wanita : " + (hitungWanita > 0 ? (totalUsiaWanita / hitungWanita) : 0));

        System.out.println("-----------------------------------------------");
    }

    public static void infoDosenPalingTua07(dosen07[] arrayOfDosen07) {
        dosen07 tertua = arrayOfDosen07[0];
        for (dosen07 dosen : arrayOfDosen07) {
            if (dosen.usia > tertua.usia) {
                tertua = dosen;
            }
        }

        System.out.println("Dosen Paling Tua: ");
        tertua.cetakInfo();
    }

    public static void infoDosenPalingMuda07(dosen07[] arrayOfDosen07) {
        dosen07 termuda = arrayOfDosen07[0];
        for (dosen07 dosen : arrayOfDosen07) {
            if (dosen.usia < termuda.usia) {
                termuda = dosen;
            }
        }
        System.out.println("Dosen Paling Muda: ");
        termuda.cetakInfo();
    }
}