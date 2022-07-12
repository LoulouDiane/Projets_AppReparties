//Hello.java

import java.rmi.RMISecurityManager;
import java.rmi.Naming;

@SuppressWarnings("deprecation")
public class Serveur {

	public static void main(String[] args) {
		System.setSecurityManager(new RMISecurityManager());
		try {
			Naming.rebind("Hello1",new Hello ("Hello"));
			System.out.println ("Serveur pret");
	     	}
		catch (Exception e) {
			System.out.println ("Erreur Serveur :" +e);
			
		}
	}

}
