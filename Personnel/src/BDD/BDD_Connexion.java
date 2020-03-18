package BDD;
import java.sql.Connection;
import java.sql.DriverManager;

public class BDD_Connexion {
	
	public static void main(String[] args) {
	Connection conn = null;
	String BDD = "ppe";
	String url = "jdbc:mysql://localhost:ppe/"+BDD;
	String Utilisateur = "root";
	String Mdp = "";
	
	try {
		Class.forName("com.mysql.jdbc.Driver");
		conn = DriverManager.getConnection(url,Utilisateur,Mdp);
		System.out.println("Connexion reussi");
	}
	catch (Exception a){
		a.printStackTrace(); //Cela aide à retracer l'exception
		System.out.println("Connexion echouer");
		System.exit(0);//quitte le programme
	}
}
	
}
