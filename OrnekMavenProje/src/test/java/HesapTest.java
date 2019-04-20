import org.junit.*;

public class HesapTest {

	// @org.junit.Test
	@Test
	public void testPozitifTopla() {
		Hesap h = new Hesap();
		int sonuc = h.topla(345, 453);
		Assert.assertEquals(798, sonuc);
	}
	
	@Test
	public void testNegatifTopla() {
		Hesap h = new Hesap();
		int sonuc = h.topla(-345, -453);
		Assert.assertEquals(-798, sonuc);
	}

	@Test
	public void testFaktoriyelPozitif() {
		Hesap h = new Hesap();
		int sonuc = h.faktoriyel(10);
		Assert.assertEquals(3628800, sonuc);
	}
	
	@Test
	public void testFaktoriyelSifir() {
		Hesap h = new Hesap();
		int sonuc = h.faktoriyel(0);
		Assert.assertEquals(1, sonuc);
	}
	
}
