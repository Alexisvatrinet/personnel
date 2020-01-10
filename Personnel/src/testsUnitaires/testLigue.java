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
		ligue.getNom().compareTo(ligue2.getNom());
		assertEquals(ligue.getNom(), ligue2.getNom());
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
