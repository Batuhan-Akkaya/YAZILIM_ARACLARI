
public class Hesap {

	public int topla(int sayi1, int sayi2) {
		return sayi1 + sayi2;
	}

	public int faktoriyel(int sayi) {
		if(sayi < 0) {
			throw new RuntimeException(
					"Eksi sayilarin faktoriyeli yoktur");
		}
		else if(sayi == 0) {
			return 1;
		}
		int sonuc = 1;
		for(int i=1; i<=sayi; i++) {
			sonuc *= i;
		}
		return sonuc;
	}
	// cikarma
	// carpma
	// bolme
}
