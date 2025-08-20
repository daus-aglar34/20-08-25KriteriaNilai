import java.util.Scanner;

public class kategoriNilai {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Masukkan nilai Anda: ");
        int nilai = input.nextInt();

        if (nilai >= 96 && nilai <= 100) {
            System.out.println("Anda mendapatkan nilai A");
            System.out.println("Kriteria : Sangat Baik");
        } else if (nilai >= 91 && nilai <= 95) {
            System.out.println("Anda mendapatkan nilai A-");
            System.out.println("Kriteria : Sangat Baik");
        } else if (nilai >= 86 && nilai <= 90) {
            System.out.println("Anda mendapatkan nilai B+");
            System.out.println("Kriteria : Baik");
        } else if (nilai >= 81 && nilai <= 85) {
            System.out.println("Anda mendapatkan nilai B");
            System.out.println("Kriteria : Baik");
        } else if (nilai <= 75 && nilai >= 80) {
            System.out.println("Anda mendapatkan nilai B-");
            System.out.println("Kriteria : Baik");
        } else if (nilai >= 70 && nilai <= 74) {
            System.out.println("Anda mendapatkan nilai C+");
            System.out.println("Kriteria : Cukup");
        } else if (nilai >= 65 && nilai <= 69) {
            System.out.println("Anda mendapatkan nilai C");
            System.out.println("Kriteria : Cukup");
        } else if (nilai >= 60 && nilai <= 64) {
            System.out.println("Anda mendapatkan nilai C-");
            System.out.println("Kriteria : Cukup");
        } else if (nilai >= 55 && nilai <= 59) {
            System.out.println("Anda mendapatkan nilai D+");
            System.out.println("Kriteria : Kurang");
        } else if (nilai < 50) {
            System.out.println("Anda mendapatkan nilai D-");
            System.out.println("Kriteria : Sangat Kurang");
        } else {
            System.out.println("Nilai tidak valid");
        }

        input.close();
    }
}