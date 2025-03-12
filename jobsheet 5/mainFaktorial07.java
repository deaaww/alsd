import java.util.Scanner;

public class mainFaktorial07 {

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        System.out.print("Masukkan nilai: ");
        int nilai = sc.nextInt();

        faktorial07 fk = new faktorial07();
        System.out.println("Nilai faktorial " + nilai + " menggunakan BF: " + fk.faktorialBF(nilai));
        System.out.println("Nilai faktorial " + nilai + " menggunakan DC: " + fk.faktorialDC(nilai));

        sc.close();
    }
}