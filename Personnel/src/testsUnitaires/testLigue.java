package testsUnitaires;

import static org.junit.jupiter.api.Assertions.*;


import java.time.LocalDate;

import org.junit.jupiter.api.Test;

import personnel.*;

import java.sql.*;

class testLigue 
{
	@Test 
	void createLigue() 
	{
		Ligue ligue = new Ligue("Fléchettes");
		assertEquals("Fléchettes", ligue.getNom()); 
	}
 
	void addEmploye() 
	{
		Ligue ligue = new Ligue("Fléchettes");
		Employe employe = ligue.addEmploye("Bouchard", "Bernard", "g.bouchard@gmail.com", "azerty",LocalDate.now(),null); 
		assertEquals(employe, ligue.getEmployes().first());
	} 
	
	@Test
	void testGetNom() 
	{
		Ligue ligue = new Ligue("Fléchettes");
		assertEquals("Fléchettes",ligue.getNom());
	}
	
	@Test 
	void testSetNom() 
	{
		Ligue ligue = new Ligue("Fléchettes"); 
		String ligue2 = "Ligua";
		ligue.setNom(ligue2);
		assertEquals(ligue.getNom(),ligue2);
	}
	
	@Test
    void  testGetAdministrateur() 
    {
            Ligue ligue = new Ligue("Fléchettes");
            Employe employe = GestionPersonnel.getGestionPersonnel().getRoot();
            ligue.setAdministrateur(employe);
            assertEquals(employe, ligue.getAdministrateur());
    }
	
	@Test
	void testRemove()  
	{
		Ligue ligue = new Ligue("Fléchettes");
		Employe employe = ligue.addEmploye("Bouchard", "Bernard", "g.bouchard@gmail.com", "azerty",LocalDate.now(),null);
		employe.remove();
		assertFalse(ligue.getEmployes().contains(employe));
	}
	
	@Test 
	void testCompareTo() 
	{ 
		Ligue ligue = new Ligue("Fléchettes");
		Ligue autre = new Ligue("Ligua");
		assertTrue(ligue.compareTo(autre)<0);
	} 
	 
	@Test 
	void testToString() 
	{ 
		Ligue ligue = new Ligue("Fléchettes");
		String nom = "Fléchettes";
		ligue.setNom(nom); 
		assertTrue(ligue.toString().contains("Fléchettes"));
	}
	
	@Test
	
	void testconnexion (String[] args) {
		Connection Cnx= FillePasserelle.getlaconnexion();	
	}
	
	
	@Test 
	void othercreateligue() {
		
		
	}
}
