import java.rmi.*;

public class ReverseClient {

	@SuppressWarnings("deprecation")
	public static void main(String[] args) {
	
		System.setSecurityManager(new RMISecurityManager());
		try {
			ReverseInterface rev=(ReverseInterface) Naming.lookup("rmi://serveur:1099/MyReverse");
			String result = rev.reversString (arg [0]);
			System.out.println ("L'inverse de "+args[0]+"est"+result);
			
		}
		catch (Exception e)
		{
			System.out.println ("Erreur d'acces a l'objet distant.");
			System.out.println (e.toString());
		}

	}

}
