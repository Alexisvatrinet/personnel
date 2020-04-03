package testsUnitaires;

import static org.junit.jupiter.api.Assertions.*;


import java.time.LocalDate;

import org.junit.Before;

import org.junit.jupiter.api.Test;

import personnel.*;

import java.sql.*;

class testLigue 
{
	GestionPersonnel gestionPersonnel = GestionPersonnel.getGestionPersonnel();
	@Test 
	void createLigue() throws SauvegardeImpossible 
	{
		Ligue ligue = gestionPersonnel.addLigue("Fléchettes");
		assertEquals("Fléchettes", ligue.getNom()); 
	}
 
	void addEmploye() throws SauvegardeImpossible 
	{
		Ligue ligue = gestionPersonnel.addLigue("Fléchettes");
		Employe employe = ligue.addEmploye("Bouchard", "Bernard", "g.bouchard@gmail.com", "azerty",LocalDate.now(),null); 
		assertEquals(employe, ligue.getEmployes().first());
	} 
	
	@Test
	void testGetNom() throws SauvegardeImpossible
	{
		Ligue ligue = gestionPersonnel.addLigue("Fléchettes");
		assertEquals("Fléchettes",ligue.getNom());
	}
	
	@Test 
	void testSetNom() throws SauvegardeImpossible
	{
		Ligue ligue = gestionPersonnel.addLigue("Fléchettes");
		String ligue2 = "Ligua";
		ligue.setNom(ligue2);
		assertEquals(ligue.getNom(),ligue2);
	}
	
	@Test
    void  testGetAdministrateur() throws SauvegardeImpossible
    {
			Ligue ligue = gestionPersonnel.addLigue("Fléchettes");
            Employe employe = GestionPersonnel.getGestionPersonnel().getRoot();
            ligue.setAdministrateur(employe);
            assertEquals(employe, ligue.getAdministrateur());
    }
	
	@Test
	void testRemove()  throws SauvegardeImpossible
	{
		Ligue ligue = gestionPersonnel.addLigue("Fléchettes");
		Employe employe = ligue.addEmploye("Bouchard", "Bernard", "g.bouchard@gmail.com", "azerty",LocalDate.now(),null);
		employe.remove();
		assertFalse(ligue.getEmployes().contains(employe));
	}
	
	@Test 
	void testCompareTo()throws SauvegardeImpossible 
	{ 
		Ligue ligue = gestionPersonnel.addLigue("Fléchettes");
		Ligue autre = gestionPersonnel.addLigue("Ligua");
		assertTrue(ligue.compareTo(autre)<0);
	} 
	 
	@Test 
	void testToString()throws SauvegardeImpossible 
	{ 
		Ligue ligue = gestionPersonnel.addLigue("Fléchettes");
		String nom = "Fléchettes";
		ligue.setNom(nom); 
		assertTrue(ligue.toString().contains("Fléchettes"));
	}
	
	
	


	
	

}
