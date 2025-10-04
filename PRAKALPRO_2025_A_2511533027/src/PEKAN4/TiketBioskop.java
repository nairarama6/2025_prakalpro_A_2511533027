package PEKAN4;

import java.util.Scanner;

public class TiketBioskop {
	public static void main(String[] args) {
		Scanner input = new Scanner (System.in);
		String nama;
		int jumlahTiket, hari, waktu, studio;
		int hargaDasar = 0;
		double biayaHari = 0, biayaWaktu = 0;
		double hargaPerTiket, subtotal, diskon = 0, total;
		
		// Input data
		System.out.print("Masukkan Nama Pembeli: ");
		nama = input.nextLine();
		System.out.print("Masukkan Jumlah Tiket: ");
		jumlahTiket = input.nextInt();
		System.out.print("Pilih Hari (1=Senin-Kamis, 2=Jumat, 3=Sabtu-Minggu): ");
		hari = input.nextInt();
		System.out.print("Pilih Waktu (1=Pagi, 2=Siang, 3=Malam): ");
		waktu = input.nextInt();
		System.out.print("Pilih Studio (1=Reguler, 2=Deluxe, 3=Premium): ");
		studio = input.nextInt();
		
		// Tentukan harga dasar
		if (studio == 1) {
			hargaDasar = 40000;
		} else if (studio == 2) {
			hargaDasar = 50000;
		} else if (studio == 3) {
			hargaDasar = 60000;
		}
		
		// Tentukan biaya hari 
		if (hari == 1) { // Senin-Kamis
			biayaHari = 0;
		} else if (hari == 2) { // Jumat
			biayaHari = 0.10;
		} else if (hari == 3) { // Sabtu-Minggu
			biayaHari = 0.30;
		}
		
		// Tentukan biaya waktu
		if (waktu == 1) { // Pagi
			biayaWaktu = 0;
		} else if (waktu == 2) { // Siang
			biayaWaktu = 0.10;
		} else if (waktu == 3) { // Malam
			biayaWaktu = 0.20;
		}
		
		// Hitung harga tiket
		hargaPerTiket = hargaDasar + (hargaDasar * biayaHari) + (hargaDasar * biayaWaktu);
		subtotal = hargaPerTiket * jumlahTiket;
		
		// Diskon jika beli >= 5 tiket
		if (jumlahTiket >= 5) {
			diskon = subtotal * 0.20;
		}
		
		total = subtotal - diskon;
		
		// Output 
		System.out.println("=== PEMBELIAN TIKET BIOSKOP ===");
		System.out.println("Nama Pembeli        : " + nama);
		System.out.println("Jumlah Tiket        : " + jumlahTiket);
		System.out.println("Hari                : " + (hari==1 ? "Senin-Kamis" : (hari==2 ? "Jumat" : "Sabtu-Minggu")));
		System.out.println("Waktu Tayang        : " + (waktu==1 ? "Pagi" : (waktu==2 ? "Siang" : "Malam")));
		System.out.println("Jenis Studio        : " + (studio==1 ? "Regular" : (studio==2 ? "Deluxe" : "Premium")));
		System.out.println("----------------------------------------------");
		System.out.println("Harga Dasar         : Rp " + hargaDasar);
		System.out.println("Biaya Hari          : +" + (int)(biayaHari*100) + "%");
		System.out.println("Biaya Waktu         : +" + (int)(biayaWaktu*100) + "%");
		System.out.println("Harga per Tiket     : Rp " + (int)hargaPerTiket);
		System.out.println("Subtotal            : Rp " + (int)subtotal);
		System.out.println("Diskon              : Rp " + (int)diskon);
		System.out.println("----------------------------------------------");
		System.out.println("TOTAL BAYAR         : Rp " + (int)total);
		
		input.close();
	}

}
