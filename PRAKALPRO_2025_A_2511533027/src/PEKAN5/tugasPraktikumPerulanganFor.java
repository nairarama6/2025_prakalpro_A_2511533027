package PEKAN5;

public class tugasPraktikumPerulanganFor {
	public static void main(String[] args) {
		 int n = 4; // tinggi setengah diamond 

	        // hitung lebar paling lebar di tengah
	        int maxTitik = (n - 1) * 4 - 1;
	        int lebar = maxTitik + 4; // <>, titik, <>

	        // garis atas
	        System.out.print("#");
	        for (int i = 0; i < lebar + 6; i++) {
	            System.out.print("=");
	        }
	        System.out.println("#");

	        // bagian atas
	        for (int i = 1; i <= n; i++) {
	            System.out.print("|  "); // sisi kiri
	            int titik = (i - 1) * 4 - 1;
	            if (titik < 0) titik = 0;

	            int isi = titik + 4;
	            int spasi = (lebar - isi) / 2;

	            // spasi kiri
	            for (int j = 0; j < spasi; j++) System.out.print(" ");
	            // pola tengah
	            System.out.print("<>");
	            for (int j = 0; j < titik; j++) System.out.print(".");
	            System.out.print("<>");
	            // spasi kanan
	            for (int j = 0; j < spasi; j++) System.out.print(" ");

	            System.out.println("  |");
	        }

	        // bagian bawah (kebalikan atas)
	        for (int i = n - 1; i >= 1; i--) {
	            System.out.print("|  ");
	            int titik = (i - 1) * 4 - 1;
	            if (titik < 0) titik = 0;

	            int isi = titik + 4;
	            int spasi = (lebar - isi) / 2;

	            for (int j = 0; j < spasi; j++) System.out.print(" ");
	            System.out.print("<>");
	            for (int j = 0; j < titik; j++) System.out.print(".");
	            System.out.print("<>");
	            for (int j = 0; j < spasi; j++) System.out.print(" ");

	            System.out.println("  |");
	        }

	        // garis bawah
	        System.out.print("#");
	        for (int i = 0; i < lebar + 6; i++) {
	            System.out.print("=");
	        }
	        System.out.println("#");
	}

}
