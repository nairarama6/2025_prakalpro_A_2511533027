package PEKAN6_2511533027;

import java.util.Random;
import java.util.Scanner;

public class GameLemparDadu_2511533027 {

	public static void main(String[] args) {
		Scanner input = new Scanner (System.in);
		Random rand = new Random();
		
		int dadu1, dadu2, hasil;
		int percobaan = 0;
		String jawab;
		boolean menang = false;
		
		System.out.println("=== Game Lempar Dadu ===");
		do {
			System.out.print("Apakah mau lempar dadu (ya / tidak?) ");
			jawab = input.next();
			if (jawab.equalsIgnoreCase("tidak")) {
				System.out.println("\nPermainan dihentikan oleh pengguna. ");
				break;
			}
			dadu1 = rand.nextInt(6) + 1; // 1 - 6
			dadu2 = rand.nextInt(6) + 1;
			hasil = dadu1 + dadu2;
			percobaan++;
			System.out.println(dadu1 + " + " + dadu2 + " = " + hasil);
			if (hasil == 7) {
				System.out.println("\nTebakan Anda Benar!");
				System.out.println("Anda Menang Setelah " + percobaan + "Percobaan!");
				menang = true;
			} else {
				System.out.println("Tebakan Anda Salah\n");
			}
			
		} while (!menang);
		if (!menang) {
			System.out.println("Permainan Selesai. Anda Belum Mendapatkan Angka 7.");
		}
		input.close();
	}
}
