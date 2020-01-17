package testsUnitaires;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import personnel.*;

public class testEmploye {
	
	@Test
	void testSetNom() 
	{
	 Ligue ligue = new Ligue ("Fléchettes");
	 Employe employe = new Employe(ligue,"nom","prenom","mail","password");
	 String nom = "Bernard";
	 employe.setNom(nom);
	 assertEquals(employe.getNom(), nom);
	}
	 
	@Test
	void testSetPrenom() 
	{
	 Ligue ligue = new Ligue ("Fléchettes");
	 Employe employe = new Employe(ligue,"nom","prenom","mail","password");
	 assertEquals("Fléchettes", employe.getPrenom());
	}
	
	@Test
	void testSetMail() 
	{
	 Ligue ligue = new Ligue ("Fléchettes");
	 Employe employe = new Employe(ligue,"nom","prenom","mail","password");
	 assertEquals("Fléchettes", employe.getMail());
	}
	
	@Test
	void testSetPassword() 
	{
	 Ligue ligue = new Ligue ("Fléchettes");
	 Employe employe = new Employe(ligue,"nom","prenom","mail","password");
	 String mdp ="123";
	 assertEquals("Fléchettes", employe.checkPassword(mdp));
	}
	
	@Test
    void  testGetAdministrateur()
    {
            Ligue ligue = new Ligue("Fléchettes");
            Employe employe = GestionPersonnel.getGestionPersonnel().getRoot();
            ligue.setAdministrateur(employe);
            assertEquals(employe, ligue.getAdministrateur());
    }
}
