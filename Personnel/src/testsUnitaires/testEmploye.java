package testsUnitaires;

import static org.junit.jupiter.api.Assertions.*;

import java.time.LocalDate;

import org.junit.jupiter.api.Test;

import personnel.*;

import java.sql.*;

public class testEmploye {  
	
	@Test
	void testSetNom() 
	{
	 Ligue ligue = new Ligue ("Fléchettes");
	 Employe employe = ligue.addEmploye("nom","prenom","mail","password",LocalDate.now(),null);
	 String nom = "Bernard"; 
	 employe.setNom(nom);
	 assertEquals(employe.getNom(), nom);  
	}
	 
	@Test
	void testSetPrenom() 
	{
	 Ligue ligue = new Ligue ("Fléchettes");
	 Employe employe = ligue.addEmploye("nom","prenom","mail","password",LocalDate.now(),null);
	 String prenom = "Franklin";
	 employe.setPrenom(prenom);
	 assertEquals(employe.getPrenom(),prenom); 
	}
	  
	@Test
	void testSetMail() 
	{
	 Ligue ligue = new Ligue ("Fléchettes");
	 Employe employe = ligue.addEmploye("nom","prenom","mail","password",LocalDate.now(),null);
	 String mail = "alexis.vatrinet@homail.fr";
	 employe.setMail(mail);
	 assertEquals(employe.getMail(), mail);
	} 
	
	@Test
	void testSetPassword() //Retourne vrai ssi le password passé en paramètre est bien celui de l'employé.
	{
	 Ligue ligue = new Ligue ("Fléchettes");
	 Employe employe = ligue.addEmploye("nom","prenom","mail","password",LocalDate.now(),null);
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
		Employe employe = ligue.addEmploye("nom","prenom","mail","password",LocalDate.now(),null);
		Employe autre = ligue.addEmploye("Bernard","alex","demain@labas.fr","42",LocalDate.now(),null);
		assertTrue(employe.compareTo(autre)>-1);
	}   
	
	@Test
	void testRemove() //Supprime l'employé. 
	{
		Ligue ligue = new Ligue("Fléchettes");
		Employe employe = ligue.addEmploye("Bouchard", "Bernard", "g.bouchard@gmail.com", "azerty",LocalDate.now(),null);
		employe.remove();
		assertFalse(ligue.getEmployes().contains(employe));
	}
	
	@Test 
	void testgetLigue()//Retourne la ligue à laquelle l'employé est affecté.
	{
		Ligue ligue = new Ligue("Fléchettes");
		Employe employe = ligue.addEmploye("Bouchard", "Bernard", "g.bouchard@gmail.com", "azerty",LocalDate.now(),null);
		assertEquals(employe.getLigue() , ligue);     
	} 
				
	
	@Test
    void   estAdministrateur() 
    {
            Ligue ligue = new Ligue("Fléchettes");
            Employe employe = ligue.addEmploye("Bouchard", "Bernard", "g.bouchard@gmail.com", "azerty",LocalDate.now(),null);
            ligue.setAdministrateur(employe);
            assertNotEquals(employe.estAdmin(ligue),ligue.getAdministrateur());   
    }
	
	@Test 
	void testToString() 
	{
		Ligue ligue = new Ligue("Fléchettes");
		Employe employe = ligue.addEmploye("nom", "prenom", "mail", "password",LocalDate.now(),null);
		String nom = "Bernard";
		employe.setNom(nom); 
		assertTrue(employe.toString().contains("Bernard"));
	}
	
	@Test 
	void testDateDebut() 
	{
		Ligue ligue = new Ligue("Fléchettes");
		Employe employe = ligue.addEmploye("nom", "prenom", "mail", "password",LocalDate.now(),null);
		LocalDate date = LocalDate.now ();
		employe.setDateDebut(date);
		assertTrue(employe.getDateDebut()==date);   
	}
	 
	void testDateFin() 
	{ 
		Ligue ligue = new Ligue("Fléchettes");
		Employe employe = ligue.addEmploye("nom", "prenom", "mail", "password",LocalDate.now(),null);
		LocalDate date = LocalDate.of(2020, 06, 14); 
		assertTrue(employe.getDateFin()==date);   
	}
	
	void testconnexion (String[] args) {
		Connection Cnx= FillePasserelle.getlaconnexion();	
	}
}
