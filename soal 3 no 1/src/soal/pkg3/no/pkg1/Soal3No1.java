/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package soal.pkg3.no.pkg1;

import java.util.Scanner;

/**
 *
 * @author adiyatma
 */
public class Soal3No1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
       System.out.print("Masukkan jumlah siswa: ");
        int jumlahSiswa = scanner.nextInt();

        // Memasukkan jumlah hari dalam bulan
        System.out.print("Masukkan jumlah hari dalam bulan: ");
        int jumlahHari = scanner.nextInt();

        // Array untuk menyimpan kehadiran masing-masing siswa
        int[] kehadiran = new int[jumlahSiswa];

        // Memasukkan jumlah hari hadir setiap siswa
        for (int i = 0; i < jumlahSiswa; i++) {
            System.out.print("Masukkan jumlah hari hadir siswa ke-" + (i + 1) + ": ");
            kehadiran[i] = scanner.nextInt();

            // Validasi input
            if (kehadiran[i] < 0 || kehadiran[i] > jumlahHari) {
                System.out.println("Input tidak valid. Masukkan angka antara 0 dan " + jumlahHari + ".");
                i--; // Ulangi input untuk siswa ini
            }
        }

        // Menghitung rata-rata kehadiran
        int totalKehadiran = 0;
        for (int hadir : kehadiran) {
            totalKehadiran += hadir;
        }
        double rataRata = (double) totalKehadiran / jumlahSiswa;

        // Mencetak laporan kehadiran
        System.out.println("\nLaporan Kehadiran Siswa:");
        for (int i = 0; i < jumlahSiswa; i++) {
            System.out.println("Siswa ke-" + (i + 1) + ": " + kehadiran[i] + " hari hadir.");
        }
        System.out.printf("Rata-rata kehadiran: %.2f hari.%n", rataRata);

        // Menampilkan kesimpulan
        System.out.println("\nKesimpulan:");
        System.out.println("- Siswa yang kehadirannya di atas rata-rata:");
        boolean adaDiAtas = false;
        for (int i = 0; i < jumlahSiswa; i++) {
            if (kehadiran[i] > rataRata) {
                System.out.println("  - Siswa ke-" + (i + 1) + " (" + kehadiran[i] + " hari)");
                adaDiAtas = true;
            }
        }
        if (!adaDiAtas) {
            System.out.println("  Tidak ada siswa di atas rata-rata.");
        }

        System.out.println("\n- Siswa yang kehadirannya di bawah rata-rata:");
        boolean adaDiBawah = false;
        for (int i = 0; i < jumlahSiswa; i++) {
            if (kehadiran[i] < rataRata) {
                System.out.println("  - Siswa ke-" + (i + 1) + " (" + kehadiran[i] + " hari)");
                adaDiBawah = true;
            }
        }
        if (!adaDiBawah) {
            System.out.println("  Tidak ada siswa di bawah rata-rata.");
        }

    }
}
