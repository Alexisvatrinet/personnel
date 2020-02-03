package testsUnitaires;

import static org.junit.jupiter.api.Assertions.*;

import java.time.LocalDate;

import org.junit.jupiter.api.Test;

import personnel.*;

public class testEmploye {  
	
	@Test
	void testSetNom() 
	{
	 Ligue ligue = new Ligue ("Fléchettes");
	 Employe employe = ligue.addEmploye("nom","prenom","mail","password",LocalDate.now());
	 String nom = "Bernard"; 
	 employe.setNom(nom);
	 assertEquals(employe.getNom(), nom);  
	}
	 
	@Test
	void testSetPrenom() 
	{
	 Ligue ligue = new Ligue ("Fléchettes");
	 Employe employe = ligue.addEmploye("nom","prenom","mail","password",LocalDate.now());
	 String prenom = "Franklin";
	 employe.setPrenom(prenom);
	 assertEquals(employe.getPrenom(),prenom); 
	}
	  
	@Test
	void testSetMail() 
	{
	 Ligue ligue = new Ligue ("Fléchettes");
	 Employe employe = ligue.addEmploye("nom","prenom","mail","password",LocalDate.now());
	 String mail = "alexis.vatrinet@homail.fr";
	 employe.setMail(mail);
	 assertEquals(employe.getMail(), mail);
	} 
	
	@Test
	void testSetPassword() //Retourne vrai ssi le password passé en paramètre est bien celui de l'employé.
	{
	 Ligue ligue = new Ligue ("Fléchettes");
	 Employe employe = ligue.addEmploye("nom","prenom","mail","password",LocalDate.now());
	 String mdp ="123";
	 employe.setPassword(mdp); 
	 assertTrue(employe.checkPassword(mdp));  
	}
	 
	@Test
	void testestRoot() //Retourne vrai si l'employé est le root.
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
		Employe employe = ligue.addEmploye("nom","prenom","mail","password",LocalDate.now());
		Employe autre = ligue.addEmploye("Bernard","alex","demain@labas.fr","42",LocalDate.now());
		assertTrue(employe.compareTo(autre)>-1);
	}   
	
	@Test
	void testRemove() //Supprime l'employé. 
	{
		Ligue ligue = new Ligue("Fléchettes");
		Employe employe = ligue.addEmploye("Bouchard", "Bernard", "g.bouchard@gmail.com", "azerty",LocalDate.now());
		employe.remove();
		assertFalse(ligue.getEmployes().contains(employe));
	}
	
	@Test 
	void testgetLigue()//Retourne la ligue à laquelle l'employé est affecté.
	{
		Ligue ligue = new Ligue("Fléchettes");
		Employe employe = ligue.addEmploye("Bouchard", "Bernard", "g.bouchard@gmail.com", "azerty",LocalDate.now());
		assertEquals(employe.getLigue() , ligue);     
	} 
				
	
	@Test
    void   estAdministrateur() 
    {
            Ligue ligue = new Ligue("Fléchettes");
            Employe employe = ligue.addEmploye("Bouchard", "Bernard", "g.bouchard@gmail.com", "azerty",LocalDate.now());
            ligue.setAdministrateur(employe);
            assertNotEquals(employe.estAdmin(ligue),ligue.getAdministrateur());   
    }
	
	@Test 
	void testToString() 
	{
		Ligue ligue = new Ligue("Fléchettes");
		Employe employe = ligue.addEmploye("nom", "prenom", "mail", "password",LocalDate.now());
		String nom = "Bernard";
		employe.setNom(nom); 
		assertTrue(employe.toString().contains("Bernard"));
	}
	
	@Test 
	void testDateDebut() 
	{
		Ligue ligue = new Ligue("Fléchettes");
		Employe employe = ligue.addEmploye("nom", "prenom", "mail", "password",LocalDate.now());
		LocalDate date = LocalDate.now ();
		employe.setDateDebut(date);
		assertTrue(employe.getDateDebut()==date);   
	}
	 
	void testDateFin() 
	{ 
		Ligue ligue = new Ligue("Fléchettes");
		Employe employe = ligue.addEmploye("nom", "prenom", "mail", "password",LocalDate.now());
		LocalDate date = LocalDate.of(2020, 06, 14); 
		assertTrue(employe.getDateFin()==date);   
	}
}
