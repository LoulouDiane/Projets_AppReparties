// HelloInterface.java

import java.rmi.Remote;
import java.rmi.RemoteException;

public interface HelloInterface extends Remote{

	public String sayHello() throws RemoteException;

	String sayHello(String message) throws RemoteException;
}
