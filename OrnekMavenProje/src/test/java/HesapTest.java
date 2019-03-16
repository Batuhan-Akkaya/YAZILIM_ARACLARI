import org.junit.*;

public class HesapTest {

	// @org.junit.Test
	@Test
	public void testTopla() {
		
		Hesap h = new Hesap();
		
		int sonuc = h.topla(345, 453);
		
		Assert.assertEquals(798, sonuc);
		
	}

	@Test
	public void testFaktoriyel() {
		
		Hesap h = new Hesap();
		
		int sonuc = h.faktoriyel(10);
		
		Assert.assertEquals(3628801, sonuc);
		
	}
	
}
