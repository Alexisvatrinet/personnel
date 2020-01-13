package testsUnitaires;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import personnel.*;

class testLigue 
{
	@Test
	void createLigue() 
	{
		Ligue ligue = new Ligue("Fléchettes");
		assertEquals("Fléchettes", ligue.getNom());
	}

	@Test
	void addEmploye() 
	{
		Ligue ligue = new Ligue("Fléchettes");
		Employe employe = ligue.addEmploye("Bouchard", "Bernard", "g.bouchard@gmail.com", "azerty"); 
		assertEquals(employe, ligue.getEmployes().first());
	}
	
	@Test
	void testSetNom() 
	{
		Ligue ligue = new Ligue("Fléchettes");
		String ligue2 = "Ligua";
		ligue.setNom(ligue2);
		System.out.println(ligue);
		assertEquals(ligue.getNom(),ligue2);
	}
	
	
	@Test
	void testRemove() 
	{
		Ligue ligue = new Ligue("Fléchettes");
		Employe employe = ligue.addEmploye("Bouchard", "Bernard", "g.bouchard@gmail.com", "azerty");
		employe.remove();
		assertFalse(ligue.getEmployes().contains(employe));
	}
	
	@Test
	void testCompareTo() 
	{
		Ligue ligue = new Ligue("Fléchettes");
		Ligue ligue2 = new Ligue("Ligua");
		assertEquals(ligue.getNom().compareTo(ligue2.getNom()),ligue.getNom().compareTo(ligue2.getNom()));
		System.out.println(ligue.getNom().compareTo(ligue2.getNom()));
	}
	
	@Test
	void testToString() 
	{
		Ligue ligue = new Ligue("Fléchettes");
		String nom = "Fléchettes";
		ligue.setNom(nom); 
		assertTrue(ligue.toString().contains("Fléchettes"));
	}
	
}
