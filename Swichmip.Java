import java.util.Scanner;
public class Switchcase {
	public static void main(String[] args) {
		char nilai;
		System.out.println("Masukkan Nilai Anda ( A - E ) : ");
		Scanner masukan = new Scanner(System.in);
		nilai = masukan.next().charAt(0);
		switch (nilai) {
		case 'A' :
			System.out.println("Sempurna Andan Berhak Mendapatkan Mobil");
			break;
		case 'B' :
			System.out.println("Wow Anda Luar Biasa");
			break;
		case 'C' :
			System.out.println("Tingkatkan Kembali yaa");
			break;
		case 'D' :
			System.out.println("Sayang sekali, ayo belajar besama");
			break;
		case 'E' :
			System.out.println("Sabar yaa dan harus belajar lagi yaa");
			break;
		default :
			System.out.println("Tidak Ada Nilai Silahkan Kuliah Dulu");
		}
	}
}
