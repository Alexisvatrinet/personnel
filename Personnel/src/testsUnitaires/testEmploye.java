package testsUnitaires;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import personnel.*;

public class testEmploye {
	
	@Test
	void testSetNom() 
	{
	 Ligue ligue = new Ligue ("Fléchettes");
	 Employe employe = ligue.addEmploye("nom","prenom","mail","password");
	 String nom = "Bernard"; 
	 employe.setNom(nom);
	 assertEquals(employe.getNom(), nom);  
	}
	 
	@Test
	void testSetPrenom() 
	{
	 Ligue ligue = new Ligue ("Fléchettes");
	 Employe employe = ligue.addEmploye("nom","prenom","mail","password");
	 String prenom = "Franklin";
	 employe.setPrenom(prenom);
	 assertEquals(employe.getPrenom(),prenom); 
	}
	 
	@Test
	void testSetMail() 
	{
	 Ligue ligue = new Ligue ("Fléchettes");
	 Employe employe = ligue.addEmploye("nom","prenom","mail","password");
	 String mail = "alexis.vatrinet@homail.fr";
	 employe.setMail(mail);
	 assertEquals(employe.getMail(), mail);
	} 
	
	@Test
	void testSetPassword() 
	{
	 Ligue ligue = new Ligue ("Fléchettes");
	 Employe employe = ligue.addEmploye("nom","prenom","mail","password");
	 String mdp ="123";
	 employe.setPassword(mdp); 
	 assertTrue(employe.checkPassword(mdp));  
	}
	 
	@Test
	void testestRoot() 
	{
		Ligue ligue = new Ligue("Fléchettes");
		Employe employe = GestionPersonnel.getGestionPersonnel().getRoot();
		ligue.setAdministrateur(employe);
		assertTrue(employe.estRoot()); 
	}  
	 
	@Test
	void testCompareTo() 
	{
		Ligue ligue = new Ligue("Fléchettes");
		Employe employe = ligue.addEmploye("nom","prenom","mail","password");
		Employe autre = ligue.addEmploye("Bernard","alex","demain@labas.fr","42");
		assertTrue(employe.compareTo(autre)>-1);
	}   
	
	@Test
	void testRemove()  
	{
		Ligue ligue = new Ligue("Fléchettes");
		Employe employe = ligue.addEmploye("Bouchard", "Bernard", "g.bouchard@gmail.com", "azerty");
		employe.remove();
		assertFalse(ligue.getEmployes().contains(employe));
		/// Faux , à changer soon
	}
	
//	//@Test 
//	void testgetLigue() 
//	{
//		Ligue ligue = new Ligue("Fléchettes");
//		Employe employe = ligue.addEmploye("Bouchard", "Bernard", "g.bouchard@gmail.com", "azerty");
//		ligue.getEmployes();
//		assertEquals(employe , ligue.getNom());   
//	}
	
	
	@Test
    void   estAdministrateur() 
    {
            Ligue ligue = new Ligue("Fléchettes");
            Employe employe = ligue.addEmploye("Bouchard", "Bernard", "g.bouchard@gmail.com", "azerty");
            ligue.setAdministrateur(employe);
            assertNotEquals(employe.estAdmin(ligue),ligue.getAdministrateur());  
    }
	
	@Test 
	void testToString() 
	{
		Ligue ligue = new Ligue("Fléchettes");
		Employe employe = ligue.addEmploye("nom", "prenom", "mail", "password");
		String nom = "Bernard";
		employe.setNom(nom); 
		assertTrue(employe.toString().contains("Bernard"));
	}
}
