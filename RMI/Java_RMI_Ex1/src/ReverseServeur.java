import java.rmi.*;
import java.rmi.server.*;

public class ReverseServeur {

	public static void main(String[] args) {
		
		try {
			 
			System.out.println("Serveur: Construction de l'implementation");
			Reverse rev=new Reverse();
			System.out.println("Objet Revese lie dans le RMIregistry");
			Naming.rebind("rmi://Serveur:1099/MyReverse", (Remote) rev);
			System.out.print("Attente des inocation des clients ..");
			
			}
		
		catch (Exception e) {
			System.out.println ("Erreur de liaison de l'objet Reverse");
			System.out.println (e.toString());

		}
		
	

	}

}
