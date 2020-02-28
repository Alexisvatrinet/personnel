package commandLine;

import static commandLineMenus.rendering.examples.util.InOut.getInt;
import static commandLineMenus.rendering.examples.util.InOut.getString;

import java.time.LocalDate;
import java.util.ArrayList;

import commandLineMenus.List;
import commandLineMenus.Menu;
import commandLineMenus.Option;
import personnel.Employe;
import personnel.GestionPersonnel;
import personnel.Ligue;


public class EmployeConsole 
{
	private Option afficher(final Employe employe)
	{
		return new Option("Afficher l'employé", "l", () -> {System.out.println(employe);});
	}

	Menu editerEmploye(Employe employe)
	{
		Menu menu = new Menu("Gérer le compte " + employe.getNom(), "c");
		menu.add(afficher(employe));
		menu.add(changerNom(employe));
		menu.add(changerPrenom(employe));
		menu.add(changerMail(employe));
		menu.add(changerPassword(employe));
		menu.add(changerDateDebut(employe));
		menu.add(changerDateFin(employe));
		menu.add(supprimerEmploye(employe));
		menu.addBack("q");
		return menu; 
	}
	
	private Option supprimerEmploye(final Employe employe)
	{
		return new Option("Supprimer " + employe.getNom()+" "+ employe.getPrenom(), "v"
				,()->{employe.remove();});
	}

	private Option changerNom(final Employe employe)
	{
		return new Option("Changer le nom", "n", 
				() -> {employe.setNom(getString("Nouveau nom : "));}
			);
	}
	
	private Option changerPrenom(final Employe employe) 
	{
		return new Option("Changer le prénom", "p", () -> {employe.setPrenom(getString("Nouveau prénom : "));});
	}
	
	private Option changerMail(final Employe employe)
	{
		return new Option("Changer le mail", "e", () -> {employe.setMail(getString("Nouveau mail : "));});
	}
	
	private Option changerPassword(final Employe employe)
	{
		return new Option("Changer le password", "x", () -> {employe.setPassword(getString("Nouveau password : "));});
	}
	
	private Option changerDateDebut(final Employe employe) {
		return new Option("changer la dateDebut", "a",() ->  {employe.setDateDebut(getDate());});
	}
	
	private Option changerDateFin(final Employe employe) {
		return new Option("changer la dateFin", "f",() ->  {employe.setDateFin(getDate());});
	}
	private LocalDate getDate() {/// rapeler la fonction getDate
		int year = getInt("year : ");
		int month = getInt("mois : ");
		int day = getInt(" day :");
		LocalDate InputDate = LocalDate.of(year, month, day);
		return InputDate;
		
	}
}
