package PEKAN7_2511533027;

import java.util.Scanner;

public class tugasAlproPekan7_2511533027 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		Akun akun = new Akun();
		System.out.println("=== SISTEM REGISTRASI AKUN ===");
		System.out.print("Username: ");
		akun.setUsername(input.nextLine());
		System.out.print("Password: ");
		akun.setPassword(input.nextLine());
		System.out.print("Email: ");
		akun.setEmail(input.nextLine());
		System.out.print("PIN Angka (6 digit): ");
		akun.setPinAngka(input.nextInt());
		input.nextLine();
		
		System.out.println();
		
		if (!akun.isPasswordValid() || !akun.isEmailValid()) {
			System.out.println("----- REGISTRASI GAGAL -----");
			if (!akun.isPasswordValid()) {
				System.out.println("Error: Password harus memiliki panjang minimal 8 karakter.");
			}
			if (!akun.isEmailValid()) {
				System.out.println("Error: Email harus mengandung karakter '@'  dan '.'.");
			}
		} else {
			System.out.println("----- REGISTRASI BERHASIL -----");
			System.out.println("Akun untuk \"" + akun.getUsername() + "\" telah berhasil dibuat. \n");
			
			String usernameLower = akun.getUsername().toLowerCase();
			String emailUpper = akun.getEmail().toUpperCase();
			String idPengguna = akun.getUsername().concat(String.valueOf(akun.getPinAngka()));
			
			System.out.println("----- DETAIL AKUN -----");
			System.out.println("Username (Lowercase)   : " + usernameLower);
			System.out.println("Email (Uppercase)      : " + emailUpper);
			System.out.println("ID Pengguna (Gabungan) : " + idPengguna);
			
			System.out.println();
			System.out.println("----- UJI TIPE DATA (PIN ANDA: " + akun.getPinAngka() + ") -----");
			System.out.println("PIN (int) + 10          = " + (akun.getPinAngka() + 10));
			System.out.println("PIN (String) + \"10\"   = " + (String.valueOf(akun.getPinAngka()) + "10"));
		}
		
		input.close();
	}
	
}
