//HelloClient.java

import java.rmi.*;

public class Client {

	@SuppressWarnings("deprecation")
	public static void main(String[] args) {
		System.setSecurityManager(new RMISecurityManager());
		try {
			HelloInterface hello=(HelloInterface) Naming.lookup("rmi://localhost/Hello1");
			System.out.println(hello.sayHello());
		}
	
		catch (Exception e) {
		System.out.println("Erreur client:" +e);
		
		}

	}
}
