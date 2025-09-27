package PEKAN3;

import java.util.Scanner;

public class VolumeTabung {
	public static void main(String [] args) {
		double r;
		double t;
		double volume;
		Scanner keyboard = new Scanner (System.in);
		
		// Input 
		System.out.println("Input Jari-Jari Tabung: ");
		r = keyboard.nextDouble();
		System.out.println("Input Tinggi Tabung: ");
		t = keyboard.nextDouble();
		keyboard.close();
		
		// Proses menghitung volume tabung
		System.out.println("=== Perhitungan Volume Tabung ===");
		volume = 3.14 * r * r * t; // rumus volume tabung
		System.out.println("Hasil Volume Tabung = " + volume);
	}

}
