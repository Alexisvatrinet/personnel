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
	 assertEquals("Fléchettes", employe.getNom());
	}
			 
}
