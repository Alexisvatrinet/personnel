package jdbc;

import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import personnel.*;

 
public class JDBC implements Passerelle 
{
	private static Connection laconnexion;
	
	 static{

		 try {

		Class.forName("com.mysql.cj.jdbc.Driver");

		laconnexion = DriverManager.getConnection("jdbc:mysql://localhost:3306/personnel ?useUnicode=true & useJDBCCompliantTimezoneShift=true & useLegacyDatetimeCode = false & serverTimezone=UTC","root","");

		System.out.println("connexion réussie");	
	}
	catch (Exception e)
		 {
	        e.printStackTrace();
	        System.out.println("Impossible de se connecter ");
		 }

	 }
	 public static Connection getlaconnexion()
	 {
		 return laconnexion;
	 }
	 
	@Override
	public GestionPersonnel getGestionPersonnel() 
	{
		GestionPersonnel gestionPersonnel = new GestionPersonnel();
		try 
		{
			String requete = "select * from ligue";
			Statement instruction = laconnexion.createStatement();
			ResultSet ligues = instruction.executeQuery(requete);
			while (ligues.next())
				gestionPersonnel.addLigue(ligues.getInt(1), ligues.getString(2));
		}
		catch (SQLException e)
		{
			System.out.println(e);
		}
		return gestionPersonnel;
	}
 
	@Override
	public void sauvegarderGestionPersonnel(GestionPersonnel gestionPersonnel) throws SauvegardeImpossible 
	{
		close();
	}

	public void close() throws SauvegardeImpossible
	{
		try
		{
			if (laconnexion != null)
				laconnexion.close();
		}
		catch (SQLException e)
		{
			throw new SauvegardeImpossible(e);
		}
	}

	@Override
	public int insert(Ligue ligue) throws SauvegardeImpossible 
	{
		try 
		{
			PreparedStatement instruction;
			instruction = laconnexion.prepareStatement("insert into ligue (nomLigue) values (?)", Statement.RETURN_GENERATED_KEYS);
			instruction.setString(1, ligue.getNom());		
			instruction.executeUpdate();
			ResultSet id = instruction.getGeneratedKeys();
			id.next();
			return id.getInt(1);
		} 
		catch (SQLException exception) 
		{
			exception.printStackTrace();
			throw new SauvegardeImpossible(exception);
		}		
	}
	
	
}



























