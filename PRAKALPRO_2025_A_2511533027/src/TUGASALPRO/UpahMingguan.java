package TUGASALPRO;

import java.util.Scanner;

public class UpahMingguan {
	public static void main(String[] args) {
		String nama, gol;
		int jamKerja, tarif = 0, upahPokok, upahLembur = 0, totalUpah;
		Scanner keyboard = new Scanner (System.in);
		
		// Input 
		System.out.println("Input Nama Karyawan: ");
		nama = keyboard.nextLine();
		System.out.println("Input Golongan (A/B/C/D): ");
		gol = keyboard.nextLine();
		System.out.println("Input Jumlah Jam Kerja: ");
		jamKerja = keyboard.nextInt();
		
		// Tentukan tarif berdasarkan golongan
		if (gol.equals("A")) {
			tarif = 1000;
		} else if (gol.equals("B")) {
			tarif = 2000;
		} else if (gol.equals("C")) {
			tarif = 3000;
		} else if (gol.equals("D")) {
			tarif = 4000;
		} else {
			System.out.println("Golongan tidak valid. Gunakan A,B,C, atau D");
			keyboard.close();
			return;
		}
		
		// Hitung upah pokok
		upahPokok = tarif * jamKerja;
		
		// Hitung upah lembur (jika lebih dari 60 jam)
		if (jamKerja > 60) {
			upahLembur = (jamKerja - 60) * 5000;
		}
		
		// Hitung total upah
		totalUpah = upahPokok + upahLembur;
		
		// Output hasil
		System.out.println("--- Hasil Perhitungan Upah ---");
		System.out.println("Nama Karyawan     : " + nama);
		System.out.println("Golongan          : " + gol);
		System.out.println("Jam Kerja         : " + jamKerja);
		System.out.println("Upah Pokok        : " + upahPokok);
		System.out.println("Upah Lembur       : " + upahLembur);
		System.out.println("Total Upah        : " + totalUpah);
		keyboard.close();
	}
}