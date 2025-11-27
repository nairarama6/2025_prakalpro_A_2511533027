package PEKAN7_2511533027;

import java.util.Scanner;

public class tugasAlproPekan7_2511533027 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		Akun akun = new Akun();
		System.out.println("=== SISTEM REGISTRASI AKUN ===");
		System.out.print("Username: ");
		String username = input.nextLine();
		System.out.print("Password: ");
		String password = input.nextLine();
		System.out.print("Email: ");
		String email = input.nextLine();
		System.out.print("PIN Angka (6 digit): ");
		int pin = input.nextInt();
		
		akun.setUsername(username);
		akun.setPassword(password);
		akun.setEmail(email);
		akun.setPinAngka(pin);
		
		// Validasi Password
		if (!akun.isPasswordValid()) {
			System.out.println("\n[ERROR] Password tidal valid! Minimal 8 karakter.");
			input.close();
			return;
		}
		
		// Validasi Email
		if (!akun.isEmailValid()) {
			System.out.println("\n[ERROR] Email tidal valid! Harus mengandung '@' dan '.'");
			input.close();
			return;
		}
		
		System.out.println("\n--- REGISTRASI BERHASIL ---");
		System.out.println("Username : " + akun.getUsername());
		System.out.println("Email    : " + akun.getEmail());
		System.out.println("PIN      : " + akun.getPinAngka());
		
		// Manipulasi String 
		System.out.println("\n-- Manipulasi String --");
		System.out.println("Username Uppercase   : " + akun.getUsername().toUpperCase());
		System.out.println("Email Lowercase      : " + akun.getEmail().toLowerCase());
		System.out.println("Panjang Username     : " + akun.getUsername().length());
		System.out.println("Index '@' pada Email : " +  akun.getEmail().indexOf("@"));
		
		input.close();

	}

}
