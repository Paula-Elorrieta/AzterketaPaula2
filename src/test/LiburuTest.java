package test;

import static org.junit.Assert.*;


import org.junit.BeforeClass;
import org.junit.Test;

import modelo.LibZerrenda;
import modelo.Liburua;
import vista.Liburutegia;

public class LiburuTest {

	private static Liburua liburu;
	private static Liburua liburu2;
	private LibZerrenda klasea = new LibZerrenda();

	@BeforeClass
	public static void Objetua() {
		
		liburu = new Liburua();
		liburu2 = new Liburua("Izena", "12345", "Idazlea");
		
	}

	@Test
	public void testLiburuKonstruktorea() {
		liburu.setizenburua("Izenburua");
		liburu.setidazlea("Idazlea");
		liburu.setisbn("123456");
		
		assertEquals("Izenburua", liburu.getizenburua());
		assertEquals("Idazlea", liburu.getidazlea());
		assertEquals("123456", liburu.getisbn());
	}
	
	@Test
	public void testLiburuToString() {
		assertEquals("Liburua [izenburua=Izena, isbn=12345, idazlea=Idazlea]", liburu2.toString());
	}
	
	@Test
	public void testLiburuBera() {
		assertTrue(liburu2.equals(liburu2));
	}
	
	@Test
	public void testLiburuEzberdinak() {
		Liburua l3 = new Liburua("Principito", "45432", "Juan");
		assertFalse(liburu2.equals(l3));
	}
	
	@Test
	public void testLiburuNull() {
		assertFalse(liburu2.equals(null));
	}
	
	@Test
	public void testLiburuEquals() {
		assertFalse(liburu2.equals("Not a Bezeroa object"));
	}
	
	@Test
	public void testLiburuBerdinak() {
		Liburua l3 = new Liburua("Izena", "12345", "Idazlea");
		assertTrue(liburu2.equals(l3));
	}
	 
	// SARTU BEHAR DUZU LIBURU BAT EDO AUKERA BAT EMAN EDO FUNTZIO GUZTIAK EGIN
	@Test
	public void ezabatuTEST() {
		Liburutegia.main(new String[]{});
		assertFalse(klasea.beteta());
	}
	
	@Test
	public void bilatutitTEST() {
		assertEquals(-1, klasea.bilatuisbn("1234567"));
	}
	
	@Test
	public void lzerrendaEskuratuTEST() {
		Liburua l3 = new Liburua("Izena", "12345", "Idazlea");
		Liburua l2 = new Liburua("Izena", "12345", "Idazlea");
		Liburua l4 = new Liburua("Izena", "12345", "Idazlea");

		Liburua [] lzerrenda = new Liburua[3];
		lzerrenda[0] = l2;
		lzerrenda[1] = l3;
		lzerrenda[2] = l4;
			
		assertFalse(klasea.lzerrendaEskuratu().equals(lzerrenda.toString()));
	}
	
	@Test
	public void eskuratuTEST() {
		assertEquals(null, klasea.eskuratu(0));
	}

}
