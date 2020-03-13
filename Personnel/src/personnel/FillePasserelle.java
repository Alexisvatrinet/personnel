package personnel;
//-------------------------------------------
import java.sql.*;
import java.sql.DriverManager;

public class FillePasserelle implements Passerelle {

	/* (non-Javadoc)
	 * @see personnel.Passerelle#getGestionPersonnel()
	 */
	
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
	 
	 public static Connection getlaconnexion() {
		 return laconnexion;
		 
	 }
	
	
	@Override
	public GestionPersonnel getGestionPersonnel() {
		// TODO Auto-generated method stub
		return null;
	}
	/* (non-Javadoc)
	 * @see personnel.Passerelle#sauvegarderGestionPersonnel(personnel.GestionPersonnel)
	 */
	@Override
	public void sauvegarderGestionPersonnel(GestionPersonnel gestionPersonnel) throws SauvegardeImpossible {
		
		// TODO Auto-generated method stub

	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
