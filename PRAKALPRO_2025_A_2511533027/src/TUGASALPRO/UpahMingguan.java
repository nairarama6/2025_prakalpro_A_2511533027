package TUGASALPRO;

import java.util.Scanner;

public class UpahMingguan {
	public static void main(String[] args) {
		String nama;
		int jamKerja, tarif, upahPokok, upahLembur, totalUpah;
		Scanner keyboard = new Scanner (System.in);
		System.out.print("Input Nama Karyawan: ");
		nama = keyboard.nextLine();
		System.out.print("Input Tarif per Jam: ");
		tarif = keyboard.nextInt();
		System.out.print("Input Jumlah Jam Kerja: ");
		jamKerja = keyboard.nextInt();
		
		// Hitung upah pokok
		upahPokok = tarif * jamKerja;
		
		//Hitung lembur jika lebih dari 60 jam
		if (jamKerja > 60) {
			upahLembur = (jamKerja - 60) * 5000;
		} else {
			upahLembur = 0;
		}
		
		// Hitung total upah
		totalUpah = upahPokok + upahLembur;
		
		// Output
		System.out.println("==================================");
		System.out.println("Nama Karyawan   : " + nama);
		System.out.println("Upah Pokok      : " + upahPokok);
		System.out.println("Upah Lembur     : " + upahLembur);
		System.out.println("Total Upah      : " + totalUpah);
		
		keyboard.close();
	}

}
