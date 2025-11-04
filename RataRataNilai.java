import java.util.Scanner;

public class RataRataNilai {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.print("Masukkan jumlah siswa: ");
        int jumlahSiswa = input.nextInt();
        
        double totalNilai = 0;
        
        // Memasukkan nilai setiap siswa
        for (int i = 1; i <= jumlahSiswa; i++) {
            System.out.print("Masukkan nilai siswa ke-" + i + ": ");
            double nilai = input.nextDouble();
            totalNilai += nilai;
        }
        
        // Menghitung rata-rata
        double rataRata = totalNilai / jumlahSiswa;
        
        System.out.println("\n====================================");
        System.out.println("Jumlah siswa: " + jumlahSiswa);
        System.out.println("Total nilai: " + totalNilai);
        System.out.printf("Rata-rata nilai: %.2f\n", rataRata);
        System.out.println("====================================");
        
        input.close();
    }
}